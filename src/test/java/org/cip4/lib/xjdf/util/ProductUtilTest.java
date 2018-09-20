package org.cip4.lib.xjdf.util;

import org.cip4.lib.xjdf.schema.ColorIntent;
import org.cip4.lib.xjdf.schema.LayoutIntent;
import org.cip4.lib.xjdf.schema.Product;
import org.junit.jupiter.api.Test;
import org.cip4.lib.xjdf.builder.ProductBuilder;

import static org.junit.jupiter.api.Assertions.*;

public class ProductUtilTest {

    @Test
    public void getIntent() {
        ProductBuilder productBuilder = new ProductBuilder();
        ColorIntent colorIntent = new ColorIntent();
        productBuilder.addIntent(new LayoutIntent());
        productBuilder.addIntent(colorIntent);
        Product product = productBuilder.build();

        assertSame(colorIntent, ProductUtil.getIntent(product, ColorIntent.class));
    }

    @Test
    public void getIntentReturnsNull() {
        ProductBuilder productBuilder = new ProductBuilder();
        ColorIntent colorIntent = new ColorIntent();
        productBuilder.addIntent(colorIntent);
        Product product = productBuilder.build();

        assertNull(ProductUtil.getIntent(product, LayoutIntent.class));
    }
}