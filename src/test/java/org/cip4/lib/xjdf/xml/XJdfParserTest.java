package org.cip4.lib.xjdf.xml;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.UUID;

import javax.xml.bind.ValidationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.cip4.lib.xjdf.builder.XJdfBuilder;
import org.cip4.lib.xjdf.schema.*;
import org.cip4.lib.xjdf.xml.internal.NamespaceManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.xml.sax.InputSource;

import static org.junit.Assert.*;

/**
 * JUnit test case for XmlParser class.
 */
public class XJdfParserTest {

    private static final String RES_TEST_XJDF = "/org/cip4/lib/xjdf/test.xjdf";
    private static final String RES_CHILD_PRODUCTS = "/org/cip4/lib/xjdf/child_products.xjdf";
    private static final String RES_IDREF = "/org/cip4/lib/xjdf/idref.xjdf";

    private XJdfParser xJdfParser;

    /**
     * Set up unit test.
     */
    @Before
    public void setUp() throws Exception {
        // new instance
        xJdfParser = new XJdfParser();
    }

    /**
     * Tear down unit test.
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

        XJdfBuilder xJdfBuilder = new XJdfBuilder();

        xJdfBuilder.addGeneralID(
            new GeneralID().withIDUsage("CatalobID").withIDValue(VALUE)
        );

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

        XJdfBuilder xJdfBuilder = new XJdfBuilder();

        xJdfBuilder.addGeneralID(
            new GeneralID().withIDUsage("CatalobID").withIDValue(VALUE)
        );

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

        XJdfBuilder xJdfBuilder = new XJdfBuilder();

        xJdfBuilder.addGeneralID(
            new GeneralID().withIDUsage("CatalobID").withIDValue(VALUE)
        );

        XJDF xJdf = xJdfBuilder.build();
        // empty list of types is invalid
        xJdf.withTypes(Collections.EMPTY_LIST);

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

        XJdfBuilder xJdfBuilder = new XJdfBuilder("Foo");

        xJdfBuilder.addGeneralID(
            new GeneralID().withIDUsage("CatalobID").withIDValue(VALUE)
        );

        xJdfBuilder.build().getTypes().add("MyType");

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

        XPathExpression xPathExpression = xPath.compile("/ns:XJDF/ns:GeneralID/@IDValue");
        InputStream is = new ByteArrayInputStream(bos.toByteArray());
        String actual = xPathExpression.evaluate(new InputSource(is));

        Assert.assertEquals("Expected value is wrong.", VALUE, actual);
    }

    @Test
    public void testParseXJdfValidByteArray() throws Exception {

        // arrange
        final String VALUE = UUID.randomUUID().toString();

        XJdfBuilder xJdfBuilder = new XJdfBuilder("Foo");

        xJdfBuilder.addGeneralID(
            new GeneralID().withIDUsage("CatalobID").withIDValue(VALUE)
        );

        xJdfBuilder.build().getTypes().add("MyType");

        XJDF xJdf = xJdfBuilder.build();

        // act
        byte[] bytes = xJdfParser.parseXJdf(xJdf);

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
        final BindingIntent bindingIntent = (BindingIntent) mainProduct.getIntent().get(2).getProductIntent().getValue();
        assertEquals(0, bindingIntent.getChildren().size());
    }

    /**
     * Test method for {@link org.cip4.lib.xjdf.xml.XJdfParser#parseStream(java.io.InputStream)}.
     */
    @Test
    public void parseStreamWithChildProducts() throws Exception {
        InputStream is = XJdfParserTest.class.getResourceAsStream(RES_CHILD_PRODUCTS);
        XJDF xjdf = xJdfParser.parseStream(is);

        final Product mainProduct1 = xjdf.getProductList().getProduct().get(3);
        final BindingIntent bindingIntent1 = (BindingIntent) mainProduct1.getIntent().get(2).getProductIntent().getValue();
        assertEquals(2, bindingIntent1.getChildren().size());
        final Product childProduct11 = bindingIntent1.getChildren().get(0);
        assertEquals("PRD_MAIN01_SUB01", childProduct11.getID());
        assertEquals(11000, (int) childProduct11.getAmount());
        final Product childProduct12 = bindingIntent1.getChildren().get(1);
        assertEquals("PRD_MAIN01_SUB02", childProduct12.getID());
        assertEquals(12000, (int) childProduct12.getAmount());

        final Product mainProduct2 = xjdf.getProductList().getProduct().get(4);
        final BindingIntent bindingIntent2 = (BindingIntent) mainProduct2.getIntent().get(2).getProductIntent().getValue();
        assertEquals(1, bindingIntent2.getChildren().size());
        final Product childProduct21 = bindingIntent2.getChildren().get(0);
        assertEquals("PRD_MAIN02_SUB01", childProduct21.getID());
        assertEquals(21000, (int) childProduct21.getAmount());

        final Product mainProduct3 = xjdf.getProductList().getProduct().get(5);
        final BindingIntent bindingIntent3 = (BindingIntent) mainProduct3.getIntent().get(2).getProductIntent().getValue();
        assertEquals(0, bindingIntent3.getChildren().size());
    }

