package org.cip4.lib.xjdf.xml;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.UUID;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.cip4.lib.xjdf.XJdfDocument;
import org.cip4.lib.xjdf.schema.*;
import org.cip4.lib.xjdf.binding.NamespaceManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.xml.sax.InputSource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit test case for XmlParser class.
 */
public class XJdfParser2Test {

    private static final String RES_TEST_XJDF = "/org/cip4/lib/xjdf/test.xjdf";
    private static final String RES_CHILD_PRODUCTS = "/org/cip4/lib/xjdf/child_products.xjdf";
    private static final String RES_IDREF = "/org/cip4/lib/xjdf/idref.xjdf";

    private XJdfParser<XJDF> xJdfParser;

    /**
     * Set up unit test.
     */
    @BeforeEach
    public void setUp() throws Exception {
        // new instance
        xJdfParser = new XJdfParser<>();
    }

    /**
     * Tear down unit test.
     */
    @AfterEach
    public void tearDown() {
        // clean up
        xJdfParser = null;
    }

    @Test
    public void testParseXJdfSkipValidation() throws Exception {

        // arrange
        final String VALUE = UUID.randomUUID().toString();

        XJdfDocument xJdfDocument = new XJdfDocument();
        xJdfDocument.getXJdf().withGeneralID(new GeneralID().withIDUsage("CatalobID").withIDValue(VALUE));
        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        // act
        xJdfParser.writeXml(xJdfDocument.getXJdf(), bos);

        // assert
        NamespaceManager nsManager = new NamespaceManager();
        nsManager.addNamespace("ns", XJdfConstants.NAMESPACE_JDF20);

        XPathFactory xPathFactory = XPathFactory.newInstance();
        XPath xPath = xPathFactory.newXPath();
        xPath.setNamespaceContext(nsManager);

        XPathExpression xPathExpression = xPath.compile("/ns:XJDF/ns:GeneralID/@IDValue");
        InputStream is = new ByteArrayInputStream(bos.toByteArray());
        String actual = xPathExpression.evaluate(new InputSource(is));

        assertEquals(VALUE, actual, "Expected value is wrong.");
    }

    @Test
    public void testParseXJdfSkipValidationByteArray() throws Exception {

        // arrange
        final String VALUE = UUID.randomUUID().toString();

        XJdfDocument xJdfDocument = new XJdfDocument();
        xJdfDocument.getXJdf().withGeneralID(new GeneralID().withIDUsage("CatalobID").withIDValue(VALUE));

        // act
        byte[] bytes = xJdfParser.writeXml(xJdfDocument.getXJdf());

        // assert
        NamespaceManager nsManager = new NamespaceManager();
        nsManager.addNamespace("ns", XJdfConstants.NAMESPACE_JDF20);

        XPathFactory xPathFactory = XPathFactory.newInstance();
        XPath xPath = xPathFactory.newXPath();
        xPath.setNamespaceContext(nsManager);

        XPathExpression xPathExpression = xPath.compile("/ns:XJDF/ns:GeneralID/@IDValue");
        InputStream is = new ByteArrayInputStream(bytes);
        String actual = xPathExpression.evaluate(new InputSource(is));

        assertEquals(VALUE, actual, "Expected value is wrong.");
    }

    @Test
    public void testParseXJdfValid() throws Exception {

        // arrange
        final String VALUE = UUID.randomUUID().toString();

        XJdfDocument xJdfDocument = new XJdfDocument("Foo", "MyType");
        xJdfDocument.getXJdf().withGeneralID(new GeneralID().withIDUsage("CatalobID").withIDValue(VALUE));

        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        // act
        xJdfParser.writeXml(xJdfDocument.getXJdf(), bos);

        // assert
        NamespaceManager nsManager = new NamespaceManager();
        nsManager.addNamespace("ns", XJdfConstants.NAMESPACE_JDF20);

        XPathFactory xPathFactory = XPathFactory.newInstance();
        XPath xPath = xPathFactory.newXPath();
        xPath.setNamespaceContext(nsManager);

        XPathExpression xPathExpression = xPath.compile("/ns:XJDF/ns:GeneralID/@IDValue");
        InputStream is = new ByteArrayInputStream(bos.toByteArray());
        String actual = xPathExpression.evaluate(new InputSource(is));

        assertEquals(VALUE, actual, "Expected value is wrong.");
    }

