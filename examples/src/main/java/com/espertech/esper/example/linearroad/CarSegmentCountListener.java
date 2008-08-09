/**************************************************************************************
 * Copyright (C) 2006 Esper Team. All rights reserved.                                *
 * http://esper.codehaus.org                                                          *
 * ---------------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the GPL license       *
 * a copy of which has been included with this distribution in the license.txt file.  *
 **************************************************************************************/
package com.espertech.esper.example.linearroad;

import com.espertech.esper.client.UpdateListener;
import com.espertech.esper.event.EventBean;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Map;
import java.util.List;
import java.util.LinkedList;

public class CarSegmentCountListener implements UpdateListener
{
    private List<CarSegmentCountResult> newEventList = new LinkedList<CarSegmentCountResult>();
    private List<CarSegmentCountResult> oldEventList = new LinkedList<CarSegmentCountResult>();

    public void update(EventBean[] newData, EventBean[] oldData)
    {
        if (newData != null)
        {
            process("new", newData, newEventList);
        }

        if (oldData != null)
        {
            process("old", oldData, oldEventList);
        }
    }

    private static void process(String description, EventBean[] events, List<CarSegmentCountResult> store)
    {
        StringBuffer buffer = new StringBuffer();

        for (int i = 0; i < events.length; i++)
        {
            Map segVolResult = (Map) events[i].get("segVolView");
            Map segAvgResult = (Map) events[i].get("segAvgSpeed");

            int expressway = (Integer) segVolResult.get("expressway");
            int direction = (Integer) segVolResult.get("direction");
            int segment = (Integer) segVolResult.get("segment");
            double avgSpeed = (Double) segAvgResult.get("average");
            long size = (Long) segVolResult.get("size");

            CarSegmentCountResult result = new CarSegmentCountResult(expressway, direction, segment, avgSpeed, size);
            store.add(result);

            buffer.append("event#" + i + " " + result + "\n");
        }

        log.warn(".update " + description + "...\n" + buffer.toString());
    }

    public void reset()
    {
        newEventList = new LinkedList<CarSegmentCountResult>();
        oldEventList = new LinkedList<CarSegmentCountResult>();
    }

    public Object[] getAndClearNew()
    {
        Object[] result = newEventList.toArray();
        newEventList = new LinkedList<CarSegmentCountResult>();
        return result;
    }

    public Object[] getAndClearOld()
    {
        Object[] result = oldEventList.toArray();
        oldEventList = new LinkedList<CarSegmentCountResult>();
        return result;
    }

    private static final Log log = LogFactory.getLog(CarSegmentCountListener.class);
}


