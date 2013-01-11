/**
 * All rights reserved by
 * 
 * flyeralarm GmbH
 * Alfred-Nobel-Straße 18
 * 97080 Würzburg
 *
 * Email: info@flyeralarm.com
 * Website: http://www.flyeralarm.com
 */
package org.cip4.lib.xjdf.xml;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

import javax.xml.bind.JAXBException;

import junit.framework.Assert;

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
 * @author s.meissner
 * @date 11.04.2012
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
		xJdfNodeFactory = XJdfNodeFactory.newInstance();
		xJdfBuilder = XJdfBuilder.newInstance();
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
		GeneralID generalId = xJdfNodeFactory.createGeneralID("CatalobID", "42");
		xJdfBuilder.addGeneralID(generalId);

		xJdfBuilder.build().setID("MyId");

		// act
		InputStream xJdfFileStream = builder2InputStream(xJdfBuilder);

		xJdfValidator = XJdfValidator.newInstance(xJdfFileStream);
		boolean isValid = xJdfValidator.isValid();

		// assert
		Assert.assertFalse("Validation result is wrong", isValid);
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

		xJdfValidator = XJdfValidator.newInstance(xJdfFileStream);
		boolean isValid = xJdfValidator.isValid();

		// assert
		Assert.assertTrue("Validation result is wrong", isValid);
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

		xJdfValidator = XJdfValidator.newInstance(xJdfFileStream);
		boolean isValid = xJdfValidator.isValid();

		// assert
		Assert.assertTrue("Validation result is wrong", isValid);
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

		xJdfBuilder.build().setID("MyId");

		// act
		InputStream xJdfFileStream = builder2InputStream(xJdfBuilder);

		xJdfValidator = XJdfValidator.newInstance(xJdfFileStream);
		boolean isValid = xJdfValidator.isValid();

		// assert
		int size = xJdfValidator.getMessages().size();

		Assert.assertEquals("Number messages is wrong.", 1, size);
		Assert.assertFalse("Validation result is wrong", isValid);
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

		xJdfValidator = XJdfValidator.newInstance(xJdfFileStream);
		boolean isValid = xJdfValidator.isValid();

		// assert
		int size = xJdfValidator.getMessages().size();

		Assert.assertEquals("Number messages is wrong.", 0, size);
		Assert.assertTrue("Validation result is wrong", isValid);
	}

	@Test
	public void testCheck() throws Exception {

		// arrange
		InputStream is = XJdfValidatorTest.class.getResourceAsStream(RES_TEST_XJDF);

		// act
		xJdfValidator = XJdfValidator.newInstance(is);
		boolean isValid = xJdfValidator.isValid();

		// assert
		System.out.println(xJdfValidator.getMessagesText());
		// TODO Assert.assertTrue("Validation result is wrong", isValid);
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
		XJdfParser xJdfParser = XJdfParser.newInstance();
		xJdfParser.parseXJdf(xJdf, bos, true);

		return new ByteArrayInputStream(bos.toByteArray());

	}

	@Test
	public void createTestXJDFDocument() throws Exception {

		XJdfNodeFactory nf = XJdfNodeFactory.newInstance();

		// create product
		ProductBuilder productBuilder = ProductBuilder.newInstance(1000, "Brochure", "4 Page Brochure");
		productBuilder.addIntent(nf.createLayoutIntent(32, "TwoSidedHeadToHead", new Shape(595.27559055, 822.04724409)));
		productBuilder.addIntent(nf.createMediaIntent("IPG_135", null, 135d));
		productBuilder.addIntent(nf.createProductionIntent("Lithography"));
		productBuilder.addIntent(nf.createFoldingIntent("F6-1"));
		// TODO productBuilder.addIntent(nf.createcol)

		// create contact
		ContactBuilder contactBuilder = ContactBuilder.newInstance();
		contactBuilder.addPerson("Mustermann", "Max", "Dr.");
		contactBuilder.addCompany("Firma Muster GmbH");
		contactBuilder.addAddress("Musterstraße 12", "12345", "Stadt", "Deutschland", "de");
		contactBuilder.addComChannel("Email", "mailto:info@muster.com");
		contactBuilder.addComChannel("Phone", "tel:+49.173.1234.567");

		// create XJDF
		XJdfBuilder xJdfBuilder = XJdfBuilder.newInstance("Web2Print", "Job258596");
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
		XJdfParser.newInstance().parseXJdf(xJdf, bos, true);
		bos.close();

		//
		String doc = new String(bos.toByteArray());
		System.out.println(doc);
	}
}
