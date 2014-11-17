package org.cip4.lib.xjdf.util;

import org.cip4.lib.xjdf.XJdfNodeFactory;
import org.cip4.lib.xjdf.comparator.SetTypeComparator;
import org.cip4.lib.xjdf.schema.Part;
import org.cip4.lib.xjdf.schema.SetType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.ListIterator;

/**
 * This class provides simple access to asset sets.
 *
 * @param <S> the type of the sets (e.g. ParameterSet)
 * @param <T> the type of the asset container (e.g. Parameter)
 * @param <U> the type of the asset (e.g. ParameterType)
 */
public abstract class Assets<S extends SetType, T, U> {

    /**
     * List of sets of assets to operate on.
     */
    private final List<? extends SetType> assetSets;

    /**
     * Comparator to use for ordering asset sets.
     */
    private final SetTypeComparator setTypeComparator = new SetTypeComparator();

    /**
     * Factory to use for creating xjdf nodes.
     */
    private final XJdfNodeFactory nodeFactory = new XJdfNodeFactory();

    /**
     * Constructor.
     *
     * @param assetSets List of sets of assets to operate on.
     */
    public Assets(@NotNull final List<? extends SetType> assetSets) {
        this.assetSets = assetSets;
    }

    /**
     * Add an asset to the corresponding asset set.
     * If the corresponding assetSet does not exist it will be created. New assetsSets are added in lexicographic order
     * of their attribute "name" while adding new entries after existing entries with the same "name".
     * This method assumes that the assetSets are already ordered in lexicographic order of their "name"-attributes.
     *
     * @param asset Asset to add
     * @param processUsage Process usage of the asset
     */
    public final void addAsset(@NotNull final T asset, @Nullable final String processUsage) {
        // get parameter name
        String assetName = getAssetName(asset);

        S assetSet = findAssetSet(assetName, processUsage);
        if (null == assetSet) {
            assetSet = createSet();
            assetSet.withName(assetName).withProcessUsage(processUsage);
            addAssetSet(assetSet);
        }
        addAssets(assetSet, asset);
    }

    /**
     * Add an asset to the corresponding asset set.
     *
     * @param assetType Asset to add
     * @param part Partition to add the asset to
     * @param processUsage Process usage of the asset
     * @param <V> Type of the added asset
     */
    public final <V extends U> void addAsset(
        @NotNull final V assetType, @Nullable final Part part, @Nullable final String processUsage
    ) {
        addAsset(createAsset(assetType, part), processUsage);
    }

    /**
     * Wrap an asset type within its asset.
     * (e.g. wrap Media in Resource)
     *
     * @param assetType Asset to wrap
     * @param partition Partition of the asset.
     * @param <V> Type of the asset
     *
     * @return wrapped asset
     */
    @NotNull
    abstract <V extends U> T createAsset(@NotNull final V assetType, @Nullable final Part partition);

    /**
     * Get the name of an asset.
     *
     * @param asset Asset to get the name of
     *
     * @return Name of the asset
     */
    abstract String getAssetName(@NotNull T asset);

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
    abstract void addAssets(@NotNull final S assetSet, @NotNull final T asset);

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

    /**
     * Add an asset set to the known assets.
     * This method will insert the assets in lexicographic order while adding new sets with the same name
     * after existing elements with the same name.
     *
     * @param assetSet Set of assets to add.
     */
    public final void addAssetSet(final S assetSet) {
        ListIterator<? extends SetType> listIterator = assetSets.listIterator();
        while (listIterator.hasNext()) {
            SetType currentSet = listIterator.next();
            if (setTypeComparator.compare(currentSet, assetSet) > 0) {
                if (listIterator.hasPrevious()) {
                    listIterator.previous();
                }
                break;
            }
        }
        ((ListIterator<SetType>) listIterator).add(assetSet);
    }

    /**
     * Getter for the factory for xjdf nodes.
     *
     * @return Factory for creating xjdf nodes.
     */
    @NotNull
    protected final XJdfNodeFactory getNodeFactory() {
        return nodeFactory;
    }

}
