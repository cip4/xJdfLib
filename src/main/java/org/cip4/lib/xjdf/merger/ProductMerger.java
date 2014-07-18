package org.cip4.lib.xjdf.merger;

import org.cip4.lib.xjdf.schema.Product;

/**
 * Class for merging two product entries.
 */
class ProductMerger extends BaseMerger<Product> {

    @Override
    void merge(final Product baseObject, final Product mergeObject) throws MergeConflictException {
        throw new MergeConflictException("Merging of products is not implemented yet!");
    }

    @Override
    boolean isMergeable(final Object baseObject, final Object mergeObject) {
        if (!(baseObject instanceof Product)
            || !(mergeObject instanceof Product)
            || !super.isMergeable(baseObject, mergeObject)) {
            return false;
        }
        Product baseProduct = (Product) baseObject;
        Product mergeProduct = (Product) mergeObject;
        return null != baseProduct.getID()
            && null != mergeProduct.getID()
            && baseProduct.getID().equals(mergeProduct.getID());
    }
}
