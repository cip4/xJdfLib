/**
 * All rights reserved by
 * 
 * flyeralarm GmbH
 * Alfred-Nobel-Straße 18
 * 97080 Würzburg
 *
 * info@flyeralarm.com
 * http://www.flyeralarm.com
 */
package org.cip4.lib.xjdf.builder;

import org.cip4.lib.xjdf.XJdfNodeFactory;
import org.cip4.lib.xjdf.schema.FileSpec;
import org.cip4.lib.xjdf.schema.GeneralID;
import org.cip4.lib.xjdf.schema.Part;
import org.cip4.lib.xjdf.schema.RunList;
import org.cip4.lib.xjdf.schema.XJDF;
import org.cip4.lib.xjdf.xml.internal.JAXBContextFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * JUnit test case for XJdfBuilder.
 * @author s.meissner
 */
public class XJdfBuilderUsabilityTest extends AbstractBuilderTest<XJDF> {

	private XJdfBuilder xJdfBuilder;

	/**
	 * Setup unit test.
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		xJdfBuilder = new XJdfBuilder();

		JAXBContextFactory.init();
	}

	/**
	 * Tear down unit test.
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		xJdfBuilder = null;
	}

	/**
	 * Add Multiple Resource o XJDF document.
	 * @throws Exception
	 */
	@Test
	public void testCreateXJdfDocumentSimple() throws Exception {

		// new xJdfBuilder
		XJdfBuilder xJdfBuilder = new XJdfBuilder();

		// xjdf attributes
		xJdfBuilder.getXJdf().setCategory("Web2Print");
		xJdfBuilder.getXJdf().setJobID("Job-12345");

		// append GeneralID
		GeneralID generalId = new XJdfNodeFactory().createGeneralID("CatalobID", "46");
		xJdfBuilder.addGeneralID(generalId);

		// append Product
		ProductBuilder productBuilder = new ProductBuilder(1000);
		productBuilder.getProduct().setDescriptiveName("Description is optional...");
		xJdfBuilder.addProduct(productBuilder.build());

		// append Cover File (using the detailed way - for customization)
		FileSpec fileSpec = new XJdfNodeFactory().createFileSpec();
		fileSpec.setURL("http://www.example.org/xjdf/myCover.pdf");
		RunList runCover = new XJdfNodeFactory().createRunList();
		runCover.setFileSpec(fileSpec);
		Part partCover = new XJdfNodeFactory().createPart();
		partCover.setRun("Cover");
		xJdfBuilder.addResource(runCover, partCover);

		// append Content File (using the straight way - based on common default settings)
		RunList runContent = new XJdfNodeFactory().createRunList("http://www.example.org/xjdf/myContent.pdf");
		Part partContent = new XJdfNodeFactory().createPart();
		partContent.setRun("Content");
		xJdfBuilder.addResource(runContent, partContent);

		// build document
		XJDF xJdf = xJdfBuilder.build();

		// console output
		marsahlResult(xJdfBuilder);
	}

	/**
	 * Add Multiple Resource o XJDF document.
	 * @throws Exception
	 */
	@Test
	public void testCreateXJdfDocumentWithProduct() throws Exception {

		// new xJdfBuilder
		XJdfBuilder xJdfBuilder = new XJdfBuilder();

		// xjdf attributes
		xJdfBuilder.getXJdf().setCategory("Web2Print");
		xJdfBuilder.getXJdf().setJobID("Job-12345");

		// append GeneralID
		GeneralID generalId = new XJdfNodeFactory().createGeneralID("CatalobID", "46");
		xJdfBuilder.addGeneralID(generalId);

		// create and append Product
		ProductBuilder productBuilder = new ProductBuilder();

		xJdfBuilder.addProduct(productBuilder.build());

		// append Cover File (using the detailed way - for customization)
		FileSpec fileSpec = new XJdfNodeFactory().createFileSpec();
		fileSpec.setURL("http://www.example.org/xjdf/myCover.pdf");
		RunList runCover = new XJdfNodeFactory().createRunList();
		runCover.setFileSpec(fileSpec);
		Part partCover = new XJdfNodeFactory().createPart();
		partCover.setRun("Cover");
		xJdfBuilder.addResource(runCover, partCover);

		// append Content File (using the straight way - based on common default settings)
		RunList runContent = new XJdfNodeFactory().createRunList("http://www.example.org/xjdf/myContent.pdf");
		Part partContent = new XJdfNodeFactory().createPart();
		partContent.setRun("Content");
		xJdfBuilder.addResource(runContent, partContent);

		// build document
		XJDF xJdf = xJdfBuilder.build();

		// console output
		marsahlResult(xJdfBuilder);
	}

}
