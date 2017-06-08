package org.cip4.lib.xjdf;

import org.cip4.lib.xjdf.schema.*;
import org.cip4.lib.xjdf.type.DateTime;
import org.cip4.lib.xjdf.type.Duration;
import org.cip4.lib.xjdf.type.URI;
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
        final Float WEIGHT = 3.22f;

        // act
        MediaIntent mediaIntent = xJdfNodeFactory.createMediaIntent(MEDIA_QUALITY, BRAND, WEIGHT);

        // assert
        assertEquals("MediaQuality is wrong", MEDIA_QUALITY, mediaIntent.getMediaQuality());
        assertEquals("Brand is wrong", BRAND, mediaIntent.getBrand());
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
        assertNull("Brand is wrong", mediaIntent.getBrand());
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
    public void testCreateFoldingIntent() {

        // arrange
        final String FOLDING_CATALOG = UUID.randomUUID().toString();

        // act
        FoldingIntent foldingIntent = xJdfNodeFactory.createFoldingIntent(FOLDING_CATALOG);

        // assert
        assertEquals("FoldCatalog is wrong", FOLDING_CATALOG, foldingIntent.getFoldCatalog());
    }

}
