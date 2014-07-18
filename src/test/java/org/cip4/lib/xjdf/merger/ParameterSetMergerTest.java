package org.cip4.lib.xjdf.merger;

import org.cip4.lib.xjdf.schema.Parameter;
import org.cip4.lib.xjdf.schema.ParameterSet;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class ParameterSetMergerTest {

    @Test
    public void testMerge() throws Exception {
        ParameterSet baseSet = new ParameterSet();
        ParameterSet mergeSet = new ParameterSet();
        Parameter parameter = new Parameter();
        mergeSet.getParameter().add(parameter);

        ParameterSetMerger ParameterSetMerger = new ParameterSetMerger();
        ParameterSetMerger.merge(baseSet, mergeSet);

        assertEquals(1, baseSet.getParameter().size());
        assertSame(parameter, baseSet.getParameter().get(0));
    }
}