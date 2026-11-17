package org.cip4.lib.xjdf.validator.element;

import org.cip4.lib.xjdf.schema.Resource;
import org.cip4.lib.xjdf.schema.ResourceInfo;
import org.cip4.lib.xjdf.schema.ResourceSet;
import org.cip4.lib.xjdf.validator.Ancestors;
import org.cip4.lib.xjdf.validator.ValidationResultBuilder;

/**
 * Validates that a resource set without {@code @Usage} is referenced by ID.
 *
 * <p>
 * If no {@code @Usage} is specified, the resource set or its resources must have an ID and be referenced from
 * elsewhere in the document. Resource sets inside a {@code ResourceInfo} are exempt.
 * </p>
 */
public class ResourceSetUsageValidator extends SimpleValidator<ResourceSet> {

    /**
     * Creates the validator.
     */
    public ResourceSetUsageValidator() {
    }


    /**
     * Validates the resource set.
     *
     * @param resourceSet The element to validate.
     * @param ancestors The ancestors of the element.
     * @param validationResult Collector for violations.
     */
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

    /**
     * Returns true for {@link ResourceSet} elements.
     *
     * @param o The candidate element.
     *
     * @return True in case the element is a resource set.
     */
    @Override
    public boolean canValidate(final Object o) {
        return o instanceof ResourceSet;
    }

}
