package net.esper.eql.core;

import net.esper.eql.expression.ExprValidationException;
import net.esper.event.EventType;
import net.esper.event.EventBean;
import net.esper.event.NaturalEventBean;
import net.esper.core.StatementResultService;

/**
 * A select expression processor that check what type of result (synthetic and natural) event is expected and
 * produces.
 */
public class SelectExprResultProcessor implements SelectExprProcessor
{
    private final StatementResultService statementResultService;
    private final SelectExprProcessor syntheticProcessor;
    private final BindProcessor bindProcessor;

    /**
     * Ctor.
     * @param statementResultService for awareness of listeners and subscribers handles output results
     * @param syntheticProcessor is the processor generating synthetic events according to the select clause
     * @param bindProcessor for generating natural object column results
     * @throws ExprValidationException if the validation failed
     */
    public SelectExprResultProcessor(StatementResultService statementResultService,
                                     SelectExprProcessor syntheticProcessor,
                                     BindProcessor bindProcessor)
            throws ExprValidationException
    {
        this.statementResultService = statementResultService;
        this.syntheticProcessor = syntheticProcessor;
        this.bindProcessor = bindProcessor;
    }

    public EventType getResultEventType()
    {
        return syntheticProcessor.getResultEventType();
    }

    public EventBean process(EventBean[] eventsPerStream, boolean isNewData, boolean isSynthesize)
    {
        if ((isSynthesize) && (!statementResultService.isMakeNatural()))
        {
            return syntheticProcessor.process(eventsPerStream, isNewData, isSynthesize);
        }

        EventBean syntheticEvent = null;
        EventType syntheticEventType = null;
        if (statementResultService.isMakeSynthetic() || isSynthesize)
        {
            syntheticEvent = syntheticProcessor.process(eventsPerStream, isNewData, isSynthesize);

            if (!statementResultService.isMakeNatural())
            {
                return syntheticEvent;
            }

            syntheticEventType = syntheticProcessor.getResultEventType();
        }

        if (!statementResultService.isMakeNatural())
        {
            return null; // neither synthetic nor natural required, be cheap and generate no output event
        }

        Object[] parameters = bindProcessor.process(eventsPerStream, isNewData);
        return new NaturalEventBean(syntheticEventType, parameters, syntheticEvent);
    }
}
