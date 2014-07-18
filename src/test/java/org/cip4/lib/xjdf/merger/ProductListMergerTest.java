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

    @Test
    public void testMergeComment() throws Exception {
        BaseMerger<Product> productMerger = mock(BaseMerger.class);
        ProductListMerger productListMerger = new ProductListMerger(productMerger);

        Comment comment1 = new Comment().withValue("comment1");
        Comment comment2 = new Comment().withValue("comment2");
        ProductList baseProductList = new ProductList();
        baseProductList.withComment(comment1);
        ProductList mergerProductList = new ProductList();
        mergerProductList.withComment(comment2);

        productListMerger.merge(baseProductList, mergerProductList);

        assertEquals(2, baseProductList.getComment().size());
        assertSame(comment1, baseProductList.getComment().get(0));
        assertSame(comment2, baseProductList.getComment().get(1));
    }

    @Test
    public void testMergeGeneralId() throws Exception {
        BaseMerger<Product> productMerger = mock(BaseMerger.class);
        ProductListMerger productListMerger = new ProductListMerger(productMerger);

        GeneralID generalID1 = new GeneralID().withIDUsage("usage1").withIDValue("value1");
        GeneralID generalID2 = new GeneralID().withIDUsage("usage2").withIDValue("value2");
        ProductList baseProductList = new ProductList();
        baseProductList.withGeneralID(generalID1);
        ProductList mergerProductList = new ProductList();
        mergerProductList.withGeneralID(generalID2);

        productListMerger.merge(baseProductList, mergerProductList);

        assertEquals(2, baseProductList.getGeneralID().size());
        assertSame(generalID1, baseProductList.getGeneralID().get(0));
        assertSame(generalID2, baseProductList.getGeneralID().get(1));
    }

    @Test
    public void testMergeDescriptiveName() throws Exception {
        BaseMerger<Product> productMerger = mock(BaseMerger.class);
        ProductListMerger productListMerger = new ProductListMerger(productMerger);

        ProductList baseProductList = new ProductList();
        baseProductList.withDescriptiveName("desc1");
        ProductList mergerProductList = new ProductList();
        mergerProductList.withDescriptiveName("desc2");

        productListMerger.merge(baseProductList, mergerProductList);

        assertEquals("desc2", baseProductList.getDescriptiveName());
    }
}