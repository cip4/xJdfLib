package org.cip4.lib.xjdf.merger;

import org.cip4.lib.xjdf.schema.Comment;
import org.cip4.lib.xjdf.schema.GeneralID;
import org.cip4.lib.xjdf.schema.Product;
import org.cip4.lib.xjdf.schema.ProductList;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


public class ProductListMergerTest {

    @Test
    public void testMerge() throws Exception {
        Product mergeProduct = new Product();
        BaseMerger<Product> productMerger = mock(BaseMerger.class);
        ProductListMerger productListMerger = new ProductListMerger(productMerger);

        ProductList baseProductList = new ProductList();
        ProductList mergerProductList = new ProductList();
        mergerProductList.withProduct(mergeProduct);

        productListMerger.merge(baseProductList, mergerProductList);

        verify(productMerger).merge(baseProductList.getProduct(), mergerProductList.getProduct());
    }
}