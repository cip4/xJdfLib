package org.cip4.lib.xjdf.util;

import org.cip4.lib.xjdf.schema.Resource;
import org.cip4.lib.xjdf.schema.ResourceSet;
import org.cip4.lib.xjdf.schema.SetType;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * This class provides access to Resources within ResourceSets.
 */
public class Resources extends Assets<ResourceSet, Resource> {

    /**
     * Constructor.
     *
     * @param assetSets List of sets of assets to operate on.
     */
    public Resources(final List<SetType> assetSets) {
        super(assetSets);
    }

    @Override
    @NotNull
    final String getAssetName(@NotNull final Resource resource) {
        return resource.getResourceType().getName().getLocalPart();
    }

    @Override
    @NotNull
    final ResourceSet createSet() {
        return new ResourceSet();
    }

    @Override
    final void addAssets(@NotNull final ResourceSet resourceSet, @NotNull final Resource asset) {
        resourceSet.getResource().add(asset);
    }

}
