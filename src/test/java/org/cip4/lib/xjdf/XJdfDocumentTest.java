package org.cip4.lib.xjdf;

import org.cip4.lib.xjdf.exception.XJdfInitException;
import org.cip4.lib.xjdf.exception.XJdfParseException;
import org.cip4.lib.xjdf.schema.*;
import org.cip4.lib.xjdf.type.DateTime;
import org.cip4.lib.xjdf.type.URI;
import org.cip4.lib.xjdf.xml.XJdfConstants;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.parallel.ExecutionMode.SAME_THREAD;

@Execution(SAME_THREAD)
public class XJdfDocumentTest {

    @BeforeAll
    static void initTests() {
        XJdfConstants.AGENT_NAME = "MY_AGENT";
        XJdfConstants.AGENT_VERSION = "MY_AGENT_VERSION";
        XJdfConstants.DEVICE_ID = "MY_DEVICE";
    }

    @Test
    public void createXJDF_1() throws Exception {

        // ARRANGE
        XJdfDocument xjdfDoc = new XJdfDocument("JobID", "ConventionalPrinting", "Cutting");

        // audit pool
        AuditCreated auditCreated = new AuditCreated();
        Header header = new Header();
        header.setAgentName("Test Agent");
        auditCreated.setHeader(header);
        xjdfDoc.addAudits(auditCreated);

        // resources simple
        NodeInfo nodeInfo = new NodeInfo();
        nodeInfo.setEnd(new DateTime(2018, 7, 23, 9, 23, 0));
        xjdfDoc.addResourceSet(nodeInfo, ResourceSet.Usage.INPUT);

        // resource multiple
        Map<Part[], RunList> runListMap = new HashMap<>();

        runListMap.put(
                new Part[]{new Part().withSide(Side.FRONT)},
                new RunList().withFileSpec(
                        new FileSpec().withURL(new URI(new java.net.URI("https://example.org/front.pdf"))))
        );

        runListMap.put(
                new Part[]{new Part().withSide(Side.BACK)},
                new RunList().withFileSpec(
                        new FileSpec().withURL(new URI(new java.net.URI("https://example.org/back.pdf"))))
        );

        xjdfDoc.addResourceSet(runListMap, ResourceSet.Usage.INPUT);

        // ACT

        // ASSERT
        System.out.println("----------------");
        System.out.println("");
        System.out.println(new String(xjdfDoc.toXml(false)));
        System.out.println("");
        System.out.println("----------------");
    }

    @Test
    public void createXJDF_2() throws Exception {

        // arrange
        XJdfDocument xJdfDoc = new XJdfDocument("JOB_42", new String[]{"ConventionalPrinting", "Cutting"});

        Map<Part[], Preview> previews = new HashMap<>();

        previews.put(
                new Part[]{new Part().withPreviewType(Part.PreviewType.IDENTIFICATION)},
                new Preview().withFileSpec(new FileSpec().withURL(new URI("https://cip4.example.org/identification.pdf")))
        );

        previews.put(
                new Part[]{new Part().withPreviewType(Part.PreviewType.THUMB_NAIL)},
                new Preview().withFileSpec(new FileSpec().withURL(new URI("https://cip4.example.org/preview.jpg")))
        );

        xJdfDoc.addResourceSet(previews, ResourceSet.Usage.INPUT);

        xJdfDoc.addResourceSet(
                new RunList().withFileSpec(new FileSpec().withURL(new URI("https://cip4.example.org/artwork.pdf"))),
                ResourceSet.Usage.INPUT
        );

        // act

        // assert
        System.out.println(new String(xJdfDoc.toXml()));
    }

    @Test
    public void createXJDF_3() throws Exception {

        // arrange
        XJdfDocument xJdfDoc = new XJdfDocument("JOB_42", new String[]{"ConventionalPrinting", "Cutting"});

        Map<Part[], Preview> previews = new HashMap<>();

        // act
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            xJdfDoc.addResourceSet(previews, ResourceSet.Usage.INPUT);
        });

        // assert
        assertEquals("The resource map requries at leaset one entry.", exception.getMessage());
    }

    @Test
    public void createXJDF_4() throws Exception {

        // arrange

        // act
        Exception exception = assertThrows(XJdfParseException.class, () -> {
            new XJdfDocument((byte[]) null);
        });

        // assert
        assertEquals("Cannot read an XML byte array of null.", exception.getMessage());
    }

    @Test
    public void getAuditCreated_1() throws XJdfInitException {

        // arrange
        XJdfDocument xJdfDocument = new XJdfDocument("42", "Product");

        // act
        Header actual = xJdfDocument.getAuditCreated();

        // assert
        assertEquals("MY_DEVICE", actual.getDeviceID(), "Device Id is wrong.");
        assertEquals("MY_AGENT", actual.getAgentName(), "Agent Name is wrong.");
        assertEquals("MY_AGENT_VERSION", actual.getAgentVersion(), "Agent Version is wrong.");
    }

    @Test
    public void getAuditCreated_2() throws XJdfInitException {

        // arrange
        XJdfDocument xJdfDocument = new XJdfDocument();
        xJdfDocument.getXJdf().setAuditPool(null);

        // act
        Header actual = xJdfDocument.getAuditCreated();

        // assert
        assertNull(actual, "AuditCreated is not null.");
    }
}