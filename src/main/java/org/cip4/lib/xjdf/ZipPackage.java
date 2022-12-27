package org.cip4.lib.xjdf;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * This class provides functionality all about packaging.
 */
public class ZipPackage {

    private final Map<String, byte[]> assets;

    /**
     * Default constructor.
     */
    public ZipPackage() {
        this.assets = new HashMap<>();

//        FileSystem fileSystem = FileSystems.getFileSystem();
    }


    public void importZipArchive(byte[] bytes) throws IOException {
        try (
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
            ZipInputStream packageStream = new ZipInputStream(byteArrayInputStream)
        ) {
            ZipEntry entry = packageStream.getNextEntry();

            while (entry != null) {
                assets.put(entry.getName(), "test".getBytes());
                entry = packageStream.getNextEntry();
            }
        }

        System.out.println(Arrays.toString(assets.keySet().toArray()));
    }


}
