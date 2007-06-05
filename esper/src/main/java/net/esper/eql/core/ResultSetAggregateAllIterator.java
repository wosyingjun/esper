package net.esper.eql.core;

import net.esper.event.EventBean;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Method to transform an event based on the select expression.
 */
public class ResultSetAggregateAllIterator implements Iterator<EventBean>
{
    private final Iterator<EventBean> sourceIterator;
    private final ResultSetProcessorAggregateAll resultSetProcessor;
    private EventBean nextResult;
    private final EventBean[] eventsPerStream;

    public ResultSetAggregateAllIterator(Iterator<EventBean> sourceIterator, ResultSetProcessorAggregateAll resultSetProcessor)
    {
        this.sourceIterator = sourceIterator;
        this.resultSetProcessor = resultSetProcessor;
        eventsPerStream = new EventBean[1];
    }

    public boolean hasNext()
    {
        if (nextResult != null)
        {
            return true;
        }
        findNext();
        if (nextResult != null)
        {
            return true;
        }
        return false;
    }

    public EventBean next()
    {
        if (nextResult != null)
        {
            EventBean result = nextResult;
            nextResult = null;
            return result;
        }
        findNext();
        if (nextResult != null)
        {
            EventBean result = nextResult;
            nextResult = null;
            return result;
        }
        throw new NoSuchElementException();
    }

    private void findNext()
    {
        while (sourceIterator.hasNext())
        {
            EventBean candidate = sourceIterator.next();
            eventsPerStream[0] = candidate;

            Boolean pass = true;
            if (resultSetProcessor.getOptionalHavingNode() != null)
            {
                pass = (Boolean) resultSetProcessor.getOptionalHavingNode().evaluate(eventsPerStream, true);
            }
            if (!pass)
            {
                continue;
            }

            if (resultSetProcessor.getSelectExprProcessor() == null)
            {
                nextResult = candidate;
            }
            else
            {
                nextResult = resultSetProcessor.getSelectExprProcessor().process(eventsPerStream, true);
            }

            break;
        }
    }

    public void remove()
    {
        throw new UnsupportedOperationException();
    }
}
