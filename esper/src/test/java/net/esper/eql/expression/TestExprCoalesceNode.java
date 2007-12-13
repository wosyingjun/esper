package net.esper.eql.expression;

import junit.framework.TestCase;
import net.esper.support.eql.SupportExprNode;

public class TestExprCoalesceNode extends TestCase
{
    private ExprCoalesceNode[] coalesceNodes;

    public void setUp()
    {
        coalesceNodes = new ExprCoalesceNode[5];

        coalesceNodes[0] = new ExprCoalesceNode();
        coalesceNodes[0].addChildNode(new SupportExprNode(null, Long.class));
        coalesceNodes[0].addChildNode(new SupportExprNode(null, int.class));
        coalesceNodes[0].addChildNode(new SupportExprNode(4, byte.class));

        coalesceNodes[1] = new ExprCoalesceNode();
        coalesceNodes[1].addChildNode(new SupportExprNode(null, String.class));
        coalesceNodes[1].addChildNode(new SupportExprNode("a", String.class));

        coalesceNodes[2] = new ExprCoalesceNode();
        coalesceNodes[2].addChildNode(new SupportExprNode(null, Boolean.class));
        coalesceNodes[2].addChildNode(new SupportExprNode(true, boolean.class));

        coalesceNodes[3] = new ExprCoalesceNode();
        coalesceNodes[3].addChildNode(new SupportExprNode(null, char.class));
        coalesceNodes[3].addChildNode(new SupportExprNode(null, Character.class));
        coalesceNodes[3].addChildNode(new SupportExprNode(null, char.class));
        coalesceNodes[3].addChildNode(new SupportExprNode('b', Character.class));

        coalesceNodes[4] = new ExprCoalesceNode();
        coalesceNodes[4].addChildNode(new SupportExprNode(5, float.class));
        coalesceNodes[4].addChildNode(new SupportExprNode(null, Double.class));
    }

    public void testGetType() throws Exception
    {
        for (int i = 0; i < coalesceNodes.length; i++)
        {
            coalesceNodes[i].validate(null, null, null, null, null);
        }

        assertEquals(Long.class, coalesceNodes[0].getType());
        assertEquals(String.class, coalesceNodes[1].getType());
        assertEquals(Boolean.class, coalesceNodes[2].getType());
        assertEquals(Character.class, coalesceNodes[3].getType());
        assertEquals(Double.class, coalesceNodes[4].getType());
    }

    public void testValidate() throws Exception
    {
        ExprCoalesceNode coalesceNode = new ExprCoalesceNode();
        coalesceNode.addChildNode(new SupportExprNode(1));

        // Test too few nodes under this node
        try
        {
            coalesceNode.validate(null, null, null, null, null);
            fail();
        }
        catch (ExprValidationException ex)
        {
            // Expected
        }

        // Test node result type not fitting
        coalesceNode.addChildNode(new SupportExprNode("s"));
        try
        {
            coalesceNode.validate(null, null, null, null, null);
            fail();
        }
        catch (ExprValidationException ex)
        {
            // Expected
        }
    }

    public void testEvaluate() throws Exception
    {
        for (int i = 0; i < coalesceNodes.length; i++)
        {
            coalesceNodes[i].validate(null, null, null, null, null);
        }

        assertEquals(4L, coalesceNodes[0].evaluate(null, false));
        assertEquals("a", coalesceNodes[1].evaluate(null, false));
        assertEquals(true, coalesceNodes[2].evaluate(null, false));
        assertEquals('b', coalesceNodes[3].evaluate(null, false));
        assertEquals(5D, coalesceNodes[4].evaluate(null, false));
    }

    public void testEquals() throws Exception
    {
        assertFalse(coalesceNodes[0].equalsNode(new ExprEqualsNode(true)));
        assertTrue(coalesceNodes[0].equalsNode(coalesceNodes[1]));
    }

    public void testToExpressionString() throws Exception
    {
        coalesceNodes[0].validate(null, null, null, null, null);
        assertEquals("coalesce(null,null,4)", coalesceNodes[0].toExpressionString());
    }
}
