package org.cip4.lib.xjdf.util;

import org.cip4.lib.xjdf.schema.Part;
import org.junit.Test;

import java.lang.reflect.Method;

import static org.junit.Assert.*;

public class PartitionsTest {

    @Test
    public void hasMismatchingAttributesWillReturnTrueForEmptyPart1() throws Exception {
        assertFalse(
            Partitions.hasMismatchingAttributes(
                new Part(),
                new Part().withAssemblyID("foo")
            )
        );
    }

    @Test
    public void hasMismatchingAttributesWillReturnTrueForEmptyPart2() throws Exception {
        assertFalse(
            Partitions.hasMismatchingAttributes(
                new Part().withAssemblyID("foo"),
                new Part()
            )
        );
    }

    @Test
    public void hasMismatchingAttributesWillReturnTrueWhenPart1IsASubsetOfPart2() throws Exception {
        assertFalse(
            Partitions.hasMismatchingAttributes(
                new Part().withProductPart("foo").withSide("Front"),
                new Part().withProductPart("foo")
            )
        );
    }

    @Test
    public void hasMismatchingAttributesWillReturnTrueWhenPart2IsASubsetOfPart1() throws Exception {
        assertFalse(
            Partitions.hasMismatchingAttributes(
                new Part().withProductPart("foo"),
                new Part().withProductPart("foo").withSide("Front")
            )
        );
    }

    @Test
    public void hasMismatchingAttributesWillReturnTrueIfPartsDoNotOverlap() throws Exception {
        assertFalse(
            Partitions.hasMismatchingAttributes(
                new Part().withSheetName("bar"),
                new Part().withSeparation("foo")
            )
        );
    }

    @Test
    public void hasMismatchingAttributesWillReturnTrueForListAttribute() throws Exception {
        assertFalse(
            Partitions.hasMismatchingAttributes(
                new Part(),
                new Part().withCellIndex("1", "2")
            )
        );
    }

    @Test
    public void hasMismatchingAttributesWillReturnFalseOnMismatch() throws Exception {
        assertTrue(
            Partitions.hasMismatchingAttributes(
                new Part().withBlockName("bar"),
                new Part().withBlockName("foo")
            )
        );
    }

    @Test
    public void getGettersDoesNotIncludeGetClass() throws Exception {
        for (Method getter : Partitions.readGetters()) {
            assertFalse(getter.getName().equals("getClass"));
        }
    }

    @Test
    public void getGettersIsNotEmpty() throws Exception {
        assertNotEquals(0, Partitions.readGetters().size());
    }
}