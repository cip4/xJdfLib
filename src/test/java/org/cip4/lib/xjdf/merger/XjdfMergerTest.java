package org.cip4.lib.xjdf.merger;

import org.cip4.lib.xjdf.schema.ResourceSet;
import org.cip4.lib.xjdf.schema.ProductList;
import org.cip4.lib.xjdf.schema.XJDF;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class XjdfMergerTest {

    @Test
    public void testMergeMultiple() throws Exception {
        BaseMerger<ProductList> productListMerger = mock(BaseMerger.class);
        BaseMerger<ResourceSet> resourceSetMerger = mock(BaseMerger.class);
        XjdfMerger merger = new XjdfMerger(productListMerger, resourceSetMerger);

        XJDF resultingXJDf = merger.merge(new XJDF());
        assertNotNull(resultingXJDf);
    }

    @Test
    public void testMergeMinimalXjdf() throws Exception {
        BaseMerger<ProductList> productListMerger = mock(BaseMerger.class);
        BaseMerger<ResourceSet> resourceSetMerger = mock(BaseMerger.class);
        XjdfMerger merger = new XjdfMerger(productListMerger, resourceSetMerger);
        XJDF baseXjdf = new XJDF();
        merger.merge(baseXjdf, new XJDF());
        assertNull(baseXjdf.getProductList());
    }

    @Test
    public void testMergeProductList() throws Exception {
        BaseMerger<ProductList> productListMerger = mock(BaseMerger.class);
        BaseMerger<ResourceSet> resourceSetMerger = mock(BaseMerger.class);
        XjdfMerger merger = new XjdfMerger(productListMerger, resourceSetMerger);
        XJDF baseXjdf = new XJDF();
        baseXjdf.setProductList(new ProductList());
        merger.merge(baseXjdf, new XJDF().withProductList(new ProductList()));
        verify(productListMerger).merge(any(ProductList.class), any(ProductList.class));
    }

    @Test
    public void testMergeNoProductList() throws Exception {
        BaseMerger<ProductList> productListMerger = mock(BaseMerger.class);
        BaseMerger<ResourceSet> resourceSetMerger = mock(BaseMerger.class);
        XjdfMerger merger = new XjdfMerger(productListMerger, resourceSetMerger);
        XJDF baseXjdf = new XJDF();
        merger.merge(baseXjdf, new XJDF());
        assertNull(baseXjdf.getProductList());
    }

    @Test
    public void testMergeSingleProductList() throws Exception {
        BaseMerger<ProductList> productListMerger = mock(BaseMerger.class);
        BaseMerger<ResourceSet> resourceSetMerger = mock(BaseMerger.class);
        XjdfMerger merger = new XjdfMerger(productListMerger, resourceSetMerger);
        XJDF baseXjdf = new XJDF();
        ProductList productList = new ProductList();
        merger.merge(baseXjdf, new XJDF().withProductList(productList));
        assertSame(productList, baseXjdf.getProductList());
    }

    @Test
    public void testConstructor() throws Exception {
        XjdfMerger merger = new XjdfMerger();
        XJDF result = merger.merge(new XJDF());
        assertNotNull(result);
    }

    @Test
    public void testIsMergeableNoIds() throws Exception {
        ResourceSetMerger merger = new ResourceSetMerger();
        ResourceSet baseSet = new ResourceSet();
        baseSet.setName("ColorantControl");
        ResourceSet mergerSet = new ResourceSet();
        mergerSet.setName("ColorantControl");
        assertTrue(merger.isMergeable(baseSet, mergerSet));
    }

    @Test
    public void testIsMergeableBaseWithoutName() throws Exception {
        ResourceSetMerger merger = new ResourceSetMerger();
        ResourceSet baseSet = new ResourceSet();
        ResourceSet mergerSet = new ResourceSet();
        mergerSet.setName("ColorantControl");
        assertFalse(merger.isMergeable(baseSet, mergerSet));
    }

    @Test
    public void testIsMergeableMergeWithoutName() throws Exception {
        ResourceSetMerger merger = new ResourceSetMerger();
        ResourceSet baseSet = new ResourceSet();
        baseSet.setName("ColorantControl");
        ResourceSet mergerSet = new ResourceSet();
        assertFalse(merger.isMergeable(baseSet, mergerSet));
    }

    @Test
    public void testIsMergeableDifferentClasses() throws Exception {
        ResourceSetMerger merger = new ResourceSetMerger();
        ResourceSet baseSet = new ResourceSet();
        baseSet.setName("ColorantControl");
        ResourceSet mergerSet = new ResourceSet();
        baseSet.setName("ColorantControl");
        assertFalse(merger.isMergeable(baseSet, mergerSet));
    }
}