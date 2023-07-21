package org.cip4.lib.xjdf;

import org.cip4.lib.xjdf.schema.*;
import org.cip4.lib.xjdf.type.URI;
import org.cip4.lib.xjdf.type.XYPair;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.UUID;

public class XJdfDocumentExamples {

    @BeforeEach
    public void init() {
        XJdfConstants.AGENT_NAME = "PreviewService";
        XJdfConstants.AGENT_VERSION = "1.2.34";
        XJdfConstants.DEVICE_ID = "PREVIEW_SERVICE";
    }

    @Test
    public void example_1() throws Exception {

        // sample code
        XJdfDocument xJdfDocument = new XJdfDocument("42", "Interpreting",  "Rendering", "PreviewGeneration");

        ResourceSet previewResourceSet = xJdfDocument.addResourceSet(Preview.class, ResourceSet.Usage.INPUT);

        xJdfDocument.addSpecificResource(
                previewResourceSet,
                new Preview()
                        .withPreviewFileType(Preview.PreviewFileType.PNG)
                        .withFileSpec(new FileSpec().withURL(new URI("preview.png")))
        );

        byte[] bytes = xJdfDocument.toXml();

        // output
        System.out.println(new String(bytes));
    }

    @Test
    public void example_2() throws Exception {

        // sample code
        XJdfDocument xJdfDocument = new XJdfDocument("42", "Interpreting",  "Rendering", "PreviewGeneration");

        ResourceSet previewResourceSet = xJdfDocument.addResourceSet(Preview.class, ResourceSet.Usage.INPUT);

        xJdfDocument.addSpecificResource(
                previewResourceSet,
                new Preview()
                        .withPreviewFileType(Preview.PreviewFileType.PNG)
                        .withFileSpec(new FileSpec().withURL(new URI("preview.png"))),
                new Part().withPreviewType(Part.PreviewType.VIEWABLE)
        );

        xJdfDocument.addSpecificResource(
                previewResourceSet,
                new Preview()
                        .withPreviewFileType(Preview.PreviewFileType.PNG)
                        .withFileSpec(new FileSpec().withURL(new URI("thumb.png"))),
                new Part().withPreviewType(Part.PreviewType.THUMB_NAIL)
        );

        byte[] bytes = xJdfDocument.toXml();

        // output
        System.out.println(new String(bytes));
    }

    @Test
    public void example_3() throws Exception {

        // load artwork
        byte[] artwork = "ARTWORK".getBytes();
        URI artworkUri = new URI("artwork/my-artwork.pdf");

        // create XJDF Document
        String jobId = UUID.randomUUID().toString().substring(0, 6);

        XJdfDocument xJdfDocument = new XJdfDocument(jobId, "PreviewGeneration");

        ResourceSet runListResourceSet = xJdfDocument.addResourceSet(RunList.class, ResourceSet.Usage.INPUT);
        xJdfDocument.addSpecificResource(
                runListResourceSet,
                new RunList().withFileSpec(new FileSpec().withURL(artworkUri))
        );

        ResourceSet previewGenerationParamsResourceSet = xJdfDocument.addResourceSet(PreviewGenerationParams.class, ResourceSet.Usage.INPUT);
        xJdfDocument.addSpecificResource(
                previewGenerationParamsResourceSet,
                new PreviewGenerationParams().withResolution(new XYPair(72f, 72f))
        );
        URI xJdfDocumentUri = new URI(jobId + ".xjdf");

        // create CommandSubmitQueueEntry XJMF Message
        XJmfMessage xJmfMessage = new XJmfMessage();
        xJmfMessage.addMessage(
                new CommandSubmitQueueEntry().withQueueSubmissionParams(new QueueSubmissionParams().withURL(xJdfDocumentUri))
        );

        // create and return zip package
        byte[] xjmfZipPackage = new XJmfZipPackage.Builder()
                .withXJmfRoot(xJmfMessage)
                .withXJdfDocument(xJdfDocumentUri, xJdfDocument)
                .withFile(artworkUri, artwork)
                .build()
                .packageFiles();

    }
}