    @Test
    public void parseStreamApprovalPersonWithContactRef() throws Exception {
        InputStream is = XJdfParserTest.class.getResourceAsStream(RES_IDREF);
        XJDF xjdf = xJdfParser.parseStream(is);

        ResourceSet resourceSet = xjdf.getResourceSet().get(6);
        ApprovalDetails approvalDetails = (ApprovalDetails) resourceSet.getResource().get(0).getSpecificResource().getValue();
        ApprovalPerson approvalPerson = approvalDetails.getApprovalPerson();
        Contact contact = (Contact) approvalPerson.getContact().getSpecificResource().getValue();

        assertEquals("CONTACT_REF_1", approvalPerson.getContact().getID());
        assertEquals("FLYERALARM GmbH", contact.getCompany().getOrganizationName());
    }

    @Test
    public void parseStreamPhaseTimeWithPhaseTimeRef() throws Exception {
        InputStream is = XJdfParserTest.class.getResourceAsStream(RES_IDREF);
        XJDF xjdf = xJdfParser.parseStream(is);

        AuditStatus auditStatusB = (AuditStatus) xjdf.getAuditPool().getAudits().get(4);
        String auditStatusA = auditStatusB.getHeader().getRefID();
        assertEquals("PhaseTime_B", auditStatusB.getHeader().getID());
        assertEquals("PhaseTime_A", auditStatusA);
        assertEquals("author B", auditStatusB.getHeader().getAuthor());
    }

    @Test
    public void parseStreamProcessRunWithProcessRunRef() throws Exception {
        InputStream is = XJdfParserTest.class.getResourceAsStream(RES_IDREF);
        XJDF xjdf = xJdfParser.parseStream(is);

        AuditProcessRun processRunB = (AuditProcessRun) xjdf.getAuditPool().getAudits().get(6);
        assertEquals("ProcessRun_A", processRunB.getHeader().getRefID());
        assertEquals("ProcessRun_B", processRunB.getHeader().getID());
    }

    @Test
    public void parseStreamResourceAuditWithResourceAuditRef() throws Exception {
        InputStream is = XJdfParserTest.class.getResourceAsStream(RES_IDREF);
        XJDF xjdf = xJdfParser.parseStream(is);

        AuditResource auditResourceB = (AuditResource) xjdf.getAuditPool().getAudits().get(8);
        String resourceAuditA = auditResourceB.getHeader().getRefID();
        assertEquals("ResourceAudit_B", auditResourceB.getHeader().getID());
        assertEquals("ResourceAudit_A", resourceAuditA);
        assertEquals("author B", auditResourceB.getHeader().getAuthor());
    }

    @Test
    public void parseXmlReadsUTF8Chars() throws Exception {
        InputStream is = XJdfParserTest.class.getResourceAsStream("/org/cip4/lib/xjdf/utf8.xjdf");
        XJDF xjdf = xJdfParser.parseStream(is);

        Comment comment = xjdf.getComment().get(0);

        assertEquals("aÄoÖuÜsß", comment.getValue());
    }

    @Test
    public void parseXjdfWritesUtf8Chars() throws Exception {
        final String utf8String = "aÄoÖuÜsß";
        XJDF xjdf = new XJDF();
        xjdf.withJobID("Foo")
            .withTypes("Foo")
            .withComment(new Comment().withValue(utf8String));

        byte[] bytes = xJdfParser.parseXJdf(xjdf);
        String xjdfString = new String(bytes, StandardCharsets.UTF_8);
        assertTrue(xjdfString.contains("<xjdf:Comment>aÄoÖuÜsß</xjdf:Comment>"));
    }

    @Test(expected = ValidationException.class)
    public void parseXjdfValidatesDocument() throws Exception {
        xJdfParser.parseXJdf(getInvalidXjdfDocument());
    }

    @Test
    public void parseXjdfAllowsGeneratingInvalidXml() throws Exception {
        byte[] bytes = xJdfParser.parseXJdf(getInvalidXjdfDocument(), true);
        assertNotNull(bytes);
    }

    private XJDF getInvalidXjdfDocument() {
        // xjdf is invalid, because empty list of types is not allowed.
        return new XJDF().withTypes(Collections.EMPTY_LIST);
    }
}
