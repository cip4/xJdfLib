package org.cip4.lib.xjdf.util;

import org.cip4.lib.xjdf.schema.ColorIntent;
import org.cip4.lib.xjdf.schema.Intent;
import org.cip4.lib.xjdf.schema.LayoutIntent;
import org.cip4.lib.xjdf.schema.ObjectFactory;
import org.cip4.lib.xjdf.schema.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductsTest {

    @Test
    public void getIntent() {
        ColorIntent colorIntent = new ColorIntent();

        Product product = new Product()
            .withIntent(new Intent().withProductIntent(new ObjectFactory().createColorIntent(colorIntent)))
            .withIntent(new Intent().withProductIntent(new ObjectFactory().createLayoutIntent(new LayoutIntent())));

        assertSame(colorIntent, Products.getIntent(product, ColorIntent.class));
    }

    @Test
    public void getIntentReturnsNull() {
        ColorIntent colorIntent = new ColorIntent();

        Product product = new Product()
            .withIntent(new Intent().withProductIntent(new ObjectFactory().createColorIntent(colorIntent)));

        assertNull(Products.getIntent(product, LayoutIntent.class));
    }
}