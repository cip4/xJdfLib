package org.cip4.lib.xjdf.util;

import org.cip4.lib.xjdf.schema.Parameter;
import org.cip4.lib.xjdf.schema.ParameterSet;
import org.cip4.lib.xjdf.schema.ParameterType;
import org.cip4.lib.xjdf.schema.Part;
import org.cip4.lib.xjdf.schema.SetType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * This class provides access to Parameters within ParameterSets.
 */
public class Parameters extends Assets<ParameterSet, Parameter, ParameterType> {

    /**
     * Constructor.
     *
     * @param assetSets List of sets of assets to operate on.
     */
    public Parameters(@NotNull final List<? extends SetType> assetSets) {
        super(assetSets);
    }

    @NotNull
    @Override
    <V extends ParameterType> Parameter createAsset(
        @NotNull final V parameterType, @Nullable final Part partition
    ) {
        return getNodeFactory().createParameter(parameterType, partition);
    }

    @Override
    @NotNull final String getAssetName(@NotNull final Parameter parameter) {
        return parameter.getParameterType().getName().getLocalPart();
    }

    @Override
    @NotNull final ParameterSet createSet() {
        return new ParameterSet();
    }

    @Override
    final void addAssets(@NotNull final ParameterSet parameterSet, @NotNull final Parameter asset) {
        parameterSet.getParameter().add(asset);
    }

}
