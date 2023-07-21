package org.cip4.lib.xjdf;

import org.cip4.lib.xjdf.exception.XJdfParseException;
import org.cip4.lib.xjdf.schema.CommandSubmitQueueEntry;
import org.cip4.lib.xjdf.schema.QueueSubmissionParams;
import org.cip4.lib.xjdf.type.URI;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.parallel.ExecutionMode.SAME_THREAD;


@Execution(SAME_THREAD)
class ZipPackageTest {

    @BeforeAll
    static void initTests() {
        XJdfConstants.AGENT_NAME = "ZIP_PACKAGE_TEST";
        XJdfConstants.AGENT_VERSION = "42.0";
        XJdfConstants.DEVICE_ID = "DEEPTHOUGHT";
    }

    @Test
    void createZipArchive_0() throws Exception {

        // arrange
        XJmfMessage xJmfMessage = new XJmfMessage();
        xJmfMessage.addMessage(new CommandSubmitQueueEntry()
            .withQueueSubmissionParams(new QueueSubmissionParams().withURL(new URI("https://www.example.org/job.xjdf"))));

        // act
        XJmfZipPackage xjmfZipPackage = new XJmfZipPackage(xJmfMessage);

        // assert
        System.out.println(new String(xJmfMessage.toXml()));

        Set<URI> files = xjmfZipPackage.listFiles();
        System.out.println(Arrays.toString(files.toArray()));

        Assertions.assertEquals(1, files.size());
        Assertions.assertTrue(files.contains(new URI("root.xjmf")));
    }

    @Test
    void createZipArchive_1() throws Exception {

        // arrange
        Map<URI, XJdfDocument> xJdfDocuments = new HashMap<>();

        XJdfDocument xJdfDoc = new XJdfDocument("MyJob", "Product");
        URI uriXJdfDoc = new URI("assets/myxjdf.xjdf");
        xJdfDocuments.put(uriXJdfDoc, xJdfDoc);

        XJmfMessage xJmfMessage = new XJmfMessage();
        xJmfMessage.addMessage(new CommandSubmitQueueEntry()
            .withQueueSubmissionParams(new QueueSubmissionParams().withURL(uriXJdfDoc)));

        // act
        XJmfZipPackage xjmfZipPackage = new XJmfZipPackage(xJmfMessage, xJdfDocuments);

        // assert
        Set<URI> files = xjmfZipPackage.listFiles();
        System.out.println(Arrays.toString(files.toArray()));

        Assertions.assertEquals(2, files.size());
        Assertions.assertTrue(files.contains(new URI("root.xjmf")));
        Assertions.assertTrue(files.contains(new URI("assets/myxjdf.xjdf")));
    }

    @Test
    void createZipArchive_2() throws Exception {

        // arrange
        Map<URI, XJdfDocument> xJdfDocuments = new HashMap<>();

        XJdfDocument xJdfDoc = new XJdfDocument("MyJob", "Product");
        URI uriXJdfDoc = new URI("./assets/myxjdf.xjdf");
        xJdfDocuments.put(uriXJdfDoc, xJdfDoc);

        XJmfMessage xJmfMessage = new XJmfMessage();
        xJmfMessage.addMessage(new CommandSubmitQueueEntry()
            .withQueueSubmissionParams(new QueueSubmissionParams().withURL(uriXJdfDoc)));

        // act
        XJmfZipPackage xjmfZipPackage = new XJmfZipPackage(xJmfMessage, xJdfDocuments);

        // assert
        Set<URI> files = xjmfZipPackage.listFiles();
        System.out.println(Arrays.toString(files.toArray()));

        Assertions.assertEquals(2, files.size());
        Assertions.assertTrue(files.contains(new URI("root.xjmf")));
        Assertions.assertTrue(files.contains(new URI("assets/myxjdf.xjdf")));
    }

    @Test
    void createZipArchive_3() throws Exception {

        // arrange
        byte[] bytes = loadFile("package.zip");

        // act
        XJmfZipPackage xjmfZipPackage = new XJmfZipPackage(bytes);

        // assert
        Set<URI> files = xjmfZipPackage.listFiles();
        System.out.println(Arrays.toString(files.toArray()));

        Assertions.assertEquals(2, files.size());
        Assertions.assertTrue(files.contains(new URI("index.xml")));
        Assertions.assertTrue(files.contains(new URI("foo.txt")));
    }

