package net.esper.core;

import net.esper.collection.Pair;
import net.esper.event.EventBean;
import net.esper.event.NaturalEventBean;
import net.sf.cglib.reflect.FastClass;
import net.sf.cglib.reflect.FastMethod;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * A result delivery strategy that uses an "update" method that accepts a pair of object array array.
 */
public class ResultDeliveryStrategyObjectArr implements ResultDeliveryStrategy
{
    private static Log log = LogFactory.getLog(ResultDeliveryStrategyImpl.class);
    private final Object subscriber;
    private final FastMethod fastMethod;

    /**
     * Ctor.
     * @param subscriber is the subscriber to deliver to
     * @param method the method to invoke
     */
    public ResultDeliveryStrategyObjectArr(Object subscriber, Method method)
    {
        this.subscriber = subscriber;
        FastClass fastClass = FastClass.create(subscriber.getClass());
        this.fastMethod = fastClass.getMethod(method);
    }

    public void execute(Pair<EventBean[], EventBean[]> result)
    {
        Object[][] newData = convert(result.getFirst());
        Object[][] oldData = convert(result.getSecond());

        Object[] params = new Object[] {newData, oldData};
        try {
            fastMethod.invoke(subscriber, params);
        }
        catch (InvocationTargetException e) {
            ResultDeliveryStrategyImpl.handle(log, e, params, subscriber, fastMethod);
        }
    }

    private Object[][] convert(EventBean[] events)
    {
        if ((events == null) || (events.length == 0))
        {
            return null;
        }

        Object[][] result = new Object[events.length][];
        int length = 0;
        for (int i = 0; i < result.length; i++)
        {
            if (events[i] instanceof NaturalEventBean)
            {
                NaturalEventBean natural = (NaturalEventBean) events[i];
                result[length] = natural.getNatural();
                length++;
            }
        }

        if (length == 0)
        {
            return null;
        }
        if (length != events.length)
        {
            Object[][] reduced = new Object[length][];
            System.arraycopy(result, 0, reduced, 0, length);
            result = reduced;
        }
        return result;
    }
}
