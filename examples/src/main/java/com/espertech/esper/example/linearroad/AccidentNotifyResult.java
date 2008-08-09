/**************************************************************************************
 * Copyright (C) 2006 Esper Team. All rights reserved.                                *
 * http://esper.codehaus.org                                                          *
 * ---------------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the GPL license       *
 * a copy of which has been included with this distribution in the license.txt file.  *
 **************************************************************************************/
package com.espertech.esper.example.linearroad;

public class AccidentNotifyResult
{
    private int expressway;
    private int direction;
    private int segment;

    public AccidentNotifyResult(int expressway, int direction, int segment)
    {
        this.expressway = expressway;
        this.direction = direction;
        this.segment = segment;
    }

    public int getExpressway()
    {
        return expressway;
    }

    public void setExpressway(int expressway)
    {
        this.expressway = expressway;
    }

    public int getDirection()
    {
        return direction;
    }

    public void setDirection(int direction)
    {
        this.direction = direction;
    }

    public int getSegment()
    {
        return segment;
    }

    public void setSegment(int segment)
    {
        this.segment = segment;
    }

    public String toString()
    {
        return "expressway=" + expressway +
                " direction=" + direction +
                " segment=" + segment;
    }

    public boolean equals(Object other)
    {
        if (!(other instanceof AccidentNotifyResult))
        {
            return false;
        }

        AccidentNotifyResult otherResult = (AccidentNotifyResult) other;

        if ((otherResult.expressway != this.expressway) ||
            (otherResult.direction != this.direction) ||
            (otherResult.segment != this.segment))
        {
            return false;
        }

        return true;
    }
}
