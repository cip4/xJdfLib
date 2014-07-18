package org.cip4.lib.xjdf.merger;

import org.cip4.lib.xjdf.schema.Parameter;
import org.cip4.lib.xjdf.schema.ParameterSet;

/**
 * Class for merging ParameterSets.
 */
class ParameterSetMerger extends AssetSetMerger<ParameterSet> {

    @Override
    void merge(final ParameterSet baseObject, final ParameterSet mergeObject) {
        for (Parameter parameter : mergeObject.getParameter()) {
            baseObject.getParameter().add(parameter);
        }
    }

}
