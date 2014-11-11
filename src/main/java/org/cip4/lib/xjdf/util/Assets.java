package org.cip4.lib.xjdf.util;

import org.cip4.lib.xjdf.schema.SetType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * This class provides simple access to asset sets.
 *
 * @param <S> the type of the sets
 * @param <A> the type of the assets
 */
public abstract class Assets<S extends SetType, A> {

    /**
     * List of sets of assets to operate on.
     */
    private final List<SetType> assetSets;

    /**
     * Constructor.
     *
     * @param assetSets List of sets of assets to operate on.
     */
    public Assets(@NotNull final List<SetType> assetSets) {
        this.assetSets = assetSets;
    }

    /**
     * Add an asset to the corresponding asset set.
     * This will add a new set to the end of the list if no matching set exsists.
     *
     * @param asset Asset to add
     * @param processUsage Process usage of the asset
     */
    public final void addAsset(@NotNull final A asset, @Nullable final String processUsage) {
        // get parameter name
        String assetName = getAssetName(asset);

        S assetSet = findAssetSet(assetName, processUsage);
        if (null == assetSet) {
            assetSet = createSet();
            assetSet.withName(assetName).withProcessUsage(processUsage);
            assetSets.add(assetSet);
        }
        addAssets(assetSet, asset);
    }

    /**
     * Get the name of an asset.
     *
     * @param asset Asset to get the name of
     *
     * @return Name of the asset
     */
    abstract String getAssetName(@NotNull A asset);

    /**
     * Create a new asset set.
     *
     * @return Empty asset set.
     */
    @NotNull
    abstract S createSet();

    /**
     * Add an asset to its matching set.
     *
     * @param assetSet Set to add the asset to
     * @param asset Asset to add
     */
    abstract void addAssets(@NotNull final S assetSet, @NotNull final A asset);

    /**
     * Find the first assetSet with a given name and processUsage.
     *
     * @param assetName Name of the asset
     * @param processUsage Process usage og the asset
     *
     * @return Matching assetSet or NULL if no matching set was found.
     */
    @Nullable
    @SuppressWarnings("unchecked")
    final S findAssetSet(@NotNull final String assetName, @Nullable final String processUsage) {
        for (SetType assetSet : assetSets) {
            if (assetSet.getName().equals(assetName)
                && (
                (processUsage == null && assetSet.getProcessUsage() == null)
                    || (processUsage != null && processUsage.equals(assetSet.getProcessUsage())))
                ) {
                return (S) assetSet;
            }
        }
        return null;
    }

}
