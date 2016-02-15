package org.cip4.lib.xjdf.xml;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.UUID;

import javax.xml.bind.ValidationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.cip4.lib.xjdf.XJdfNodeFactory;
import org.cip4.lib.xjdf.builder.XJdfBuilder;
import org.cip4.lib.xjdf.schema.*;
import org.cip4.lib.xjdf.type.XYPair;
import org.cip4.lib.xjdf.xml.internal.NamespaceManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.xml.sax.InputSource;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * JUnit test case for XmlParser class.
 */
public class XJdfParserTest {

    private final String RES_TEST_XJDF = "/org/cip4/lib/xjdf/test.xjdf";
    private final String RES_CHILD_PRODUCTS = "/org/cip4/lib/xjdf/child_products.xjdf";
    private final String RES_IDREF = "/org/cip4/lib/xjdf/idref.xjdf";

    private XJdfParser xJdfParser;

    /**
     * Set up unit test.
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        // new instance
        xJdfParser = new XJdfParser();
    }

    /**
     * Tear down unit test.
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
        // clean up
        xJdfParser = null;
    }

    @Test
    public void testParseXJdfSkipValidation() throws Exception {

        // arrange
        final String VALUE = UUID.randomUUID().toString();

        XJdfNodeFactory xJdfNodeFactory = new XJdfNodeFactory();
        XJdfBuilder xJdfBuilder = new XJdfBuilder();

        GeneralID generalId = xJdfNodeFactory.createGeneralID("CatalobID", VALUE);
        xJdfBuilder.addGeneralID(generalId);

        XJDF xJdf = xJdfBuilder.build();

        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        // act
        xJdfParser.parseXJdf(xJdf, bos, true);

        // assert
        NamespaceManager nsManager = new NamespaceManager();
        nsManager.addNamespace("ns", XJdfConstants.NAMESPACE_JDF20);

        XPathFactory xPathFactory = XPathFactory.newInstance();
        XPath xPath = xPathFactory.newXPath();
        xPath.setNamespaceContext(nsManager);

        XPathExpression xPathExpression = xPath.compile("/ns:XJDF/ns:GeneralID/@IDValue");
        InputStream is = new ByteArrayInputStream(bos.toByteArray());
        String actual = xPathExpression.evaluate(new InputSource(is));

        Assert.assertEquals("Expected value is wrong.", VALUE, actual);
    }

    @Test
    public void testParseXJdfSkipValidationByteArray() throws Exception {

        // arrange
        final String VALUE = UUID.randomUUID().toString();

        XJdfNodeFactory xJdfNodeFactory = new XJdfNodeFactory();
        XJdfBuilder xJdfBuilder = new XJdfBuilder();

        GeneralID generalId = xJdfNodeFactory.createGeneralID("CatalobID", VALUE);
        xJdfBuilder.addGeneralID(generalId);

        XJDF xJdf = xJdfBuilder.build();

        // act
        byte[] bytes = xJdfParser.parseXJdf(xJdf, true);

        // assert
        NamespaceManager nsManager = new NamespaceManager();
        nsManager.addNamespace("ns", XJdfConstants.NAMESPACE_JDF20);

        XPathFactory xPathFactory = XPathFactory.newInstance();
        XPath xPath = xPathFactory.newXPath();
        xPath.setNamespaceContext(nsManager);

        XPathExpression xPathExpression = xPath.compile("/ns:XJDF/ns:GeneralID/@IDValue");
        InputStream is = new ByteArrayInputStream(bytes);
        String actual = xPathExpression.evaluate(new InputSource(is));

        Assert.assertEquals("Expected value is wrong.", VALUE, actual);
    }

    @Test(expected = ValidationException.class)
    public void testParseXJdfInvalid() throws Exception {

        // arrange
        final String VALUE = UUID.randomUUID().toString();

        XJdfNodeFactory xJdfNodeFactory = new XJdfNodeFactory();
        XJdfBuilder xJdfBuilder = new XJdfBuilder();

        GeneralID generalId = xJdfNodeFactory.createGeneralID("CatalobID", VALUE);
        xJdfBuilder.addGeneralID(generalId);

        XJDF xJdf = xJdfBuilder.build();
        xJdf.setID(null);

        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        // act
        xJdfParser.parseXJdf(xJdf, bos);

        // assert
        // exception expected
    }

    @Test
    public void testParseXJdfValid() throws Exception {

        // arrange
        final String VALUE = UUID.randomUUID().toString();

        XJdfNodeFactory xJdfNodeFactory = new XJdfNodeFactory();
        XJdfBuilder xJdfBuilder = new XJdfBuilder();

        GeneralID generalId = xJdfNodeFactory.createGeneralID("CatalobID", VALUE);
        xJdfBuilder.addGeneralID(generalId);

        xJdfBuilder.build().setID("MyId");
        xJdfBuilder.build().getTypes().add("MyType");
        xJdfBuilder.build().setVersion(XJdfConstants.XJDF_CURRENT_VERSION);

        XJDF xJdf = xJdfBuilder.build();

        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        // act
        xJdfParser.parseXJdf(xJdf, bos);

        // assert
        NamespaceManager nsManager = new NamespaceManager();
        nsManager.addNamespace("ns", XJdfConstants.NAMESPACE_JDF20);

        XPathFactory xPathFactory = XPathFactory.newInstance();
        XPath xPath = xPathFactory.newXPath();
        xPath.setNamespaceContext(nsManager);

        System.out.println(new String(bos.toByteArray()));

        XPathExpression xPathExpression = xPath.compile("/ns:XJDF/ns:GeneralID/@IDValue");
        InputStream is = new ByteArrayInputStream(bos.toByteArray());
        String actual = xPathExpression.evaluate(new InputSource(is));

        Assert.assertEquals("Expected value is wrong.", VALUE, actual);
    }

    @Test
    public void testParseXJdfValidByteArray() throws Exception {

        // arrange
        final String VALUE = UUID.randomUUID().toString();

        XJdfNodeFactory xJdfNodeFactory = new XJdfNodeFactory();
        XJdfBuilder xJdfBuilder = new XJdfBuilder();

        GeneralID generalId = xJdfNodeFactory.createGeneralID("CatalobID", VALUE);
        xJdfBuilder.addGeneralID(generalId);

        xJdfBuilder.build().setID("MyId");
        xJdfBuilder.build().getTypes().add("MyType");
        xJdfBuilder.build().setVersion(XJdfConstants.XJDF_CURRENT_VERSION);

        XJDF xJdf = xJdfBuilder.build();

        // act
        byte[] bytes = xJdfParser.parseXJdf(xJdf);

        // assert
        NamespaceManager nsManager = new NamespaceManager();
        nsManager.addNamespace("ns", XJdfConstants.NAMESPACE_JDF20);

        XPathFactory xPathFactory = XPathFactory.newInstance();
        XPath xPath = xPathFactory.newXPath();
        xPath.setNamespaceContext(nsManager);

        System.out.println(new String(bytes));

        XPathExpression xPathExpression = xPath.compile("/ns:XJDF/ns:GeneralID/@IDValue");
        InputStream is = new ByteArrayInputStream(bytes);
        String actual = xPathExpression.evaluate(new InputSource(is));

        Assert.assertEquals("Expected value is wrong.", VALUE, actual);
    }

    /**
     * Test method for {@link org.cip4.lib.xjdf.xml.XJdfParser#parseStream(java.io.InputStream)}.
     */
    @Test
    public void testParseXmlStream() throws Exception {
        // arrange
        final String RESULT = "890e81ed-6830-4868-b23d-8ab8af8a4047";

        InputStream is = XJdfParserTest.class.getResourceAsStream(RES_TEST_XJDF);

        // act
        XJDF xJdf = xJdfParser.parseStream(is);

        // assert
        Assert.assertEquals("Result is wrong.", RESULT, xJdf.getGeneralID().get(0).getIDValue());
    }

