package org.cip4.lib.xjdf.xml;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.UUID;

import javax.xml.bind.JAXBException;
import javax.xml.bind.ValidationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.cip4.lib.xjdf.XJdfNodeFactory;
import org.cip4.lib.xjdf.builder.XJdfBuilder;
import org.cip4.lib.xjdf.schema.GeneralID;
import org.cip4.lib.xjdf.schema.LayoutIntent;
import org.cip4.lib.xjdf.schema.Media;
import org.cip4.lib.xjdf.schema.Product;
import org.cip4.lib.xjdf.schema.XJDF;
import org.cip4.lib.xjdf.type.XYPair;
import org.cip4.lib.xjdf.xml.internal.JAXBContextFactory;
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
 * @author s.meissner
 * @date 06.03.2012
 */
public class XJdfParserTest {

    private final String RES_TEST_XJDF = "/org/cip4/lib/xjdf/test.xjdf";
    private final String RES_CHILD_PRODUCTS = "/org/cip4/lib/xjdf/child_products.xjdf";
    private final String RES_IDREF = "/org/cip4/lib/xjdf/idref.xjdf";

    private XJdfParser xJdfParser;

    /**
     * Default constructor.
     */
    public XJdfParserTest() {
        try {
            JAXBContextFactory.init();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

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

    /**
     * Test method for {@link org.cip4.lib.xjdf.xml.XJdfParser#parseXJdf(org.cip4.lib.xjdf.schema.jdf.XJDF, java.io.OutputStream)}.
     */
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

    /**
     * Test method for {@link org.cip4.lib.xjdf.xml.XJdfParser#parseXJdf(org.cip4.lib.xjdf.schema.jdf.XJDF, java.io.OutputStream)}.
     */
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

    /**
     * Test method for {@link org.cip4.lib.xjdf.xml.XJdfParser#parseXJdf(org.cip4.lib.xjdf.schema.jdf.XJDF, java.io.OutputStream)}.
     */
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

    /**
     * Test method for {@link org.cip4.lib.xjdf.xml.XJdfParser#parseXJdf(org.cip4.lib.xjdf.schema.jdf.XJDF, java.io.OutputStream)}.
     */
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

    /**
     * Test method for {@link org.cip4.lib.xjdf.xml.XJdfParser#parseXJdf(org.cip4.lib.xjdf.schema.jdf.XJDF, java.io.OutputStream)}.
     */
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
    public void parseStreamWithMediaRef() throws Exception {
        InputStream is = XJdfParserTest.class.getResourceAsStream(RES_IDREF);
        XJDF xjdf = xJdfParser.parseStream(is);

        LayoutIntent layoutIntent0 =
            (LayoutIntent) xjdf.getProductList().getProduct().get(0).getIntent().get(0).getIntentType().getValue();
        LayoutIntent layoutIntent1 =
            (LayoutIntent) xjdf.getProductList().getProduct().get(1).getIntent().get(0).getIntentType().getValue();
        Media media0 = (Media) layoutIntent0.getLayoutRef().getResourceType().getValue();
        Media media1 = (Media) layoutIntent1.getLayoutRef().getResourceType().getValue();

        assertEquals("LAYOUT_INTENT_REF_0", layoutIntent0.getLayoutRef().getID());
        assertEquals("LAYOUT_INTENT_REF_1", layoutIntent1.getLayoutRef().getID());
        assertEquals(new XYPair(0, 0), media0.getDimension());
        assertEquals(new XYPair(1, 1), media1.getDimension());
    }

}
