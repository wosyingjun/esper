/**************************************************************************************
 * Copyright (C) 2006 Esper Team. All rights reserved.                                *
 * http://esper.codehaus.org                                                          *
 * ---------------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the GPL license       *
 * a copy of which has been included with this distribution in the license.txt file.  *
 **************************************************************************************/
package com.espertech.esper.example.qos_sla.monitor;

import com.espertech.esper.client.*;
import com.espertech.esper.example.qos_sla.eventbean.OperationMeasurement;
import com.espertech.esper.event.EventBean;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ServiceHealthMonitor
{
    public ServiceHealthMonitor()
    {
        EPAdministrator admin = EPServiceProviderManager.getDefaultProvider().getEPAdministrator();

        String event = OperationMeasurement.class.getName();

        EPStatement statView = admin.createPattern("every (" +
                event + "(success=false)->" +
                event + "(success=false)->" +
                event + "(success=false))");

        statView.addListener(new UpdateListener()
        {
            public void update(EventBean[] newEvents, EventBean[] oldEvents)
            {
                log.debug(".update Alert, detected 3 erros in a row");
            }
        });
    }

    private static final Log log = LogFactory.getLog(ServiceHealthMonitor.class);
}
