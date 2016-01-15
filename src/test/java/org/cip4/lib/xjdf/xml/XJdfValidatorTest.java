package org.cip4.lib.xjdf.xml;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

import javax.xml.bind.JAXBException;

import static org.junit.Assert.*;

import org.cip4.lib.xjdf.XJdfNodeFactory;
import org.cip4.lib.xjdf.builder.ContactBuilder;
import org.cip4.lib.xjdf.builder.ProductBuilder;
import org.cip4.lib.xjdf.builder.XJdfBuilder;
import org.cip4.lib.xjdf.schema.GeneralID;
import org.cip4.lib.xjdf.schema.XJDF;
import org.cip4.lib.xjdf.type.Shape;
import org.cip4.lib.xjdf.xml.internal.JAXBContextFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * JUnit test case for XJdfValidator.
 */
public class XJdfValidatorTest {

    private final String RES_TEST_XJDF = "/org/cip4/lib/xjdf/test.xjdf";

    private XJdfValidator xJdfValidator;

    private XJdfNodeFactory xJdfNodeFactory;

    private XJdfBuilder xJdfBuilder;

    /**
     * Default constructor.
     */
    public XJdfValidatorTest() {
        try {
            JAXBContextFactory.init();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    /**
     * Setup unit test.
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {

        // init instance variables
        xJdfNodeFactory = new XJdfNodeFactory();
        xJdfBuilder = new XJdfBuilder();
    }

    /**
     * Tear down unit test.
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
        xJdfValidator = null;
        xJdfNodeFactory = null;
        xJdfBuilder = null;
    }

    /**
     * Test method for {@link org.cip4.lib.xjdf.xml.XJdfValidator#validate(java.io.InputStream)}.
     * @throws Exception
     */
    @Test
    public void testIntegrationInvalide() throws Exception {

        // arrange
        XJdfBuilder xJdfBuilder = new XJdfBuilder();
        xJdfBuilder.addGeneralID(xJdfNodeFactory.createGeneralID("CatalobID", "42"));
        xJdfBuilder.build().setID(null);

        // act
        InputStream xJdfFileStream = builder2InputStream(xJdfBuilder);

        xJdfValidator = new XJdfValidator();
        boolean isValid = xJdfValidator.isValid(xJdfFileStream);

        // assert
        assertFalse("Validation result is wrong", isValid);
    }

    /**
     * Test method for {@link org.cip4.lib.xjdf.xml.XJdfValidator#validate(java.io.InputStream)}.
     * @throws Exception
     */
    @Test
    public void testIntegrationValide() throws Exception {

        // arrange
        GeneralID generalId = xJdfNodeFactory.createGeneralID("CatalobID", "42");
        xJdfBuilder.addGeneralID(generalId);

        xJdfBuilder.build().setID("MyId");
        xJdfBuilder.build().getTypes().add("Web2Print");
        xJdfBuilder.build().setVersion(XJdfConstants.XJDF_CURRENT_VERSION);

        // act
        InputStream xJdfFileStream = builder2InputStream(xJdfBuilder);

        xJdfValidator = new XJdfValidator();
        boolean isValid = xJdfValidator.isValid(xJdfFileStream);

        // assert
        assertTrue("Validation result is wrong", isValid);
    }

    /**
     * Test method for {@link org.cip4.lib.xjdf.xml.XJdfValidator#validate(java.io.InputStream)}.
     * @throws Exception
     */
    @Test
    public void testIntegrationValideSingleLineCall() throws Exception {

        // arrange
        GeneralID generalId = xJdfNodeFactory.createGeneralID("CatalobID", "42");
        xJdfBuilder.addGeneralID(generalId);

        xJdfBuilder.build().setID("MyId");
        xJdfBuilder.build().getTypes().add("Web2Print");
        xJdfBuilder.build().setVersion(XJdfConstants.XJDF_CURRENT_VERSION);

        // act
        InputStream xJdfFileStream = builder2InputStream(xJdfBuilder);

        xJdfValidator = new XJdfValidator();
        boolean isValid = xJdfValidator.isValid(xJdfFileStream);

        // assert
        assertTrue("Validation result is wrong", isValid);
    }

    /**
     * Test method for {@link org.cip4.lib.xjdf.xml.XJdfValidator#validate(java.io.InputStream)}.
     * @throws Exception
     */
    @Test
    public void testIntegrationAnalyzeMessagesInvalid() throws Exception {

        // arrange
        GeneralID generalId = xJdfNodeFactory.createGeneralID("CatalobID", "42");
        xJdfBuilder.addGeneralID(generalId);

        xJdfBuilder.build().setID(null);

        // act
        InputStream xJdfFileStream = builder2InputStream(xJdfBuilder);

        xJdfValidator = new XJdfValidator();
        boolean valid = xJdfValidator.isValid(xJdfFileStream);

        // assert
        assertFalse("Validation result is wrong", valid);
    }

    /**
     * Test method for {@link org.cip4.lib.xjdf.xml.XJdfValidator#validate(java.io.InputStream)}.
     * @throws Exception
     */
    @Test
    public void testIntegrationAnalyzeMessagesValid() throws Exception {

        // arrange
        GeneralID generalId = xJdfNodeFactory.createGeneralID("CatalobID", "42");
        xJdfBuilder.addGeneralID(generalId);

        xJdfBuilder.build().setID("MyId");
        xJdfBuilder.build().getTypes().add("Web2Print");
        xJdfBuilder.build().setVersion(XJdfConstants.XJDF_CURRENT_VERSION);

        // act
        InputStream xJdfFileStream = builder2InputStream(xJdfBuilder);

        xJdfValidator = new XJdfValidator();
        boolean isValid = xJdfValidator.isValid(xJdfFileStream);

        // assert
        assertTrue("Validation result is wrong", isValid);
    }

    @Test
    public void testCheck() throws Exception {
        // arrange
        InputStream is = XJdfValidatorTest.class.getResourceAsStream(RES_TEST_XJDF);

        // act
        xJdfValidator = new XJdfValidator();

        // assert
        assertFalse(xJdfValidator.isValid(is));
    }

    /**
     * Helper converting builder to input stream.
     * @param xJdfBuilder XJdfBuilder object to convert to.
     * @return XJDF as InputStream object.
     * @throws Exception
     */
    private InputStream builder2InputStream(XJdfBuilder xJdfBuilder) throws Exception {

        XJDF xJdf = xJdfBuilder.build();

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        XJdfParser xJdfParser = new XJdfParser();
        xJdfParser.parseXJdf(xJdf, bos, true);

        return new ByteArrayInputStream(bos.toByteArray());

    }

    @Test
    public void createTestXJDFDocument() throws Exception {

        XJdfNodeFactory nf = new XJdfNodeFactory();

        // create product
        ProductBuilder productBuilder = new ProductBuilder(1000, "Brochure", "4 Page Brochure");
        productBuilder.addIntent(
            nf.createLayoutIntent(
                32,
                "TwoSidedHeadToHead",
                new Shape(595.27559055, 822.04724409)
            )
        );
        productBuilder.addIntent(nf.createMediaIntent("IPG_135", null, 135d));
        productBuilder.addIntent(nf.createProductionIntent("Lithography"));
        productBuilder.addIntent(nf.createFoldingIntent("F6-1"));
        // TODO productBuilder.addIntent(nf.createcol)

        // create contact
        ContactBuilder contactBuilder = new ContactBuilder();
        contactBuilder.addPerson("Mustermann", "Max", "Dr.");
        contactBuilder.addCompany("Firma Muster GmbH");
        contactBuilder.addAddress("Musterstraße 12", "12345", "Stadt", "Deutschland", "de");
        contactBuilder.addComChannel("Email", "mailto:info@muster.com");
        contactBuilder.addComChannel("Phone", "tel:+49.173.1234.567");

        // create XJDF
        XJdfBuilder xJdfBuilder = new XJdfBuilder("Web2Print", "Job258596");
        xJdfBuilder.addGeneralID(nf.createGeneralID("CatalogID", "890e81ed-6830-4868-b23d-8ab8af8a4047"));
        xJdfBuilder.addProduct(productBuilder.build());
        xJdfBuilder.addParameter(nf.createCustomerInfo("FA-WEB-DE"));
        xJdfBuilder.addParameter(nf.createRunList("http://www.w2p.com:8080/w2p/getPDF/w2p/hd_a5_32.pdf"));
        xJdfBuilder.addParameter(nf.createApprovalParams(1));
        // TODO xJdfBuilder.addParameter(nf.createNodeInfo());
        // TODO ColorIntent
        xJdfBuilder.addParameter(contactBuilder.build());

        XJDF xJdf = xJdfBuilder.build();
        xJdf.getComment().add(nf.createComment("This is a multiline\nuser comment."));

        // parse
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        new XJdfParser().parseXJdf(xJdf, bos);
        bos.close();

        //
        String doc = new String(bos.toByteArray());
        System.out.println(doc);
    }
}
