package org.cip4.lib.xjdf.util;

import org.cip4.lib.xjdf.XJdfNodeFactory;
import org.cip4.lib.xjdf.schema.Media;
import org.cip4.lib.xjdf.schema.Part;
import org.cip4.lib.xjdf.schema.Resource;
import org.cip4.lib.xjdf.schema.ResourceSet;
import org.cip4.lib.xjdf.schema.ResourceType;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ResourcesTest {

    private XJdfNodeFactory nodeFactory;

    @Before
    public void setUp() throws Exception {
        nodeFactory = new XJdfNodeFactory();
    }

    private Resource getMediaResource() {
        return nodeFactory.createResource(new Media(), null);
    }

    @Test
    public void testGetResourceName() throws Exception {

        Resources Resources = new Resources(new ArrayList<ResourceSet>());
        assertEquals("Media", Resources.getResourceName(getMediaResource()));
    }

    @Test
    public void createResource() throws Exception {
        Resources resources = new Resources(new ArrayList<ResourceSet>());
        ResourceType resourceType = Mockito.mock(ResourceType.class);
        Part part = Mockito.mock(Part.class);
        Resource resource = resources.createResource(resourceType, part);
        assertEquals(1, resource.getPart().size());
        assertSame(part, resource.getPart().get(0));
        assertSame(resourceType, resource.getResourceType().getValue());
    }

    @Test
    public void testAddResource() throws Exception {
        List<ResourceSet> resourceSets = new ArrayList<>();
        Resources resources = new Resources(resourceSets);
        Resource resource = getMediaResource();
        resources.addResource(resource, "Testing");
        assertEquals(1, resourceSets.size());
        assertEquals("Media", resourceSets.get(0).getName());
        assertEquals("Testing", resourceSets.get(0).getProcessUsage());
        ResourceSet resourceSet = resourceSets.get(0);
        assertEquals(1, resourceSet.getResource().size());
        assertEquals(resource, resourceSet.getResource().get(0));
    }

    @Test
    public void testAddResourceWithCorrespondingSetPresent() throws Exception {
        Resource resource = getMediaResource();
        List<ResourceSet> resourceSets = new ArrayList<>();
        ResourceSet set = new ResourceSet().withProcessUsage("Testing").withName("Media");
        assertEquals(0, set.getResource().size());
        resourceSets.add(set);
        Resources resources = new Resources(resourceSets);

        resources.addResource(resource, "Testing");
        assertEquals(1, resourceSets.size());
        assertSame(set, resourceSets.get(0));

        ResourceSet resourceSet = resourceSets.get(0);
        assertEquals(1, resourceSet.getResource().size());
        assertEquals(resource, resourceSet.getResource().get(0));
    }

    @Test
    public void testFindResourceSetNoMatchingName() throws Exception {
        List<ResourceSet> resourceSets = new ArrayList<>();
        ResourceSet set = Mockito.mock(ResourceSet.class);
        Mockito.when(set.getName()).thenReturn("Resource1");
        Mockito.when(set.getProcessUsage()).thenReturn("ProcessUsage");
        resourceSets.add(set);

        Resources resources = new Resources(resourceSets);

        assertNull(resources.findResourceSet("Resource2", "ProcessUsage"));
    }

    @Test
    public void testFindResourceSetNoMatchingProcessUsage() throws Exception {
        List<ResourceSet> resourceSets = new ArrayList<>();
        ResourceSet set = Mockito.mock(ResourceSet.class);
        Mockito.when(set.getName()).thenReturn("Resource");
        Mockito.when(set.getProcessUsage()).thenReturn("ProcessUsage1");
        resourceSets.add(set);

        Resources resources = new Resources(resourceSets);

        assertNull(resources.findResourceSet("Resource", "ProcessUsage2"));
    }

    @Test
    public void testFindResourceSet() throws Exception {
        List<ResourceSet> resourceSets = new ArrayList<>();
        ResourceSet set1 = Mockito.mock(ResourceSet.class);
        Mockito.when(set1.getName()).thenReturn("Resource1");
        Mockito.when(set1.getProcessUsage()).thenReturn("ProcessUsage1");
        resourceSets.add(set1);

        Resources resources = new Resources(resourceSets);

        assertSame(set1, resources.findResourceSet("Resource1", "ProcessUsage1"));
    }

    @Test
    public void testFindResourceSetRespectsProcessUsage() throws Exception {
        List<ResourceSet> resourceSets = new ArrayList<>();

        ResourceSet set = Mockito.mock(ResourceSet.class);
        Mockito.when(set.getName()).thenReturn("Resource");
        Mockito.when(set.getProcessUsage()).thenReturn("ProcessUsage2");
        resourceSets.add(set);

        Resources resources = new Resources(resourceSets);

        assertSame(set, resources.findResourceSet("Resource", "ProcessUsage2"));
    }

    @Test
    public void testFindResourceSetRespectsName() throws Exception {
        List<ResourceSet> resourceSets = new ArrayList<>();

        ResourceSet set = Mockito.mock(ResourceSet.class);
        Mockito.when(set.getName()).thenReturn("Resource2");
        Mockito.when(set.getProcessUsage()).thenReturn("ProcessUsage1");
        resourceSets.add(set);

        Resources resources = new Resources(resourceSets);

        assertSame(set, resources.findResourceSet("Resource2", "ProcessUsage1"));
    }

    @Test
    public void testFindResourceSetRespectsOrder() throws Exception {
        List<ResourceSet> resourceSets = new ArrayList<>();
        ResourceSet set1 = Mockito.mock(ResourceSet.class);
        Mockito.when(set1.getName()).thenReturn("Resource");
        Mockito.when(set1.getProcessUsage()).thenReturn("ProcessUsage");
        resourceSets.add(set1);

        ResourceSet set2 = Mockito.mock(ResourceSet.class);
        Mockito.when(set2.getName()).thenReturn("Resource");
        Mockito.when(set2.getProcessUsage()).thenReturn("ProcessUsage");
        resourceSets.add(set2);

        Resources resources = new Resources(resourceSets);

        assertSame(set1, resources.findResourceSet("Resource", "ProcessUsage"));
        assertNotSame(set2, resources.findResourceSet("Resource", "ProcessUsage"));
    }

    @Test
    public void testAddResourceSetLexicographic1() throws Exception {
        List<ResourceSet> resourceSets = new ArrayList<>();
        Resources resources = new Resources(resourceSets);

        ResourceSet a = new ResourceSet().withName("A");
        ResourceSet b = new ResourceSet().withName("B");
        resources.addResourceSet(b);
        resources.addResourceSet(a);

        assertEquals(a, resourceSets.get(0));
        assertEquals(b, resourceSets.get(1));
    }

    @Test
    public void testAddResourceSetLexicographic2() throws Exception {
        List<ResourceSet> resourceSets = new ArrayList<>();
        Resources resources = new Resources(resourceSets);

        ResourceSet a = new ResourceSet().withName("A");
        ResourceSet b = new ResourceSet().withName("B");
        resources.addResourceSet(a);
        resources.addResourceSet(b);

        assertEquals(a, resourceSets.get(0));
        assertEquals(b, resourceSets.get(1));
    }

    @Test
    public void testAddResourceSetSameName() throws Exception {
        List<ResourceSet> resourceSets = new ArrayList<>();
        Resources resources = new Resources(resourceSets);

        ResourceSet a1 = new ResourceSet().withName("A");
        ResourceSet a2 = new ResourceSet().withName("A");
        resources.addResourceSet(a1);
        resources.addResourceSet(a2);

        assertEquals(a1, resourceSets.get(0));
        assertEquals(a2, resourceSets.get(1));
    }

    @Test
    public void addResource() throws Exception {
        List<ResourceSet> resourceSets = new ArrayList<>();
        Resources resources = new Resources(resourceSets);

        ResourceType resourceType = Mockito.mock(ResourceType.class);
        Part part = Mockito.mock(Part.class);
        String processUsage = "Testing";

        resources.addResource(resourceType, part, processUsage);

        assertEquals(1, resourceSets.size());
        ResourceSet resourceSet = resourceSets.get(0);
        assertSame(processUsage, resourceSet.getProcessUsage());
        assertEquals(1, resourceSet.getResource().size());
        Resource resource = resourceSet.getResource().get(0);
        assertSame(part, resource.getPart().get(0));
        assertSame(resourceType, resource.getResourceType().getValue());
    }
}