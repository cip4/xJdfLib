package org.cip4.lib.xjdf.merger;

import org.cip4.lib.xjdf.schema.Resource;
import org.cip4.lib.xjdf.schema.ResourceSet;

/**
 * Class for merging resource sets.
 */
class ResourceSetMerger extends AssetSetMerger<ResourceSet> {

    @Override
    void merge(final ResourceSet baseObject, final ResourceSet mergeObject) {
        for (Resource resource : mergeObject.getResource()) {
            baseObject.getResource().add(resource);
        }
    }

}
