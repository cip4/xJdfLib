package org.cip4.lib.xjdf.util;

import org.cip4.lib.xjdf.XJdfNodeFactory;
import org.cip4.lib.xjdf.schema.Parameter;
import org.cip4.lib.xjdf.schema.ParameterSet;
import org.cip4.lib.xjdf.schema.RunList;
import org.cip4.lib.xjdf.schema.SetType;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ParametersTest {

    @Test
    public void testGetAssetName() throws Exception {
        XJdfNodeFactory nodeFactory = new XJdfNodeFactory();
        Assets<ParameterSet, Parameter> parameters = new Parameters(new ArrayList<SetType>());
        assertEquals("RunList", parameters.getAssetName(nodeFactory.createParameter(new RunList())));
    }

    @Test
    public void testCreateSet() throws Exception {
        Assets parameters = new Parameters(new ArrayList<SetType>());
        assertTrue(parameters.createSet() instanceof ParameterSet);
    }

    @Test
    public void testAddAssets() throws Exception {
        XJdfNodeFactory nodeFactory = new XJdfNodeFactory();
        Assets<ParameterSet, Parameter> parameters = new Parameters(new ArrayList<SetType>());
        ParameterSet parameterSet = new ParameterSet();
        Parameter parameter = nodeFactory.createParameter(new RunList());
        parameters.addAssets(parameterSet, parameter);
        assertEquals(1, parameterSet.getParameter().size());
        assertSame(parameter, parameterSet.getParameter().get(0));
    }
}