package org.cip4.lib.xjdf.merger;

import org.cip4.lib.xjdf.schema.Product;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductMergerTest {

    @Test(expected = MergeConflictException.class)
    public void testMerge() throws Exception {
        ProductMerger productMerger = new ProductMerger();
        productMerger.merge(new Product(), new Product());
    }

    @Test
    public void testIsMergeableWrongType() throws Exception {
        ProductMerger productMerger = new ProductMerger();
        assertFalse(productMerger.isMergeable(1, 1));
    }

    @Test
    public void testIsMergeableTrue() throws Exception {
        ProductMerger productMerger = new ProductMerger();
        Product product = new Product().withID("42");
        assertTrue(productMerger.isMergeable(product, product));
    }
}