/**************************************************************************************
 * Copyright (C) 2006 Esper Team. All rights reserved.                                *
 * http://esper.codehaus.org                                                          *
 * ---------------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the GPL license       *
 * a copy of which has been included with this distribution in the license.txt file.  *
 **************************************************************************************/
package com.espertech.esper.example.transaction.sim;

import com.espertech.esper.example.transaction.TxnEventBase;

import java.io.IOException;
import java.io.PrintStream;
import java.util.List;
import java.util.Map;

/** Interface to output events in your preferred format.
 *
 *
 */
public interface OutputStream {
    public void output(List<TxnEventBase> bucket) throws IOException;
}
