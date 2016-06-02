package org.cip4.lib.xjdf.merger;

import org.cip4.lib.xjdf.schema.Resource;
import org.cip4.lib.xjdf.schema.ResourceSet;

/**
 * Class for merging resource sets.
 */
class ResourceSetMerger extends BaseMerger<ResourceSet> {

    @Override
    boolean isMergeable(final Object baseObject, final Object mergeObject) {
        if (!super.isMergeable(baseObject, mergeObject)) {
            return false;
        }
        ResourceSet baseResourceSet = (ResourceSet) baseObject;
        ResourceSet mergeResourceSet = (ResourceSet) mergeObject;
        return (null != baseResourceSet.getName()
            && null != mergeResourceSet.getName()
            && baseResourceSet.getName().equals(mergeResourceSet.getName())
        ) && (baseResourceSet.getID() == null
            || mergeResourceSet.getID() == null
            || baseResourceSet.getID().equals(mergeResourceSet.getID())
        );
    }
    
    @Override
    void merge(final ResourceSet baseObject, final ResourceSet mergeObject) {
        for (Resource resource : mergeObject.getResource()) {
            baseObject.getResource().add(resource);
        }
    }

}
