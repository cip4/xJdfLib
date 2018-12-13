package org.cip4.lib.xjdf.validator.element;

import org.cip4.lib.xjdf.schema.Resource;
import org.cip4.lib.xjdf.schema.ResourceInfo;
import org.cip4.lib.xjdf.schema.ResourceSet;
import org.cip4.lib.xjdf.validator.Ancestors;
import org.cip4.lib.xjdf.validator.ValidationResultBuilder;

/**
 * Validator for element ResourceSet.
 */
public class ResourceSetUsageValidator extends SimpleValidator<ResourceSet> {


    @Override
    public void validate(
        final ResourceSet resourceSet, final Ancestors ancestors, ValidationResultBuilder validationResult
    ) {
        if (null != resourceSet.getUsage()) {
            return;
        }

        if (null != resourceSet.getID()) {
            return;
        }

        if (ancestors.parent() instanceof ResourceInfo) {
            return;
        }

        for (Resource resource : resourceSet.getResource()) {
            if (null == resource.getID()) {
                validationResult.append(String.format(
                    "If no @Usage is specified, the ResourceSet or its Resource children SHALL"
                        + " contain @ID and be referenced from elsewhere within the XJDF."
                        + " This rule is violated by ResourceSet[Name=%s]",
                    resourceSet.getName()
                ));
            }
        }
    }

    @Override
    public boolean canValidate(final Object o) {
        return o instanceof ResourceSet;
    }

}
