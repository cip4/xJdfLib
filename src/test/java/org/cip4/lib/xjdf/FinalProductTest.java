package org.cip4.lib.xjdf;

import org.cip4.lib.xjdf.schema.*;
import org.cip4.lib.xjdf.xml.XJdfConstants;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FinalProductTest {

    @BeforeEach
    public void init() {
        XJdfConstants.AGENT_NAME = "AGENT_NAME";
        XJdfConstants.AGENT_VERSION = "AGENT_VERSION";
        XJdfConstants.DEVICE_ID = "DEV";
    }

    @Test
    public void simpleProduct_1() throws Exception {

        // arrange
        FinalProduct finalProduct = new FinalProduct(5000, "A5 Flyers");

        finalProduct.addIntent(new LayoutIntent().withBleed(3f));
        finalProduct.addIntent(new FoldingIntent().withFoldCatalog("F6-1"));
        finalProduct.addIntent(new LaminatingIntent().withTexture("Smooth"));

        // act
        XJdfDocument xJdfDocument = new XJdfDocument("JOB_ID", "Product");
        xJdfDocument.addFinalProduct(finalProduct);

        // assert
        System.out.println(xJdfDocument);

        assertEquals(1, xJdfDocument.getXJdf().getProductList().getProduct().size(), "Number of products is wrong.");

        Product product = xJdfDocument.getXJdf().getProductList().getProduct().get(0);
        assertEquals(5000, product.getAmount(), "Amount is wrong.");
        assertEquals("A5 Flyers", product.getDescriptiveName(), "DescName is wrong.");
        assertTrue(product.isIsRoot(), "IsRoot is wrong.");

        assertEquals("FoldingIntent", product.getIntent().get(0).getName(), "IntentName is wrong.");
        assertEquals("LaminatingIntent", product.getIntent().get(1).getName(), "IntentName is wrong.");
        assertEquals("LayoutIntent", product.getIntent().get(2).getName(), "IntentName is wrong.");
    }

}