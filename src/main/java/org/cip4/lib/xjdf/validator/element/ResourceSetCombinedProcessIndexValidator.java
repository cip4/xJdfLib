package org.cip4.lib.xjdf.validator.element;

import org.cip4.lib.xjdf.schema.ResourceSet;
import org.cip4.lib.xjdf.schema.XJDF;
import org.cip4.lib.xjdf.validator.Ancestors;
import org.cip4.lib.xjdf.validator.ValidationResultBuilder;

import java.util.Collections;

/**
 * Validator for element ResourceSet.
 */
public class ResourceSetCombinedProcessIndexValidator extends SimpleValidator<ResourceSet> {

    @Override
    public void validate(
        final ResourceSet resourceSet, final Ancestors ancestors, ValidationResultBuilder validationResult
    ) {
        if (null == resourceSet.getCombinedProcessIndex()) {
            return;
        }
        XJDF xjdf = ancestors.getNearestAncestor(XJDF.class);
        if (null == xjdf) {
            validationResult.append(
                "@CombinedProcessIndex can't reference XJDF/@Types if there is no parent XJDF."
            );
            return;
        }
        int maxReferencedIndex = Collections.max(resourceSet.getCombinedProcessIndex().getList());
        if (maxReferencedIndex >= xjdf.getTypes().size()) {
            validationResult.append(
                "@CombinedProcessIndex SHALL NOT reference an index bigger than the length of XJDF/@Types"
            );
        }
    }

    @Override
    public boolean canValidate(final Object o) {
        return o instanceof ResourceSet;
    }

}
