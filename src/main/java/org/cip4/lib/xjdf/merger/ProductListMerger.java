package org.cip4.lib.xjdf.merger;

import org.cip4.lib.xjdf.schema.Product;
import org.cip4.lib.xjdf.schema.ProductList;

/**
 * Class for merging product lists.
 */
class ProductListMerger extends BaseMerger<ProductList> {

    /**
     * Merger to uso for merging product entries.
     */
    private final BaseMerger<Product> productMerger;

    /**
     * Constructor.
     *
     * @param productMerger Merger to use for merging products.
     */
    ProductListMerger(final BaseMerger<Product> productMerger) {
        this.productMerger = productMerger;
    }

    @Override
    void merge(final ProductList baseProductList, final ProductList productList) throws MergeConflictException {
        baseProductList.getComment().addAll(productList.getComment());
        baseProductList.getGeneralID().addAll(productList.getGeneralID());
        baseProductList.setDescriptiveName(productList.getDescriptiveName());
        productMerger.merge(baseProductList.getProduct(), productList.getProduct());
    }

}
