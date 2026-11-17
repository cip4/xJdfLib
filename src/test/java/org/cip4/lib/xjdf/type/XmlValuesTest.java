package org.cip4.lib.xjdf.type;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * JUnit test case for the whitespace separated value helper.
 */
public class XmlValuesTest {

    @Test
    public void splitSingleSpaces() {
        assertArrayEquals(new String[] { "a", "b", "c" }, XmlValues.split("a b c"));
    }

    @Test
    public void splitRepeatedAndMixedWhitespace() {
        assertArrayEquals(new String[] { "a", "b", "c" }, XmlValues.split("  a\t\tb \n c  "));
    }

    @Test
    public void splitBlank() {
        assertArrayEquals(new String[0], XmlValues.split(""));
        assertArrayEquals(new String[0], XmlValues.split("   "));
    }

    @Test
    public void splitNull() {
        assertThrows(IllegalArgumentException.class, () -> XmlValues.split(null));
    }

    @Test
    public void splitExpectedCount() {
        assertArrayEquals(new String[] { "1", "2" }, XmlValues.split("XYPair", " 1   2 ", 2));
        assertThrows(IllegalArgumentException.class, () -> XmlValues.split("XYPair", "1", 2));
        assertThrows(IllegalArgumentException.class, () -> XmlValues.split("XYPair", "1 2 3", 2));
    }

    @Test
    public void parseFloatInvalid() {
        assertThrows(IllegalArgumentException.class, () -> XmlValues.parseFloat("XYPair", "abc"));
    }

    @Test
    public void parseIntInvalid() {
        assertThrows(IllegalArgumentException.class, () -> XmlValues.parseInt("IntegerList", "1.5"));
    }
}