    @Test
    void createZipArchive_4() throws Exception {

        // arrange
        byte[] bytes = loadFile("package with spaces.zip");

        // act
        XJmfZipPackage xjmfZipPackage = new XJmfZipPackage(bytes);

        // assert
        Set<URI> files = xjmfZipPackage.listFiles();
        System.out.println(Arrays.toString(files.toArray()));

        Assertions.assertEquals(3, files.size());
        Assertions.assertTrue(files.contains(new URI("artwork/testArtwork.pdf")));
        Assertions.assertTrue(files.contains(new URI("testPackage.xjdf")));
        Assertions.assertTrue(files.contains(new URI("preview/testPreview.pdf")));
    }

    @Test
    void createZipArchive_5() throws Exception {

        // arrange
        byte[] file = loadFile("test.pdf");
        URI uriCommentUrl = new URI("assets/test.pdf");
        Map<URI, byte[]> mapFiles = new HashMap<>();
        mapFiles.put(uriCommentUrl, file);

        XJdfDocument xJdfDoc = new XJdfDocument("MyJob", "Product");
        xJdfDoc.getXJdf().withCommentURL(uriCommentUrl);
        URI uriXJdfDoc = new URI("assets/myxjdf.xjdf");
        Map<URI, XJdfDocument> xJdfDocuments = new HashMap<>();
        xJdfDocuments.put(uriXJdfDoc, xJdfDoc);

        XJmfMessage xJmfMessage = new XJmfMessage();
        xJmfMessage.addMessage(new CommandSubmitQueueEntry()
            .withQueueSubmissionParams(new QueueSubmissionParams().withURL(uriXJdfDoc)));

        // act
        XJmfZipPackage xjmfZipPackage = new XJmfZipPackage(xJmfMessage, xJdfDocuments, mapFiles);

        // assert
        Set<URI> files = xjmfZipPackage.listFiles();
        System.out.println(Arrays.toString(files.toArray()));

        Assertions.assertEquals(3, files.size());
        Assertions.assertTrue(files.contains(new URI("root.xjmf")));
        Assertions.assertTrue(files.contains(new URI("assets/myxjdf.xjdf")));
        Assertions.assertTrue(files.contains(new URI("assets/test.pdf")));
    }

    @Test
    void getFile_1() throws Exception {

        // arrange
        byte[] bytes = loadFile("package with spaces.zip");
        XJmfZipPackage xjmfZipPackage = new XJmfZipPackage(bytes);

        // act
        byte[] file = xjmfZipPackage.getFile("artwork/testArtwork.pdf");

        // assert
        System.out.println("File size: " + file.length);
        Assertions.assertTrue(file.length > 0);
    }

    @Test
    void getFile_2() throws Exception {

        // arrange
        byte[] bytes = loadFile("package with spaces.zip");
        XJmfZipPackage xjmfZipPackage = new XJmfZipPackage(bytes);

        // act
        byte[] file = xjmfZipPackage.getFile(new URI("testPackage.xjdf"));

        // assert
        System.out.println("File size: " + file.length);
        Assertions.assertTrue(file.length > 0);
    }

    @Test
    void getFile_3() throws Exception {

        // arrange
        byte[] bytes = loadFile("package with spaces.zip");
        XJmfZipPackage xjmfZipPackage = new XJmfZipPackage(bytes);

        // act
        byte[] file = xjmfZipPackage.getFile(new URI("NOT_EXISTING.xjdf"));

        // assert
        Assertions.assertNull(file);
    }

    @Test
    void getXJdfDocument_1() throws Exception {

        // arrange
        byte[] bytes = loadFile("package with spaces.zip");
        XJmfZipPackage xjmfZipPackage = new XJmfZipPackage(bytes);

        // act
        XJdfDocument xJdfDocument = xjmfZipPackage.getXJdfDocument("testPackage.xjdf");

        // assert
        System.out.println(new String(xJdfDocument.toXml(false)));
        Assertions.assertEquals("95733854-01", xJdfDocument.getXJdf().getJobID());
    }

    @Test
    void getXJdfDocument_2() throws Exception {

        // arrange
        byte[] bytes = loadFile("testPackage.zip");
        XJmfZipPackage xjmfZipPackage = new XJmfZipPackage(bytes);

        // act
        XJdfDocument xJdfDocument = xjmfZipPackage.getXJdfDocument(new URI("./testPackage.xjdf"));

        // assert
        System.out.println(new String(xJdfDocument.toXml(false)));
        Assertions.assertEquals("95733854-01", xJdfDocument.getXJdf().getJobID());
    }

