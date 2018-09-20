package org.cip4.lib.xjdf.util;

import org.cip4.lib.xjdf.schema.Side;
import org.cip4.lib.xjdf.schema.Part;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

public class PartitionsTest {

    @Test
    public void hasMismatchingAttributesWillReturnTrueForEmptyPart1() {
        assertFalse(
            Partitions.hasMismatchingAttributes(
                new Part(),
                new Part().withBinderySignatureID("foo")
            )
        );
    }

    @Test
    public void hasMismatchingAttributesWillReturnTrueForEmptyPart2() {
        assertFalse(
            Partitions.hasMismatchingAttributes(
                new Part().withBinderySignatureID("foo"),
                new Part()
            )
        );
    }

    @Test
    public void hasMismatchingAttributesWillReturnTrueWhenPart1IsASubsetOfPart2() {
        assertFalse(
            Partitions.hasMismatchingAttributes(
                new Part().withProductPart("foo").withSide(Side.FRONT),
                new Part().withProductPart("foo")
            )
        );
    }

    @Test
    public void hasMismatchingAttributesWillReturnTrueWhenPart2IsASubsetOfPart1() {
        assertFalse(
            Partitions.hasMismatchingAttributes(
                new Part().withProductPart("foo"),
                new Part().withProductPart("foo").withSide(Side.FRONT)
            )
        );
    }

    @Test
    public void hasMismatchingAttributesWillReturnTrueIfPartsDoNotOverlap() {
        assertFalse(
            Partitions.hasMismatchingAttributes(
                new Part().withSheetName("bar"),
                new Part().withSeparation("foo")
            )
        );
    }

    @Test
    public void hasMismatchingAttributesWillReturnTrueForListAttribute() {
        assertFalse(
            Partitions.hasMismatchingAttributes(
                new Part(),
                new Part().withProductPart("part2")
            )
        );
    }

    @Test
    public void hasMismatchingAttributesWillReturnFalseOnMismatch() {
        assertTrue(
            Partitions.hasMismatchingAttributes(
                new Part().withBlockName("bar"),
                new Part().withBlockName("foo")
            )
        );
    }

    @Test
    public void getGettersDoesNotIncludeGetClass() {
        for (Method getter : Partitions.readGetters()) {
            assertNotEquals("getClass", getter.getName());
        }
    }

    @Test
    public void getGettersIsNotEmpty() {
        assertNotEquals(0, Partitions.readGetters().size());
    }
}