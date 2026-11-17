package org.cip4.lib.xjdf.util;

import org.cip4.lib.xjdf.schema.*;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PartitionsTest {


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
}
