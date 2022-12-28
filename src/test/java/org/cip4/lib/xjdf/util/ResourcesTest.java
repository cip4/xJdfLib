package org.cip4.lib.xjdf.util;

import jakarta.xml.bind.JAXBElement;
import org.cip4.lib.xjdf.schema.ColorantControl;
import org.cip4.lib.xjdf.schema.Layout;
import org.cip4.lib.xjdf.schema.Media;
import org.cip4.lib.xjdf.schema.Part;
import org.cip4.lib.xjdf.schema.Resource;
import org.cip4.lib.xjdf.schema.ResourceSet;
import org.cip4.lib.xjdf.schema.Side;
import org.cip4.lib.xjdf.schema.SpecificResource;
import org.cip4.lib.xjdf.schema.WrappingParams;
import org.cip4.lib.xjdf.xml.XJdfConstants;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.EMPTY_LIST;
import static org.cip4.lib.xjdf.schema.ColorantControl.ProcessColorModel.DEVICE_CMYK;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ResourcesTest {

    private Resource getMediaResource() {
        Resource resource = new Resource();

        QName qname = new QName(XJdfConstants.NAMESPACE_JDF20, "Media");
        JAXBElement<Media> media = new JAXBElement<>(qname, Media.class, null, new Media());
        resource.setSpecificResource(media);

        return resource;
    }

    @Test
    public void testGetResourceName() {

        Resources Resources = new Resources(new ArrayList<ResourceSet>());
        assertEquals("Media", Resources.getResourceName(getMediaResource()));
    }

    @Test
    public void createResource() {
        Resources resources = new Resources(new ArrayList<ResourceSet>());
        SpecificResource specificResource = Mockito.mock(SpecificResource.class);
        Part part = Mockito.mock(Part.class);
        Resource resource = resources.createResource(specificResource, part);
        assertEquals(1, resource.getPart().size());
        assertSame(part, resource.getPart().get(0));
        assertSame(specificResource, resource.getSpecificResource().getValue());
    }

    @Test
    public void testAddResource() {
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
    public void testAddResourceWithCorrespondingSetPresent() {
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
    public void testFindResourceSetNoMatchingName() {
        List<ResourceSet> resourceSets = new ArrayList<>();
        ResourceSet set = Mockito.mock(ResourceSet.class);
        Mockito.when(set.getName()).thenReturn("Resource1");
        Mockito.when(set.getProcessUsage()).thenReturn("ProcessUsage");
        resourceSets.add(set);

        Resources resources = new Resources(resourceSets);

        assertNull(resources.findResourceSet("Resource2", "ProcessUsage"));
    }

    @Test
    public void testFindResourceSetNoMatchingProcessUsage() {
        List<ResourceSet> resourceSets = new ArrayList<>();
        ResourceSet set = Mockito.mock(ResourceSet.class);
        Mockito.when(set.getName()).thenReturn("Resource");
        Mockito.when(set.getProcessUsage()).thenReturn("ProcessUsage1");
        resourceSets.add(set);

        Resources resources = new Resources(resourceSets);

        assertNull(resources.findResourceSet("Resource", "ProcessUsage2"));
    }

    @Test
    public void testFindResourceSet() {
        List<ResourceSet> resourceSets = new ArrayList<>();
        ResourceSet set1 = Mockito.mock(ResourceSet.class);
        Mockito.when(set1.getName()).thenReturn("Resource1");
        Mockito.when(set1.getProcessUsage()).thenReturn("ProcessUsage1");
        resourceSets.add(set1);

        Resources resources = new Resources(resourceSets);

        assertSame(set1, resources.findResourceSet("Resource1", "ProcessUsage1"));
    }

    @Test
    public void testFindResourceSetRespectsProcessUsage() {
        List<ResourceSet> resourceSets = new ArrayList<>();

        ResourceSet set = Mockito.mock(ResourceSet.class);
        Mockito.when(set.getName()).thenReturn("Resource");
        Mockito.when(set.getProcessUsage()).thenReturn("ProcessUsage2");
        resourceSets.add(set);

        Resources resources = new Resources(resourceSets);

        assertSame(set, resources.findResourceSet("Resource", "ProcessUsage2"));
    }

    @Test
    public void testFindResourceSetRespectsName() {
        List<ResourceSet> resourceSets = new ArrayList<>();

        ResourceSet set = Mockito.mock(ResourceSet.class);
        Mockito.when(set.getName()).thenReturn("Resource2");
        Mockito.when(set.getProcessUsage()).thenReturn("ProcessUsage1");
        resourceSets.add(set);

        Resources resources = new Resources(resourceSets);

        assertSame(set, resources.findResourceSet("Resource2", "ProcessUsage1"));
    }

    @Test
    public void testFindResourceSetRespectsOrder() {
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
    public void testAddResourceSetLexicographic1() {
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
    public void testAddResourceSetLexicographic2() {
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
    public void testAddResourceSetSameName() {
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
    public void addResource() {
        List<ResourceSet> resourceSets = new ArrayList<>();
        Resources resources = new Resources(resourceSets);

        SpecificResource specificResource = Mockito.mock(SpecificResource.class);
        Part part = Mockito.mock(Part.class);
        String processUsage = "Testing";

        resources.addResource(specificResource, part, processUsage);

        assertEquals(1, resourceSets.size());
        ResourceSet resourceSet = resourceSets.get(0);
        assertSame(processUsage, resourceSet.getProcessUsage());
        assertEquals(1, resourceSet.getResource().size());
        Resource resource = resourceSet.getResource().get(0);
        assertSame(part, resource.getPart().get(0));
        assertSame(specificResource, resource.getSpecificResource().getValue());
    }

    @Test
    public void isPartsMatchingForTheSameParts() {
        Part part = new Part().withProductPart("Foo");
        assertTrue(new Resources().isPartsMatching(part, part));
    }

    @Test
    public void isPartsMatchingForEqualParts() {
        Part part = new Part().withProductPart("Foo");
        Part part2 = new Part().withProductPart("Foo");
        assertTrue(new Resources().isPartsMatching(part, part2));
    }

    @Test
    public void isPatsNotMatchingForDifferentValuesForTheSameKey() {
        Part part = new Part().withProductPart("Foo");
        Part part2 = new Part().withProductPart("Foo2");
        assertFalse(new Resources().isPartsMatching(part, part2));
    }

    @Test
    public void isPatsNotMatchingForDifferentValuesForTheSameKey2() {
        Part part = new Part().withProductPart("Foo").withBinderySignatureID("Foo");
        Part part2 = new Part().withProductPart("Foo").withBinderySignatureID("Foo1");
        assertFalse(new Resources().isPartsMatching(part, part2));
    }

    @Test
    public void isPartsMatchingWhenSearchKeyIsNotContainedInPart() {
        Part searchPart = new Part().withProductPart("Foo");
        Part part = new Part();
        assertTrue(new Resources().isPartsMatching(searchPart, part));
    }

    @Test
    public void isPartsMatchingWhenPartIsNotContainedInSearchPart() {
        Part searchPart = new Part();
        Part part = new Part().withProductPart("Foo");
        assertTrue(new Resources().isPartsMatching(searchPart, part));
    }

    @Test
    public void findSpecificResourceWithoutMatchingResourceSet() {
        Resources resources = new Resources();
        resources.addResource(new WrappingParams(), new Part().withProductPart("foo"), "Wrapping");
        assertEquals(EMPTY_LIST, resources.findSpecificResource(Layout.class, new Part(), null));
    }

    @Test
    public void findSpecificResourceWithoutMatchingResource() {
        Resources resources = new Resources();
        resources.addResource(new WrappingParams(), new Part().withProductPart("foo"), null);
        assertEquals(
            EMPTY_LIST,
            resources.findSpecificResource(WrappingParams.class, new Part().withProductPart("bar"), null)
        );
    }

    @Test
    public void findSpecificResourceByConsistentPart() {
        Resources resources = new Resources();
        WrappingParams wrappingParams = new WrappingParams();
        resources.addResource(wrappingParams, new Part().withProductPart("foo"), null);
        assertEquals(
            Collections.singletonList(wrappingParams),
            resources.findSpecificResource(
                WrappingParams.class,
                new Part().withProductPart("foo").withSide(Side.FRONT),
                null
            )
        );
    }

    @Test
    public void findSpecificResourceWithMatchingResource() {
        Resources resources = new Resources();
        WrappingParams specificResource = new WrappingParams();
        resources.addResource(specificResource, new Part(), null);
        assertEquals(Collections.singletonList(specificResource), resources.findSpecificResource(
            specificResource.getClass(),
            new Part(),
            null
        ));
    }

    @Test
    public void getResourceSetsReturnsEmptyList() {
        Resources resources = new Resources();
        assertEquals(EMPTY_LIST, resources.getResourceSets());
    }

    @Test
    public void getResourceSetsReturnsCorrectResourceSets() {
        ColorantControl colorantControl = new ColorantControl().withProcessColorModel(DEVICE_CMYK);
        Part part = new Part().withProductPart("foo");
        Resources resources = new Resources();
        resources.addResource(colorantControl, part, null);

        assertEquals(1, resources.getResourceSets().size());
        List<ColorantControl> resourceList = resources.findSpecificResource(
            ColorantControl.class,
            part,
            null
        );
        assertEquals(1, resourceList.size());
        ColorantControl actual = resourceList.get(0);
        assertEquals(colorantControl, actual);
    }
}
