package org.cip4.lib.xjdf.type;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit test case for XJDF data type IDREF.
 */
public class IDREFTest {

    @Test
    public void testDefaultConstructor() {
        assertEquals("", new IDREF().getId());
        assertNull(new IDREF().getResource());
        assertNull(new IDREF().getProduct());
    }

    @Test
    public void testStringConstructor() {
        final IDREF idRef = new IDREF("R-123");

        assertEquals("R-123", idRef.getId());
        assertEquals("R-123", idRef.toString());
    }

    @Test
    public void testMarshal() {
        assertEquals("R-123", new IDREF().marshal(new IDREF("R-123")));
        assertNull(new IDREF().marshal(null));
    }

    @Test
    public void testUnmarshal() {
        assertEquals("R-123", new IDREF().unmarshal("R-123").getId());
    }

    @Test
    public void testEquals() {
        assertEquals(new IDREF("R-123"), new IDREF("R-123"));
        assertNotEquals(new IDREF("R-123"), new IDREF("R-456"));
    }
}
