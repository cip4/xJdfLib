package org.cip4.lib.xjdf;

import java.io.IOException;
import java.io.InputStream;

/**
 * Loads test resources from {@code src/test/resources}.
 */
public final class TestResources {

    /**
     * Root of the test resources.
     */
    public static final String ROOT = "/org/cip4/lib/xjdf/";

    private TestResources() {
    }

    /**
     * Loads a test resource from {@code /org/cip4/lib/xjdf/}.
     *
     * @param filename The file name, relative to the root.
     *
     * @return The file content.
     *
     * @throws IOException in case the resource cannot be read.
     */
    public static byte[] load(final String filename) throws IOException {
        return read(ROOT + filename);
    }

    /**
     * Loads a test resource from {@code /org/cip4/lib/xjdf/xml/}.
     *
     * @param filename The file name, relative to the xml folder.
     *
     * @return The file content.
     *
     * @throws IOException in case the resource cannot be read.
     */
    public static byte[] loadXml(final String filename) throws IOException {
        return read(ROOT + "xml/" + filename);
    }

    private static byte[] read(final String path) throws IOException {
        try (InputStream stream = TestResources.class.getResourceAsStream(path)) {
            if (stream == null) {
                throw new IOException("Test resource not found: " + path);
            }
            return stream.readAllBytes();
        }
    }
}
