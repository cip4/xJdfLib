package org.cip4.lib.xjdf.type;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * JUnit test case for the double adapter.
 */
public class DoubleAdapterTest {

    @Test
    public void doubleToStringNull() {
        assertNull(DoubleAdapter.doubleToString(null));
    }

    @Test
    public void doubleToStringIntegral() {
        assertEquals("5", DoubleAdapter.doubleToString(5.0d));
        assertEquals("-5", DoubleAdapter.doubleToString(-5.0d));
        assertEquals("0", DoubleAdapter.doubleToString(0.0d));
    }

    @Test
    public void doubleToStringFractional() {
        assertEquals("5.5", DoubleAdapter.doubleToString(5.5d));
    }

    @Test
    public void stringToDoubleNull() {
        assertNull(DoubleAdapter.stringToDouble(null));
    }

    @Test
    public void stringToDouble() {
        assertEquals(5.5d, DoubleAdapter.stringToDouble("5.5"));
    }
}
