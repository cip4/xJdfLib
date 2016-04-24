package org.cip4.lib.xjdf.partition;

import org.cip4.lib.xjdf.XJdfNodeFactory;
import org.cip4.lib.xjdf.schema.EnumSide;
import org.cip4.lib.xjdf.schema.Part;
import org.cip4.lib.xjdf.schema.Resource;
import org.cip4.lib.xjdf.schema.ResourceSet;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * JUnit Test case for PartitionManager object.
 * @author s.meissner
 * @date 24.04.2016
 */
public class PartitionManagerTest {

    private final static String RES_EXPOSED_MEDIA = "/org/cip4/lib/xjdf/partition/partition-exposedmedia.xjdf";

    private final static XJdfNodeFactory NF = new XJdfNodeFactory();

    private PartitionManager partitionManager;

    private ResourceSet resourceSet;

    /**
     * Setup unit test.
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        partitionManager = new PartitionManager();
        resourceSet = NF.createResourceSet();
    }

    /**
     * Tear down unit test.
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
    }

    /**
     * The second Resource in ResourceSet has no Part element (catch all).
     */
    @Test
    public void testGetResourceByPart_EmptyPart() throws Exception {
        // arrange
        createResource("CYAN_FRONT");
        createPart_SeparationSide("Cyan", EnumSide.FRONT, "CYAN_FRONT");

        createResource("CYAN_BACK");
        createPart_SeparationSide("Cyan", EnumSide.BACK, "CYAN_BACK");

        // act / assert
        Part part;

        assertNull("Resource is not null.", partitionManager.getResourceByPart(resourceSet, null));
        assertNull("Resource is not null.", partitionManager.getResourceByPart(resourceSet, NF.createPart()));

        part = createPart_SeparationSide("Cyan", null, null);
        assertNull("Resource is not null.", partitionManager.getResourceByPart(resourceSet, part));
    }

    /**
     * The second Resource in ResourceSet has no Part element (second resource does catch all).
     */
    @Test
    public void testGetResourceByPart_CatchAllMiddle() throws Exception {
        // arrange
        createResource("CYAN_FRONT");
        createPart_SeparationSide("Cyan", EnumSide.FRONT, "CYAN_FRONT");

        createResource("CYAN_CATCH_ALL");

        createResource("CYAN_BACK");
        createPart_SeparationSide("Cyan", EnumSide.BACK, "CYAN_BACK");

        // act / assert
        Part part;

        part = createPart_SeparationSide("Cyan", EnumSide.FRONT, null);
        assertEquals("Resource ID is wrong.", "CYAN_FRONT", partitionManager.getResourceByPart(resourceSet, part).getID());

        part = createPart_SeparationSide("Cyan", EnumSide.BACK, null);
        assertEquals("Resource ID is wrong.", "CYAN_CATCH_ALL", partitionManager.getResourceByPart(resourceSet, part).getID());
    }

    /**
     * Each resource contains one unique partition key
     */
    @Test
    public void testGetResourceByPart_OnePartPerResource() throws Exception {
        // arrange
        createResource("CYAN_FRONT");
        createPart_SeparationSide("Cyan", EnumSide.FRONT, "CYAN_FRONT");

        createResource("CYAN_BACK");
        createPart_SeparationSide("Cyan", EnumSide.BACK, "CYAN_BACK");

        createResource("BLACK_FRONT");
        createPart_SeparationSide("Black", EnumSide.FRONT, "BLACK_FRONT");

        createResource("BLACK_BACK");
        createPart_SeparationSide("Black", EnumSide.BACK, "BLACK_BACK");

        // act / assert
        Part part;

        part = createPart_SeparationSide("Cyan", EnumSide.FRONT, null);
        assertEquals("Resource ID is wrong.", "CYAN_FRONT", partitionManager.getResourceByPart(resourceSet, part).getID());

        part = createPart_SeparationSide("Cyan", EnumSide.BACK, null);
        assertEquals("Resource ID is wrong.", "CYAN_BACK", partitionManager.getResourceByPart(resourceSet, part).getID());

        part = createPart_SeparationSide("Black", EnumSide.FRONT, null);
        assertEquals("Resource ID is wrong.", "BLACK_FRONT", partitionManager.getResourceByPart(resourceSet, part).getID());

        part = createPart_SeparationSide("Black", EnumSide.BACK, null);
        assertEquals("Resource ID is wrong.", "BLACK_BACK", partitionManager.getResourceByPart(resourceSet, part).getID());
    }

