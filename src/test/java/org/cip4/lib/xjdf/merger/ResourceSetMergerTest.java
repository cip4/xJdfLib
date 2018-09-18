package org.cip4.lib.xjdf.merger;

import org.cip4.lib.xjdf.schema.Resource;
import org.cip4.lib.xjdf.schema.ResourceSet;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ResourceSetMergerTest {

    @Test
    public void testMerge() throws Exception {
        ResourceSet baseSet = new ResourceSet();
        ResourceSet mergeSet = new ResourceSet();
        Resource resource = new Resource();
        mergeSet.getResource().add(resource);

        ResourceSetMerger resourceSetMerger = new ResourceSetMerger();
        resourceSetMerger.merge(baseSet, mergeSet);

        assertEquals(1, baseSet.getResource().size());
        assertSame(resource, baseSet.getResource().get(0));
    }
}