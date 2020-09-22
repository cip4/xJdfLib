package org.cip4.lib.xjdf;

import org.cip4.lib.xjdf.schema.AuditCreated;
import org.cip4.lib.xjdf.schema.FileSpec;
import org.cip4.lib.xjdf.schema.Header;
import org.cip4.lib.xjdf.schema.NodeInfo;
import org.cip4.lib.xjdf.schema.Part;
import org.cip4.lib.xjdf.schema.Preview;
import org.cip4.lib.xjdf.schema.ResourceSet;
import org.cip4.lib.xjdf.schema.RunList;
import org.cip4.lib.xjdf.schema.Side;
import org.cip4.lib.xjdf.schema.XJDF;
import org.cip4.lib.xjdf.type.DateTime;
import org.cip4.lib.xjdf.type.URI;
import org.cip4.lib.xjdf.xml.XJdfPackager;
import org.cip4.lib.xjdf.xml.internal.AbstractXmlPackager;
import org.cip4.lib.xjdf.xml.internal.JAXBContextFactory;
import org.cip4.lib.xjdf.xml.internal.XJdfNamespaceMapper;
import org.junit.jupiter.api.Test;

import javax.xml.bind.Marshaller;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class XJdfDocumentTest {

    @Test
    public void createXJDF_1() throws Exception {

        // ARRANGE
        XJdfDocument xjdfDoc = new XJdfDocument("JobID", new String[] {"ConventionalPrinting", "Cutting"});

        // audit pool
        AuditCreated auditCreated = new AuditCreated();
        Header header = new Header();
        header.setAgentName("Test Agent");
        auditCreated.setHeader(header);
        xjdfDoc.addAudit(auditCreated);

        // resources simple
        NodeInfo nodeInfo = new NodeInfo();
        nodeInfo.setEnd(new DateTime(2018,7,23,9,23,0));
        xjdfDoc.addResourceSet(nodeInfo, ResourceSet.Usage.INPUT);

        // resource multiple
        Map<Part, RunList> runListMap = new HashMap<>();

        Part front = new Part();
        front.setSide(Side.FRONT);
        runListMap.put(front, new RunList());
        runListMap.get(front).setFileSpec(new FileSpec());
        runListMap.get(front).getFileSpec().setURL(new URI(new java.net.URI("https://example.org/front.pdf")));

        Part back = new Part();
        back.setSide(Side.BACK);
        runListMap.put(back, new RunList());
        runListMap.get(back).setFileSpec(new FileSpec());
        runListMap.get(back).getFileSpec().setURL(new URI(new java.net.URI("https://example.org/back.pdf")));

        xjdfDoc.addResourceSet(runListMap, ResourceSet.Usage.INPUT);
        xjdfDoc.setValidation(false);

        // ACT

        // ASSERT
        System.out.println("----------------");
        System.out.println("");
        System.out.println(xjdfDoc.toXml());
        System.out.println("");
        System.out.println("----------------");
    }

    @Test
    public void createXJDF_1_pgk() throws Exception {

        // ARRANGE
        XJdfDocument xjdfDoc = new XJdfDocument("JobID", new String[] {"ConventionalPrinting", "Cutting"});

        // audit pool
        AuditCreated auditCreated = new AuditCreated();
        Header header = new Header();
        header.setAgentName("Test Agent");
        auditCreated.setHeader(header);
        xjdfDoc.addAudit(auditCreated);

        // resources simple
        NodeInfo nodeInfo = new NodeInfo();
        nodeInfo.setEnd(new DateTime(2018,7,23,9,23,0));
        xjdfDoc.addResourceSet(nodeInfo, ResourceSet.Usage.INPUT);

        // resource multiple
        Map<Part, RunList> runListMap = new HashMap<>();

        Part front = new Part();
        front.setSide(Side.FRONT);
        runListMap.put(front, new RunList());
        runListMap.get(front).setFileSpec(new FileSpec());
        runListMap.get(front).getFileSpec().setURL(new URI(new java.net.URI("https://example.org/front.pdf")));

        Part back = new Part();
        back.setSide(Side.BACK);
        runListMap.put(back, new RunList());
        runListMap.get(back).setFileSpec(new FileSpec());
        runListMap.get(back).getFileSpec().setURL(new URI(new java.net.URI("https://example.org/back.pdf")));

        xjdfDoc.addResourceSet(runListMap, ResourceSet.Usage.INPUT);
        xjdfDoc.setValidation(false);

        // ACT
        byte[] bytes = xjdfDoc.getXJdfPackage();

        // ASSERT
    }

    @Test
    public void createXJDF_2() throws Exception {

        // arrange
        XJdfDocument xJdfDoc = new XJdfDocument("JOB_42", new String[]{"ConventionalPrinting", "Cutting"});

        Map<Part, Preview> previews = new HashMap<>();

        previews.put(
            new Part().withPreviewType(Part.PreviewType.IDENTIFICATION),
            new Preview().withFileSpec(new FileSpec().withURL(new URI("https://cip4.example.org/identification.pdf")))
        );

        previews.put(
            new Part().withPreviewType(Part.PreviewType.THUMB_NAIL),
            new Preview().withFileSpec(new FileSpec().withURL(new URI("https://cip4.example.org/preview.jpg")))
        );

        xJdfDoc.addResourceSet(previews, ResourceSet.Usage.INPUT);

        xJdfDoc.addResourceSet(
            new RunList().withFileSpec(new FileSpec().withURL(new URI("https://cip4.example.org/artwork.pdf"))),
            ResourceSet.Usage.INPUT
        );

        // act

        // assert
        System.out.println(xJdfDoc.toXml());
    }

    @Test
    public void createXJDF_2_pgk() throws Exception {

        // arrange
        final String jobId = "SHEET_ID";

        XJdfDocument xJdfDoc = new XJdfDocument(jobId, new String[]{"ConventionalPrinting", "Cutting"});

        Map<Part, Preview> previews = new HashMap<>();

        previews.put(
            new Part().withPreviewType(Part.PreviewType.IDENTIFICATION),
            new Preview().withFileSpec(new FileSpec().withURL(new URI("identification".getBytes(), "preview/" + jobId + "-identification.pdf")))
        );

        previews.put(
            new Part().withPreviewType(Part.PreviewType.THUMB_NAIL),
            new Preview().withFileSpec(new FileSpec().withURL(new URI("thumb".getBytes(), "preview/" + jobId + ".jpg")))
        );

        xJdfDoc.addResourceSet(previews, ResourceSet.Usage.INPUT);

        xJdfDoc.addResourceSet(
            new RunList().withFileSpec(new FileSpec().withURL(new URI("artwork".getBytes(), "runlist/" + jobId + ".pdf"))),
            ResourceSet.Usage.INPUT
        );

        // act

        // assert
        System.out.println(xJdfDoc.toXml());
    }

    @Test
    public void createXJDF_3() throws Exception {

        // arrange
        XJdfDocument xJdfDoc = new XJdfDocument("JOB_42", new String[]{"ConventionalPrinting", "Cutting"});

        Map<Part, Preview> previews = new HashMap<>();

        // act
        Exception exception = assertThrows(IOException.class, () -> {
            xJdfDoc.addResourceSet(previews, ResourceSet.Usage.INPUT);
        });

        // assert
        assertEquals("The resource map requries at leaset one entry.", exception.getMessage());
    }
}