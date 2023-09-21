package org.cip4.lib.xjdf;

import org.cip4.lib.xjdf.exception.XJdfDocumentException;
import org.cip4.lib.xjdf.exception.XJdfInitException;
import org.cip4.lib.xjdf.exception.XJdfParseException;
import org.cip4.lib.xjdf.schema.*;
import org.cip4.lib.xjdf.type.DateTime;
import org.cip4.lib.xjdf.type.IntegerList;
import org.cip4.lib.xjdf.type.URI;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.parallel.ExecutionMode.SAME_THREAD;

@Execution(SAME_THREAD)
public class XJdfDocumentTest {

    private final String RES_ROOT = "/org/cip4/lib/xjdf/";

    @BeforeAll
    static void initTests() {
        XJdfConstants.AGENT_NAME = "MY_AGENT";
        XJdfConstants.AGENT_VERSION = "MY_AGENT_VERSION";
        XJdfConstants.DEVICE_ID = "MY_DEVICE";
    }

    @Test
    public void addResourceSet_1() throws Exception {

        // arrange
        byte[] xjdfBytes = XJdfDocumentTest.class.getResourceAsStream(RES_ROOT + "sheet.xjdf").readAllBytes();
        XJdfDocument xJdfDocument = new XJdfDocument(xjdfBytes);

        // act
        ResourceSet resourceSet = xJdfDocument.addResourceSet(Preview.class, ResourceSet.Usage.INPUT);

        // assert
        System.out.println(xJdfDocument);
    }

    @Test
    public void addSpecificResource_1() throws Exception {

        // arrange
        byte[] xjdfBytes = XJdfDocumentTest.class.getResourceAsStream(RES_ROOT + "sheet.xjdf").readAllBytes();
        XJdfDocument xJdfDocument = new XJdfDocument(xjdfBytes);

        ResourceSet resourceSet = xJdfDocument.addResourceSet(Preview.class, null, null, (IntegerList) null);

        Preview preview = new Preview();

        // act
        Resource resource = xJdfDocument.addSpecificResource(resourceSet, preview, List.of());

        // assert
        System.out.println(xJdfDocument);
    }

    @Test
    public void getResourceSet_1() throws Exception {

        // arrange
        byte[] xjdfBytes = XJdfDocumentTest.class.getResourceAsStream(RES_ROOT + "sheet.xjdf").readAllBytes();
        XJdfDocument xJdfDocument = new XJdfDocument(xjdfBytes);

        // act
        ResourceSet resourceSet = xJdfDocument.getResourceSet(BinderySignature.class);

        // assert
        assertNotNull(resourceSet, "ResourceSet is null.");
        assertEquals("BinderySignature", resourceSet.getName(), "Name is wrong.");
        assertEquals(3, resourceSet.getResource().size(), "Number of resources is wrong.");
    }

    @Test
    public void getResourceSet_2() throws Exception {

        // arrange
        byte[] xjdfBytes = XJdfDocumentTest.class.getResourceAsStream(RES_ROOT + "sheet.xjdf").readAllBytes();
        XJdfDocument xJdfDocument = new XJdfDocument(xjdfBytes);

        // act
        ResourceSet resourceSet = xJdfDocument.getResourceSet(Contact.class);

        // assert
        assertNull(resourceSet, "ResourceSet is not null.");
    }

    @Test
    public void getResourceSet_3() throws Exception {

        // arrange
        byte[] xjdfBytes = XJdfDocumentTest.class.getResourceAsStream(RES_ROOT + "sheet-2.xjdf").readAllBytes();
        XJdfDocument xJdfDocument = new XJdfDocument(xjdfBytes);

        // act
        Throwable t = assertThrows(XJdfDocumentException.class, () -> xJdfDocument.getResourceSet(Component.class));

        // assert
        assertEquals("ResourceSet 'Component' is ambiguous.", t.getMessage(), "Message is wrong.");
    }

    @Test
    public void getResourceSet_4() throws Exception {

        // arrange
        byte[] xjdfBytes = XJdfDocumentTest.class.getResourceAsStream(RES_ROOT + "sheet-2.xjdf").readAllBytes();
        XJdfDocument xJdfDocument = new XJdfDocument(xjdfBytes);

        // act
        ResourceSet componentResourceSet = xJdfDocument.getResourceSet(Component.class, null, null, "Cutting");

        // assert
        assertNotNull(componentResourceSet, "ResourceSet is null.");
    }

    @Test
    public void getResourceSet_5() throws Exception {

        // arrange
        byte[] xjdfBytes = XJdfDocumentTest.class.getResourceAsStream(RES_ROOT + "sheet-2.xjdf").readAllBytes();
        XJdfDocument xJdfDocument = new XJdfDocument(xjdfBytes);

        // act
        ResourceSet componentResourceSet = xJdfDocument.getResourceSet(Component.class, ResourceSet.Usage.INPUT, null, "Cutting");

        // assert
        assertNull(componentResourceSet, "ResourceSet is not null.");
    }

    @Test
    public void getResourceSet_6() throws Exception {

        // arrange
        byte[] xjdfBytes = XJdfDocumentTest.class.getResourceAsStream(RES_ROOT + "sheet-2.xjdf").readAllBytes();
        XJdfDocument xJdfDocument = new XJdfDocument(xjdfBytes);

        // act
        ResourceSet componentResourceSet = xJdfDocument.getResourceSet(Layout.class, ResourceSet.Usage.INPUT, null, "Cutting");

        // assert
        assertNull(componentResourceSet, "ResourceSet is not null.");
    }

