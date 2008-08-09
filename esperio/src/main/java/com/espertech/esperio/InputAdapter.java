/**************************************************************************************
 * Copyright (C) 2006 Esper Team. All rights reserved.                                *
 * http://esper.codehaus.org                                                          *
 * ---------------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the GPL license       *
 * a copy of which has been included with this distribution in the license.txt file.  *
 **************************************************************************************/
package com.espertech.esperio;

/**
 * An InputAdapter takes some external data, converts it into events, and sends it into the runtime engine.
 */
public interface InputAdapter extends Adapter
{
    /**
     * Use for MapMessage events to indicate the event type alias.
     */
    public static final String ESPERIO_MAP_EVENT_TYPE = InputAdapter.class.getName() + "_maptype";
}
