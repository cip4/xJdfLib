package org.cip4.lib.xjdf;

import org.junit.jupiter.api.Test;

import java.io.IOException;

class ZipPackageTest {

    @Test
    void importZipArchive() throws Exception {

        // arrange
        byte[] bytes = loadFile("package.zip");

        ZipPackage pkg = new ZipPackage();

        // act
        pkg.importZipArchive(bytes);

        // assert
    }

    /**
     * Helper method to load a file.
     * @param filename The files name.
     * @return The file as byte array.
     */
    private byte[] loadFile(String filename) throws IOException {
        return ZipPackageTest.class.getResourceAsStream("/org/cip4/lib/xjdf/" + filename).readAllBytes();
    }
}