    @Test
    public void getCombinedProcessIndex_1() throws Exception {

        // arrange
        byte[] xjdfBytes = XJdfDocumentTest.class.getResourceAsStream(RES_ROOT + "sheet-2.xjdf").readAllBytes();
        XJdfDocument xJdfDocument = new XJdfDocument(xjdfBytes);

        // act
        int result = xJdfDocument.getCombinedProcessIndex("ConventionalPrinting");

        // assert
        assertEquals(0, result, "CombinedProcessIndex is wrong.");
    }

    @Test
    public void getCombinedProcessIndex_2() throws Exception {

        // arrange
        byte[] xjdfBytes = XJdfDocumentTest.class.getResourceAsStream(RES_ROOT + "sheet-2.xjdf").readAllBytes();
        XJdfDocument xJdfDocument = new XJdfDocument(xjdfBytes);

        // act
        int result = xJdfDocument.getCombinedProcessIndex("cutting");

        // assert
        assertEquals(1, result, "CombinedProcessIndex is wrong.");
    }

    @Test
    public void getCombinedProcessIndex_3() throws Exception {

        // arrange
        byte[] xjdfBytes = XJdfDocumentTest.class.getResourceAsStream(RES_ROOT + "sheet-2.xjdf").readAllBytes();
        XJdfDocument xJdfDocument = new XJdfDocument(xjdfBytes);

        // act
        Throwable t = assertThrows(XJdfDocumentException.class, () -> xJdfDocument.getCombinedProcessIndex("Folding"));

        // assert
        assertEquals("ProcessName 'Folding' has not been found.", t.getMessage(), "Exception message is wrong.");
    }

    @Test
    public void getCombinedProcessIndex_4() throws Exception {

        // arrange
        XJdfDocument xJdfDocument = new XJdfDocument("JOB_ID", "ConventionalPrinting", "Cutting", "Folding", "Cutting");

        // act
        Throwable t = assertThrows(XJdfDocumentException.class, () -> xJdfDocument.getCombinedProcessIndex("Cutting"));

        // assert
        assertEquals("ProcessName 'Cutting' is not unique.", t.getMessage(), "Exception message is wrong.");
    }

    @Test
    public void getCombinedProcessIndex_5() throws Exception {

        // arrange
        XJdfDocument xJdfDocument = new XJdfDocument("JOB_ID", "ConventionalPrinting", "Cutting", "Folding", "Cutting");

        // act
        Throwable t = assertThrows(IllegalArgumentException.class, () -> xJdfDocument.getCombinedProcessIndex(null));

        // assert
        assertEquals("ProcessName cannot be null or empty.", t.getMessage(), "Exception message is wrong.");
    }

    @Test
    public void getCombinedProcessIndex_6() throws Exception {

        // arrange
        XJdfDocument xJdfDocument = new XJdfDocument("JOB_ID", "ConventionalPrinting", "Cutting", "Folding", "Cutting");

        // act
        Throwable t = assertThrows(IllegalArgumentException.class, () -> xJdfDocument.getCombinedProcessIndex(""));

        // assert
        assertEquals("ProcessName cannot be null or empty.", t.getMessage(), "Exception message is wrong.");
    }

    @Test
    public void getResources_0() throws Exception {

        // arrange
        byte[] xjdfBytes = XJdfDocumentTest.class.getResourceAsStream(RES_ROOT + "sheet.xjdf").readAllBytes();
        XJdfDocument xJdfDocument = new XJdfDocument(xjdfBytes);

        // act
        List<Resource> resources = xJdfDocument.getResources(BinderySignature.class, "BinderySignatureID");

        // assert
        assertNotNull(resources, "Resources are null.");
        assertEquals(3, resources.size(), "Number of resources is wrong.");
    }

    @Test
    public void getResources_1() throws Exception {

        // arrange
        byte[] xjdfBytes = XJdfDocumentTest.class.getResourceAsStream(RES_ROOT + "sheet.xjdf").readAllBytes();
        XJdfDocument xJdfDocument = new XJdfDocument(xjdfBytes);

        Part part = new Part().withBinderySignatureID("BS-2");

        // act
        Resource resource = xJdfDocument.getResource(BinderySignature.class, part);

        // assert
        assertNotNull(resource, "Resource is null.");

        BinderySignature binderySignature = (BinderySignature) resource.getSpecificResource().getValue();
        assertEquals("F6-1", binderySignature.getFoldCatalog(), "FoldCatalog is wrong.");
    }

