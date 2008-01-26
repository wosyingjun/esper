package net.esper.regression.client;

import net.esper.support.bean.SupportBean;
import net.esper.support.bean.SupportBeanComplexProps;
import net.esper.support.bean.SupportEnum;
import net.esper.support.bean.SupportMarketDataBean;

import java.util.ArrayList;
import java.util.List;

public class MySubscriberRowByRowSpecific
{
    private ArrayList<Object[]> indicate = new ArrayList<Object[]>();

    public void update(String string, int intPrimitive)
    {
        indicate.add(new Object[] {string, intPrimitive});
    }

    public void update(int wideByte, long wideInt, double wideLong, double wideFloat)
    {
        indicate.add(new Object[] {wideByte, wideInt, wideLong, wideFloat});
    }

    public void update(SupportBean supportBean)
    {
        indicate.add(new Object[] {supportBean});
    }

    public void update(SupportBean supportBean, int value1, String value2)
    {
        indicate.add(new Object[] {supportBean, value1, value2});
    }

    public void update(SupportBeanComplexProps.SupportBeanSpecialGetterNested n,
                               SupportBeanComplexProps.SupportBeanSpecialGetterNestedNested nn)
    {
        indicate.add(new Object[] {n, nn});
    }

    public void update(String string, SupportEnum supportEnum)
    {
        indicate.add(new Object[] {string, supportEnum});
    }

    public void update(String nullableValue, Long longBoxed)
    {
        indicate.add(new Object[] {nullableValue, longBoxed});
    }

    public void update(String value, SupportMarketDataBean s1, SupportBean s0)
    {
        indicate.add(new Object[] {value, s1, s0});
    }

    public void update(SupportBean s0, SupportMarketDataBean s1)
    {
        indicate.add(new Object[] {s0, s1});
    }

    public List<Object[]> getAndResetIndicate()
    {
        List<Object[]> result = indicate;
        indicate = new ArrayList<Object[]>();
        return result;
    }
}
