package org.cip4.lib.xjdf.merger;

import org.cip4.lib.xjdf.schema.ParameterSet;
import org.cip4.lib.xjdf.schema.ProductList;
import org.cip4.lib.xjdf.schema.ResourceSet;
import org.cip4.lib.xjdf.schema.XJDF;

import java.util.Collection;

/**
 * Class for merging xjdf documents recursively.
 */
public class XjdfMerger extends BaseMerger<XJDF> {

    /**
     * Merger to use for merging product lists.
     */
    private final BaseMerger<ProductList> productListMerger;

    /**
     * Merger to use for merging resource sets.
     */
    private final BaseMerger<ResourceSet> resourceSetMerger;

    /**
     * Merger to use for merging parameter sets.
     */
    private final BaseMerger<ParameterSet> parameterSetMerger;

    /**
     * Internal constructor for testing purposes.
     * @param productListMerger Merger tu use for merging product lists.
     * @param resourceSetMerger Merger to use for merging reseourcesets.
     * @param parameterSetMerger Merger to use for merging parametersets.
     */
    XjdfMerger(
        final BaseMerger<ProductList> productListMerger,
        final BaseMerger<ResourceSet> resourceSetMerger,
        final BaseMerger<ParameterSet> parameterSetMerger
    ) {
        this.productListMerger = productListMerger;
        this.resourceSetMerger = resourceSetMerger;
        this.parameterSetMerger = parameterSetMerger;
    }

    /**
     * Default constructor.
     */
    public XjdfMerger() {
        productListMerger = new ProductListMerger(new ProductMerger());
        parameterSetMerger = new ParameterSetMerger();
        resourceSetMerger = new ResourceSetMerger();
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
        parameterSetMerger.merge((Collection) baseObject.getParameterSet(), (Collection) mergeObject.getParameterSet());
        resourceSetMerger.merge((Collection) baseObject.getResourceSet(), (Collection) mergeObject.getResourceSet());
    }
}
