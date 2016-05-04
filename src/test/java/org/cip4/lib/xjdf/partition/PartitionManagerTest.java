package org.cip4.lib.xjdf.partition;

import org.cip4.lib.xjdf.XJdfNodeFactory;
import org.cip4.lib.xjdf.schema.EnumSide;
import org.cip4.lib.xjdf.schema.Part;
import org.cip4.lib.xjdf.schema.Resource;
import org.cip4.lib.xjdf.schema.ResourceSet;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;


/**
 * JUnit Test case for PartitionManager object.
 *
 * @author s.meissner
 */
public class PartitionManagerTest {

    /**
     * NodeFactory for creating XJDF Nodes.
     */
    private static final XJdfNodeFactory NF = new XJdfNodeFactory();

    /**
     * The current Partition Manager.
     */
    private PartitionManager partitionManager;

    /**
     * The current Resource Set.
     */
    private ResourceSet resourceSet;

    /**
     * Setup unit test.
     *
     * @throws Exception Catch all Exception.
     */
    @Before
    public final void setUp() throws Exception {
        partitionManager = new PartitionManager();
        resourceSet = NF.createResourceSet();
    }

    /**
     * Tear down unit test.
     *
     * @throws Exception Catch all Exception
     */
    @After
    public final void tearDown() throws Exception {
    }

    /**
     * The second Resource in ResourceSet has no Part element (catch all).
     *
     * @throws Exception Catch all Exception
     */
    @Test
    public final void testGetResourceByPartEmptyPart() throws Exception {
        // arrange
        createResource("CYAN_FRONT");
        createPartSeparationSide("Cyan", EnumSide.FRONT, "CYAN_FRONT");

        createResource("CYAN_BACK");
        createPartSeparationSide("Cyan", EnumSide.BACK, "CYAN_BACK");

        // act / assert
        Part part;

        assertNull("Resource is not null.", partitionManager.getResourceByPart(resourceSet, null));
        assertNull("Resource is not null.", partitionManager.getResourceByPart(resourceSet, NF.createPart()));

        part = createPartSeparationSide("Cyan", null, null);
        assertNull("Resource is not null.", partitionManager.getResourceByPart(resourceSet, part));
    }

    /**
     * The second Resource in ResourceSet has no Part element (second resource does catch all).
     *
     * @throws Exception Catch all Exception
     */
    @Test
    public final void testGetResourceByPartCatchAllMiddle() throws Exception {
        // arrange
        createResource("CYAN_FRONT");
        createPartSeparationSide("Cyan", EnumSide.FRONT, "CYAN_FRONT");

        createResource("CYAN_CATCH_ALL");

        createResource("CYAN_BACK");
        createPartSeparationSide("Cyan", EnumSide.BACK, "CYAN_BACK");

        // act / assert
        Part part;

        part = createPartSeparationSide("Cyan", EnumSide.FRONT, null);
        assertEquals(
            "Resource ID is wrong.",
            "CYAN_FRONT",
            partitionManager.getResourceByPart(resourceSet, part).getID()
        );

        part = createPartSeparationSide("Cyan", EnumSide.BACK, null);
        assertEquals(
            "Resource ID is wrong.",
            "CYAN_CATCH_ALL",
            partitionManager.getResourceByPart(resourceSet, part).getID()
        );
    }

    /**
     * Each resource contains one unique partition key.
     *
     * @throws Exception Catch all Exception
     */
    @Test
    public final void testGetResourceByPartOnePartPerResource() throws Exception {
        // arrange
        createResource("CYAN_FRONT");
        createPartSeparationSide("Cyan", EnumSide.FRONT, "CYAN_FRONT");

        createResource("CYAN_BACK");
        createPartSeparationSide("Cyan", EnumSide.BACK, "CYAN_BACK");

        createResource("BLACK_FRONT");
        createPartSeparationSide("Black", EnumSide.FRONT, "BLACK_FRONT");

        createResource("BLACK_BACK");
        createPartSeparationSide("Black", EnumSide.BACK, "BLACK_BACK");

        // act / assert
        Part part;

        part = createPartSeparationSide("Cyan", EnumSide.FRONT, null);
        assertEquals(
            "Resource ID is wrong.",
            "CYAN_FRONT",
            partitionManager.getResourceByPart(resourceSet, part).getID()
        );

        part = createPartSeparationSide("Cyan", EnumSide.BACK, null);
        assertEquals(
            "Resource ID is wrong.",
            "CYAN_BACK",
            partitionManager.getResourceByPart(resourceSet, part).getID()
        );

        part = createPartSeparationSide("Black", EnumSide.FRONT, null);
        assertEquals(
            "Resource ID is wrong.",
            "BLACK_FRONT",
            partitionManager.getResourceByPart(resourceSet, part).getID()
        );

        part = createPartSeparationSide("Black", EnumSide.BACK, null);
        assertEquals(
            "Resource ID is wrong.",
            "BLACK_BACK",
            partitionManager.getResourceByPart(resourceSet, part).getID()
        );
    }

