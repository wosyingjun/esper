/**************************************************************************************
 * Copyright (C) 2006 Esper Team. All rights reserved.                                *
 * http://esper.codehaus.org                                                          *
 * ---------------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the GPL license       *
 * a copy of which has been included with this distribution in the license.txt file.  *
 **************************************************************************************/
package com.espertech.esper.example.servershellclient;

import com.espertech.esper.client.UpdateListener;
import com.espertech.esper.event.EventBean;

import java.io.Serializable;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ClientSideUpdateListener implements Serializable, UpdateListener
{
    private static Log log = LogFactory.getLog(ClientSideUpdateListener.class);

    public void update(EventBean[] newEvents, EventBean[] oldEvents)
    {
        log.info("Single duration over 9.9: IPAddress: " + newEvents[0].get("ipAddress") +
             " Duration: " + newEvents[0].get("duration"));
    }

}
