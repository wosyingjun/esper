package com.espertech.esper.epl.thread;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.concurrent.ThreadFactory;

public class MicroThreadFactory implements ThreadFactory
{
    private static final Log log = LogFactory.getLog(MicroThreadFactory.class);
    private final String engineURI;
    private final String prefix;
    private final ThreadGroup threadGroup;
    private final int threadPriority;
    private int currThreadCount;

    public MicroThreadFactory(String engineURI, String prefix, ThreadGroup threadGroup, int threadPrio)
    {
        if (engineURI == null)
        {
            this.engineURI = "default";
        }
        else
        {
            this.engineURI = engineURI;
        }
        this.prefix = prefix;
        this.threadGroup = threadGroup;
        this.threadPriority = threadPrio;
    }

    public Thread newThread(Runnable runnable)
    {
        String name = "com.espertech.esper." + prefix + "-" + engineURI + "-" + currThreadCount;
        currThreadCount++;
        Thread t = new Thread(threadGroup, runnable, name);
        t.setDaemon(true);
        t.setPriority(threadPriority);

        if (log.isDebugEnabled())
        {
            log.debug("Creating thread '" + name + "' : " + t + " priority " + threadPriority);
        }
        return t;
    }
}