    /**
     * Test method for {@link org.cip4.lib.xjdf.xml.XJdfParser#parseStream(java.io.InputStream)}.
     */
    @Test
    public void parseStreamWithChildProductsInvalidChildId() throws Exception {
        InputStream is = XJdfParserTest.class.getResourceAsStream(RES_CHILD_PRODUCTS);
        XJDF xjdf = xJdfParser.parseStream(is);

        final Product mainProduct = xjdf.getProductList().getProduct().get(6);
        assertEquals(1, mainProduct.getChildProduct().size());
        final Product childProduct = mainProduct.getChildProduct().get(0).getChildRef();
        assertNull(childProduct);
    }

    /**
     * Test method for {@link org.cip4.lib.xjdf.xml.XJdfParser#parseStream(java.io.InputStream)}.
     */
    @Test
    public void parseStreamWithChildProducts() throws Exception {
        InputStream is = XJdfParserTest.class.getResourceAsStream(RES_CHILD_PRODUCTS);
        XJDF xjdf = xJdfParser.parseStream(is);

        final Product mainProduct1 = xjdf.getProductList().getProduct().get(3);
        assertEquals(2, mainProduct1.getChildProduct().size());
        final Product childProduct11 = mainProduct1.getChildProduct().get(0).getChildRef();
        assertEquals("PRD_MAIN01_SUB01", childProduct11.getID());
        assertEquals(11000, (int) childProduct11.getAmount());
        final Product childProduct12 = mainProduct1.getChildProduct().get(1).getChildRef();
        assertEquals("PRD_MAIN01_SUB02", childProduct12.getID());
        assertEquals(12000, (int) childProduct12.getAmount());

        final Product mainProduct2 = xjdf.getProductList().getProduct().get(4);
        assertEquals(1, mainProduct2.getChildProduct().size());
        final Product childProduct21 = mainProduct2.getChildProduct().get(0).getChildRef();
        assertEquals("PRD_MAIN02_SUB01", childProduct21.getID());
        assertEquals(21000, (int) childProduct21.getAmount());

        final Product mainProduct3 = xjdf.getProductList().getProduct().get(5);
        assertEquals(0, mainProduct3.getChildProduct().size());
    }