    /**
     * Each resource contains two unique partition keys
     */
    @Test
    public void testGetResourceByPart_TwoPartsPerResource() throws Exception {
        // arrange
        createResource("CYAN_FRONT_BACK");
        createPart_SeparationSide("Cyan", EnumSide.FRONT, "CYAN_FRONT_BACK");
        createPart_SeparationSide("Cyan", EnumSide.BACK, "CYAN_FRONT_BACK");

        createResource("BLACK_FRONT_BACK");
        createPart_SeparationSide("Black", EnumSide.FRONT, "BLACK_FRONT_BACK");
        createPart_SeparationSide("Black", EnumSide.BACK, "BLACK_FRONT_BACK");

        // act / assert
        Part part;

        part = createPart_SeparationSide("Cyan", EnumSide.FRONT, null);
        assertEquals("Resource ID is wrong.", "CYAN_FRONT_BACK", partitionManager.getResourceByPart(resourceSet, part).getID());

        part = createPart_SeparationSide("Cyan", EnumSide.BACK, null);
        assertEquals("Resource ID is wrong.", "CYAN_FRONT_BACK", partitionManager.getResourceByPart(resourceSet, part).getID());

        part = createPart_SeparationSide("Black", EnumSide.FRONT, null);
        assertEquals("Resource ID is wrong.", "BLACK_FRONT_BACK", partitionManager.getResourceByPart(resourceSet, part).getID());

        part = createPart_SeparationSide("Black", EnumSide.BACK, null);
        assertEquals("Resource ID is wrong.", "BLACK_FRONT_BACK", partitionManager.getResourceByPart(resourceSet, part).getID());
    }

    /**
     * Add a part element containing a Separation and a Side attribute to a given Resource object.
     * @param side The side to be added.
     * @param resourceId The id of the given Resource object.
     */
    private Part createPart_Side(EnumSide side, String resourceId) {

        // create part
        Part part = NF.createPart();
        part.setSide(side);

        // add to referenced resource
        addPartToResource(resourceId, part);

        // return part
        return part;
    }

    /**
     * Add a part element containing a Separation and a Side attribute to a given Resource object.
     * @param separation The sepeartion to be added.
     * @param side The side to be added.
     * @param resourceId The id of the given Resource object.
     */
    private Part createPart_SeparationSide(String separation, EnumSide side, String resourceId) {

        // create part
        Part part = NF.createPart();
        part.setSeparation(separation);
        part.setSide(side);

        // add to referenced resource
        addPartToResource(resourceId, part);

        // return part
        return part;
    }

    /**
     * Add a part element containing a Separation and a Side attribute to a given Resource object.
     * @param separation The sepeartion to be added.
     * @param side The side to be added.
     * @param resourceId The id of the given Resource object.
     */
    private Part createPart_SeparationSideVersion(String separation, EnumSide side, String resourceId, String... partVersions) {

        // create part
        Part part = NF.createPart();
        part.setSeparation(separation);
        part.setSide(side);
        part.getPartVersion().addAll(Arrays.asList(partVersions));

        // add to referenced resource
        addPartToResource(resourceId, part);

        // return part
        return part;
    }

    /**
     * Add part to a resrouce identified by resourceId
     * @param resourceId Identifier of the resource.
     * @param part The part element to be added.
     */
    private void addPartToResource(String resourceId, Part part) {
        for(Resource resource: resourceSet.getResource()) {
            if (resource.getID().equals(resourceId)) {
                resource.getPart().add(part);
            }
        }
    }

    /**
     * Create a new Resource element.
     * @param id Id of the new Resource elemenet.
     * @return The created Resource element.
     */
    private Resource createResource(String id) {
        Resource resource = NF.createResource();
        resource.setID(id);

        resourceSet.getResource().add(resource);

        return resource;
    }
}