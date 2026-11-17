package org.cip4.lib.xjdf.type;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Ensures the XJDF data types can be serialized, as required by the serializable generated schema classes.
 */
public class SerializationTest {

    @Test
    public void allTypesImplementSerializable() {
        assertTrue(new XYPair() instanceof java.io.Serializable);
        assertTrue(new Matrix() instanceof java.io.Serializable);
        assertTrue(new Shape() instanceof java.io.Serializable);
        assertTrue(new Rectangle() instanceof java.io.Serializable);
        assertTrue(new DateTime() instanceof java.io.Serializable);
        assertTrue(new Duration() instanceof java.io.Serializable);
        assertTrue(new IntegerList() instanceof java.io.Serializable);
        assertTrue(new NMTokens() instanceof java.io.Serializable);
        assertTrue(new IDREF() instanceof java.io.Serializable);
    }

    @Test
    public void roundTrip() throws Exception {
        assertRoundTrip(new XYPair(1.5f, 2.5f));
        assertRoundTrip(new Matrix(1, 2, 3, 4, 5, 6));
        assertRoundTrip(new Shape(1, 2, 3));
        assertRoundTrip(new Rectangle(1, 2, 3, 4));
        assertRoundTrip(new DateTime(2012, 3, 4, 16, 20, 45, 999, java.time.ZoneId.of("UTC")));
        assertRoundTrip(new Duration("P1Y2M3DT4H5M6S"));
        assertRoundTrip(new IntegerList(1, 2, 3));
        assertRoundTrip(new NMTokens("a", "b"));
        assertRoundTrip(new IDREF("R-123"));
    }

    private void assertRoundTrip(final Object value) throws Exception {
        final ByteArrayOutputStream bytes = new ByteArrayOutputStream();

        try (ObjectOutputStream out = new ObjectOutputStream(bytes)) {
            out.writeObject(value);
        }

        final Object copy;
        try (ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(bytes.toByteArray()))) {
            copy = in.readObject();
        }

        assertEquals(value, copy);
    }
}
