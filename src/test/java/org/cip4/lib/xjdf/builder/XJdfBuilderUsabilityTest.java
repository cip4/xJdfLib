package org.cip4.lib.xjdf.builder;

import org.cip4.lib.xjdf.schema.FileSpec;
import org.cip4.lib.xjdf.schema.GeneralID;
import org.cip4.lib.xjdf.schema.Part;
import org.cip4.lib.xjdf.schema.RunList;
import org.cip4.lib.xjdf.schema.XJDF;
import org.cip4.lib.xjdf.type.URI;
import org.junit.jupiter.api.Test;

public class XJdfBuilderUsabilityTest extends AbstractBuilderTest<XJDF> {

	/**
	 * Add Multiple Resource o XJDF document.
	 */
	@Test
	public void testCreateXJdfDocumentSimple() throws Exception {

		// new xJdfBuilder
		XJdfBuilder xJdfBuilder = new XJdfBuilder();

		// xjdf attributes
		xJdfBuilder.getXJdf().setCategory("Web2Print");
		xJdfBuilder.getXJdf().setJobID("Job-12345");

		// append GeneralID
		GeneralID generalId = new GeneralID().withIDUsage("CatalobID").withIDValue("46");
		xJdfBuilder.addGeneralID(generalId);

		// append Product
		ProductBuilder productBuilder = new ProductBuilder(1000);
		productBuilder.getProduct().setDescriptiveName("Description is optional...");
		xJdfBuilder.addProduct(productBuilder.build());

		// append Cover File (using the detailed way - for customization)
		FileSpec fileSpec = new FileSpec().withURL(new URI(
			"http://www.example.org/xjdf/myCover.pdf"
		));

		RunList runCover = new RunList();
		runCover.setFileSpec(fileSpec);
		Part partCover = new Part();
		partCover.setRun("Cover");
		xJdfBuilder.addResource(runCover, partCover);

		// append Content File (using the straight way - based on common default settings)
		RunList runContent = new RunList().withFileSpec(new FileSpec().withURL(new URI("http://www.example.org/xjdf/myContent.pdf")));
		Part partContent = new Part();
		partContent.setRun("Content");
		xJdfBuilder.addResource(runContent, partContent);

		// console output
        marshalResult(xJdfBuilder);
	}

	/**
	 * Add Multiple Resource o XJDF document.
	 */
	@Test
	public void testCreateXJdfDocumentWithProduct() throws Exception {

		// new xJdfBuilder
		XJdfBuilder xJdfBuilder = new XJdfBuilder();

		// xjdf attributes
		xJdfBuilder.getXJdf().setCategory("Web2Print");
		xJdfBuilder.getXJdf().setJobID("Job-12345");

		// append GeneralID
		GeneralID generalId = new GeneralID().withIDUsage("CatalobID").withIDValue("46");
		xJdfBuilder.addGeneralID(generalId);

		// create and append Product
		ProductBuilder productBuilder = new ProductBuilder();

		xJdfBuilder.addProduct(productBuilder.build());

		// append Cover File (using the detailed way - for customization)
		FileSpec fileSpec = new FileSpec();
        fileSpec.setURL(
            new URI(
                new java.net.URI(
                    "http://www.example.org/xjdf/myCover.pdf"
                )
            )
        );
		RunList runCover = new RunList();
		runCover.setFileSpec(fileSpec);
		Part partCover = new Part();
		partCover.setRun("Cover");
		xJdfBuilder.addResource(runCover, partCover);

		// append Content File (using the straight way - based on common default settings)
        RunList runContent = new RunList().withFileSpec(new FileSpec().withURL(
			new URI(
				"http://www.example.org/xjdf/myContent.pdf"
			)
		));
		Part partContent = new Part();
		partContent.setRun("Content");
		xJdfBuilder.addResource(runContent, partContent);

		// console output
		marshalResult(xJdfBuilder);
	}

}
