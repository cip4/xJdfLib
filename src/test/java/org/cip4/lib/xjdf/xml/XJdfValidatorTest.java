package org.cip4.lib.xjdf.xml;

import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.ValidationException;
import org.cip4.lib.xjdf.builder.ProductBuilder;
import org.cip4.lib.xjdf.builder.XJdfBuilder;
import org.cip4.lib.xjdf.schema.Address;
import org.cip4.lib.xjdf.schema.ComChannel;
import org.cip4.lib.xjdf.schema.Comment;
import org.cip4.lib.xjdf.schema.Company;
import org.cip4.lib.xjdf.schema.Contact;
import org.cip4.lib.xjdf.schema.CustomerInfo;
import org.cip4.lib.xjdf.schema.FileSpec;
import org.cip4.lib.xjdf.schema.FoldingIntent;
import org.cip4.lib.xjdf.schema.LayoutIntent;
import org.cip4.lib.xjdf.schema.MediaIntent;
import org.cip4.lib.xjdf.schema.MediaType;
import org.cip4.lib.xjdf.schema.ObjectFactory;
import org.cip4.lib.xjdf.schema.ProductionIntent;
import org.cip4.lib.xjdf.schema.RunList;
import org.cip4.lib.xjdf.schema.Sides;
import org.cip4.lib.xjdf.schema.GeneralID;
import org.cip4.lib.xjdf.schema.Person;
import org.cip4.lib.xjdf.schema.XJDF;
import org.cip4.lib.xjdf.type.Shape;
import org.cip4.lib.xjdf.type.URI;
import org.cip4.lib.xjdf.xml.internal.JAXBContextFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit test case for XJdfValidator.
 */
public class XJdfValidatorTest {

    private XJdfValidator xJdfValidator;

    private ObjectFactory objectFactory;

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

    @BeforeEach
    public void setUp() {
        // init instance variables
        objectFactory = new ObjectFactory();
        xJdfBuilder = new XJdfBuilder(this.getClass().getCanonicalName());
    }

    @AfterEach
    public void tearDown() {
        xJdfValidator = null;
        objectFactory = null;
        xJdfBuilder = null;
    }

    @Test
    public void integrationInvalid() throws Exception {
        // arrange
        XJdfBuilder xJdfBuilder = new XJdfBuilder();
        xJdfBuilder.addGeneralID(new GeneralID());
        // Empty list of types is invalid...
        xJdfBuilder.build().withTypes(Collections.EMPTY_LIST);

        // act
        final InputStream xJdfFileStream = builder2InputStream(xJdfBuilder);

        xJdfValidator = new XJdfValidator();

        assertThrows(
            ValidationException.class,
            new Executable() {
                @Override
                public void execute() throws Throwable {
                    xJdfValidator.validate(xJdfFileStream);
                }
            }
        );
    }

    @Test
    public void integrationValid() throws Exception {

        // arrange
        xJdfBuilder.addGeneralID(new GeneralID().withIDUsage("CatalogID").withIDValue("42"));

        xJdfBuilder.build().getTypes().add("Web2Print");

        // act
        InputStream xJdfFileStream = builder2InputStream(xJdfBuilder);

        xJdfValidator = new XJdfValidator();
        xJdfValidator.validate(xJdfFileStream);
    }

    @Test
    public void integrationAnalyzeMessagesInvalid() throws Exception {

        // arrange
        xJdfBuilder.addGeneralID(new GeneralID().withIDUsage("CatalogID").withIDValue("42"));
        // Empty list of types is invalid...
        xJdfBuilder.build().withTypes(Collections.EMPTY_LIST);

        // act
        final InputStream xJdfFileStream = builder2InputStream(xJdfBuilder);

        xJdfValidator = new XJdfValidator();

        assertThrows(
            ValidationException.class,
            new Executable() {
                @Override
                public void execute() throws Throwable {
                    xJdfValidator.validate(xJdfFileStream);
                }
            }
        );
    }

    @Test
    public void isValidXjdfIsInvalid() {
        // arrange
        final InputStream is = XJdfValidatorTest.class.getResourceAsStream("/org/cip4/lib/xjdf/test.xjdf");

        // act
        xJdfValidator = new XJdfValidator();

        assertThrows(
            ValidationException.class,
            new Executable() {
                @Override
                public void execute() throws Throwable {
                    xJdfValidator.validate(is);
                }
            }
        );
    }

    /**
     * Helper converting builder to input stream.
     *
     * @param xJdfBuilder XJdfBuilder object to convert to.
     *
     * @return XJDF as InputStream object.
     * @throws Exception Is thrown in case of any errors.
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

        // create product
        ProductBuilder productBuilder = new ProductBuilder(1000, "Brochure", "4 Page Brochure");
        productBuilder.addIntent(
            new LayoutIntent()
                .withPages(32)
                .withSides(Sides.TWO_SIDED_HEAD_TO_HEAD)
                .withFinishedDimensions(new Shape(595.27559055f, 822.04724409f))
        );
        productBuilder.addIntent(
            new MediaIntent()
                .withMediaQuality("IPG_135")
                .withWeight(135f)
                .withMediaType(MediaType.PAPER)
        );
        productBuilder.addIntent(new ProductionIntent().withPrintProcess("Lithography"));
        productBuilder.addIntent(new FoldingIntent().withFoldCatalog("F6-1"));
        // TODO productBuilder.addIntent(nf.createcol)

        // create contact
        Contact contact = new Contact()
            .withPerson(
                new Person()
                    .withFamilyName("Mustermann")
                    .withFirstName("Max")
                    .withNamePrefix("Dr.")
            ).withCompany(
                new Company()
                    .withOrganizationName("Firma Muster GmbH")
            ).withAddress(
                new Address()
                    .withStreet("Musterstraße 12")
                    .withPostalCode("12345")
                    .withCity("Stadt")
                    .withCountry("Deutschland")
                    .withCountryCode("DE")
            ).withComChannel(
                new ComChannel()
                    .withChannelType("Email")
                    .withLocator("mailto:info@muster.com"),
                new ComChannel()
                    .withChannelType("Phone")
                    .withLocator("tel:+49.173.1234.567")
            );

        // create XJDF
        XJdfBuilder xJdfBuilder = new XJdfBuilder("Web2Print", "Job258596");
        xJdfBuilder.addGeneralID(new GeneralID().withIDUsage("CatalogID").withIDValue("890e81ed-6830-4868-b23d-8ab8af8a4047"));
        xJdfBuilder.addProduct(productBuilder.build());
        xJdfBuilder.addResource(new CustomerInfo().withCustomerID("FA-WEB-DE"));
        xJdfBuilder.addResource(new RunList()
            .withFileSpec(new FileSpec()
                .withURL(new URI("http://www.w2p.com:8080/w2p/getPDF/w2p/hd_a5_32.pdf"))
            )
        );

        // TODO xJdfBuilder.addResource(nf.createNodeInfo());
        // TODO ColorIntent
        xJdfBuilder.addResource(contact);

        XJDF xJdf = xJdfBuilder.build();
        xJdf.withTypes("Product");
        xJdf.getComment().add(new Comment().withValue("This is a multiline\nuser comment."));

        // parse
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        new XJdfParser().parseXJdf(xJdf, bos);
        bos.close();

        //
        String doc = new String(bos.toByteArray());
        System.out.println(doc);
    }

    @Test
    public void foreignNamespaceInResource() throws Exception {
        InputStream is = XJdfValidatorTest.class.getResourceAsStream("../foreignNamespace.xjdf");
        xJdfValidator = new XJdfValidator();
        xJdfValidator.validate(is);
    }
}
