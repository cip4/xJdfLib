package org.cip4.lib.xjdf.xml;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.cip4.lib.xjdf.XJdfDocument;
import org.cip4.lib.xjdf.schema.Preview;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit test case for XJdfUnpackager
 *
 * @author s.meissner
 */
public class XJdfUnpackagerTest {

    private final static String RES_PGK = "/org/cip4/lib/xjdf/testPackage.zip";
    private final static String RES_PGK_WITH_SPACES = "/org/cip4/lib/xjdf/package with spaces.zip";

    @Test
    public void testUnpackageZip() throws IOException, URISyntaxException {

        // arrange
        String pathZip = XJdfUnpackagerTest.class.getResource(RES_PGK).toURI().getPath();

        String tmpDir = FileUtils.getTempDirectoryPath();
        String targetDir = FilenameUtils.concat(tmpDir, "XJdfLib_UnpackageTest_" + System.currentTimeMillis());

        // assert
        XJdfUnpackager unpackager = new XJdfUnpackager(pathZip);
        unpackager.unpackageXJdf(targetDir);

        // act
        File targetFile = new File(targetDir);
        assertTrue(targetFile.exists(), "Target destination does not exist.");

        String pathPtk = FilenameUtils.concat(targetDir, "testPackage.xjdf");
        assertTrue(new File(pathPtk).exists(), "File does not exist.");

        String pathArtwork = FilenameUtils.concat(targetDir, "artwork/testArtwork.pdf");
        assertTrue(new File(pathArtwork).exists(), "Artwork does not exist.");

        String pathPreview = FilenameUtils.concat(targetDir, "preview/testPreview.pdf");
        assertTrue(new File(pathPreview).exists(), "Preview does not exist.");

        FileUtils.deleteDirectory(targetFile); // clean up
        assertFalse(targetFile.exists(), "Target destination was not removed.");
    }

    @Test
    public void testUnpackageZipWithSpaces() throws IOException, URISyntaxException {

        // arrange
        URI pathZip = XJdfUnpackagerTest.class.getResource(RES_PGK_WITH_SPACES).toURI();

        String tmpDir = FileUtils.getTempDirectoryPath();
        String targetDir = FilenameUtils.concat(tmpDir, "XJdfLib_UnpackageTest_" + System.currentTimeMillis());

        // assert
        XJdfUnpackager unpackager = new XJdfUnpackager(pathZip.getPath());
        unpackager.unpackageXJdf(targetDir);

        // act
        File targetFile = new File(targetDir);
        assertTrue(targetFile.exists(), "Target destination does not exist.");

        String pathPtk = FilenameUtils.concat(targetDir, "testPackage.xjdf");
        assertTrue(new File(pathPtk).exists(), "File does not exist.");

        String pathArtwork = FilenameUtils.concat(targetDir, "artwork/testArtwork.pdf");
        assertTrue(new File(pathArtwork).exists(), "Artwork does not exist.");

        String pathPreview = FilenameUtils.concat(targetDir, "preview/testPreview.pdf");
        assertTrue(new File(pathPreview).exists(), "Preview does not exist.");

        FileUtils.deleteDirectory(targetFile); // clean up
        assertFalse(targetFile.exists(), "Target destination was not removed.");
    }

    @Test
    public void testUnpackageZipTempDir() throws IOException, URISyntaxException {

        // arrange
        String pathZip = XJdfUnpackagerTest.class.getResource(RES_PGK).toURI().getPath();

        // assert
        XJdfUnpackager unpackager = new XJdfUnpackager(pathZip);
        String targetDir = FilenameUtils.getFullPath(unpackager.unpackageXJdfTemp());

        // act
        File targetFile = new File(targetDir);
        assertTrue(targetFile.exists(), "Target destination does not exist.");

        String pathPtk = FilenameUtils.concat(targetDir, "testPackage.xjdf");
        assertTrue(new File(pathPtk).exists(), "File does not exist.");

        String pathArtwork = FilenameUtils.concat(targetDir, "artwork/testArtwork.pdf");
        assertTrue(new File(pathArtwork).exists(), "Artwork does not exist.");

        String pathPreview = FilenameUtils.concat(targetDir, "preview/testPreview.pdf");
        assertTrue(new File(pathPreview).exists(), "Preview does not exist.");

        FileUtils.deleteDirectory(targetFile); // clean up
        assertFalse(targetFile.exists(), "Target destination was not removed.");
    }

    @Test
    public void testGetXJdfDocument() throws Exception {

        // arrange
        String path = XJdfUnpackagerTest.class.getResource(RES_PGK).toURI().getPath();
        XJdfUnpackager unpackager = new XJdfUnpackager(path);

        // act
        XJdfDocument xJdfDocument = unpackager.getXJdfDocument();

        String pathPreview = xJdfDocument.getSpecificResourceByPart(Preview.class).getFileSpec().getURL().getSourceUri().getPath();
        byte[] bytes = unpackager.extractFile(pathPreview);

        // assert
        assertEquals(xJdfDocument.getXJdf().getJobID(), "95733854-01", "XJDF ID is wrong.");
        assertNotEquals(0, bytes.length, "Preview is null.");
    }
}