    @Test
    public void createXJDF_1() throws Exception {

        // ARRANGE
        XJdfDocument xJdfDocument = new XJdfDocument("JOB_ID", "ConventionalPrinting", "Cutting");

        // resources simple
        ResourceSet nodeInfoResourceSet = xJdfDocument.addResourceSet(NodeInfo.class, ResourceSet.Usage.INPUT);

        xJdfDocument.addSpecificResource(
                nodeInfoResourceSet,
                new NodeInfo()
                        .withEnd(new DateTime(2018, 7, 23, 9, 23, 0))
        );

        // resources multiple
        ResourceSet runListResourceSet = xJdfDocument.addResourceSet(RunList.class, ResourceSet.Usage.INPUT);

        xJdfDocument.addSpecificResource(
                runListResourceSet,
                new RunList().withFileSpec(new FileSpec()
                        .withURL(new URI("https://example.org/front.pdf"))),
                new Part().withSide(Side.FRONT)
        );

        xJdfDocument.addSpecificResource(
                runListResourceSet,
                new RunList().withFileSpec(new FileSpec()
                        .withURL(new URI("https://example.org/back.pdf"))),
                new Part().withSide(Side.BACK)
        );

        // ACT

        // ASSERT
        System.out.println("----------------");
        System.out.println();
        System.out.println(xJdfDocument);
        System.out.println();
        System.out.println("----------------");

        assertEquals("NodeInfo", xJdfDocument.getXJdf().getResourceSet().get(0).getName(), "ResourceSet is wrong.");
        assertEquals("RunList", xJdfDocument.getXJdf().getResourceSet().get(1).getName(), "ResourceSet is wrong.");
    }