    @Test
    public void testParseXJdfValidByteArray() throws Exception {

        // arrange
        final String VALUE = UUID.randomUUID().toString();

        XJdfDocument xJdfDocument = new XJdfDocument("Foo", "MyType");
        xJdfDocument.getXJdf().withGeneralID(new GeneralID().withIDUsage("CatalobID").withIDValue(VALUE));

        // act
        byte[] bytes = xJdfParser.writeXml(xJdfDocument.getXJdf());

        // assert
        NamespaceManager nsManager = new NamespaceManager();
        nsManager.addNamespace("ns", XJdfConstants.NAMESPACE_JDF20);

        XPathFactory xPathFactory = XPathFactory.newInstance();
        XPath xPath = xPathFactory.newXPath();
        xPath.setNamespaceContext(nsManager);

        XPathExpression xPathExpression = xPath.compile("/ns:XJDF/ns:GeneralID/@IDValue");
        InputStream is = new ByteArrayInputStream(bytes);
        String actual = xPathExpression.evaluate(new InputSource(is));

        assertEquals(VALUE, actual, "Expected value is wrong.");
    }

    /**
     * Test method for {@link XJdfParser#writeXml(Object)} (java.io.InputStream)}.
     */
    @Test
    public void testParseXmlStream() throws Exception {
        // arrange
        final String RESULT = "890e81ed-6830-4868-b23d-8ab8af8a4047";

        InputStream is = XJdfParser2Test.class.getResourceAsStream(RES_TEST_XJDF);

        // act
        XJDF xJdf = xJdfParser.readXml(is);

        // assert
        assertEquals(RESULT, xJdf.getGeneralID().get(0).getIDValue(), "Result is wrong.");
    }

    /**
     * Test method for {@link XJdfParser#readXml(java.io.InputStream)}.
     */
    @Test
    public void parseStreamWithChildProductsInvalidChildId() throws Exception {
        InputStream is = XJdfParser2Test.class.getResourceAsStream(RES_CHILD_PRODUCTS);
        XJDF xjdf = xJdfParser.readXml(is);

        final Product mainProduct = xjdf.getProductList().getProduct().get(6);
        final BindingIntent bindingIntent = (BindingIntent) mainProduct.getIntent().get(2).getProductIntent().getValue();
        assertEquals(0, bindingIntent.getChildren().size());
    }

    /**
     * Test method for {@link XJdfParser#readXml(java.io.InputStream)}.
     */
    @Test
    public void parseStreamWithChildProducts() throws Exception {
        InputStream is = XJdfParser2Test.class.getResourceAsStream(RES_CHILD_PRODUCTS);
        XJDF xjdf = xJdfParser.readXml(is);

        final Product mainProduct1 = xjdf.getProductList().getProduct().get(3);
        final BindingIntent bindingIntent1 = (BindingIntent) mainProduct1.getIntent().get(2).getProductIntent().getValue();
        assertEquals(2, bindingIntent1.getChildren().size());
        final Product childProduct11 = bindingIntent1.getChildren().get(0);
        assertEquals(childProduct11.getID(), "PRD_MAIN01_SUB01");
        assertEquals(11000, (int) childProduct11.getAmount());
        final Product childProduct12 = bindingIntent1.getChildren().get(1);
        assertEquals(childProduct12.getID(), "PRD_MAIN01_SUB02");
        assertEquals(12000, (int) childProduct12.getAmount());

        final Product mainProduct2 = xjdf.getProductList().getProduct().get(4);
        final BindingIntent bindingIntent2 = (BindingIntent) mainProduct2.getIntent().get(2).getProductIntent().getValue();
        assertEquals(1, bindingIntent2.getChildren().size());
        final Product childProduct21 = bindingIntent2.getChildren().get(0);
        assertEquals(childProduct21.getID(), "PRD_MAIN02_SUB01");
        assertEquals(21000, (int) childProduct21.getAmount());

        final Product mainProduct3 = xjdf.getProductList().getProduct().get(5);
        final BindingIntent bindingIntent3 = (BindingIntent) mainProduct3.getIntent().get(2).getProductIntent().getValue();
        assertEquals(0, bindingIntent3.getChildren().size());
    }

