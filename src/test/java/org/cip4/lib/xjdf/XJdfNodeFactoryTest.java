package org.cip4.lib.xjdf;

import org.cip4.lib.xjdf.schema.*;
import org.cip4.lib.xjdf.type.DateTime;
import org.cip4.lib.xjdf.type.Duration;
import org.cip4.lib.xjdf.type.URI;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * JUnit test case for XJdfNodeFactory.
 */
public class XJdfNodeFactoryTest {

    private XJdfNodeFactory xJdfNodeFactory;

    /**
     * Set up unit test.
     */
    @BeforeEach
    public void setUp() throws Exception {
        xJdfNodeFactory = new XJdfNodeFactory();
    }

    /**
     * Tear down unit test.
     */
    @AfterEach
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
        assertEquals(ID_USAGE, generalId.getIDUsage(), "IDUsage is wrong");
        assertEquals(ID_VALUE, generalId.getIDValue(), "IDValue is wrong");
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
            fileSpecUri,
            runList.getFileSpec().getURL(),
            "Attribute URL in Node FileSpec is wrong"
        );
    }

    @Test
    public void testCreateComment() {

        // arrange
        final String COMMENT = UUID.randomUUID().toString();

        // act
        Comment comment = xJdfNodeFactory.createComment(COMMENT);

        // assert
        assertEquals(COMMENT, comment.getValue(), "Comment is wrong");
    }

    @Test
    public void testCreateCustomerInfo() {

        // arrange
        final String CUSTOMER_ID = UUID.randomUUID().toString();

        // act
        CustomerInfo customerInfo = xJdfNodeFactory.createCustomerInfo(CUSTOMER_ID);

        // assert
        assertEquals(CUSTOMER_ID, customerInfo.getCustomerID(), "CustomerID is wrong");
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
        assertEquals(TOTAL_DURATION, nodeInfo.getTotalDuration(), "TotalDuration is wrong");
        assertEquals(END, nodeInfo.getEnd(), "End is wrong");
        assertEquals(NATURAL_LANG, nodeInfo.getNaturalLang(), "NaturalLang is wrong");
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
        assertEquals(MEDIA_QUALITY, mediaIntent.getMediaQuality(), "MediaQuality is wrong");
        assertEquals(BRAND, mediaIntent.getBrand(), "Brand is wrong");
        assertEquals(WEIGHT, mediaIntent.getWeight(), "Weight is wrong");
    }

    @Test
    public void testCreateMediaIntentLight() {

        // arrange
        final String MEDIA_QUALITY = UUID.randomUUID().toString();

        // act
        MediaIntent mediaIntent = xJdfNodeFactory.createMediaIntent(MEDIA_QUALITY);

        // assert
        assertEquals(MEDIA_QUALITY, mediaIntent.getMediaQuality(), "MediaQuality is wrong");
        assertNull(mediaIntent.getBrand(), "Brand is wrong");
        assertNull(mediaIntent.getWeight(), "Weight is wrong");
    }

    @Test
    public void testCreateProductionIntent() {

        // arrange
        final String PRINT_PROCESS = UUID.randomUUID().toString();

        // act
        ProductionIntent productionIntent = xJdfNodeFactory.createProductionIntent(PRINT_PROCESS);

        // assert
        assertEquals(PRINT_PROCESS, productionIntent.getPrintProcess(), "PrintProcess is wrong");
    }

    @Test
    public void testCreateFoldingIntent() {

        // arrange
        final String FOLDING_CATALOG = UUID.randomUUID().toString();

        // act
        FoldingIntent foldingIntent = xJdfNodeFactory.createFoldingIntent(FOLDING_CATALOG);

        // assert
        assertEquals(FOLDING_CATALOG, foldingIntent.getFoldCatalog(), "FoldCatalog is wrong");
    }

}
