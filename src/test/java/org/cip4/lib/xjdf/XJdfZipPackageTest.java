package org.cip4.lib.xjdf;

import org.cip4.lib.xjdf.exception.XJdfPackagerException;
import org.cip4.lib.xjdf.schema.FileSpec;
import org.cip4.lib.xjdf.schema.ResourceSet;
import org.cip4.lib.xjdf.schema.RunList;
import org.cip4.lib.xjdf.type.URI;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;

import java.util.Map;

import static org.junit.jupiter.api.parallel.ExecutionMode.SAME_THREAD;

@Execution(SAME_THREAD)
class XJdfZipPackageTest {

    private static final byte[] ARTWORK = "ARTWORK".getBytes();

    @BeforeAll
    static void initTests() {
        XJdfConstants.AGENT_NAME = "XJDF_PACKAGE_TEST";
        XJdfConstants.AGENT_VERSION = "42.0";
        XJdfConstants.DEVICE_ID = "DEEPTHOUGHT";
    }

    @Test
    void buildAndPackageFiles() throws Exception {

        // arrange
        XJdfDocument document = newXJdfDocument();

        // act
        XJdfZipPackage xJdfZipPackage = new XJdfZipPackage.Builder()
            .withXJdfDocument(new URI("0b520d.xjdf"), document)
            .withFile(new URI("artwork/testArtwork.pdf"), ARTWORK)
            .build();

        // assert
        Assertions.assertEquals(new URI("0b520d.xjdf"), xJdfZipPackage.getXJdfUri());
        Assertions.assertEquals(2, xJdfZipPackage.listFiles().size());
        Assertions.assertArrayEquals(ARTWORK, xJdfZipPackage.getFile("artwork/testArtwork.pdf"));
        Assertions.assertEquals("0b520d", xJdfZipPackage.getXJdfDocument().getXJdf().getJobID());
    }

    @Test
    void xjdfDocumentIsTheFirstEntry() throws Exception {

        // arrange
        XJdfZipPackage xJdfZipPackage = new XJdfZipPackage.Builder()
            .withXJdfDocument(new URI("0b520d.xjdf"), newXJdfDocument())
            .withFile(new URI("artwork/testArtwork.pdf"), ARTWORK)
            .build();

        // act
        byte[] zip = xJdfZipPackage.packageFiles();

        // assert
        Map<URI, byte[]> entries = ZipArchive.read(zip);
        Assertions.assertEquals(
            new URI("0b520d.xjdf"),
            entries.keySet().iterator().next(),
            "The XJDF document must be the first entry of the archive."
        );
    }

    @Test
    void defaultUriFollowsTheJobId() throws Exception {

        // arrange
        XJdfDocument document = new XJdfDocument("0b520d", "PreviewGeneration");

        // act
        XJdfZipPackage xJdfZipPackage = new XJdfZipPackage.Builder()
            .withXJdfDocument(document)
            .build();

        // assert
        Assertions.assertEquals(new URI("0b520d.xjdf"), xJdfZipPackage.getXJdfUri());
    }

    @Test
    void defaultUriFallsBackForMissingOrInvalidJobId() throws Exception {

        // arrange
        XJdfDocument withoutJobId = new XJdfDocument(null, "PreviewGeneration");
        XJdfDocument withInvalidJobId = new XJdfDocument("0b 520/d", "PreviewGeneration");

        // act & assert
        Assertions.assertEquals(new URI("document.xjdf"), XJdfZipPackage.defaultXJdfUri(withoutJobId));
        Assertions.assertEquals(new URI("document.xjdf"), XJdfZipPackage.defaultXJdfUri(withInvalidJobId));
    }

