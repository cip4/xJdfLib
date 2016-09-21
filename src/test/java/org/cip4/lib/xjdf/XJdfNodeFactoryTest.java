package org.cip4.lib.xjdf;

import org.cip4.lib.xjdf.schema.*;
import org.cip4.lib.xjdf.type.DateTime;
import org.cip4.lib.xjdf.type.Duration;
import org.cip4.lib.xjdf.type.Matrix;
import org.cip4.lib.xjdf.type.Rectangle;
import org.cip4.lib.xjdf.type.URI;
import org.cip4.lib.xjdf.type.XYPair;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.UUID;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * JUnit test case for XJdfNodeFactory.
 */
public class XJdfNodeFactoryTest {

    private XJdfNodeFactory xJdfNodeFactory;

    /**
     * Set up unit test.
     */
    @Before
    public void setUp() throws Exception {
        xJdfNodeFactory = new XJdfNodeFactory();
    }

    /**
     * Tear down unit test.
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
        assertEquals("IDUsage is wrong", ID_USAGE, generalId.getIDUsage());
        assertEquals("IDValue is wrong", ID_VALUE, generalId.getIDValue());
    }

    @Test
    public void testCreateRunList() throws Exception {

        // arrange
        final String FILE_SPEC_URL = UUID.randomUUID().toString();

        // act
        final URI fileSpecUri = new URI(new java.net.URI(FILE_SPEC_URL));
        RunList runList = xJdfNodeFactory.createRunList(fileSpecUri);

        // assert
        assertEquals(
            "Attribute URL in Node FileSpec is wrong",
            fileSpecUri,
            runList.getFileSpec().getURL()
        );
    }

    @Test
    public void testCreateComment() {

        // arrange
        final String COMMENT = UUID.randomUUID().toString();

        // act
        Comment comment = xJdfNodeFactory.createComment(COMMENT);

        // assert
        assertEquals("Comment is wrong", COMMENT, comment.getValue());
    }

    @Test
    public void testCreateApprovalParams() {

        // arrange
        final Integer MIN_APPROVALS = 5;

        // act
        ApprovalParams approvalParams = xJdfNodeFactory.createApprovalParams(MIN_APPROVALS);

        // assert
        assertEquals("MinApprovals is wrong", MIN_APPROVALS, approvalParams.getMinApprovals());
    }

    @Test
    public void testCreateCustomerInfo() {

        // arrange
        final String CUSTOMER_ID = UUID.randomUUID().toString();

        // act
        CustomerInfo customerInfo = xJdfNodeFactory.createCustomerInfo(CUSTOMER_ID);

        // assert
        assertEquals("CustomerID is wrong", CUSTOMER_ID, customerInfo.getCustomerID());
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
        assertEquals("TotalDuration is wrong", TOTAL_DURATION, nodeInfo.getTotalDuration());
        assertEquals("End is wrong", END, nodeInfo.getEnd());
        assertEquals("NaturalLang is wrong", NATURAL_LANG, nodeInfo.getNaturalLang());
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
        assertEquals("MediaQuality is wrong", MEDIA_QUALITY, mediaIntent.getMediaQuality());
        assertEquals("Brand is wrong", BRAND, mediaIntent.getStockBrand());
        assertEquals("Weight is wrong", WEIGHT, mediaIntent.getWeight());
    }

    @Test
    public void testCreateMediaIntentLight() {

        // arrange
        final String MEDIA_QUALITY = UUID.randomUUID().toString();

        // act
        MediaIntent mediaIntent = xJdfNodeFactory.createMediaIntent(MEDIA_QUALITY);

        // assert
        assertEquals("MediaQuality is wrong", MEDIA_QUALITY, mediaIntent.getMediaQuality());
        assertNull("Brand is wrong", mediaIntent.getStockBrand());
        assertNull("Weight is wrong", mediaIntent.getWeight());
    }

    @Test
    public void testCreateProductionIntent() {

        // arrange
        final String PRINT_PROCESS = UUID.randomUUID().toString();

        // act
        ProductionIntent productionIntent = xJdfNodeFactory.createProductionIntent(PRINT_PROCESS);

        // assert
        assertEquals("PrintProcess is wrong", PRINT_PROCESS, productionIntent.getPrintProcess());
    }

    @Test
    public void testCreateBindingIntent() {

		// arrange
		final EnumBindingType BINDING_TYPE = EnumBindingType.CORNER_STITCH;

        // act
        BindingIntent bindingIntent = xJdfNodeFactory.createBindingIntent(BINDING_TYPE);

        // assert
        assertEquals("BindingType is wrong", BINDING_TYPE, bindingIntent.getBindingType());
    }

    @Test
    public void testCreateBindingIntent_2() {

        // arrange
        EnumBindingType bindingType = EnumBindingType.LOOSE_BINDING;
        EnumEdge bindingEdge = EnumEdge.BOTTOM;
        EnumBindingOrder bindingOrder = EnumBindingOrder.GATHERING;


        // act
        BindingIntent bindingIntent = xJdfNodeFactory.createBindingIntent(bindingType, bindingEdge, bindingOrder);

        // assert
        assertEquals("BindingType is wrong", bindingType, bindingIntent.getBindingType());
        assertEquals("BindingType is wrong", EnumEdge.BOTTOM, bindingIntent.getBindingSide());
        assertEquals("BindingType is wrong", EnumBindingOrder.GATHERING, bindingIntent.getBindingOrder());

    }

    @Test
    public void testCreateFoldingIntent() {

        // arrange
        final String FOLDING_CATALOG = UUID.randomUUID().toString();

        // act
        FoldingIntent foldingIntent = xJdfNodeFactory.createFoldingIntent(FOLDING_CATALOG);

        // assert
        assertEquals("FoldingCatalog is wrong", FOLDING_CATALOG, foldingIntent.getFoldingCatalog());
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
        assertEquals("CTM is wrong.", 1d, markObject.getCTM().getD(), 0.0);
        assertEquals("ClipBox is wrong.", 2976.3779527559d, markObject.getClipBox().getUrx(), 0.0);
        assertEquals("Ord is wrong.", new Integer(8), markObject.getOrd());
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
        assertEquals("CTM is wrong.", 1d, contentObject.getCTM().getD(), 0.0);
        assertEquals("ClipBox is wrong.", 2976.3779527559d, contentObject.getClipBox().getUrx(), 0.0);
        assertEquals("Ord is wrong.", new Integer(8), contentObject.getOrd());
        assertEquals("TrimCTM is wrong.", 36.8509397008d, contentObject.getTrimCTM().getTx(), 0.0);
        assertEquals("TrimSize is wrong.", 813.5433070866d, contentObject.getTrimSize().getY(), 0.0);
    }
}
