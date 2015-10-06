package org.cip4.lib.xjdf.util;

import org.cip4.lib.xjdf.schema.ColorIntent;
import org.cip4.lib.xjdf.schema.LayoutIntent;
import org.cip4.lib.xjdf.schema.Product;
import org.junit.Test;
import org.cip4.lib.xjdf.builder.ProductBuilder;

import static org.junit.Assert.*;

public class ProductUtilTest {

    @Test
    public void getIntent() throws Exception {
        ProductBuilder productBuilder = new ProductBuilder();
        ColorIntent colorIntent = new ColorIntent();
        productBuilder.addIntent(new LayoutIntent());
        productBuilder.addIntent(colorIntent);
        Product product = productBuilder.build();

        assertSame(colorIntent, ProductUtil.getIntent(product, ColorIntent.class));
    }

    @Test
    public void getIntentReturnsNull() throws Exception {
        ProductBuilder productBuilder = new ProductBuilder();
        ColorIntent colorIntent = new ColorIntent();
        productBuilder.addIntent(colorIntent);
        Product product = productBuilder.build();

        assertNull(ProductUtil.getIntent(product, LayoutIntent.class));
    }

    @Test
    public void normalize() {
        String str = ProductUtil.normalize("ABCabc0123{³²!!§$.zip");
        assertEquals("ABCabc0123_______.zip", str);
    }
}