package org.cip4.lib.xjdf.type;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit test case for XJDF data type NMTokens.
 */
public class NMTokensTest {

    @Test
    public void testDefaultConstructor() {
        assertTrue(new NMTokens().getList().isEmpty());
        assertEquals("", new NMTokens().toString());
    }

    @Test
    public void testVarargsConstructor() {
        final NMTokens tokens = new NMTokens("a", "b", "c");
        assertEquals("a b c", tokens.toString());
    }

    @Test
    public void testStringConstructor() {
        final NMTokens tokens = new NMTokens("a  b\tc");
        assertEquals(Arrays.asList("a", "b", "c"), tokens.getList());
    }

    @Test
    public void testEmptyStringConstructor() {
        assertTrue(new NMTokens("").getList().isEmpty());
    }

    @Test
    public void testListIsDefensivelyCopied() {
        final List<String> source = new java.util.ArrayList<>(Arrays.asList("a", "b"));
        final NMTokens tokens = new NMTokens(source);
        source.add("c");

        assertEquals(Arrays.asList("a", "b"), tokens.getList());
        assertThrows(UnsupportedOperationException.class, () -> tokens.getList().add("c"));
    }

    @Test
    public void testUnmarshal() throws Exception {
        final NMTokens tokens = (NMTokens) new NMTokens().unmarshal("a b");
        assertEquals(Arrays.asList("a", "b"), tokens.getList());
    }
}
