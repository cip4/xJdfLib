package org.cip4.lib.xjdf.merger;

import org.cip4.lib.xjdf.schema.Product;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

public class ProductMergerTest {

    @Test
    public void testMerge() {
        final ProductMerger productMerger = new ProductMerger();
        assertThrows(
            MergeConflictException.class,
            new Executable() {
                @Override
                public void execute() throws Throwable {
                    productMerger.merge(new Product(), new Product());
                }
            }
        );
    }

    @Test
    public void testIsMergeableWrongType() {
        ProductMerger productMerger = new ProductMerger();
        assertFalse(productMerger.isMergeable(1, 1));
    }

    @Test
    public void testIsMergeableTrue() {
        ProductMerger productMerger = new ProductMerger();
        Product product = new Product().withID("42");
        assertTrue(productMerger.isMergeable(product, product));
    }
}