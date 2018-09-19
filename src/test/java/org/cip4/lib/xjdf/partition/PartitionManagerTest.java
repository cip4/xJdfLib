package org.cip4.lib.xjdf.partition;

import org.cip4.lib.xjdf.XJdfNodeFactory;
import org.cip4.lib.xjdf.schema.Side;
import org.cip4.lib.xjdf.schema.Part;
import org.cip4.lib.xjdf.schema.Resource;
import org.cip4.lib.xjdf.schema.ResourceSet;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;


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
    @BeforeEach
    public final void setUp() {
        partitionManager = new PartitionManager();
        resourceSet = NF.createResourceSet();
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
        createPartSeparationSide("Cyan", Side.FRONT, "CYAN_FRONT");

        createResource("CYAN_BACK");
        createPartSeparationSide("Cyan", Side.BACK, "CYAN_BACK");

        // act / assert
        Part part;

        assertNull(partitionManager.getResourceByPart(resourceSet, null), "Resource is not null.");
        assertNull(partitionManager.getResourceByPart(resourceSet, NF.createPart()), "Resource is not null.");

        part = createPartSeparationSide("Cyan", null, null);
        assertNull(partitionManager.getResourceByPart(resourceSet, part), "Resource is not null.");
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
        createPartSeparationSide("Cyan", Side.FRONT, "CYAN_FRONT");

        createResource("CYAN_CATCH_ALL");

        createResource("CYAN_BACK");
        createPartSeparationSide("Cyan", Side.BACK, "CYAN_BACK");

        // act / assert
        Part part;

        part = createPartSeparationSide("Cyan", Side.FRONT, null);
        assertEquals(
            "CYAN_FRONT",
            partitionManager.getResourceByPart(resourceSet, part).getID(),
            "Resource ID is wrong."
        );

        part = createPartSeparationSide("Cyan", Side.BACK, null);
        assertEquals(
            "CYAN_CATCH_ALL",
            partitionManager.getResourceByPart(resourceSet, part).getID(),
            "Resource ID is wrong."
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
        createPartSeparationSide("Cyan", Side.FRONT, "CYAN_FRONT");

        createResource("CYAN_BACK");
        createPartSeparationSide("Cyan", Side.BACK, "CYAN_BACK");

        createResource("BLACK_FRONT");
        createPartSeparationSide("Black", Side.FRONT, "BLACK_FRONT");

        createResource("BLACK_BACK");
        createPartSeparationSide("Black", Side.BACK, "BLACK_BACK");

        // act / assert
        Part part;

        part = createPartSeparationSide("Cyan", Side.FRONT, null);
        assertEquals(
            "CYAN_FRONT",
            partitionManager.getResourceByPart(resourceSet, part).getID(),
            "Resource ID is wrong."
        );

        part = createPartSeparationSide("Cyan", Side.BACK, null);
        assertEquals(
            "CYAN_BACK",
            partitionManager.getResourceByPart(resourceSet, part).getID(),
            "Resource ID is wrong."
        );

        part = createPartSeparationSide("Black", Side.FRONT, null);
        assertEquals(
            "BLACK_FRONT",
            partitionManager.getResourceByPart(resourceSet, part).getID(),
            "Resource ID is wrong."
        );

        part = createPartSeparationSide("Black", Side.BACK, null);
        assertEquals(
            "BLACK_BACK",
            partitionManager.getResourceByPart(resourceSet, part).getID(),
            "Resource ID is wrong."
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
        createPartSeparationSide("Cyan", Side.FRONT, "CYAN_FRONT_BACK");
        createPartSeparationSide("Cyan", Side.BACK, "CYAN_FRONT_BACK");

        createResource("BLACK_FRONT_BACK");
        createPartSeparationSide("Black", Side.FRONT, "BLACK_FRONT_BACK");
        createPartSeparationSide("Black", Side.BACK, "BLACK_FRONT_BACK");

        // act / assert
        Part part;

        part = createPartSeparationSide("Cyan", Side.FRONT, null);
        assertEquals(
            "CYAN_FRONT_BACK",
            partitionManager.getResourceByPart(resourceSet, part).getID(),
            "Resource ID is wrong."
        );

        part = createPartSeparationSide("Cyan", Side.BACK, null);
        assertEquals(
            "CYAN_FRONT_BACK",
            partitionManager.getResourceByPart(resourceSet, part).getID(),
            "Resource ID is wrong."
        );

        part = createPartSeparationSide("Black", Side.FRONT, null);
        assertEquals(
            "BLACK_FRONT_BACK",
            partitionManager.getResourceByPart(resourceSet, part).getID(),
            "Resource ID is wrong."
        );

        part = createPartSeparationSide("Black", Side.BACK, null);
        assertEquals(
            "BLACK_FRONT_BACK",
            partitionManager.getResourceByPart(resourceSet, part).getID(),
            "Resource ID is wrong."
        );
    }

    /**
     * Add a part element containing a Separation and a Side attribute to a given Resource object.
     *
     * @param side The side to be added.
     * @param resourceId The id of the given Resource object.
     * @return The initialized Part object.
     */
    private Part createPartSide(final Side side, final String resourceId) {

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
    private Part createPartSeparationSide(final String separation, final Side side, final String resourceId) {

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
        final String separation, final Side side, final String resourceId, final String partVersion
    ) {

        // create part
        Part part = NF.createPart();
        part.setSeparation(separation);
        part.setSide(side);
        part.withPartVersion(partVersion);

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