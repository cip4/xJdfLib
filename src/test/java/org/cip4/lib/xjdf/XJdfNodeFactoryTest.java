package org.cip4.lib.xjdf;

import junit.framework.Assert;
import org.cip4.lib.xjdf.schema.*;
import org.cip4.lib.xjdf.type.*;
import org.cip4.lib.xjdf.type.Shape;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.UUID;

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
		xJdfNodeFactory = new XJdfNodeFactory();
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
		final Duration TOTAL_DURATION = new Duration(4);
		final DateTime END = new DateTime();
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
		final String uuid = UUID.randomUUID().toString();
		Product childRefProduct = new Product();
		childRefProduct.setID(uuid);
		ChildProduct childProduct = xJdfNodeFactory.createChildProduct(childRefProduct);
		Assert.assertEquals("Childref is wrong", uuid, childProduct.getChildRef().getID());
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
		Assert.assertEquals("Brand is wrong", BRAND, mediaIntent.getStockBrand());
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
		Assert.assertNull("Brand is wrong", mediaIntent.getStockBrand());
		Assert.assertNull("Weight is wrong", mediaIntent.getWeight());
	}

	@Test
	public void testCreateLayoutIntent() {

		// arrange
		final Integer pages = 23;
		final String sides = "OneSided";
		final Shape finishedDimensions = new Shape(4.4, 6.6);
		final XYPair dimensions = new XYPair(5.5, 7.7);

		// act
		LayoutIntent layoutIntent = xJdfNodeFactory.createLayoutIntent(pages, sides, finishedDimensions, dimensions);

		// assert
		Assert.assertEquals("Pages is wrong", pages, layoutIntent.getPrintedPages());
		Assert.assertEquals("Sides is wrong", EnumSides.ONE_SIDED, layoutIntent.getSides());
		Assert.assertEquals("FinishedDimensions is wrong", finishedDimensions, layoutIntent.getFinishedDimensions());
		Assert.assertEquals("Dimensions is wrong", dimensions, layoutIntent.getDimensions());
	}

	@Test
	public void testCreateLayoutIntentLight() {

		// arrange
		final Integer pages = 23;
		final String sides = "OneSided";
		final Shape finishedDimensions = new Shape(4.4, 6.6);

		// act
		LayoutIntent layoutIntent = xJdfNodeFactory.createLayoutIntent(pages, sides, finishedDimensions);

		// assert
		Assert.assertEquals("Pages is wrong", pages, layoutIntent.getPrintedPages());
		Assert.assertEquals("Sides is wrong", EnumSides.ONE_SIDED, layoutIntent.getSides());
		Assert.assertEquals("FinishedDimensions is wrong", finishedDimensions, layoutIntent.getFinishedDimensions());
		Assert.assertEquals("Dimensions is wrong", null, layoutIntent.getDimensions());
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
		Assert.assertEquals("BrandName is wrong", BRAND_NAME, proofingIntent.getProofItem().get(0).getBrandName());
	}

	@Test
	public void testCreateBindingIntent() {

		// arrange
		final EnumBindingType BINDING_TYPE = EnumBindingType.CORNER_STITCH;

		// act
		BindingIntent bindingIntent = xJdfNodeFactory.createBindingIntent(BINDING_TYPE);

		// assert
		Assert.assertEquals("BindingType is wrong", BINDING_TYPE, bindingIntent.getBindingType());
	}

    @Test
    public void testCreateBindingIntent_2() {

        // arrange
        final EnumBindingType BINDING_TYPE = EnumBindingType.LOOSE_BINDING;
        final String BINDING_SIDE = "Bottom";
        final String BINDING_ORDER = "Gathering";


        // act
        BindingIntent bindingIntent = xJdfNodeFactory.createBindingIntent(BINDING_TYPE, BINDING_SIDE, BINDING_ORDER);

        // assert
        Assert.assertEquals("BindingType is wrong", BINDING_TYPE, bindingIntent.getBindingType());
        Assert.assertEquals("BindingType is wrong", EnumEdge.BOTTOM, bindingIntent.getBindingSide());
        Assert.assertEquals("BindingType is wrong", EnumBindingOrder.GATHERING, bindingIntent.getBindingOrder());

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
	public void testCreateColorIntentLight() {

		// arrange
		final IntegerList NUM_COLORS = new IntegerList(2, 4);

		// act
		ColorIntent colorIntent = xJdfNodeFactory.createColorIntent(NUM_COLORS);

		// assert
        List<SurfaceColor> surfaceColors = colorIntent.getSurfaceColor();
        Assert.assertEquals("Number of surface colors is wrong.", 2, surfaceColors.size());

        SurfaceColor colorFront = null;
        SurfaceColor colorBack = null;
        for (SurfaceColor surfaceColor : surfaceColors) {
            if (EnumSurface.FRONT == surfaceColor.getSurface()) {
                colorFront = surfaceColor;
            } else if (EnumSurface.BACK == surfaceColor.getSurface()) {
                colorBack = surfaceColor;
            } else {
                Assert.fail("Surface of SurfaceColor is wrong.");
            }
        }
        Assert.assertNotNull(colorFront);
        Assert.assertNotNull(colorBack);

		Assert.assertEquals("NumColors is wrong for front", NUM_COLORS.get(0), colorFront.getNumColors());
		Assert.assertEquals("FoldingCatalog is wrong", NUM_COLORS.get(1), colorBack.getNumColors());
		Assert.assertEquals("ColorsUsed is wrong for front", 0, colorFront.getColorsUsed().size());
		Assert.assertEquals("Coatings is wrong for front", 0, colorFront.getCoatings().size());
        Assert.assertEquals("ColorsUsed is wrong for back", 0, colorBack.getColorsUsed().size());
		Assert.assertEquals("Coatings is wrong for back", 0, colorBack.getCoatings().size());
	}

	@Test
	public void testMarkObject() {

		// arrange
		final Matrix ctm = new Matrix();
		final Rectangle clipBox = new Rectangle("0.0000 0.0000 2976.3779527559 2125.9842519685");
		final Integer ord = 8;

		// act
		MarkObject markObject = xJdfNodeFactory.createMarkObject(ctm, clipBox, ord);

		// assert
		Assert.assertEquals("CTM is wrong.", 1d, markObject.getCTM().getD());
		Assert.assertEquals("ClipBox is wrong.", 2976.3779527559d, markObject.getClipBox().getUrx());
		Assert.assertEquals("Ord is wrong.", new Integer(8), markObject.getOrd());
	}

	@Test
	public void testContentObject() {

		// arrange
		final Matrix ctm = new Matrix("1 0 0 1 0.0000 0.0000");
		final Rectangle clipBox = new Rectangle("0.0000 0.0000 2976.3779527559 2125.9842519685");
		final Integer ord = 8;
		final Matrix trimCtm = new Matrix("1 0 0 1 36.8509397008 958.1102362205");
		final XYPair trimSize = new XYPair("425.1968503937 813.5433070866");

		// act
		ContentObject contentObject = xJdfNodeFactory.createContentObject(ctm, clipBox, ord, trimCtm, trimSize);

		// assert
		Assert.assertEquals("CTM is wrong.", 1d, contentObject.getCTM().getD());
		Assert.assertEquals("ClipBox is wrong.", 2976.3779527559d, contentObject.getClipBox().getUrx());
		Assert.assertEquals("Ord is wrong.", new Integer(8), contentObject.getOrd());
		Assert.assertEquals("TrimCTM is wrong.", 36.8509397008d, contentObject.getTrimCTM().getTx());
		Assert.assertEquals("TrimSize is wrong.", 813.5433070866d, contentObject.getTrimSize().getY());
	}
}