    @Test
    void readExistingPackage() throws Exception {

        // arrange
        byte[] zip = new XJdfZipPackage.Builder()
            .withXJdfDocument(new URI("jobs/0b520d.xjdf"), newXJdfDocument())
            .withFile(new URI("jobs/artwork/testArtwork.pdf"), ARTWORK)
            .build()
            .packageFiles();

        // act
        XJdfZipPackage xJdfZipPackage = new XJdfZipPackage(zip);

        // assert
        Assertions.assertEquals(new URI("jobs/0b520d.xjdf"), xJdfZipPackage.getXJdfUri());
        Assertions.assertEquals(2, xJdfZipPackage.listFiles().size());
        Assertions.assertEquals("0b520d", xJdfZipPackage.getXJdfDocument().getXJdf().getJobID());
        Assertions.assertArrayEquals(ARTWORK, xJdfZipPackage.getFile("jobs/artwork/testArtwork.pdf"));
    }

    @Test
    void readRealWorldPackage() throws Exception {

        // arrange
        byte[] zip = TestResources.load("testPackage.zip");

        // act
        XJdfZipPackage xJdfZipPackage = new XJdfZipPackage(zip);

        // assert
        Assertions.assertEquals(new URI("testPackage.xjdf"), xJdfZipPackage.getXJdfUri());
        Assertions.assertEquals(3, xJdfZipPackage.listFiles().size());
        Assertions.assertEquals("95733854-01", xJdfZipPackage.getXJdfDocument().getXJdf().getJobID());
    }

    @Test
    void readFailsWithoutXjdfDocument() throws Exception {

        // arrange
        byte[] zip = TestResources.load("package.zip");

        // act
        XJdfPackagerException exception = Assertions.assertThrows(
            XJdfPackagerException.class,
            () -> new XJdfZipPackage(zip)
        );

        // assert
        Assertions.assertTrue(
            exception.getMessage().contains("no XJDF document"),
            "The message must explain the missing document: " + exception.getMessage()
        );
    }

    @Test
    void readFailsWithMultipleXjdfDocuments() throws Exception {

        // arrange
        XJmfMessage xJmfMessage = new XJmfMessage();
        xJmfMessage.addMessage(
            new org.cip4.lib.xjdf.schema.CommandSubmitQueueEntry()
                .withQueueSubmissionParams(
                    new org.cip4.lib.xjdf.schema.QueueSubmissionParams().withURL(new URI("first.xjdf"))
                )
        );

        byte[] zip = new XJmfZipPackage.Builder()
            .withXJdfDocument(new URI("first.xjdf"), new XJdfDocument("first", "PreviewGeneration"))
            .withXJdfDocument(new URI("second.xjdf"), new XJdfDocument("second", "PreviewGeneration"))
            .withXJmfRoot(xJmfMessage)
            .build()
            .packageFiles();

        // act
        XJdfPackagerException exception = Assertions.assertThrows(
            XJdfPackagerException.class,
            () -> new XJdfZipPackage(zip)
        );

        // assert
        Assertions.assertTrue(
            exception.getMessage().contains("more than one XJDF document"),
            "The message must name the duplicate documents: " + exception.getMessage()
        );
    }

    @Test
    void buildFailsWithoutDocument() throws Exception {

        // arrange
        XJdfZipPackage.Builder builder = new XJdfZipPackage.Builder()
            .withFile(new URI("artwork/testArtwork.pdf"), ARTWORK);

        // act
        XJdfPackagerException exception = Assertions.assertThrows(
            XJdfPackagerException.class,
            builder::build
        );

        // assert
        Assertions.assertTrue(
            exception.getMessage().contains("No XJDF document"),
            "The message must explain the missing document: " + exception.getMessage()
        );
    }

    /**
     * Creates a document that references an artwork file.
     */
    private static XJdfDocument newXJdfDocument() throws Exception {
        XJdfDocument document = new XJdfDocument("0b520d", "PreviewGeneration");

        ResourceSet runListResourceSet = document.addResourceSet(RunList.class, ResourceSet.Usage.INPUT);
        document.addSpecificResource(
            runListResourceSet,
            new RunList().withFileSpec(new FileSpec().withURL(new URI("artwork/testArtwork.pdf")))
        );

        return document;
    }
}
