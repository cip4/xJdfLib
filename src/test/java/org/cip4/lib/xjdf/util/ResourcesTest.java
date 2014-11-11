package org.cip4.lib.xjdf.util;

import org.cip4.lib.xjdf.XJdfNodeFactory;
import org.cip4.lib.xjdf.schema.Media;
import org.cip4.lib.xjdf.schema.Resource;
import org.cip4.lib.xjdf.schema.ResourceSet;
import org.cip4.lib.xjdf.schema.SetType;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ResourcesTest {

    @Test
    public void testGetAssetName() throws Exception {
        XJdfNodeFactory nodeFactory = new XJdfNodeFactory();
        Assets<ResourceSet, Resource> Resources = new Resources(new ArrayList<SetType>());
        assertEquals("Media", Resources.getAssetName(nodeFactory.createResource(new Media(), null)));
    }

    @Test
    public void testCreateSet() throws Exception {
        Assets Resources = new Resources(new ArrayList<SetType>());
        assertTrue(Resources.createSet() instanceof ResourceSet);
    }

    @Test
    public void testAddAssets() throws Exception {
        XJdfNodeFactory nodeFactory = new XJdfNodeFactory();
        Assets<ResourceSet, Resource> Resources = new Resources(new ArrayList<SetType>());
        ResourceSet ResourceSet = new ResourceSet();
        Resource Resource = nodeFactory.createResource(new Media(), null);
        Resources.addAssets(ResourceSet, Resource);
        assertEquals(1, ResourceSet.getResource().size());
        assertSame(Resource, ResourceSet.getResource().get(0));
    }
}