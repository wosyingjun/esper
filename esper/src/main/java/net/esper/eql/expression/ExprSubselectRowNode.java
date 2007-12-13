package net.esper.eql.expression;

import net.esper.eql.spec.StatementSpecRaw;
import net.esper.eql.core.StreamTypeService;
import net.esper.eql.core.MethodResolutionService;
import net.esper.eql.core.ViewResourceDelegate;
import net.esper.eql.variable.VariableService;
import net.esper.event.EventBean;
import net.esper.schedule.TimeProvider;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Set;

/**
 * Represents a subselect in an expression tree.
 */
public class ExprSubselectRowNode extends ExprSubselectNode
{
    private static final Log log = LogFactory.getLog(ExprSubselectRowNode.class);

    /**
     * Ctor.
     * @param statementSpec is the lookup statement spec from the parser, unvalidated
     */
    public ExprSubselectRowNode(StatementSpecRaw statementSpec)
    {
        super(statementSpec);
    }

    public Class getType() throws ExprValidationException
    {
        if (selectClause == null)   // wildcards allowed
        {
            return rawEventType.getUnderlyingType();
        }
        return selectClause.getType();
    }

    public void validate(StreamTypeService streamTypeService, MethodResolutionService methodResolutionService, ViewResourceDelegate viewResourceDelegate, TimeProvider timeProvider, VariableService variableService) throws ExprValidationException
    {
    }    

    public Object evaluate(EventBean[] eventsPerStream, boolean isNewData, Set<EventBean> matchingEvents)
    {
        if (matchingEvents == null)
        {
            return null;
        }
        if (matchingEvents.size() == 0)
        {
            return null;
        }
        if ((filterExpr == null) && (matchingEvents.size() > 1))
        {
            log.warn("Subselect returned more then one row in subselect '" + toExpressionString() + "', returning null result");
            return null;
        }

        // Evaluate filter
        EventBean subSelectResult = null;
        EventBean[] events = new EventBean[eventsPerStream.length + 1];
        System.arraycopy(eventsPerStream, 0, events, 1, eventsPerStream.length);

        if (filterExpr != null)
        {
            for (EventBean subselectEvent : matchingEvents)
            {
                // Prepare filter expression event list
                events[0] = subselectEvent;

                Boolean pass = (Boolean) filterExpr.evaluate(events, true);
                if ((pass != null) && (pass))
                {
                    if (subSelectResult != null)
                    {
                        log.warn("Subselect returned more then one row in subselect '" + toExpressionString() + "', returning null result");
                        return null;
                    }
                    subSelectResult = subselectEvent;
                }
            }

            if (subSelectResult == null)
            {
                return null;
            }
        }
        else
        {
            subSelectResult = matchingEvents.iterator().next();
        }

        events[0] = subSelectResult;
        Object result;

        if (selectClause != null)
        {
            result = selectClause.evaluate(events, true);
        }
        else
        {
            result = events[0].getUnderlying();
        }

        return result;
    }
}
