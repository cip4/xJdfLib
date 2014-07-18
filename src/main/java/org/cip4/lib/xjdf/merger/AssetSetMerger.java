package org.cip4.lib.xjdf.merger;

import org.cip4.lib.xjdf.schema.SetType;

/**
 * Base class for merging asset sets like ParameterSet and ResourceSet.
 *
 * @param <S> Type of the asset set that will be merged.
 */
abstract class AssetSetMerger<S extends SetType> extends BaseMerger<S> {

    @Override
    boolean isMergeable(final Object baseObject, final Object mergeObject) {
        if (!super.isMergeable(baseObject, mergeObject)) {
            return false;
        }
        SetType baseAssetSet = (SetType) baseObject;
        SetType mergeAssetSet = (SetType) mergeObject;
        return (null != baseAssetSet.getName()
            && null != mergeAssetSet.getName()
            && baseAssetSet.getName().equals(mergeAssetSet.getName())
        ) && (baseAssetSet.getID() == null
            || mergeAssetSet.getID() == null
            || baseAssetSet.getID().equals(mergeAssetSet.getID())
        );
    }
}