    @Test
    public void createXJDF_2() throws Exception {

        // arrange
        XJdfDocument xJdfDocument = new XJdfDocument("JOB_42", "ConventionalPrinting", "Cutting");

        ResourceSet previewResourceSet = xJdfDocument.addResourceSet(Preview.class, ResourceSet.Usage.INPUT, null, "Cutting");

        xJdfDocument.addSpecificResource(
                previewResourceSet,
                new Preview().withFileSpec(new FileSpec().withURL(new URI("https://cip4.example.org/identification.pdf"))),
                new Part().withPreviewType(Part.PreviewType.IDENTIFICATION)
        );
        xJdfDocument.addSpecificResource(
                previewResourceSet,
                new Preview().withFileSpec(new FileSpec().withURL(new URI("https://cip4.example.org/preview.pdf"))),
                new Part().withPreviewType(Part.PreviewType.THUMB_NAIL)
        );

        ResourceSet runListResourceSet = xJdfDocument.addResourceSet(RunList.class, ResourceSet.Usage.OUTPUT);

        xJdfDocument.addSpecificResource(
                runListResourceSet,
                new RunList().withFileSpec(new FileSpec().withURL(new URI("https://cip4.example.org/artwork.pdf")))
        );

        // act

        // assert
        System.out.println(xJdfDocument);

        assertEquals("Preview", xJdfDocument.getXJdf().getResourceSet().get(0).getName(), "ResourceSet is wrong.");
        assertEquals(new IntegerList(1), xJdfDocument.getXJdf().getResourceSet().get(0).getCombinedProcessIndex(), "CombinedProcessIndex is wrong.");
        assertEquals(ResourceSet.Usage.INPUT, xJdfDocument.getXJdf().getResourceSet().get(0).getUsage(), "Usage is wrong.");

        assertEquals("RunList", xJdfDocument.getXJdf().getResourceSet().get(1).getName(), "ResourceSet is wrong.");
        assertEquals(ResourceSet.Usage.OUTPUT, xJdfDocument.getXJdf().getResourceSet().get(1).getUsage(), "CombinedProcessIndex is wrong.");
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

    @Test
    public void addGeneralId_1() throws XJdfInitException {

        // arrange
        XJdfDocument xJdfDocument = new XJdfDocument();

        // act
        xJdfDocument.addGeneralID(new GeneralID()
                .withIDUsage("USAGE")
                .withIDValue("VALUE")
        );

        // assert
        System.out.println(xJdfDocument);

        assertEquals("VALUE", xJdfDocument.getXJdf().getGeneralID().get(0).getIDValue(), "IDValue is wrong.");
        assertEquals("USAGE", xJdfDocument.getXJdf().getGeneralID().get(0).getIDUsage(), "IDUsage is wrong.");
    }

    @Test
    public void addGeneralId_2() throws XJdfInitException {

        // arrange
        XJdfDocument xJdfDocument = new XJdfDocument();

        // act
        xJdfDocument.addGeneralID(new GeneralID()
                .withIDUsage("3")
                .withIDValue("v")
        );
        xJdfDocument.addGeneralID(new GeneralID()
                .withIDUsage("1")
                .withIDValue("v")
        );
        xJdfDocument.addGeneralID(new GeneralID()
                .withIDUsage("2")
                .withIDValue("v")
        );

        // assert
        System.out.println(xJdfDocument);

        assertEquals("1", xJdfDocument.getXJdf().getGeneralID().get(0).getIDUsage(), "IDUsage is wrong.");
        assertEquals("2", xJdfDocument.getXJdf().getGeneralID().get(1).getIDUsage(), "IDUsage is wrong.");
        assertEquals("3", xJdfDocument.getXJdf().getGeneralID().get(2).getIDUsage(), "IDUsage is wrong.");
    }

    @Test
    public void addGeneralId_3() throws XJdfInitException {

        // arrange
        XJdfDocument xJdfDocument = new XJdfDocument();

        // act
        xJdfDocument.addGeneralID("USAGE", "VALUE");

        // assert
        System.out.println(xJdfDocument);

        assertEquals("VALUE", xJdfDocument.getXJdf().getGeneralID().get(0).getIDValue(), "IDValue is wrong.");
        assertEquals("USAGE", xJdfDocument.getXJdf().getGeneralID().get(0).getIDUsage(), "IDUsage is wrong.");
    }

    @Test
    public void addGeneralId_4() throws XJdfInitException {

        // arrange
        XJdfDocument xJdfDocument = new XJdfDocument();

        // act
        xJdfDocument.addGeneralID("USAGE", 5);

        // assert
        System.out.println(xJdfDocument);

        assertEquals("5", xJdfDocument.getXJdf().getGeneralID().get(0).getIDValue(), "IDValue is wrong.");
        assertEquals("USAGE", xJdfDocument.getXJdf().getGeneralID().get(0).getIDUsage(), "IDUsage is wrong.");
    }

    @Test
    public void getSpecificResource_Null() throws Exception {

        // arrange
        XJdfDocument xJdfDocument = new XJdfDocument();

        // act
        RunList runList = xJdfDocument.getSpecificResource(RunList.class);

        // assert
        assertNull(runList, "RunList is not null.");
    }

    @Test
    public void getSpecificResource_1() throws Exception {

        // arrange
        byte[] xjdfBytes = XJdfDocumentTest.class.getResourceAsStream(RES_ROOT + "sheet-2.xjdf").readAllBytes();
        XJdfDocument xJdfDocument = new XJdfDocument(xjdfBytes);

        // act
        Throwable t = assertThrows(XJdfDocumentException.class, () -> xJdfDocument.getSpecificResources(Component.class));

        // assert
        assertEquals("ResourceSet 'Component' is ambiguous.", t.getMessage(), "Exception message is wrong.");
    }

    @Test
    public void getSpecificResource_3() throws Exception {

        // arrange
        byte[] xjdfBytes = XJdfDocumentTest.class.getResourceAsStream(RES_ROOT + "sheet-3.xjdf").readAllBytes();
        XJdfDocument xJdfDocument = new XJdfDocument(xjdfBytes);

        // act
        NodeInfo nodeInfo = xJdfDocument.getSpecificResource("R3");

        // assert
        assertNotNull(nodeInfo, "NodeInfo is null.");
        assertEquals(1686689880845L, nodeInfo.getStart().getCalendar().getTimeInMillis(), "Time is wrong.");
    }

    @Test
    public void getResource_1() throws Exception {

        // arrange
        byte[] xjdfBytes = XJdfDocumentTest.class.getResourceAsStream(RES_ROOT + "sheet-3.xjdf").readAllBytes();
        XJdfDocument xJdfDocument = new XJdfDocument(xjdfBytes);

        // act
        Resource resource = xJdfDocument.getResource("R2");

        // assert
        assertNotNull(resource, "Result is null.");
        assertEquals("R2", resource.getID(), "ID is wrong.");
    }

    @Test
    public void getResource_2() throws Exception {

        // arrange
        byte[] xjdfBytes = XJdfDocumentTest.class.getResourceAsStream(RES_ROOT + "sheet-3.xjdf").readAllBytes();
        XJdfDocument xJdfDocument = new XJdfDocument(xjdfBytes);

        // act
        Resource resource = xJdfDocument.getResource("R4");

        // assert
        System.out.println(xJdfDocument);

        assertNull(resource, "Resource is not null.");
    }

    @Test
    public void removeResourceSet_1() throws Exception {

        byte[] xjdfBytes = XJdfDocumentTest.class.getResourceAsStream(RES_ROOT + "sheet-2.xjdf").readAllBytes();
        XJdfDocument xJdfDocument = new XJdfDocument(xjdfBytes);

        assertEquals(10, xJdfDocument.getXJdf().getResourceSet().size());
        assertNotNull(xJdfDocument.getSpecificResource(Layout.class), "Layout is missing.");

        // act
        ResourceSet layoutResourceSet = xJdfDocument.getResourceSet(Layout.class);
        boolean result = xJdfDocument.removeResourceSet(layoutResourceSet);

        // assert
        System.out.println(xJdfDocument);

        assertTrue(result, "Result is wrong.");
        assertEquals(9, xJdfDocument.getXJdf().getResourceSet().size());
        assertNull(xJdfDocument.getSpecificResource(Layout.class), "Layout is still there.");
    }

    @Test
    public void removeResourceSet_2() throws Exception {

        byte[] xjdfBytes = XJdfDocumentTest.class.getResourceAsStream(RES_ROOT + "sheet-2.xjdf").readAllBytes();
        XJdfDocument xJdfDocument = new XJdfDocument(xjdfBytes);

        assertEquals(10, xJdfDocument.getXJdf().getResourceSet().size());
        assertNotNull(xJdfDocument.getSpecificResource(Layout.class), "Layout is missing.");

        // act
        boolean result = xJdfDocument.removeResourceSet(Layout.class, ResourceSet.Usage.INPUT, null, (IntegerList) null);

        // assert
        System.out.println(xJdfDocument);

        assertTrue(result, "Result is wrong.");
        assertEquals(9, xJdfDocument.getXJdf().getResourceSet().size());
        assertNull(xJdfDocument.getSpecificResource(Layout.class), "Layout is still there.");
    }

    @Test
    public void removeResourceSet_3() throws Exception {

        byte[] xjdfBytes = XJdfDocumentTest.class.getResourceAsStream(RES_ROOT + "sheet-2.xjdf").readAllBytes();
        XJdfDocument xJdfDocument = new XJdfDocument(xjdfBytes);

        assertEquals(10, xJdfDocument.getXJdf().getResourceSet().size());
        assertNotNull(xJdfDocument.getSpecificResource(Layout.class), "Layout is missing.");

        // act
        Throwable t = assertThrows(XJdfDocumentException.class, () ->
                xJdfDocument.removeResourceSet(Component.class, ResourceSet.Usage.OUTPUT, null, (IntegerList) null)
        );

        // assert
        System.out.println(xJdfDocument);

        assertEquals("ResourceSet 'Component' is ambiguous.", t.getMessage(), "Error message is wrong.");
    }

    @Test
    public void removeResourceSet_4() throws Exception {

        byte[] xjdfBytes = XJdfDocumentTest.class.getResourceAsStream(RES_ROOT + "sheet-2.xjdf").readAllBytes();
        XJdfDocument xJdfDocument = new XJdfDocument(xjdfBytes);

        assertEquals(10, xJdfDocument.getXJdf().getResourceSet().size());

        // act
        boolean result = xJdfDocument.removeResourceSet(Layout.class, ResourceSet.Usage.OUTPUT, null, "Cutting");

        // assert
        System.out.println(xJdfDocument);

        assertFalse(result, "Removals return value is wrong.");
        assertEquals(10, xJdfDocument.getXJdf().getResourceSet().size());
    }

    @Test
    public void removeResourceSet_5() throws Exception {

        byte[] xjdfBytes = XJdfDocumentTest.class.getResourceAsStream(RES_ROOT + "sheet-2.xjdf").readAllBytes();
        XJdfDocument xJdfDocument = new XJdfDocument(xjdfBytes);

        assertEquals(10, xJdfDocument.getXJdf().getResourceSet().size());

        // act
        boolean result = xJdfDocument.removeResourceSet(Component.class, ResourceSet.Usage.OUTPUT, null, "Cutting");

        // assert
        System.out.println(xJdfDocument);

        assertTrue(result, "Removals return value is wrong.");
        assertEquals(9, xJdfDocument.getXJdf().getResourceSet().size());
    }

    @Test
    public void removeResourceSet_6() throws Exception {

        byte[] xjdfBytes = XJdfDocumentTest.class.getResourceAsStream(RES_ROOT + "sheet-2.xjdf").readAllBytes();
        XJdfDocument xJdfDocument = new XJdfDocument(xjdfBytes);

        assertEquals(10, xJdfDocument.getXJdf().getResourceSet().size());

        // act
        boolean result = xJdfDocument.removeResourceSet(Layout.class);

        // assert
        System.out.println(xJdfDocument);

        assertTrue(result, "Removals return value is wrong.");
        assertEquals(9, xJdfDocument.getXJdf().getResourceSet().size());
    }

    @Test
    public void removeResourceSet_7() throws Exception {

        byte[] xjdfBytes = XJdfDocumentTest.class.getResourceAsStream(RES_ROOT + "sheet-2.xjdf").readAllBytes();
        XJdfDocument xJdfDocument = new XJdfDocument(xjdfBytes);

        assertEquals(10, xJdfDocument.getXJdf().getResourceSet().size());
        assertNotNull(xJdfDocument.getSpecificResource(Layout.class), "Layout is missing.");

        // act
        Throwable t = assertThrows(XJdfDocumentException.class, () ->
                xJdfDocument.removeResourceSet(Component.class)
        );

        // assert
        System.out.println(xJdfDocument);

        assertEquals("ResourceSet 'Component' is ambiguous.", t.getMessage(), "Error message is wrong.");
    }

    @Test
    public void removeResource_1() throws Exception {

        byte[] xjdfBytes = XJdfDocumentTest.class.getResourceAsStream(RES_ROOT + "sheet.xjdf").readAllBytes();
        XJdfDocument xJdfDocument = new XJdfDocument(xjdfBytes);

        ResourceSet binderySignatureResourceSet = xJdfDocument.getResourceSet(BinderySignature.class);

        // act
        boolean result = xJdfDocument.removeResource(binderySignatureResourceSet, new Part().withBinderySignatureID("BS-1"));

        // assert
        System.out.println(xJdfDocument);

        assertTrue(result, "Removal return value is wrong.");
    }

    @Test
    public void removeResource_2() throws Exception {

        // arrange
        byte[] xjdfBytes = XJdfDocumentTest.class.getResourceAsStream(RES_ROOT + "sheet.xjdf").readAllBytes();
        XJdfDocument xJdfDocument = new XJdfDocument(xjdfBytes);

        ResourceSet binderySignatureResourceSet = xJdfDocument.getResourceSet(BinderySignature.class);

        // act
        boolean result = xJdfDocument.removeResource(binderySignatureResourceSet, new Part().withBinderySignatureID("NOT_EXIST"));

        // assert
        System.out.println(xJdfDocument);

        assertFalse(result, "Removal return value is wrong.");
    }

    @Test
    public void getGeneralID_1() throws Exception {

        // arrange
        byte[] xjdfBytes = XJdfDocumentTest.class.getResourceAsStream(RES_ROOT + "sheet-2.xjdf").readAllBytes();
        XJdfDocument xJdfDocument = new XJdfDocument(xjdfBytes);

        // act
        GeneralID generalID = xJdfDocument.getGeneralID("RATING_EFFICIENCY");

        // assert
        assertNotNull(generalID);
        assertEquals("0.94", generalID.getIDValue(), "IDValue is wrong");
    }

    @Test
    public void getGeneralID_2() throws Exception {

        // arrange
        byte[] xjdfBytes = XJdfDocumentTest.class.getResourceAsStream(RES_ROOT + "sheet-2.xjdf").readAllBytes();
        XJdfDocument xJdfDocument = new XJdfDocument(xjdfBytes);

        // act
        GeneralID generalID = xJdfDocument.getGeneralID("NOT_EXIST");

        // assert
        assertNull(generalID);
    }

    @Test
    public void getGeneralID_3() throws Exception {

        // arrange
        byte[] xjdfBytes = XJdfDocumentTest.class.getResourceAsStream(RES_ROOT + "sheet-3.xjdf").readAllBytes();
        XJdfDocument xJdfDocument = new XJdfDocument(xjdfBytes);

        // act
        Throwable t = assertThrows(IllegalArgumentException.class, () -> xJdfDocument.getGeneralID("RATING_EFFICIENCY"));

        // assert
        assertEquals("IDUsage 'RATING_EFFICIENCY' is not unique.", t.getMessage(), "Error message is wrong.");
    }

    @Test
    public void getGeneralID_4() throws Exception {

        // arrange
        XJdfDocument xJdfDocument = new XJdfDocument("TEST", "Product");
        xJdfDocument.addGeneralIDs(
                new GeneralID().withIDUsage("G_ID_1").withIDValue("20")
        );

        // act
        String result = xJdfDocument.getGeneralID("G_ID_1", String.class);

        // assert
        assertEquals("20", result, "Value is wrong.");
    }

    @Test
    public void getGeneralID_5() throws Exception {

        // arrange
        XJdfDocument xJdfDocument = new XJdfDocument("TEST", "Product");
        xJdfDocument.addGeneralIDs(
                new GeneralID().withIDUsage("G_ID_1").withIDValue("20")
        );

        // act
        int result = xJdfDocument.getGeneralID("G_ID_1", Integer.class);

        // assert
        assertEquals(20, result, "Value is wrong.");
    }

    @Test
    public void getGeneralID_6() throws Exception {

        // arrange
        XJdfDocument xJdfDocument = new XJdfDocument("TEST", "Product");
        xJdfDocument.addGeneralIDs(
                new GeneralID().withIDUsage("G_ID_1").withIDValue("20")
        );

        // act
        float result = xJdfDocument.getGeneralID("G_ID_1", Float.class);

        // assert
        assertEquals(20f, result, 0.0001, "Value is wrong.");
    }

    @Test
    public void getGeneralID_7() throws Exception {

        // arrange
        XJdfDocument xJdfDocument = new XJdfDocument("TEST", "Product");
        xJdfDocument.addGeneralIDs(
                new GeneralID().withIDUsage("G_ID_1").withIDValue("20")
        );

        // act
        Throwable t = assertThrows(UnsupportedOperationException.class, () -> xJdfDocument.getGeneralID("G_ID_1", Void.class));

        // assert
        assertEquals("Type 'class java.lang.Void is not supported.", t.getMessage(), "Error message is wrong.");
    }

    @Test
    public void getGeneralID_8() throws Exception {

        // arrange
        XJdfDocument xJdfDocument = new XJdfDocument("TEST", "Product");
        xJdfDocument.addGeneralIDs(
                new GeneralID().withIDUsage("G_ID_1").withIDValue("20")
        );

        // act
        Object result = xJdfDocument.getGeneralID("XXX", Float.class);

        // assert
        assertNull(result, "Value is wrong.");
    }

    @Test
    public void getGeneralID_9() throws Exception {

        // arrange
        XJdfDocument xJdfDocument = new XJdfDocument("TEST", "Product");
        xJdfDocument.addGeneralIDs(
                new GeneralID().withIDUsage("G_ID_1").withIDValue("2012-03-04T13:20:40.123+03:00")
        );

        // act
        DateTime result = xJdfDocument.getGeneralID("G_ID_1", DateTime.class);

        // assert
        assertEquals(1330856440123L, result.getCalendar().getTimeInMillis(), "Value is wrong.");
    }

    @Test
    public void removeGeneralID_1() throws Exception {

        // arrange
        byte[] xjdfBytes = XJdfDocumentTest.class.getResourceAsStream(RES_ROOT + "sheet-2.xjdf").readAllBytes();
        XJdfDocument xJdfDocument = new XJdfDocument(xjdfBytes);

        GeneralID generalID = xJdfDocument.getGeneralID("RATING_EFFICIENCY");

        // act
        boolean result = xJdfDocument.removeGeneralID(generalID);

        // assert
        assertTrue(result, "Return value remove is wrong.");
        assertNull(xJdfDocument.getGeneralID("RATING_EFFICIENCY"));
    }

    @Test
    public void removeGeneralID_2() throws Exception {

        // arrange
        byte[] xjdfBytes = XJdfDocumentTest.class.getResourceAsStream(RES_ROOT + "sheet-2.xjdf").readAllBytes();
        XJdfDocument xJdfDocument = new XJdfDocument(xjdfBytes);

        GeneralID generalID = new GeneralID().withIDUsage("RATING_EFFICIENCY");

        // act
        boolean result = xJdfDocument.removeGeneralID(generalID);

        // assert
        assertFalse(result, "Return value remove is wrong.");
        assertNotNull(xJdfDocument.getGeneralID("RATING_EFFICIENCY"));
    }

    @Test
    public void removeGeneralID_3() throws Exception {

        // arrange
        byte[] xjdfBytes = XJdfDocumentTest.class.getResourceAsStream(RES_ROOT + "sheet-2.xjdf").readAllBytes();
        XJdfDocument xJdfDocument = new XJdfDocument(xjdfBytes);

        // act
        boolean result = xJdfDocument.removeGeneralID("RATING_EFFICIENCY");

        // assert
        assertTrue(result, "Return value remove is wrong.");
        assertNull(xJdfDocument.getGeneralID("RATING_EFFICIENCY"));
    }

    @Test
    public void removeGeneralID_4() throws Exception {

        // arrange
        byte[] xjdfBytes = XJdfDocumentTest.class.getResourceAsStream(RES_ROOT + "sheet-2.xjdf").readAllBytes();
        XJdfDocument xJdfDocument = new XJdfDocument(xjdfBytes);

        // act
        boolean result = xJdfDocument.removeGeneralID("NOT_EXIST");

        // assert
        assertFalse(result, "Return value remove is wrong.");
        assertNotNull(xJdfDocument.getGeneralID("RATING_EFFICIENCY"));
    }

    @Test
    public void getParts_1() throws Exception {

        // arrange
        byte[] xjdfBytes = XJdfDocumentTest.class.getResourceAsStream(RES_ROOT + "sheet-2.xjdf").readAllBytes();
        XJdfDocument xJdfDocument = new XJdfDocument(xjdfBytes);

        ResourceSet resourceSet = xJdfDocument.getResourceSet(Component.class, ResourceSet.Usage.OUTPUT, null, "Cutting");

        // act
        List<Part> parts = xJdfDocument.getParts(resourceSet);

        // assert
        assertNotNull(parts, "Return is null.");
        assertEquals(2, parts.size(), "Number of parts is wrong.");

        assertEquals("09b5d583-3e1d-450d-927a-3b1a2dba53b7", parts.get(0).getBinderySignatureID(),"BS-ID 1 is wrong.");
        assertEquals("29b5d583-3e1d-450d-927a-3b1a2dba53b7", parts.get(1).getBinderySignatureID(),"BS-ID 2 is wrong.");
    }

    @Test
    public void getParts_2() throws Exception {

        // arrange
        byte[] xjdfBytes = XJdfDocumentTest.class.getResourceAsStream(RES_ROOT + "sheet-2.xjdf").readAllBytes();
        XJdfDocument xJdfDocument = new XJdfDocument(xjdfBytes);

        ResourceSet resourceSet = xJdfDocument.getResourceSet(Media.class);

        // act
        List<Part> parts = xJdfDocument.getParts(resourceSet);

        // assert
        assertNotNull(parts, "Return is null.");
        assertEquals(1, parts.size(), "Number of parts is wrong.");

        assertNull(parts.get(0),"BS-ID 1 is wrong.");
    }

    @Test
    public void getParts_3() throws Exception {

        // arrange
        byte[] xjdfBytes = XJdfDocumentTest.class.getResourceAsStream(RES_ROOT + "sheet-2.xjdf").readAllBytes();
        XJdfDocument xJdfDocument = new XJdfDocument(xjdfBytes);

        // act
        List<Part> parts = xJdfDocument.getParts(Component.class, ResourceSet.Usage.OUTPUT, null, "Cutting");

        // assert
        assertNotNull(parts, "Return is null.");
        assertEquals(2, parts.size(), "Number of parts is wrong.");

        assertEquals("09b5d583-3e1d-450d-927a-3b1a2dba53b7", parts.get(0).getBinderySignatureID(),"BS-ID 1 is wrong.");
        assertEquals("29b5d583-3e1d-450d-927a-3b1a2dba53b7", parts.get(1).getBinderySignatureID(),"BS-ID 2 is wrong.");
    }

    @Test
    public void getParts_4() throws Exception {

        // arrange
        byte[] xjdfBytes = XJdfDocumentTest.class.getResourceAsStream(RES_ROOT + "sheet-2.xjdf").readAllBytes();
        XJdfDocument xJdfDocument = new XJdfDocument(xjdfBytes);

        // act
        List<Part> parts = xJdfDocument.getParts(Media.class);

        // assert
        assertNotNull(parts, "Return is null.");
        assertEquals(1, parts.size(), "Number of parts is wrong.");

        assertNull(parts.get(0),"BS-ID 1 is wrong.");
    }

    @Test
    public void getPartAmount_0() throws Exception {

        // arrange
        byte[] xjdfBytes = XJdfDocumentTest.class.getResourceAsStream(RES_ROOT + "sheet-2.xjdf").readAllBytes();
        XJdfDocument xJdfDocument = new XJdfDocument(xjdfBytes);

        Resource resource = xJdfDocument.getResource(ColorantControl.class);

        // act
        PartAmount partAmount = xJdfDocument.getPartAmount(resource);

        // assert
        assertNull(partAmount, "PartAmount is NOT null.");
    }

    @Test
    public void getPartAmount_1() throws Exception {

        // arrange
        byte[] xjdfBytes = XJdfDocumentTest.class.getResourceAsStream(RES_ROOT + "sheet-2.xjdf").readAllBytes();
        XJdfDocument xJdfDocument = new XJdfDocument(xjdfBytes);

        ResourceSet componentResourceSet = xJdfDocument.getResourceSet(Component.class, ResourceSet.Usage.OUTPUT, null, "Cutting");
        Resource resource = xJdfDocument.getResource(componentResourceSet, new Part().withBinderySignatureID("09b5d583-3e1d-450d-927a-3b1a2dba53b7"));

        // act
        PartAmount partAmount = xJdfDocument.getPartAmount(resource);

        // assert
        assertNotNull(partAmount, "PartAmount is null.");
        assertEquals(5000.0, partAmount.getAmount(), "Amount is null.");
    }

    @Test
    public void getPartAmount_2() throws Exception {

        // arrange
        byte[] xjdfBytes = XJdfDocumentTest.class.getResourceAsStream(RES_ROOT + "sheet.xjdf").readAllBytes();
        XJdfDocument xJdfDocument = new XJdfDocument(xjdfBytes);

        Resource resource = xJdfDocument.getResource(Component.class);

        // act
        PartAmount partAmount = xJdfDocument.getPartAmount(resource);

        // assert
        assertNotNull(partAmount, "PartAmount is null.");
        assertEquals(556, partAmount.getAmount(), "Amount is null.");
    }

    @Test
    public void getPartAmount_3() throws Exception {

        // arrange
        byte[] xjdfBytes = XJdfDocumentTest.class.getResourceAsStream(RES_ROOT + "sheet-2.xjdf").readAllBytes();
        XJdfDocument xJdfDocument = new XJdfDocument(xjdfBytes);

        ResourceSet componentResourceSet = xJdfDocument.getResourceSet(Component.class, ResourceSet.Usage.OUTPUT, null, "Cutting");

        // act
        PartAmount partAmount = xJdfDocument.getPartAmount(componentResourceSet, new Part().withBinderySignatureID("09b5d583-3e1d-450d-927a-3b1a2dba53b7"));

        // assert
        assertNotNull(partAmount, "PartAmount is null.");
        assertEquals(5000.0, partAmount.getAmount(), "Amount is null.");
    }

    @Test
    public void getPartAmount_4() throws Exception {

        // arrange
        byte[] xjdfBytes = XJdfDocumentTest.class.getResourceAsStream(RES_ROOT + "sheet.xjdf").readAllBytes();
        XJdfDocument xJdfDocument = new XJdfDocument(xjdfBytes);

        // act
        PartAmount partAmount = xJdfDocument.getPartAmount(Component.class);

        // assert
        assertNotNull(partAmount, "PartAmount is null.");
        assertEquals(556.0, partAmount.getAmount(), "Amount is null.");
    }

    @Test
    public void getPartAmount_5() throws Exception {

        // arrange
        byte[] xjdfBytes = XJdfDocumentTest.class.getResourceAsStream(RES_ROOT + "sheet-4.xjdf").readAllBytes();
        XJdfDocument xJdfDocument = new XJdfDocument(xjdfBytes);

        // act
        Throwable t = assertThrows(XJdfDocumentException.class, () -> xJdfDocument.getPartAmount(ColorantControl.class));

        // assert
        assertEquals("PartAmount in selected resource is ambiguous.", t.getMessage(), "Message is wrong.");
    }

    @Test
    public void getCuttingParams_ProcessUsage_1() throws Exception {

        // arrange
        byte[] xjdfBytes = XJdfDocumentTest.class.getResourceAsStream(RES_ROOT + "sheet-5.xjdf").readAllBytes();
        XJdfDocument xJdfDocument = new XJdfDocument(xjdfBytes);

        // act
        CuttingParams cuttingParams = xJdfDocument.getSpecificResource(CuttingParams.class, ResourceSet.Usage.INPUT, "CIP3", (IntegerList) null);

        // assert
        assertNotNull(cuttingParams, "CuttingParams is null.");
        assertEquals("https://assets.ven.vpsvc.com/v1/asset/orca/sheet/SH-LHQ0-L03U/SH-LHQ0-L03U.ppf", cuttingParams.getFileSpec().getURL().toString(), "URL is wrong.");
    }

    @Test
    public void getCuttingParams_ProcessUsage_2() throws Exception {

        // arrange
        byte[] xjdfBytes = XJdfDocumentTest.class.getResourceAsStream(RES_ROOT + "sheet-5.xjdf").readAllBytes();
        XJdfDocument xJdfDocument = new XJdfDocument(xjdfBytes);

        // act
        CuttingParams cuttingParams = xJdfDocument.getSpecificResource(CuttingParams.class, ResourceSet.Usage.INPUT, null, (IntegerList) null);

        // assert
        assertNotNull(cuttingParams, "CuttingParams is null.");
        assertEquals("Left", cuttingParams.getSheetLay().value(), "SheetLay is wrong.");
    }
}