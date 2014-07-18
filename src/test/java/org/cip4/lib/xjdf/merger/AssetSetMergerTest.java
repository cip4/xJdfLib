package org.cip4.lib.xjdf.merger;

import org.cip4.lib.xjdf.schema.ParameterSet;
import org.cip4.lib.xjdf.schema.ResourceSet;
import org.cip4.lib.xjdf.schema.SetType;
import org.junit.Test;

import static org.junit.Assert.*;

public class AssetSetMergerTest {

    private class MockClass extends AssetSetMerger<SetType> {
        @Override
        void merge(final SetType baseObject, final SetType mergeObject) throws MergeConflictException {
        }
    }

    @Test
    public void testIsMergeableNoIds() throws Exception {
        AssetSetMerger<SetType> merger = new MockClass();
        SetType baseSet = new ParameterSet();
        baseSet.setName("ColorantControl");
        SetType mergerSet = new ParameterSet();
        mergerSet.setName("ColorantControl");
        assertTrue(merger.isMergeable(baseSet, mergerSet));
    }

    @Test
    public void testIsMergeableBaseWithoutName() throws Exception {
        AssetSetMerger<SetType> merger = new MockClass();
        SetType baseSet = new ParameterSet();
        SetType mergerSet = new ParameterSet();
        mergerSet.setName("ColorantControl");
        assertFalse(merger.isMergeable(baseSet, mergerSet));
    }

    @Test
    public void testIsMergeableMergeWithoutName() throws Exception {
        AssetSetMerger<SetType> merger = new MockClass();
        SetType baseSet = new ParameterSet();
        baseSet.setName("ColorantControl");
        SetType mergerSet = new ParameterSet();
        assertFalse(merger.isMergeable(baseSet, mergerSet));
    }

    @Test
    public void testIsMergeableDifferentClasses() throws Exception {
        AssetSetMerger<SetType> merger = new MockClass();
        SetType baseSet = new ParameterSet();
        baseSet.setName("ColorantControl");
        SetType mergerSet = new ResourceSet();
        baseSet.setName("ColorantControl");
        assertFalse(merger.isMergeable(baseSet, mergerSet));
    }
}