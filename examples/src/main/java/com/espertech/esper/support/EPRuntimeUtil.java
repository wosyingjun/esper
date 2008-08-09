/**************************************************************************************
 * Copyright (C) 2006 Esper Team. All rights reserved.                                *
 * http://esper.codehaus.org                                                          *
 * ---------------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the GPL license       *
 * a copy of which has been included with this distribution in the license.txt file.  *
 **************************************************************************************/
package com.espertech.esper.support;

import com.espertech.esper.client.EPRuntime;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;

/**
 * Utility methods for monitoring a EPRuntime instance.
 */
public class EPRuntimeUtil
{
    public static boolean awaitCompletion(EPRuntime epRuntime,
                                       int numEventsExpected,
                                       int numSecAwait,
                                       int numSecThreadSleep,
                                       int numSecThreadReport)
    {
        log.info(".awaitCompletion Waiting for completion, expecting " + numEventsExpected +
                 " events within " + numSecAwait + " sec");

        int secondsWaitTotal = numSecAwait;
        long lastNumEventsProcessed = 0;
        int secondsUntilReport = 0;

        long startTimeMSec = System.currentTimeMillis();
        long endTimeMSec = 0;

        while (secondsWaitTotal > 0)
        {
            try
            {
                Thread.sleep(numSecThreadSleep * 1000);
            }
            catch (InterruptedException ex)
            {
            }

            secondsWaitTotal -= numSecThreadSleep;
            secondsUntilReport += numSecThreadSleep;
            long currNumEventsProcessed = epRuntime.getNumEventsReceived();

            if (secondsUntilReport > numSecThreadReport)
            {
                long numPerSec = (currNumEventsProcessed - lastNumEventsProcessed) / numSecThreadReport;
                log.info(".awaitCompletion received=" + epRuntime.getNumEventsReceived() +
                         "  emitted=" + epRuntime.getNumEventsEmitted() +
                         "  processed=" + currNumEventsProcessed +
                         "  perSec=" + numPerSec);
                lastNumEventsProcessed = currNumEventsProcessed;
                secondsUntilReport = 0;
            }

            // Completed loop if the total event count has been reached
            if (epRuntime.getNumEventsReceived() == numEventsExpected)
            {
                endTimeMSec = System.currentTimeMillis();
                break;
            }
        }

        if (endTimeMSec == 0)
        {
            log.info(".awaitCompletion Not completed within " + numSecAwait + " seconds");
            return false;
        }

        long totalUnitsProcessed = epRuntime.getNumEventsReceived();
        long deltaTimeSec = (endTimeMSec - startTimeMSec) / 1000;

        long numPerSec = 0;
        if (deltaTimeSec > 0)
        {
            numPerSec = (totalUnitsProcessed) / deltaTimeSec;
        }
        else
        {
            numPerSec = -1;
        }

        log.info(".awaitCompletion Completed, sec=" + deltaTimeSec + "  avgPerSec=" + numPerSec);

        long numReceived = epRuntime.getNumEventsReceived();
        long numReceivedPerSec = 0;
        if (deltaTimeSec > 0)
        {
            numReceivedPerSec = (numReceived) / deltaTimeSec;
        }
        else
        {
            numReceivedPerSec = -1;
        }

        log.info(".awaitCompletion Runtime reports, numReceived=" + numReceived +
                 "  numProcessed=" + epRuntime.getNumEventsReceived() +
                 "  perSec=" +  numReceivedPerSec +
                 "  numEmitted=" + epRuntime.getNumEventsEmitted()
                 );

        return true;
    }

    private static final Log log = LogFactory.getLog(EPRuntimeUtil.class);
}
