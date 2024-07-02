package org.cip4.lib.xjdf.util;

import org.cip4.lib.xjdf.XJdfDocument;
import org.cip4.lib.xjdf.XJdfDocumentTest;
import org.cip4.lib.xjdf.schema.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.ReflectionUtils;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class PartitionsTest {
    private final String RES_ROOT = "/org/cip4/lib/xjdf/";


    @Test
    void getResourcesByPart_1_no_part() {

        // arrange
        ResourceSet resourceSet = new ResourceSet().withResource(List.of(
                new Resource()
                        .withID("RES-1")
                        .withPart(new Part().withBlockName("BLOCK_ID")),
                new Resource()
                        .withID("RES-2")
        ));

        Part part = new Part().withBlockName("BLOCK_ID");

        // act
        List<Resource> resources = Partitions.getResourcesByPart(resourceSet, part);

        // assert
        assertEquals(1, resources.size(), "Number of resources is wrong.");
        assertEquals("RES-2", resources.get(0).getID(), "The selected ID is wrong.");
    }

    @Test
    void getResourcesByPart_2_empty_part() {

        // arrange
        ResourceSet resourceSet = new ResourceSet().withResource(List.of(
                new Resource()
                        .withID("RES-1")
                        .withPart(new Part().withBlockName("BLOCK_ID")),
                new Resource()
                        .withID("RES-2")
                        .withPart(new Part())
        ));

        Part part = new Part().withBlockName("BLOCK_ID");

        // act
        List<Resource> resources = Partitions.getResourcesByPart(resourceSet, part);

        // assert
        assertEquals(1, resources.size(), "Number of resources is wrong.");
        assertEquals("RES-2", resources.get(0).getID(), "The selected ID is wrong.");
    }

    @Test
    void getResourcesByPart_3_2nd_part_empty() {

        // arrange
        ResourceSet resourceSet = new ResourceSet().withResource(List.of(
                new Resource()
                        .withID("RES-1")
                        .withPart(new Part().withBlockName("BLOCK_ID")),
                new Resource()
                        .withID("RES-2")
                        .withPart(new Part().withBlockName("abc"), new Part())
        ));

        Part part = new Part().withBlockName("BLOCK_ID");

        // act
        List<Resource> resources = Partitions.getResourcesByPart(resourceSet, part);

        // assert
        assertEquals(1, resources.size(), "Number of resources is wrong.");
        assertEquals("RES-2", resources.get(0).getID(), "The selected ID is wrong.");
    }

    @Test
    void getResourcesByPart_4() {

        // arrange
        ResourceSet resourceSet = new ResourceSet().withResource(List.of(
                new Resource()
                        .withID("RES-1")
                        .withPart(new Part().withBlockName("BLOCK_1")),
                new Resource()
                        .withID("RES-2")
                        .withPart(new Part().withBlockName("BLOCK_2"))
        ));

        Part part = new Part().withBlockName("BLOCK_ID");

        // act
        List<Resource> resources = Partitions.getResourcesByPart(resourceSet, part);

        // assert
        assertEquals(0, resources.size(), "Number of resources is wrong.");
    }

    @Test
    void getResourcesByPart_5() {

        // arrange
        ResourceSet resourceSet = new ResourceSet().withResource(List.of(
                new Resource()
                        .withID("RES-1")
                        .withPart(new Part().withBlockName("BLOCK_1")),
                new Resource()
                        .withID("RES-2")
                        .withPart(new Part().withBlockName("BLOCK_2"))
        ));

        Part part = new Part().withBlockName("BLOCK_2");

        // act
        List<Resource> resources = Partitions.getResourcesByPart(resourceSet, part);

        // assert
        assertEquals(1, resources.size(), "Number of resources is wrong.");
        assertEquals("RES-2", resources.get(0).getID(), "The selected ID is wrong.");
    }

    @Test
    void getResourcesByPart_6() {

        // arrange
        ResourceSet resourceSet = new ResourceSet().withResource(List.of(
                new Resource()
                        .withID("RES-1")
                        .withPart(new Part().withBlockName("BLOCK_1"))
                        .withPart(new Part().withBlockName("BLOCK_3")),
                new Resource()
                        .withID("RES-2")
                        .withPart(new Part().withBlockName("BLOCK_2"))
        ));

        Part part = new Part().withBlockName("BLOCK_3");

        // act
        List<Resource> resources = Partitions.getResourcesByPart(resourceSet, part);

        // assert
        assertEquals(1, resources.size(), "Number of resources is wrong.");
        assertEquals("RES-1", resources.get(0).getID(), "The selected ID is wrong.");
    }

    @Test
    void getResourcesByPart_7() {

        // arrange
        ResourceSet resourceSet = new ResourceSet().withResource(List.of(
                new Resource()
                        .withID("RES-1")
                        .withPart(new Part().withBlockName("BLOCK_1").withBinderySignatureID("BS")),
                new Resource()
                        .withID("RES-2")
                        .withPart(new Part().withBlockName("BLOCK_2").withBinderySignatureID("BS")),
                new Resource()
                        .withID("RES-3")
                        .withPart(new Part().withBlockName("BLOCK_2").withBinderySignatureID("BS-xx"))
        ));

        Part part = new Part().withBinderySignatureID("BS");

        // act
        List<Resource> resources = Partitions.getResourcesByPart(resourceSet, part);

        // assert
        assertEquals(2, resources.size(), "Number of resources is wrong.");
        assertEquals("RES-1", resources.get(0).getID(), "The selected ID is wrong.");
        assertEquals("RES-2", resources.get(1).getID(), "The selected ID is wrong.");
    }

    @Test
    void getPartitionKeys_1() {

        // arrange
        Part part = new Part();

        // act
        List<String> partitionKeys = Partitions.getPartitionKeys(part);

        // assert
        assertEquals(0, partitionKeys.size());
    }

    @Test
    void getPartitionKeys_2() {

        // arrange
        Part part = new Part()
                .withBinderySignatureID("BS_ID");

        // act
        List<String> partitionKeys = Partitions.getPartitionKeys(part);

        // assert
        assertEquals(1, partitionKeys.size());
        assertEquals("binderySignatureID", partitionKeys.get(0));
    }

    @Test
    void getPartitionKeys_3() {

        // arrange
        Part part = new Part()
                .withBlockName("BLOCK_1")
                .withBundleItemName("BUNDLE_ITEM_1");

        // act
        List<String> partitionKeys = Partitions.getPartitionKeys(part);

        // assert
        assertEquals(2, partitionKeys.size());
        assertEquals("blockName", partitionKeys.get(0));
        assertEquals("bundleItemName", partitionKeys.get(1));
    }

    @Test
    void matches_1() {

        // arrange
        Part resourcePart = new Part()
                .withBinderySignatureID("BS-12");

        Part givenPart = new Part()
                .withBinderySignatureID("BS-12");

        // act
        boolean result = Partitions.matches(resourcePart, givenPart);

        // assert
        assertTrue(result, "Parts matches");
    }

    @Test
    void matches_2() {

        // arrange
        Part resourcePart = new Part()
                .withBinderySignatureID("BS-12")
                .withBlockName("BLOCK-1");

        Part givenPart = new Part()
                .withBinderySignatureID("BS-12");

        // act
        boolean result = Partitions.matches(resourcePart, givenPart);

        // assert
        assertTrue(result, "Parts matches");
    }

    @Test
    void matches_3() {

        // arrange
        Part resourcePart = new Part()
                .withBinderySignatureID("BS-12");

        Part givenPart = new Part()
                .withBinderySignatureID("BS-12")
                .withBlockName("BLOCK-1");

        // act
        boolean result = Partitions.matches(resourcePart, givenPart);

        // assert
        assertFalse(result, "Parts do NOT matches");
    }

//    @Test
//    public void getPartKeyValues_1() throws Exception {
//
//        // arrange
//        byte[] xjdfBytes = XJdfDocumentTest.class.getResourceAsStream(RES_ROOT + "sheet.xjdf").readAllBytes();
//        XJdfDocument xJdfDocument = new XJdfDocument(xjdfBytes);
//
//        ResourceSet resourceSet = xJdfDocument.getResourceSet(BinderySignature.class);
//
//        // act
//        Map<String, List<Object>> partKeyValues = Partitions.getPartKeyValues(resourceSet);
//
//        // assert
//        assertNotNull(partKeyValues, "Result is null.");
//        assertEquals(1, partKeyValues.size(), "Number of PartKeys is wrong.");
//        assertEquals(3, partKeyValues.get("BinderySignatureID").size(), "Number of BinderSignatureID values is wrong.");
//    }
//
//    @Test
//    public void getPartKeyValues_2() throws Exception {
//
//        // arrange
//        byte[] xjdfBytes = XJdfDocumentTest.class.getResourceAsStream(RES_ROOT + "sheet.xjdf").readAllBytes();
//        XJdfDocument xJdfDocument = new XJdfDocument(xjdfBytes);
//
//        ResourceSet resourceSet = xJdfDocument.getResourceSet(Contact.class);
//
//        // act
//        Map<String, List<Object>> partKeyValues = Partitions.getPartKeyValues(resourceSet);
//
//        // assert
//        assertNotNull(partKeyValues, "Result is null.");
//        assertEquals(0, partKeyValues.size(), "Number of PartKeys is wrong.");
//    }
//
//    @Test
//    public void getPartKeyValues_3() throws Exception {
//
//        // arrange
//        byte[] xjdfBytes = XJdfDocumentTest.class.getResourceAsStream(RES_ROOT + "sheet.xjdf").readAllBytes();
//        XJdfDocument xJdfDocument = new XJdfDocument(xjdfBytes);
//
//        ResourceSet resourceSet = xJdfDocument.getResourceSet(RunList.class);
//
//        // act
//        Map<String, List<Object>> partKeyValues = Partitions.getPartKeyValues(resourceSet);
//
//        // assert
//        assertNotNull(partKeyValues, "Result is null.");
//        assertEquals(1, partKeyValues.size(), "Number of PartKeys is wrong.");
//        assertEquals(1, partKeyValues.get("BinderySignatureID").size(), "Number of BinderSignatureID values is wrong.");
//    }
//
//    @Test
//    public void getResourcesByPartKeys_0() {
//
//        // arrange
//        createResource("CYAN_FRONT");
//        createPartSeparationSide("Cyan", Side.FRONT, "CYAN_FRONT");
//
//        createResource("CYAN_BACK");
//        createPartSeparationSide("Cyan", Side.BACK, "CYAN_BACK");
//
//        // act
//        List<Resource> resources = Partitions.getResourcesByPartKeys(resourceSet, "Side", "Separation");
//
//        // assert
//        assertEquals(2, resources.size(), "Number of resources is wrong.");
//    }
//
//    @Test
//    public void getResourcesByPartKeys_1() {
//
//        // arrange
//        createResource("CYAN_FRONT");
//        createPartSeparationSide("Cyan", Side.FRONT, "CYAN_FRONT");
//
//        createResource("CYAN_BACK");
//        createPartSeparationSide("Cyan", Side.BACK, "CYAN_BACK");
//
//        // act
//        List<Resource> resources = Partitions.getResourcesByPartKeys(resourceSet, "Side");
//
//        // assert
//        assertEquals(0, resources.size(), "Number of resources is wrong.");
//    }
//
//    @Test
//    public void getResourcesByPartKeys_2() {
//
//        // arrange
//        createResource("CYAN_FRONT");
//        createPartSide(Side.FRONT, "CYAN_FRONT");
//
//        createResource("CYAN_BACK");
//        createPartSide(Side.BACK, "CYAN_BACK");
//
//        // act
//        List<Resource> resources = Partitions.getResourcesByPartKeys(resourceSet, "Side");
//
//        // assert
//        assertEquals(2, resources.size(), "Number of resources is wrong.");
//    }
//
//    @Test
//    public void getResourcesByPartKeys_3() {
//
//        // arrange
//        createResource("CYAN_FRONT");
//        createPartSide(Side.FRONT, "CYAN_FRONT");
//
//        createResource("CYAN_BACK");
//        createPartSeparationSide("Cyan", Side.BACK, "CYAN_BACK");
//
//        // act
//        List<Resource> resources = Partitions.getResourcesByPartKeys(resourceSet, "Side");
//
//        // assert
//        assertEquals(1, resources.size(), "Number of resources is wrong.");
//    }
//
//    @Test
//    public void getResourcesByPartKeys_4() {
//
//        // arrange
//        createResource("CYAN_FRONT");
//
//        // act
//        List<Resource> resources = Partitions.getResourcesByPartKeys(resourceSet, "Side");
//
//        // assert
//        assertEquals(0, resources.size(), "Number of resources is wrong.");
//    }
//
//    @Test
//    public void getResourcesByPartKeys_5() {
//
//        // arrange
//        createResource("CYAN_FRONT");
//
//        // act
//        List<Resource> resources = Partitions.getResourcesByPartKeys(resourceSet);
//
//        // assert
//        assertEquals(0, resources.size(), "Number of resources is wrong.");
//    }
//
//    /**
//     * The second Resource in ResourceSet has no Part element (catch all).
//     *
//     * @throws Exception Catch all Exception
//     */
//    @Test
//    public final void testGetResourceByPartEmptyPart() throws Exception {
//        // arrange
//        createResource("CYAN_FRONT");
//        createPartSeparationSide("Cyan", Side.FRONT, "CYAN_FRONT");
//
//        createResource("CYAN_BACK");
//        createPartSeparationSide("Cyan", Side.BACK, "CYAN_BACK");
//
//        // act / assert
//        Part part;
//
//        assertNull(Partitions.getResourceByPart(resourceSet, null), "Resource is not null.");
//        assertNull(Partitions.getResourceByPart(resourceSet, new Part()), "Resource is not null.");
//
//        part = createPartSeparationSide("Cyan", null, null);
//        assertNull(Partitions.getResourceByPart(resourceSet, part), "Resource is not null.");
//    }
//
//    /**
//     * The second Resource in ResourceSet has no Part element (second resource does catch all).
//     *
//     * @throws Exception Catch all Exception
//     */
//    @Test
//    public final void testGetResourceByPartCatchAllMiddle() throws Exception {
//        // arrange
//        createResource("CYAN_FRONT");
//        createPartSeparationSide("Cyan", Side.FRONT, "CYAN_FRONT");
//
//        createResource("CYAN_CATCH_ALL");
//
//        createResource("CYAN_BACK");
//        createPartSeparationSide("Cyan", Side.BACK, "CYAN_BACK");
//
//        // act / assert
//        Part part;
//
//        part = createPartSeparationSide("Cyan", Side.FRONT, null);
//        assertEquals(
//                "CYAN_FRONT",
//                Partitions.getResourceByPart(resourceSet, part).getID(),
//                "Resource ID is wrong."
//        );
//
//        part = createPartSeparationSide("Cyan", Side.BACK, null);
//        assertEquals(
//                "CYAN_CATCH_ALL",
//                Partitions.getResourceByPart(resourceSet, part).getID(),
//                "Resource ID is wrong."
//        );
//    }
//
//    /**
//     * Each resource contains one unique partition key.
//     *
//     * @throws Exception Catch all Exception
//     */
//    @Test
//    public final void testGetResourceByPartOnePartPerResource() throws Exception {
//        // arrange
//        createResource("CYAN_FRONT");
//        createPartSeparationSide("Cyan", Side.FRONT, "CYAN_FRONT");
//
//        createResource("CYAN_BACK");
//        createPartSeparationSide("Cyan", Side.BACK, "CYAN_BACK");
//
//        createResource("BLACK_FRONT");
//        createPartSeparationSide("Black", Side.FRONT, "BLACK_FRONT");
//
//        createResource("BLACK_BACK");
//        createPartSeparationSide("Black", Side.BACK, "BLACK_BACK");
//
//        // act / assert
//        Part part;
//
//        part = createPartSeparationSide("Cyan", Side.FRONT, null);
//        assertEquals(
//                "CYAN_FRONT",
//                Partitions.getResourceByPart(resourceSet, part).getID(),
//                "Resource ID is wrong."
//        );
//
//        part = createPartSeparationSide("Cyan", Side.BACK, null);
//        assertEquals(
//                "CYAN_BACK",
//                Partitions.getResourceByPart(resourceSet, part).getID(),
//                "Resource ID is wrong."
//        );
//
//        part = createPartSeparationSide("Black", Side.FRONT, null);
//        assertEquals(
//                "BLACK_FRONT",
//                Partitions.getResourceByPart(resourceSet, part).getID(),
//                "Resource ID is wrong."
//        );
//
//        part = createPartSeparationSide("Black", Side.BACK, null);
//        assertEquals(
//                "BLACK_BACK",
//                Partitions.getResourceByPart(resourceSet, part).getID(),
//                "Resource ID is wrong."
//        );
//    }
//
//    /**
//     * Each resource contains two unique partition keys.
//     *
//     * @throws Exception Catch all Exception
//     */
//    @Test
//    public final void testGetResourceByPartTwoPartsPerResource() throws Exception {
//        // arrange
//        createResource("CYAN_FRONT_BACK");
//        createPartSeparationSide("Cyan", Side.FRONT, "CYAN_FRONT_BACK");
//        createPartSeparationSide("Cyan", Side.BACK, "CYAN_FRONT_BACK");
//
//        createResource("BLACK_FRONT_BACK");
//        createPartSeparationSide("Black", Side.FRONT, "BLACK_FRONT_BACK");
//        createPartSeparationSide("Black", Side.BACK, "BLACK_FRONT_BACK");
//
//        // act / assert
//        Part part;
//
//        part = createPartSeparationSide("Cyan", Side.FRONT, null);
//        assertEquals(
//                "CYAN_FRONT_BACK",
//                Partitions.getResourceByPart(resourceSet, part).getID(),
//                "Resource ID is wrong."
//        );
//
//        part = createPartSeparationSide("Cyan", Side.BACK, null);
//        assertEquals(
//                "CYAN_FRONT_BACK",
//                Partitions.getResourceByPart(resourceSet, part).getID(),
//                "Resource ID is wrong."
//        );
//
//        part = createPartSeparationSide("Black", Side.FRONT, null);
//        assertEquals(
//                "BLACK_FRONT_BACK",
//                Partitions.getResourceByPart(resourceSet, part).getID(),
//                "Resource ID is wrong."
//        );
//
//        part = createPartSeparationSide("Black", Side.BACK, null);
//        assertEquals(
//                "BLACK_FRONT_BACK",
//                Partitions.getResourceByPart(resourceSet, part).getID(),
//                "Resource ID is wrong."
//        );
//    }
//
//    /**
//     * Add a part element containing a Separation and a Side attribute to a given Resource object.
//     *
//     * @param side The side to be added.
//     * @param resourceId The id of the given Resource object.
//     * @return The initialized Part object.
//     */
//    private Part createPartSide(final Side side, final String resourceId) {
//
//        // create part
//        Part part = new Part();
//        part.setSide(side);
//
//        // add to referenced resource
//        addPartToResource(resourceId, part);
//
//        // return part
//        return part;
//    }
//
//    /**
//     * Add a part element containing a Separation and a Side attribute to a given Resource object.
//     *
//     * @param separation The sepeartion to be added.
//     * @param side The side to be added.
//     * @param resourceId The id of the given Resource object.
//     * @return The initialized Part object.
//     */
//    private Part createPartSeparationSide(final String separation, final Side side, final String resourceId) {
//
//        // create part
//        Part part = new Part();
//        part.setSeparation(separation);
//        part.setSide(side);
//
//        // add to referenced resource
//        addPartToResource(resourceId, part);
//
//        // return part
//        return part;
//    }
//
//    /**
//     * Add a part element containing a Separation and a Side attribute to a given Resource object.
//     *
//     * @param separation The sepeartion to be added.
//     * @param side The side to be added.
//     * @param resourceId The id of the given Resource object.
//     * @param partVersion The part Version of the given Resource object
//     */
//    private Part createPartSeparationSideVersion(
//            final String separation, final Side side, final String resourceId, final String partVersion
//    ) {
//
//        // create part
//        Part part = new Part();
//        part.setSeparation(separation);
//        part.setSide(side);
//        part.withPartVersion(partVersion);
//
//        // add to referenced resource
//        addPartToResource(resourceId, part);
//
//        // return part
//        return part;
//    }
//
//    /**
//     * Add part to a resrouce identified by resourceId.
//     *
//     * @param resourceId Identifier of the resource.
//     * @param part The part element to be added.
//     */
//    private void addPartToResource(final String resourceId, final Part part) {
//        for (Resource resource : resourceSet.getResource()) {
//            if (resource.getID().equals(resourceId)) {
//                resource.getPart().add(part);
//            }
//        }
//    }
//
//    /**
//     * Create a new Resource element.
//     *
//     * @param id Id of the new Resource elemenet.
//     *
//     * @return The created Resource element.
//     */
//    private Resource createResource(final String id) {
//        Resource resource = new Resource();
//        resource.setID(id);
//
//        resourceSet.getResource().add(resource);
//
//        return resource;
//    }
//
//    @Test
//    public void hasMismatchingAttributesWillReturnTrueForEmptyPart1() {
//        assertFalse(
//            Partitions.hasMismatchingAttributes(
//                new Part(),
//                new Part().withBinderySignatureID("foo")
//            )
//        );
//    }
//
//    @Test
//    public void hasMismatchingAttributesWillReturnTrueForEmptyPart2() {
//        assertFalse(
//            Partitions.hasMismatchingAttributes(
//                new Part().withBinderySignatureID("foo"),
//                new Part()
//            )
//        );
//    }
//
//    @Test
//    public void hasMismatchingAttributesWillReturnTrueWhenPart1IsASubsetOfPart2() {
//        assertFalse(
//            Partitions.hasMismatchingAttributes(
//                new Part().withProductPart("foo").withSide(Side.FRONT),
//                new Part().withProductPart("foo")
//            )
//        );
//    }
//
//    @Test
//    public void hasMismatchingAttributesWillReturnTrueWhenPart2IsASubsetOfPart1() {
//        assertFalse(
//            Partitions.hasMismatchingAttributes(
//                new Part().withProductPart("foo"),
//                new Part().withProductPart("foo").withSide(Side.FRONT)
//            )
//        );
//    }
//
//    @Test
//    public void hasMismatchingAttributesWillReturnTrueIfPartsDoNotOverlap() {
//        assertFalse(
//            Partitions.hasMismatchingAttributes(
//                new Part().withSheetName("bar"),
//                new Part().withSeparation("foo")
//            )
//        );
//    }
//
//    @Test
//    public void hasMismatchingAttributesWillReturnTrueForListAttribute() {
//        assertFalse(
//            Partitions.hasMismatchingAttributes(
//                new Part(),
//                new Part().withProductPart("part2")
//            )
//        );
//    }
//
//    @Test
//    public void hasMismatchingAttributesWillReturnFalseOnMismatch() {
//        assertTrue(
//            Partitions.hasMismatchingAttributes(
//                new Part().withBlockName("bar"),
//                new Part().withBlockName("foo")
//            )
//        );
//    }
//
//    @Test
//    public void getGettersDoesNotIncludeGetClass() {
//        for (Method getter : Partitions.readGetters()) {
//            assertNotEquals("getClass", getter.getName());
//        }
//    }
//
//    @Test
//    public void getGettersIsNotEmpty() {
//        assertNotEquals(0, Partitions.readGetters().size());
//    }
}