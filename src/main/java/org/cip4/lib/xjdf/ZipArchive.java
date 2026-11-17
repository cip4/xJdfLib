package org.cip4.lib.xjdf;

import org.cip4.lib.xjdf.type.URI;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/**
 * Reads and writes the ZIP archives behind XJDF and XJMF packages.
 *
 * <p>
 * The entries are kept in a {@link LinkedHashMap}, so the archive order is stable and the root document of a
 * package can be written first.
 * </p>
 */
final class ZipArchive {

    private ZipArchive() {
        // prevent instances
    }

    /**
     * Reads all entries of a zip archive, preserving the archive order.
     *
     * @param zipArchive The archive as byte array.
     *
     * @return The entries as ordered map.
     *
     * @throws IOException in case the archive cannot be read.
     * @throws URISyntaxException in case an entry name is not a valid URI.
     */
    static Map<URI, byte[]> read(final byte[] zipArchive) throws IOException, URISyntaxException {
        Map<URI, byte[]> entries = new LinkedHashMap<>();

        try (
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(zipArchive);
            ZipInputStream packageStream = new ZipInputStream(byteArrayInputStream)
        ) {
            ZipEntry entry = packageStream.getNextEntry();

            while (entry != null) {
                entries.put(new URI(entry.getName()), packageStream.readAllBytes());
                entry = packageStream.getNextEntry();
            }
        }

        return entries;
    }

    /**
     * Writes the entries to a zip archive, in map order.
     *
     * @param entries The entries as ordered map.
     *
     * @return The archive as byte array.
     *
     * @throws IOException in case the archive cannot be written.
     */
    static byte[] write(final Map<URI, byte[]> entries) throws IOException {
        try (
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ZipOutputStream packageStream = new ZipOutputStream(byteArrayOutputStream)
        ) {
            for (Map.Entry<URI, byte[]> entry : entries.entrySet()) {
                ZipEntry zipEntry = new ZipEntry(entry.getKey().toString());
                packageStream.putNextEntry(zipEntry);
                packageStream.write(entry.getValue());
                packageStream.closeEntry();
            }

            packageStream.close();
            return byteArrayOutputStream.toByteArray();
        }
    }
}
