package org.cip4.lib.xjdf.util;

import org.cip4.lib.xjdf.XJdfNodeFactory;
import org.cip4.lib.xjdf.schema.Parameter;
import org.cip4.lib.xjdf.schema.ParameterSet;
import org.cip4.lib.xjdf.schema.ParameterType;
import org.cip4.lib.xjdf.schema.Part;
import org.cip4.lib.xjdf.schema.RunList;
import org.cip4.lib.xjdf.schema.SetType;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ParametersTest {

    @Test
    public void testGetAssetName() throws Exception {
        XJdfNodeFactory nodeFactory = new XJdfNodeFactory();
        Parameters parameters = new Parameters(new ArrayList<SetType>());
        assertEquals("RunList", parameters.getAssetName(nodeFactory.createParameter(new RunList())));
    }

    @Test
    public void testCreateSet() throws Exception {
        Assets parameters = new Parameters(new ArrayList<SetType>());
        assertTrue(parameters.createSet() instanceof ParameterSet);
    }

    @Test
    public void testAddAssets() throws Exception {
        Parameters parameters = new Parameters(new ArrayList<SetType>());
        ParameterSet parameterSet = new ParameterSet();
        Parameter parameter = parameters.getNodeFactory().createParameter(new RunList());
        parameters.addAssets(parameterSet, parameter);
        assertEquals(1, parameterSet.getParameter().size());
        assertSame(parameter, parameterSet.getParameter().get(0));
    }

    @Test
    public void createAsset() throws Exception {
        Parameters parameters = new Parameters(new ArrayList<SetType>());
        ParameterType parameterType = Mockito.mock(ParameterType.class);
        Part part = Mockito.mock(Part.class);
        Parameter parameter = parameters.createAsset(parameterType, part);
        assertSame(1, parameter.getPart().size());
        assertSame(part, parameter.getPart().get(0));
        assertSame(parameterType, parameter.getParameterType().getValue());
    }
}