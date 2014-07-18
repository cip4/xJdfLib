package org.cip4.lib.xjdf.merger;

import org.cip4.lib.xjdf.schema.ProductList;
import org.cip4.lib.xjdf.schema.SetType;
import org.cip4.lib.xjdf.schema.XJDF;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Class for merging xjdf documents recursively.
 */
public class XjdfMerger extends BaseMerger<XJDF> {

    /**
     * Merger to use for merging product lists.
     */
    private final BaseMerger<ProductList> productListMerger;

    /**
     * Merger to use for merging asset sets.
     */
    private final JAXBElementMerger<? extends SetType> assetSetMerger;

    /**
     * Internal constructor for testing purposes.
     *
     * @param productListMerger Merger tu use for merging product lists.
     * @param assetSetMerger Merger to use for merging asset sets.
     */
    XjdfMerger(
        final BaseMerger<ProductList> productListMerger, final JAXBElementMerger<? extends SetType> assetSetMerger
    ) {
        this.productListMerger = productListMerger;
        this.assetSetMerger = assetSetMerger;
    }

    /**
     * Default constructor.
     */
    public XjdfMerger() {
        this.productListMerger = new ProductListMerger(new ProductMerger());
        List<BaseMerger<? extends SetType>> assetSetMergers = new ArrayList<>(2);
        assetSetMergers.add(new ParameterSetMerger());
        assetSetMergers.add(new ResourceSetMerger());
        CombinedMerger<? extends SetType> internalAssetSetMerger = new CombinedMerger<>(assetSetMergers);
        assetSetMerger = new JAXBElementMerger<>(internalAssetSetMerger);
    }

    /**
     * Merge one xjdf document into another one.
     * During the merge process all xjdfs will be merged sequentially.
     * Values from latter xjdf documents will be added if possible or overwrite existing values.
     *
     * @param xjdfs XJDF documents to merge.
     *
     * @return merged XJDF document.
     * @throws MergeConflictException if merging fails.
     */
    public final XJDF merge(final XJDF... xjdfs) throws MergeConflictException {
        XJDF resultingXjdf = new XJDF();
        for (XJDF xjdf : xjdfs) {
            merge(resultingXjdf, xjdf);
        }
        return resultingXjdf;
    }

    @Override
    @SuppressWarnings("unchecked")
    final void merge(final XJDF baseObject, final XJDF mergeObject) throws MergeConflictException {
        if (null != mergeObject.getProductList()) {
            if (null == baseObject.getProductList()) {
                baseObject.setProductList(mergeObject.getProductList());
            } else {
                productListMerger.merge(baseObject.getProductList(), mergeObject.getProductList());
            }
        }
        baseObject.getGeneralID().addAll(mergeObject.getGeneralID());
        assetSetMerger.merge((Collection) baseObject.getSetType(), (Collection) mergeObject.getSetType());
    }
}