    @Test
    void getXJdfDocument_3() throws Exception {

        // arrange
        byte[] bytes = loadFile("testPackage.zip");
        XJmfZipPackage xjmfZipPackage = new XJmfZipPackage(bytes);

        // act
        Exception exception = Assertions.assertThrows(XJdfParseException.class, () -> xjmfZipPackage.getXJdfDocument("./NOT_EXIST.xjdf"));

        // assert
        Assertions.assertEquals("Cannot read an XML byte array of null.", exception.getMessage());
    }

    @Test
    void getXJmfRoot_1() throws Exception {

        // arrange
        XJmfMessage xJmfMessage = new XJmfMessage();
        xJmfMessage.addMessage(new CommandSubmitQueueEntry()
            .withQueueSubmissionParams(new QueueSubmissionParams().withURL(new URI("https://www.example.org/job.xjdf"))));

        XJmfZipPackage xjmfZipPackage = new XJmfZipPackage(xJmfMessage);

        // act
        XJmfMessage xjmfRoot = xjmfZipPackage.getXJmfRoot();

        // assert
        System.out.println(new String(xjmfRoot.toXml()));

        Set<URI> files = xjmfZipPackage.listFiles();
        System.out.println(Arrays.toString(files.toArray()));

        Assertions.assertEquals(1, files.size());
        Assertions.assertTrue(files.contains(new URI("root.xjmf")));

        Assertions.assertEquals("DEEPTHOUGHT", xjmfRoot.getXJmf().getHeader().getDeviceID());
    }


    @Test
    void getXJmfRoot_2() throws Exception {

        // arrange
        byte[] bytes = loadFile("testPackage.zip");
        XJmfZipPackage xjmfZipPackage = new XJmfZipPackage(bytes);

        // act
        Exception exception = Assertions.assertThrows(XJdfParseException.class, xjmfZipPackage::getXJmfRoot);

        // assert
        Assertions.assertEquals("Cannot read an XML byte array of null.", exception.getMessage());
    }

    @Test
    void packageFiles_1() throws Exception {

        // arrange
        Map<URI, XJdfDocument> xJdfDocuments = new HashMap<>();

        XJdfDocument xJdfDoc = new XJdfDocument("MY_PACKAGE", "Product");
        URI uriXJdfDoc = new URI("assets/myxjdf.xjdf");
        xJdfDocuments.put(uriXJdfDoc, xJdfDoc);

        XJmfMessage xJmfMessage = new XJmfMessage();
        xJmfMessage.addMessage(new CommandSubmitQueueEntry()
            .withQueueSubmissionParams(new QueueSubmissionParams().withURL(uriXJdfDoc)));

        XJmfZipPackage xjmfZipPackage = new XJmfZipPackage(xJmfMessage, xJdfDocuments);

        // act
        byte[] result = xjmfZipPackage.packageFiles();

        // assert
        XJmfZipPackage resultXJmfZipPackage = new XJmfZipPackage(result);
        System.out.println(Arrays.toString(resultXJmfZipPackage.listFiles().toArray()));

        Set<URI> files = resultXJmfZipPackage.listFiles();
        Assertions.assertEquals(2, files.size());
        Assertions.assertTrue(files.contains(new URI("root.xjmf")));
        Assertions.assertTrue(files.contains(new URI("assets/myxjdf.xjdf")));

        XJdfDocument resultXJdfDoc = resultXJmfZipPackage.getXJdfDocument("assets/myxjdf.xjdf");
        System.out.println(new String(resultXJdfDoc.toXml()));

        Assertions.assertEquals("MY_PACKAGE", resultXJdfDoc.getXJdf().getJobID());
    }

    @Test
    void packageFiles_2() throws Exception {

        // arrange
        byte[] bytes = loadFile("testPackage.zip");
        XJmfZipPackage xjmfZipPackage = new XJmfZipPackage(bytes);

        // act
        byte[] result = xjmfZipPackage.packageFiles();

        // assert
        XJmfZipPackage resultXJmfZipPackage = new XJmfZipPackage(result);
        System.out.println(Arrays.toString(resultXJmfZipPackage.listFiles().toArray()));

        Set<URI> files = resultXJmfZipPackage.listFiles();
        Assertions.assertEquals(3, files.size());
        Assertions.assertTrue(files.contains(new URI("artwork/testArtwork.pdf")));
        Assertions.assertTrue(files.contains(new URI("testPackage.xjdf")));
        Assertions.assertTrue(files.contains(new URI("preview/testPreview.pdf")));

        XJdfDocument resultXJdfDoc = resultXJmfZipPackage.getXJdfDocument("testPackage.xjdf");
        System.out.println(new String(resultXJdfDoc.toXml(false)));

        Assertions.assertEquals("95733854-01", resultXJdfDoc.getXJdf().getJobID());
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