    @Test
    public void parseStreamApprovalPersonWithContactRef() throws Exception {
        InputStream is = XJdfParser2Test.class.getResourceAsStream(RES_IDREF);
        XJDF xjdf = xJdfParser.readXml(is);

        ResourceSet resourceSet = xjdf.getResourceSet().get(6);
        ApprovalDetails approvalDetails = (ApprovalDetails) resourceSet.getResource().get(0).getSpecificResource().getValue();
        ApprovalPerson approvalPerson = approvalDetails.getApprovalPerson();
        Contact contact = (Contact) approvalPerson.getContact().getSpecificResource().getValue();

        assertEquals(approvalPerson.getContact().getID(), "CONTACT_REF_1");
        assertEquals(contact.getCompany().getOrganizationName(), "FLYERALARM GmbH");
    }

    @Test
    public void parseStreamPhaseTimeWithPhaseTimeRef() throws Exception {
        InputStream is = XJdfParser2Test.class.getResourceAsStream(RES_IDREF);
        XJDF xjdf = xJdfParser.readXml(is);

        AuditStatus auditStatusB = (AuditStatus) xjdf.getAuditPool().getAudits().get(4);
        String auditStatusA = auditStatusB.getHeader().getRefID();
        assertEquals(auditStatusB.getHeader().getID(), "PhaseTime_B");
        assertEquals(auditStatusA, "PhaseTime_A");
        assertEquals(auditStatusB.getHeader().getAuthor(), "author B");
    }

    @Test
    public void parseStreamProcessRunWithProcessRunRef() throws Exception {
        InputStream is = XJdfParser2Test.class.getResourceAsStream(RES_IDREF);
        XJDF xjdf = xJdfParser.readXml(is);

        AuditProcessRun processRunB = (AuditProcessRun) xjdf.getAuditPool().getAudits().get(6);
        assertEquals(processRunB.getHeader().getRefID(), "ProcessRun_A");
        assertEquals(processRunB.getHeader().getID(), "ProcessRun_B");
    }

    @Test
    public void parseStreamResourceAuditWithResourceAuditRef() throws Exception {
        InputStream is = XJdfParser2Test.class.getResourceAsStream(RES_IDREF);
        XJDF xjdf = xJdfParser.readXml(is);

        AuditResource auditResourceB = (AuditResource) xjdf.getAuditPool().getAudits().get(8);
        String resourceAuditA = auditResourceB.getHeader().getRefID();
        assertEquals(auditResourceB.getHeader().getID(), "ResourceAudit_B");
        assertEquals(resourceAuditA, "ResourceAudit_A");
        assertEquals(auditResourceB.getHeader().getAuthor(), "author B");
    }

    @Test
    public void parseXmlReadsUTF8Chars() throws Exception {
        InputStream is = XJdfParser2Test.class.getResourceAsStream("/org/cip4/lib/xjdf/utf8.xjdf");
        XJDF xjdf = xJdfParser.readXml(is);

        Comment comment = xjdf.getComment().get(0);

        assertEquals(comment.getValue(), "aÄoÖuÜsß");
    }

    @Test
    public void parseXjdfWritesUtf8Chars() throws Exception {
        final String utf8String = "aÄoÖuÜsß";
        XJDF xjdf = new XJDF();
        xjdf.withJobID("Foo")
            .withTypes("Foo")
            .withComment(new Comment().withValue(utf8String));

        byte[] bytes = xJdfParser.writeXml(xjdf);
        String xjdfString = new String(bytes, StandardCharsets.UTF_8);
        assertTrue(xjdfString.contains("<Comment>aÄoÖuÜsß</Comment>"));
    }

    @Test
    public void parseXjdfAllowsGeneratingInvalidXml() throws Exception {
        byte[] bytes = xJdfParser.writeXml(getInvalidXjdfDocument());
        assertNotNull(bytes);
    }

    private XJDF getInvalidXjdfDocument() {
        // xjdf is invalid, because empty list of types is not allowed.
        return new XJDF().withTypes(Collections.EMPTY_LIST);
    }
}
