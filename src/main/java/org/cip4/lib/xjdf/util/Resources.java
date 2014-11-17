package org.cip4.lib.xjdf.util;

import org.cip4.lib.xjdf.schema.Part;
import org.cip4.lib.xjdf.schema.Resource;
import org.cip4.lib.xjdf.schema.ResourceSet;
import org.cip4.lib.xjdf.schema.ResourceType;
import org.cip4.lib.xjdf.schema.SetType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.UUID;

/**
 * This class provides access to Resources within ResourceSets.
 */
public class Resources extends Assets<ResourceSet, Resource, ResourceType> {

    /**
     * Constructor.
     *
     * @param assetSets List of sets of assets to operate on.
     */
    public Resources(@NotNull final List<? extends SetType> assetSets) {
        super(assetSets);
    }

    @NotNull
    @Override
    <V extends ResourceType> Resource createAsset(
        @NotNull final V resourceType, @Nullable final Part partition
    ) {
        Resource resource = getNodeFactory().createResource(resourceType, partition);
        if (null == resource.getID()) {
            resource.setID(resource.getResourceType().getName().getLocalPart() + "_" + UUID.randomUUID());
        }
        return resource;
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
