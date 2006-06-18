package net.esper.eql.expression;

import net.esper.event.EventType;
import net.esper.event.EventBean;
import net.esper.collection.Pair;
import net.esper.collection.MultiKey;

import java.util.Set;
import java.util.LinkedList;

/**
 * Result set processor for the case: aggregation functions used in the select clause, and no group-by,
 * and not all of the properties in the select clause are under an aggregation function.
 * <p>
 * This processor does not perform grouping, every event entering and leaving is in the same group.
 * The processor generates one row for each event entering (new event) and one row for each event leaving (old event).
 * Aggregation state is simply one row holding all the state.
 */
public class ResultSetProcessorAggregateAll implements ResultSetProcessor
{
    private final SelectExprProcessor selectExprProcessor;
    private final AggregationService aggregationService;
    private final ExprNode optionalHavingNode;
    private final boolean isOutputLimiting;
    private final boolean isOutputLimitLastOnly;

    /**
     * Ctor.
     * @param selectExprProcessor - for processing the select expression and generting the final output rows
     * @param aggregationService - handles aggregation
     * @param optionalHavingNode - having clause expression node
     * @param isOutputLimiting - set if output limiting required
     * @param isOutputLimitLastOnly - set if output limiting to last row
     */
    public ResultSetProcessorAggregateAll(SelectExprProcessor selectExprProcessor, 
                                          AggregationService aggregationService, 
                                          ExprNode optionalHavingNode, 
                                          boolean isOutputLimiting,
                                          boolean isOutputLimitLastOnly)
    {
        this.selectExprProcessor = selectExprProcessor;
        this.aggregationService = aggregationService;
        this.optionalHavingNode = optionalHavingNode;
        this.isOutputLimiting = isOutputLimiting;
        this.isOutputLimitLastOnly = isOutputLimitLastOnly;
    }

    public EventType getResultEventType()
    {
        return selectExprProcessor.getResultEventType();
    }

    public Pair<EventBean[], EventBean[]> processJoinResult(Set<MultiKey<EventBean>> newEvents, Set<MultiKey<EventBean>> oldEvents)
    {
        EventBean[] selectOldEvents = null;
        EventBean[] selectNewEvents = null;

        if (optionalHavingNode == null)
        {
            selectOldEvents = ResultSetProcessorSimple.getSelectListEvents(selectExprProcessor, oldEvents, isOutputLimiting, isOutputLimitLastOnly);
        }
        else
        {
            selectOldEvents = getSelectListEvents(selectExprProcessor, oldEvents, optionalHavingNode, isOutputLimiting, isOutputLimitLastOnly);
        }

        if (!oldEvents.isEmpty())
        {
            // apply old data to aggregates
            for (MultiKey<EventBean> events : oldEvents)
            {
                aggregationService.applyLeave(events.getArray(), null);
            }
        }

        if (!newEvents.isEmpty())
        {
            // apply new data to aggregates
            for (MultiKey<EventBean> events : newEvents)
            {
                aggregationService.applyEnter(events.getArray(), null);
            }
        }

        if (optionalHavingNode == null)
        {
            selectNewEvents = ResultSetProcessorSimple.getSelectListEvents(selectExprProcessor, newEvents, isOutputLimiting, isOutputLimitLastOnly);
        }
        else
        {
            selectNewEvents = getSelectListEvents(selectExprProcessor, newEvents, optionalHavingNode, isOutputLimiting, isOutputLimitLastOnly);
        }

        if ((selectNewEvents == null) && (selectOldEvents == null))
        {
            return null;
        }
        return new Pair<EventBean[], EventBean[]>(selectNewEvents, selectOldEvents);
    }

    public Pair<EventBean[], EventBean[]> processViewResult(EventBean[] newData, EventBean[] oldData)
    {
        EventBean[] selectOldEvents = null;
        EventBean[] selectNewEvents = null;

        // generate old events using select expressions
        if (optionalHavingNode == null)
        {
            selectOldEvents = ResultSetProcessorSimple.getSelectListEvents(selectExprProcessor, oldData, isOutputLimiting, isOutputLimitLastOnly);
        }
        // generate old events using having then select
        else
        {
            selectOldEvents = getSelectListEvents(selectExprProcessor, oldData, optionalHavingNode, isOutputLimiting, isOutputLimitLastOnly);
        }

        EventBean[] eventsPerStream = new EventBean[1];
        if (oldData != null)
        {
            // apply old data to aggregates
            for (int i = 0; i < oldData.length; i++)
            {
                eventsPerStream[0] = oldData[i];
                aggregationService.applyLeave(eventsPerStream, null);
            }
        }

        if (newData != null)
        {
            // apply new data to aggregates
            for (int i = 0; i < newData.length; i++)
            {
                eventsPerStream[0] = newData[i];
                aggregationService.applyEnter(eventsPerStream, null);
            }
        }

        // generate new events using select expressions
        if (optionalHavingNode == null)
        {
            selectNewEvents = ResultSetProcessorSimple.getSelectListEvents(selectExprProcessor, newData, isOutputLimiting, isOutputLimitLastOnly);
        }
        else
        {
            selectNewEvents = getSelectListEvents(selectExprProcessor, newData, optionalHavingNode, isOutputLimiting, isOutputLimitLastOnly);
        }

        if ((selectNewEvents == null) && (selectOldEvents == null))
        {
            return null;
        }

        return new Pair<EventBean[], EventBean[]>(selectNewEvents, selectOldEvents);
    }

    private static EventBean[] getSelectListEvents(SelectExprProcessor exprProcessor, EventBean[] events, ExprNode optionalHavingNode, boolean isOutputLimiting, boolean isOutputLimitLastOnly)
    {
        if (isOutputLimiting)
        {
    	    events = ResultSetProcessorSimple.applyOutputLimit(events, isOutputLimitLastOnly);
        }

        if (events == null)
        {
            return null;
        }

        LinkedList<EventBean> result = new LinkedList<EventBean>();
        EventBean[] eventsPerStream = new EventBean[1];

        for (int i = 0; i < events.length; i++)
        {
            eventsPerStream[0] = events[i];

            Boolean passesHaving = (Boolean) optionalHavingNode.evaluate(eventsPerStream);
            if (!passesHaving)
            {
                continue;
            }

            result.add(exprProcessor.process(eventsPerStream));
        }

        if (result.size() > 0)
        {
            return result.toArray(new EventBean[0]);
        }
        else
        {
            return null;
        }
    }

    private static EventBean[] getSelectListEvents(SelectExprProcessor exprProcessor, Set<MultiKey<EventBean>> events, ExprNode optionalHavingNode, boolean isOutputLimiting, boolean isOutputLimitLastOnly)
    {
        if (isOutputLimiting)
        {
    	    events = ResultSetProcessorSimple.applyOutputLimit(events, isOutputLimitLastOnly);
        }

        LinkedList<EventBean> result = new LinkedList<EventBean>();
        
        for (MultiKey<EventBean> key : events)
        {
            EventBean[] eventsPerStream = key.getArray();

            Boolean passesHaving = (Boolean) optionalHavingNode.evaluate(eventsPerStream);
            if (!passesHaving)
            {
                continue;
            }

            result.add(exprProcessor.process(eventsPerStream));
        }

        if (result.size() > 0)
        {
            return result.toArray(new EventBean[0]);
        }
        else
        {
            return null;
        }
    }
}
