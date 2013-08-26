/*
 * *************************************************************************************
 *  Copyright (C) 2008 EsperTech, Inc. All rights reserved.                            *
 *  http://esper.codehaus.org                                                          *
 *  http://www.espertech.com                                                           *
 *  ---------------------------------------------------------------------------------- *
 *  The software in this package is published under the terms of the GPL license       *
 *  a copy of which has been included with this distribution in the license.txt file.  *
 * *************************************************************************************
 */

package com.espertech.esper.client.dataflow.io;

import com.espertech.esper.event.EventBeanUtility;
import com.espertech.esper.util.SerializerUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.IOException;

public class DataInputToObjectCollectorSerializable implements DataInputToObjectCollector {
    private static final Log log = LogFactory.getLog(DataInputToObjectCollectorSerializable.class);

    public void collect(DataInputToObjectCollectorContext context) throws IOException {
        int size = context.getDataInput().readInt();
        byte[] bytes = new byte[size];
        context.getDataInput().readFully(bytes);
        Object event = SerializerUtil.byteArrToObject(bytes);
        if (log.isDebugEnabled()) {
            log.debug("Submitting event " + EventBeanUtility.summarizeUnderlying(event));
        }
        context.getEmitter().submit(event);
    }
}
