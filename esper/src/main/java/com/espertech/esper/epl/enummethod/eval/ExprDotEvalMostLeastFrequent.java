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

package com.espertech.esper.epl.enummethod.eval;

import com.espertech.esper.client.EventType;
import com.espertech.esper.client.util.ExpressionReturnType;
import com.espertech.esper.epl.core.MethodResolutionService;
import com.espertech.esper.epl.core.StreamTypeService;
import com.espertech.esper.epl.enummethod.dot.*;
import com.espertech.esper.epl.expression.ExprDotNodeUtility;
import com.espertech.esper.event.EventAdapterService;
import com.espertech.esper.event.arr.ObjectArrayEventType;
import com.espertech.esper.util.JavaClassHelper;

import java.util.List;

public class ExprDotEvalMostLeastFrequent extends ExprDotEvalEnumMethodBase {

    public EventType[] getAddStreamTypes(String enumMethodUsedName, List<String> goesToNames, EventType inputEventType, Class collectionComponentType, List<ExprDotEvalParam> bodiesAndParameters) {
        return ExprDotNodeUtility.getSingleLambdaParamEventType(enumMethodUsedName, goesToNames, inputEventType, collectionComponentType);
    }

    public EnumEval getEnumEval(MethodResolutionService methodResolutionService, EventAdapterService eventAdapterService, StreamTypeService streamTypeService, String statementId, String enumMethodUsedName, List<ExprDotEvalParam> bodiesAndParameters, EventType inputEventType, Class collectionComponentType, int numStreamsIncoming) {

        if (bodiesAndParameters.isEmpty()) {
            Class returnType = JavaClassHelper.getBoxedType(collectionComponentType);
            super.setTypeInfo(ExpressionReturnType.singleValue(returnType));
            return new EnumEvalMostLeastFrequentScalar(numStreamsIncoming, this.getEnumMethodEnum() == EnumMethodEnum.MOSTFREQUENT);
        }

        ExprDotEvalParamLambda first = (ExprDotEvalParamLambda) bodiesAndParameters.get(0);
        Class returnType = JavaClassHelper.getBoxedType(first.getBodyEvaluator().getType());
        super.setTypeInfo(ExpressionReturnType.singleValue(returnType));

        boolean mostFrequent = this.getEnumMethodEnum() == EnumMethodEnum.MOSTFREQUENT;
        if (inputEventType == null) {
            return new EnumEvalMostLeastFrequentScalarLamda(first.getBodyEvaluator(), first.getStreamCountIncoming(), mostFrequent,
                    (ObjectArrayEventType) first.getGoesToTypes()[0]);
        }
        return new EnumEvalMostLeastFrequentEvent(first.getBodyEvaluator(), numStreamsIncoming, mostFrequent);
    }
}
