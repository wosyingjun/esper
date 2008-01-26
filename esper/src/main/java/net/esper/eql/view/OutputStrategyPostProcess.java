package net.esper.eql.view;

import net.esper.collection.Pair;
import net.esper.core.EPStatementHandle;
import net.esper.core.InternalEventRouter;
import net.esper.core.UpdateDispatchView;
import net.esper.eql.spec.SelectClauseStreamSelectorEnum;
import net.esper.event.EventBean;
import net.esper.event.NaturalEventBean;

/**
 * An output strategy that handles routing (insert-into) and stream selection.
 */
public class OutputStrategyPostProcess implements OutputStrategy
{
    private final boolean isRoute;
    private final boolean isRouteRStream;
    private final SelectClauseStreamSelectorEnum selectStreamDirEnum;
    private final InternalEventRouter internalEventRouter;
    private final EPStatementHandle epStatementHandle;

    /**
     * Ctor.
     * @param route true if this is insert-into
     * @param routeRStream true if routing the remove stream events, false if routing insert stream events
     * @param selectStreamDirEnum enumerator selecting what stream(s) are selected
     * @param internalEventRouter for performing the route operation
     * @param epStatementHandle for use in routing to determine which statement routed
     */
    public OutputStrategyPostProcess(boolean route, boolean routeRStream, SelectClauseStreamSelectorEnum selectStreamDirEnum, InternalEventRouter internalEventRouter, EPStatementHandle epStatementHandle)
    {
        isRoute = route;
        isRouteRStream = routeRStream;
        this.selectStreamDirEnum = selectStreamDirEnum;
        this.internalEventRouter = internalEventRouter;
        this.epStatementHandle = epStatementHandle;
    }

    public void output(boolean forceUpdate, Pair<EventBean[], EventBean[]> result, UpdateDispatchView finalView)
    {
        EventBean[] newEvents = result != null ? result.getFirst() : null;
        EventBean[] oldEvents = result != null ? result.getSecond() : null;

        // route first
        if (isRoute)
        {
            if ((newEvents != null) && (!isRouteRStream))
            {
                route(newEvents);
            }

            if ((oldEvents != null) && (isRouteRStream))
            {
                route(oldEvents);
            }
        }

        // discard one side of results
        if (selectStreamDirEnum == SelectClauseStreamSelectorEnum.RSTREAM_ONLY)
        {
            newEvents = oldEvents;
            oldEvents = null;
        }
        else if (selectStreamDirEnum == SelectClauseStreamSelectorEnum.ISTREAM_ONLY)
        {
            oldEvents = null;
        }
        else if (selectStreamDirEnum == SelectClauseStreamSelectorEnum.RSTREAM_ISTREAM_BOTH)
        {
            // no action required
        }
        else
        {
            throw new IllegalStateException("Unknown stream selector " + selectStreamDirEnum);
        }

        // dispatch
        if(newEvents != null || oldEvents != null)
        {
            finalView.newResult(new Pair<EventBean[], EventBean[]>(newEvents, oldEvents));
        }
        else if(forceUpdate)
        {
            finalView.newResult(new Pair<EventBean[], EventBean[]>(null, null));
        }
    }

    private void route(EventBean[] events)
    {
        for (int i = 0; i < events.length; i++)
        {
            EventBean routed = events[i];
            if (routed instanceof NaturalEventBean)
            {
                NaturalEventBean natural = (NaturalEventBean) routed;
                internalEventRouter.route(natural.getOptionalSynthetic(), epStatementHandle);
            }
            else
            {
                internalEventRouter.route(routed, epStatementHandle);
            }
        }
    }
}
