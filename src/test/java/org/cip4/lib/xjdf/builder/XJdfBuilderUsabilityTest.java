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
import org.cip4.lib.xjdf.schema.jdf.FileSpec;
import org.cip4.lib.xjdf.schema.jdf.GeneralID;
import org.cip4.lib.xjdf.schema.jdf.Part;
import org.cip4.lib.xjdf.schema.jdf.Product;
import org.cip4.lib.xjdf.schema.jdf.RunList;
import org.cip4.lib.xjdf.schema.jdf.XJDF;
import org.cip4.lib.xjdf.xml.internal.JAXBContextFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * JUnit test case for XJdfBuilder.
 * @author s.meissner
 * @date 29.02.2012
 */
public class XJdfBuilderUsabilityTest extends AbstractBuilderTest<XJDF> {

	private XJdfBuilder xJdfBuilder;

	/**
	 * Setup unit test.
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		xJdfBuilder = XJdfBuilder.newInstance();

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
	 * Add Multiple Parameter o XJDF document.
	 * @throws Exception
	 */
	@Test
	public void testCreateXJdfDocumentSimple() throws Exception {

		// new xJdfBuilder
		XJdfBuilder xJdfBuilder = XJdfBuilder.newInstance();

		// xjdf attributes
		xJdfBuilder.getXJdf().setCategory("Web2Print");
		xJdfBuilder.getXJdf().setJobID("Job-12345");

		// append GeneralID
		GeneralID generalId = XJdfNodeFactory.newInstance().createGeneralID("CatalobID", "46");
		xJdfBuilder.addGeneralID(generalId);

		// append Product
		Product product = XJdfNodeFactory.newInstance().createProduct(1000);
		product.setDescriptiveName("Description is optional...");
		xJdfBuilder.addProduct(product);

		// append Cover File (using the detailed way - for customization)
		FileSpec fileSpec = XJdfNodeFactory.newInstance().createFileSpec();
		fileSpec.setURL("http://www.example.org/xjdf/myCover.pdf");
		RunList runCover = XJdfNodeFactory.newInstance().createRunList();
		runCover.setFileSpec(fileSpec);
		Part partCover = XJdfNodeFactory.newInstance().createPart();
		partCover.setRun("Cover");
		xJdfBuilder.addParameter(runCover, partCover);

		// append Content File (using the straight way - based on common default settings)
		RunList runContent = XJdfNodeFactory.newInstance().createRunList("http://www.example.org/xjdf/myContent.pdf");
		Part partContent = XJdfNodeFactory.newInstance().createPart();
		partContent.setRun("Content");
		xJdfBuilder.addParameter(runContent, partContent);

		// build document
		XJDF xJdf = xJdfBuilder.build();

		// console output
		marsahlResult(xJdfBuilder);
	}

	/**
	 * Add Multiple Parameter o XJDF document.
	 * @throws Exception
	 */
	@Test
	public void testCreateXJdfDocumentWithProduct() throws Exception {

		// new xJdfBuilder
		XJdfBuilder xJdfBuilder = XJdfBuilder.newInstance();

		// xjdf attributes
		xJdfBuilder.getXJdf().setCategory("Web2Print");
		xJdfBuilder.getXJdf().setJobID("Job-12345");

		// append GeneralID
		GeneralID generalId = XJdfNodeFactory.newInstance().createGeneralID("CatalobID", "46");
		xJdfBuilder.addGeneralID(generalId);

		// create and append Product
		ProductBuilder productBuilder = ProductBuilder.newInstance();

		xJdfBuilder.addProduct(productBuilder.build());

		// append Cover File (using the detailed way - for customization)
		FileSpec fileSpec = XJdfNodeFactory.newInstance().createFileSpec();
		fileSpec.setURL("http://www.example.org/xjdf/myCover.pdf");
		RunList runCover = XJdfNodeFactory.newInstance().createRunList();
		runCover.setFileSpec(fileSpec);
		Part partCover = XJdfNodeFactory.newInstance().createPart();
		partCover.setRun("Cover");
		xJdfBuilder.addParameter(runCover, partCover);

		// append Content File (using the straight way - based on common default settings)
		RunList runContent = XJdfNodeFactory.newInstance().createRunList("http://www.example.org/xjdf/myContent.pdf");
		Part partContent = XJdfNodeFactory.newInstance().createPart();
		partContent.setRun("Content");
		xJdfBuilder.addParameter(runContent, partContent);

		// build document
		XJDF xJdf = xJdfBuilder.build();

		// console output
		marsahlResult(xJdfBuilder);
	}

}
