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
package org.cip4.lib.xjdf;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import junit.framework.Assert;

import org.cip4.lib.xjdf.schema.ApprovalParams;
import org.cip4.lib.xjdf.schema.BindingIntent;
import org.cip4.lib.xjdf.schema.ChildProduct;
import org.cip4.lib.xjdf.schema.ColorIntent;
import org.cip4.lib.xjdf.schema.Comment;
import org.cip4.lib.xjdf.schema.CustomerInfo;
import org.cip4.lib.xjdf.schema.FoldingIntent;
import org.cip4.lib.xjdf.schema.GeneralID;
import org.cip4.lib.xjdf.schema.LayoutIntent;
import org.cip4.lib.xjdf.schema.MediaIntent;
import org.cip4.lib.xjdf.schema.NodeInfo;
import org.cip4.lib.xjdf.schema.ProductionIntent;
import org.cip4.lib.xjdf.schema.ProofingIntent;
import org.cip4.lib.xjdf.schema.RunList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * JUnit test case for XJdfNodeFactory.
 * @author s.meissner
 * @date 05.03.2012
 */
public class XJdfNodeFactoryTest {

	private XJdfNodeFactory xJdfNodeFactory;

	/**
	 * Set up unit test.
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		xJdfNodeFactory = XJdfNodeFactory.newInstance();
	}

	/**
	 * Tear down unit test.
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		xJdfNodeFactory = null;
	}

	@Test
	public void testCreateGeneralID() {

		// arrange
		final String ID_USAGE = UUID.randomUUID().toString();
		final String ID_VALUE = UUID.randomUUID().toString();

		// act
		GeneralID generalId = xJdfNodeFactory.createGeneralID(ID_USAGE, ID_VALUE);

		// assert
		Assert.assertEquals("IDUsage is wrong", ID_USAGE, generalId.getIDUsage());
		Assert.assertEquals("IDValue is wrong", ID_VALUE, generalId.getIDValue());
	}

	@Test
	public void testCreateRunListString() {

		// arrange
		final String FILE_SPEC_URL = UUID.randomUUID().toString();

		// act
		RunList runList = xJdfNodeFactory.createRunList(FILE_SPEC_URL);

		// assert
		Assert.assertEquals("Attribute URL in Node FileSpec is wrong", FILE_SPEC_URL, runList.getFileSpec().getURL());
	}

	@Test
	public void testCreateComment() {

		// arrange
		final String COMMENT = UUID.randomUUID().toString();

		// act
		Comment comment = xJdfNodeFactory.createComment(COMMENT);

		// assert
		Assert.assertEquals("Comment is wrong", COMMENT, comment.getValue());
	}

	@Test
	public void testCreateApprovalParams() {

		// arrange
		final Integer MIN_APPROVALS = 5;

		// act
		ApprovalParams approvalParams = xJdfNodeFactory.createApprovalParams(MIN_APPROVALS);

		// assert
		Assert.assertEquals("MinApprovals is wrong", MIN_APPROVALS, approvalParams.getMinApprovals());
	}

	@Test
	public void testCreateCustomerInfo() {

		// arrange
		final String CUSTOMER_ID = UUID.randomUUID().toString();

		// act
		CustomerInfo customerInfo = xJdfNodeFactory.createCustomerInfo(CUSTOMER_ID);

		// assert
		Assert.assertEquals("CustomerID is wrong", CUSTOMER_ID, customerInfo.getCustomerID());
	}

	@Test
	public void testCreateNodeInfo() {

		// arrange
		final String TOTAL_DURATION = UUID.randomUUID().toString();
		final String END = UUID.randomUUID().toString();
		final String NATURAL_LANG = UUID.randomUUID().toString();

		// act
		NodeInfo nodeInfo = xJdfNodeFactory.createNodeInfo(TOTAL_DURATION, END, NATURAL_LANG);

		// assert
		Assert.assertEquals("TotalDuration is wrong", TOTAL_DURATION, nodeInfo.getTotalDuration());
		Assert.assertEquals("End is wrong", END, nodeInfo.getEnd());
		Assert.assertEquals("NaturalLang is wrong", NATURAL_LANG, nodeInfo.getNaturalLang());
	}

	@Test
	public void testCreateChildProduct() {

		// arrange
		final String CHILDREF = UUID.randomUUID().toString();

		// act
		ChildProduct childProduct = xJdfNodeFactory.createChildProduct(CHILDREF);

		// assert
		Assert.assertEquals("Childref is wrong", CHILDREF, childProduct.getChildRef());
	}

	@Test
	public void testCreateMediaIntent() {

		// arrange
		final String MEDIA_QUALITY = UUID.randomUUID().toString();
		final String BRAND = UUID.randomUUID().toString();
		final Double WEIGHT = 3.22d;

		// act
		MediaIntent mediaIntent = xJdfNodeFactory.createMediaIntent(MEDIA_QUALITY, BRAND, WEIGHT);

		// assert
		Assert.assertEquals("MediaQuality is wrong", MEDIA_QUALITY, mediaIntent.getMediaQuality());
		Assert.assertEquals("Brand is wrong", BRAND, mediaIntent.getBrand());
		Assert.assertEquals("Weight is wrong", WEIGHT, mediaIntent.getWeight());
	}

	@Test
	public void testCreateMediaIntentLight() {

		// arrange
		final String MEDIA_QUALITY = UUID.randomUUID().toString();

		// act
		MediaIntent mediaIntent = xJdfNodeFactory.createMediaIntent(MEDIA_QUALITY);

		// assert
		Assert.assertEquals("MediaQuality is wrong", MEDIA_QUALITY, mediaIntent.getMediaQuality());
		Assert.assertNull("Brand is wrong", mediaIntent.getBrand());
		Assert.assertNull("Weight is wrong", mediaIntent.getWeight());
	}

	@Test
	public void testCreateLayoutIntent() {

		// arrange
		final Integer PAGES = 23;
		final String SIDES = UUID.randomUUID().toString();
		final List<Double> FINISHED_DIMENSIONS = new ArrayList<Double>();
		FINISHED_DIMENSIONS.add(4.4d);
		FINISHED_DIMENSIONS.add(6.6d);

		final List<Double> DIMENSIONS = new ArrayList<Double>();
		DIMENSIONS.add(5.5d);
		DIMENSIONS.add(7.7d);

		// act
		LayoutIntent layoutIntent = xJdfNodeFactory.createLayoutIntent(PAGES, SIDES, FINISHED_DIMENSIONS, DIMENSIONS);

		// assert
		Assert.assertEquals("Pages is wrong", PAGES, layoutIntent.getPages());
		Assert.assertEquals("Sides is wrong", SIDES, layoutIntent.getSides());
		Assert.assertEquals("FinishedDimensions is wrong", FINISHED_DIMENSIONS, layoutIntent.getFinishedDimensions());
		Assert.assertEquals("Dimensions is wrong", DIMENSIONS, layoutIntent.getDimensions());
	}

	@Test
	public void testCreateLayoutIntentLight() {

		// arrange
		final Integer PAGES = 23;
		final String SIDES = UUID.randomUUID().toString();
		final List<Double> FINISHED_DIMENSIONS = new ArrayList<Double>();
		FINISHED_DIMENSIONS.add(4.4d);
		FINISHED_DIMENSIONS.add(6.6d);

		// act
		LayoutIntent layoutIntent = xJdfNodeFactory.createLayoutIntent(PAGES, SIDES, FINISHED_DIMENSIONS);

		// assert
		Assert.assertEquals("Pages is wrong", PAGES, layoutIntent.getPages());
		Assert.assertEquals("Sides is wrong", SIDES, layoutIntent.getSides());
		Assert.assertEquals("FinishedDimensions is wrong", FINISHED_DIMENSIONS, layoutIntent.getFinishedDimensions());
		Assert.assertEquals("Dimensions is wrong", 0, layoutIntent.getDimensions().size());
	}

	@Test
	public void testCreateProductionIntent() {

		// arrange
		final String PRINT_PROCESS = UUID.randomUUID().toString();

		// act
		ProductionIntent productionIntent = xJdfNodeFactory.createProductionIntent(PRINT_PROCESS);

		// assert
		Assert.assertEquals("PrintProcess is wrong", PRINT_PROCESS, productionIntent.getPrintProcess());
	}

	@Test
	public void testCreateProofingIntent() {

		// arrange
		final String BRAND_NAME = UUID.randomUUID().toString();

		// act
		ProofingIntent proofingIntent = xJdfNodeFactory.createProofingIntent(BRAND_NAME);

		// assert
		Assert.assertEquals("BrandName is wrong", BRAND_NAME, proofingIntent.getProofItems().get(0).getBrandName());
	}

	@Test
	public void testCreateBindingIntent() {

		// arrange
		final String BINDING_TYPE = UUID.randomUUID().toString();

		// act
		BindingIntent bindingIntent = xJdfNodeFactory.createBindingIntent(BINDING_TYPE);

		// assert
		Assert.assertEquals("BindingType is wrong", BINDING_TYPE, bindingIntent.getBindingType());
	}

	@Test
	public void testCreateFoldingIntent() {

		// arrange
		final String FOLDING_CATALOG = UUID.randomUUID().toString();

		// act
		FoldingIntent foldingIntent = xJdfNodeFactory.createFoldingIntent(FOLDING_CATALOG);

		// assert
		Assert.assertEquals("FoldingCatalog is wrong", FOLDING_CATALOG, foldingIntent.getFoldingCatalog());
	}

	@Test
	public void testCreateColorIntent() {

		// arrange
		final List<Integer> NUM_COLORS = new ArrayList<Integer>();
		NUM_COLORS.add(2);
		NUM_COLORS.add(4);

		final List<String> COLORS_USED = new ArrayList<String>();
		COLORS_USED.add(UUID.randomUUID().toString());
		COLORS_USED.add(UUID.randomUUID().toString());

		final List<String> COLORS_USED_BACK = new ArrayList<String>();
		COLORS_USED_BACK.add(UUID.randomUUID().toString());
		COLORS_USED_BACK.add(UUID.randomUUID().toString());

		final String COATINGS = UUID.randomUUID().toString();
		final String COATINGS_BACK = UUID.randomUUID().toString();

		// act
		ColorIntent colorIntent = xJdfNodeFactory.createColorIntent(NUM_COLORS, COLORS_USED, COLORS_USED_BACK, COATINGS, COATINGS_BACK);

		// assert
		Assert.assertEquals("FoldingCatalog is wrong", NUM_COLORS, colorIntent.getNumColors());
		Assert.assertEquals("ColorsUsed is wrong", COLORS_USED, colorIntent.getColorsUseds());
		Assert.assertEquals("ColorsUsedBack is wrong", COLORS_USED_BACK, colorIntent.getColorsUsedBacks());
		Assert.assertEquals("Coatings is wrong", COATINGS, colorIntent.getCoatings());
		Assert.assertEquals("CoatingsBack is wrong", COATINGS_BACK, colorIntent.getCoatingsBack());
	}

	@Test
	public void testCreateColorIntentLight() {

		// arrange
		final List<Integer> NUM_COLORS = new ArrayList<Integer>();
		NUM_COLORS.add(2);
		NUM_COLORS.add(4);

		// act
		ColorIntent colorIntent = xJdfNodeFactory.createColorIntent(NUM_COLORS);

		// assert
		Assert.assertEquals("FoldingCatalog is wrong", NUM_COLORS, colorIntent.getNumColors());
		Assert.assertEquals("ColorsUsed is wrong", 0, colorIntent.getColorsUseds().size());
		Assert.assertEquals("Coatings is wrong", null, colorIntent.getCoatings());
	}
}