    /**
     * Each resource contains two unique partition keys.
     *
     * @throws Exception Catch all Exception
     */
    @Test
    public final void testGetResourceByPartTwoPartsPerResource() throws Exception {
        // arrange
        createResource("CYAN_FRONT_BACK");
        createPartSeparationSide("Cyan", EnumSide.FRONT, "CYAN_FRONT_BACK");
        createPartSeparationSide("Cyan", EnumSide.BACK, "CYAN_FRONT_BACK");

        createResource("BLACK_FRONT_BACK");
        createPartSeparationSide("Black", EnumSide.FRONT, "BLACK_FRONT_BACK");
        createPartSeparationSide("Black", EnumSide.BACK, "BLACK_FRONT_BACK");

        // act / assert
        Part part;

        part = createPartSeparationSide("Cyan", EnumSide.FRONT, null);
        assertEquals(
            "Resource ID is wrong.",
            "CYAN_FRONT_BACK",
            partitionManager.getResourceByPart(resourceSet, part).getID()
        );

        part = createPartSeparationSide("Cyan", EnumSide.BACK, null);
        assertEquals(
            "Resource ID is wrong.",
            "CYAN_FRONT_BACK",
            partitionManager.getResourceByPart(resourceSet, part).getID()
        );

        part = createPartSeparationSide("Black", EnumSide.FRONT, null);
        assertEquals(
            "Resource ID is wrong.",
            "BLACK_FRONT_BACK",
            partitionManager.getResourceByPart(resourceSet, part).getID()
        );

        part = createPartSeparationSide("Black", EnumSide.BACK, null);
        assertEquals(
            "Resource ID is wrong.",
            "BLACK_FRONT_BACK",
            partitionManager.getResourceByPart(resourceSet, part).getID()
        );
    }

    /**
     * Add a part element containing a Separation and a Side attribute to a given Resource object.
     *
     * @param side The side to be added.
     * @param resourceId The id of the given Resource object.
     * @return The initialized Part object.
     */
    private Part createPartSide(final EnumSide side, final String resourceId) {

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
     *
     * @param separation The sepeartion to be added.
     * @param side The side to be added.
     * @param resourceId The id of the given Resource object.
     * @return The initialized Part object.
     */
    private Part createPartSeparationSide(final String separation, final EnumSide side, final String resourceId) {

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
     *
     * @param separation The sepeartion to be added.
     * @param side The side to be added.
     * @param resourceId The id of the given Resource object.
     * @param partVersion The part Version of the given Resource object
     */
    private Part createPartSeparationSideVersion(
        final String separation, final EnumSide side, final String resourceId, final String partVersion
    ) {

        // create part
        Part part = NF.createPart();
        part.setSeparation(separation);
        part.setSide(side);
        part.getPartVersion().add(partVersion);

        // add to referenced resource
        addPartToResource(resourceId, part);

        // return part
        return part;
    }

    /**
     * Add part to a resrouce identified by resourceId.
     *
     * @param resourceId Identifier of the resource.
     * @param part The part element to be added.
     */
    private void addPartToResource(final String resourceId, final Part part) {
        for (Resource resource : resourceSet.getResource()) {
            if (resource.getID().equals(resourceId)) {
                resource.getPart().add(part);
            }
        }
    }

    /**
     * Create a new Resource element.
     *
     * @param id Id of the new Resource elemenet.
     *
     * @return The created Resource element.
     */
    private Resource createResource(final String id) {
        Resource resource = NF.createResource();
        resource.setID(id);

        resourceSet.getResource().add(resource);

        return resource;
    }
}