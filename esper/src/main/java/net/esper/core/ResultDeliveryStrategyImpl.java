package net.esper.core;

import net.esper.event.EventBean;
import net.esper.event.NaturalEventBean;
import net.esper.collection.Pair;
import net.esper.client.EPException;
import net.sf.cglib.reflect.FastMethod;
import net.sf.cglib.reflect.FastClass;

import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * A result delivery strategy that uses a matching "update" method and
 * optional start, end, and updateRStream methods, to deliver column-wise to parameters
 * of the update method.
 */
public class ResultDeliveryStrategyImpl implements ResultDeliveryStrategy
{
    private static Log log = LogFactory.getLog(ResultDeliveryStrategyImpl.class);
    private final Object subscriber;
    private final FastMethod updateFastMethod;
    private final FastMethod startFastMethod;
    private final FastMethod endFastMethod;
    private final FastMethod updateRStreamFastMethod;
    private final DeliveryConvertor deliveryConvertor;

    /**
     * Ctor.
     * @param subscriber is the subscriber receiving method invocations
     * @param deliveryConvertor for converting individual rows
     * @param method to deliver the insert stream to
     * @param startMethod to call to indicate when delivery starts, or null if no such indication is required
     * @param endMethod to call to indicate when delivery ends, or null if no such indication is required
     * @param rStreamMethod to deliver the remove stream to, or null if no such indication is required
     */
    public ResultDeliveryStrategyImpl(Object subscriber, DeliveryConvertor deliveryConvertor, Method method, Method startMethod, Method endMethod, Method rStreamMethod)
    {
        this.subscriber = subscriber;
        this.deliveryConvertor = deliveryConvertor;
        FastClass fastClass = FastClass.create(subscriber.getClass());
        this.updateFastMethod = fastClass.getMethod(method);
        
        if (startMethod != null)
        {
            startFastMethod = fastClass.getMethod(startMethod);
        }
        else
        {
            startFastMethod = null;
        }

        if (endMethod != null)
        {
            endFastMethod = fastClass.getMethod(endMethod);
        }
        else
        {
            endFastMethod = null;
        }

        if (rStreamMethod != null)
        {
            updateRStreamFastMethod = fastClass.getMethod(rStreamMethod);
        }
        else
        {
            updateRStreamFastMethod = null;
        }
    }

    public void execute(Pair<EventBean[], EventBean[]> result)
    {
        if (startFastMethod != null)
        {
            int countNew = count(result.getFirst());
            int countOld = count(result.getSecond());

            Object[] params = new Object[] {countNew, countOld};
            try {
                startFastMethod.invoke(subscriber, params);
            }
            catch (InvocationTargetException e) {
                handle(log, e, params, subscriber, startFastMethod);
            }
        }

        EventBean[] newData = result.getFirst();
        EventBean[] oldData = result.getSecond();

        if ((newData != null) && (newData.length > 0)) {
            for (int i = 0; i < newData.length; i++) {
                EventBean event = newData[i];
                if (event instanceof NaturalEventBean) {
                    NaturalEventBean natural = (NaturalEventBean) event;
                    Object[] params = deliveryConvertor.convertRow(natural.getNatural());
                    try {
                        updateFastMethod.invoke(subscriber, params);
                    }
                    catch (InvocationTargetException e) {
                        handle(log, e, params, subscriber, updateFastMethod);
                    }
                }
            }
        }

        if ((updateRStreamFastMethod != null) && (oldData != null) && (oldData.length > 0)) {
            for (int i = 0; i < oldData.length; i++) {
                EventBean event = oldData[i];
                if (event instanceof NaturalEventBean) {
                    NaturalEventBean natural = (NaturalEventBean) event;
                    Object[] params = deliveryConvertor.convertRow(natural.getNatural());
                    try {
                        updateRStreamFastMethod.invoke(subscriber, params);
                    }
                    catch (InvocationTargetException e) {
                        handle(log, e, params, subscriber, updateRStreamFastMethod);
                    }
                }
            }
        }

        if (endFastMethod != null) {
            try {
                endFastMethod.invoke(subscriber, null);
            }
            catch (InvocationTargetException e) {
                handle(log, e, null, subscriber, endFastMethod);
            }
        }
    }

    /**
     * Handle the exception, displaying a nice message and converting to {@link EPException}.
     * @param logger is the logger to use for error logging
     * @param e is the exception
     * @param params the method parameters
     * @param subscriber the object to deliver to
     * @param method the method to call
     * @throws EPException converted from the passed invocation exception
     */
    protected static void handle(Log logger, InvocationTargetException e, Object[] params, Object subscriber, FastMethod method) throws EPException {
        String message = "Invocation exception when invoking method '" + method.getName() +
                "' on subscriber class '" + subscriber.getClass().getSimpleName() +
                "' for parameters " + ((params == null) ? "null" : Arrays.toString(params)) +
                " : " + e.getTargetException().getClass().getSimpleName() + " : " + e.getTargetException().getMessage();
        logger.error(message, e.getTargetException());
        throw new EPException(message, e.getTargetException());
    }

    private int count(EventBean[] events) {
        if (events == null)
        {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < events.length; i++)
        {
            EventBean event = events[i];
            if (event instanceof NaturalEventBean)
            {
                count++;
            }
        }
        return count;
    }
}
