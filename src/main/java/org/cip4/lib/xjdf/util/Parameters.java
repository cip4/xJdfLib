package org.cip4.lib.xjdf.util;

import org.cip4.lib.xjdf.schema.Parameter;
import org.cip4.lib.xjdf.schema.ParameterSet;
import org.cip4.lib.xjdf.schema.SetType;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * This class provides access to Parameters within ParameterSets.
 */
public class Parameters extends Assets<ParameterSet, Parameter> {

    /**
     * Constructor.
     *
     * @param assetSets List of sets of assets to operate on.
     */
    public Parameters(@NotNull final List<SetType> assetSets) {
        super(assetSets);
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
