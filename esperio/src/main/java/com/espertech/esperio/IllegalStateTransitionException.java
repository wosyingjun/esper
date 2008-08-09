/**************************************************************************************
 * Copyright (C) 2006 Esper Team. All rights reserved.                                *
 * http://esper.codehaus.org                                                          *
 * ---------------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the GPL license       *
 * a copy of which has been included with this distribution in the license.txt file.  *
 **************************************************************************************/
package com.espertech.esperio;

import com.espertech.esper.client.EPException;

/**
 * Thrown when an illegal Adapter state transition is attempted.
 */
public class IllegalStateTransitionException extends EPException
{
	/**
	 * @param message - an explanation of the cause of the exception
	 */
	public IllegalStateTransitionException(String message)
	{
		super(message);
	}
}