    @Test
    public void parseStreamResourceWithContactRef() throws Exception {
        InputStream is = XJdfParserTest.class.getResourceAsStream(RES_IDREF);
        XJDF xjdf = xJdfParser.parseStream(is);

        ResourceSet resourceSet = xjdf.getResourceSet().get(0);
        Contact contact = (Contact) resourceSet.getResource().get(0).getContactRef().getParameterType().getValue();
        assertEquals("CONTACT_REF_1", resourceSet.getResource().get(0).getContactRef().getID());
        assertEquals("FLYERALARM GmbH", contact.getCompany().get(0).getOrganizationName());
    }

    @Test
    public void parseStreamApprovalPersonWithContactRef() throws Exception {
        InputStream is = XJdfParserTest.class.getResourceAsStream(RES_IDREF);
        XJDF xjdf = xJdfParser.parseStream(is);

        ParameterSet parameterSet = xjdf.getParameterSet().get(5);
        ApprovalSuccess approvalSuccess = (ApprovalSuccess) parameterSet.getParameter().get(0).getParameterType().getValue();
        ApprovalPerson approvalPerson = approvalSuccess.getApprovalDetails().get(0).getApprovalPerson();
        Contact contact = (Contact) approvalPerson.getContactRef().getParameterType().getValue();

        assertEquals("CONTACT_REF_1", approvalPerson.getContactRef().getID());
        assertEquals("FLYERALARM GmbH", contact.getCompany().get(0).getOrganizationName());
    }

    @Test
    public void parseStreamAuditWithAuditRef() throws Exception {
        InputStream is = XJdfParserTest.class.getResourceAsStream(RES_IDREF);
        XJDF xjdf = xJdfParser.parseStream(is);

        Notification notificationB = xjdf.getAuditPool().getNotification().get(1);
        Notification notificationA = notificationB.getRefID();
        assertEquals("Notification_B", notificationB.getID());
        assertEquals("Notification_A", notificationA.getID());
        assertEquals("agent A", notificationA.getAgentName());
    }

    @Test
    public void parseStreamPhaseTimeWithPhaseTimeRef() throws Exception {
        InputStream is = XJdfParserTest.class.getResourceAsStream(RES_IDREF);
        XJDF xjdf = xJdfParser.parseStream(is);

        PhaseTime phaseTimeB = xjdf.getAuditPool().getPhaseTime().get(1);
        PhaseTime phaseTimeA = phaseTimeB.getRefID();
        assertEquals("PhaseTime_B", phaseTimeB.getID());
        assertEquals("PhaseTime_A", phaseTimeA.getID());
        assertEquals("agent A", phaseTimeA.getAgentName());
    }

    @Test
    public void parseStreamProcessRunWithProcessRunRef() throws Exception {
        InputStream is = XJdfParserTest.class.getResourceAsStream(RES_IDREF);
        XJDF xjdf = xJdfParser.parseStream(is);

        ProcessRun processRunB = xjdf.getAuditPool().getProcessRun().get(1);
        ProcessRun processRunA = processRunB.getRefID();
        assertEquals("ProcessRun_B", processRunB.getID());
        assertEquals("ProcessRun_A", processRunA.getID());
        assertEquals("agent A", processRunA.getAgentName());
    }

    @Test
    public void parseStreamResourceAuditWithResourceAuditRef() throws Exception {
        InputStream is = XJdfParserTest.class.getResourceAsStream(RES_IDREF);
        XJDF xjdf = xJdfParser.parseStream(is);

        ResourceAudit resourceAuditB = xjdf.getAuditPool().getResourceAudit().get(1);
        ResourceAudit resourceAuditA = resourceAuditB.getRefID();
        assertEquals("ResourceAudit_B", resourceAuditB.getID());
        assertEquals("ResourceAudit_A", resourceAuditA.getID());
        assertEquals("agent A", resourceAuditA.getAgentName());
    }

    @Test
    public void parseStreamShapeCutWithMediaRef() throws Exception {
        InputStream is = XJdfParserTest.class.getResourceAsStream(RES_IDREF);
        XJDF xjdf = xJdfParser.parseStream(is);

        ShapeCuttingIntent shapeCuttingIntent =
            (ShapeCuttingIntent) xjdf.getProductList().getProduct().get(0).getIntent().get(2).getIntentType().getValue();
        Media media = (Media) shapeCuttingIntent.getShapeCut().get(0).getMediaRef().getResourceType().getValue();

        assertEquals(new XYPair(2, 2), media.getDimension());
        assertEquals("IPG_400", media.getMediaQuality());
    }

    @Test
    public void parseStreamPhaseTimeWithPhaseAmountRef() throws Exception {
        InputStream is = XJdfParserTest.class.getResourceAsStream(RES_IDREF);
        XJDF xjdf = xJdfParser.parseStream(is);

        PhaseTime phaseTime = xjdf.getAuditPool().getPhaseTime().get(0);
        PhaseAmount phaseAmount = phaseTime.getPhaseAmount().get(0);
        Media media = (Media) phaseAmount.getRRef().getResourceType().getValue();

        assertEquals(new XYPair(3, 3), media.getDimension());
        assertEquals("IPG_500", media.getMediaQuality());
    }

}
