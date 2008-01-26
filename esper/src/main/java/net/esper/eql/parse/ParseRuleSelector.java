/**************************************************************************************
 * Copyright (C) 2006 Esper Team. All rights reserved.                                *
 * http://esper.codehaus.org                                                          *
 * ---------------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the GPL license       *
 * a copy of which has been included with this distribution in the license.txt file.  *
 **************************************************************************************/
package net.esper.eql.parse;

import net.esper.eql.generated.EsperEPL2GrammarParser;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.Tree;

/**
 * For selection of the parse rule to use.
 */
public interface ParseRuleSelector
{
    /**
     * Implementations can invoke a parse rule of their choice on the parser.
     * @param parser - to invoke parse rule on
     * @return the AST tree as a result of the parsing
     * @throws RecognitionException is a parse exception
     */
    public Tree invokeParseRule(EsperEPL2GrammarParser parser) throws RecognitionException;
}




