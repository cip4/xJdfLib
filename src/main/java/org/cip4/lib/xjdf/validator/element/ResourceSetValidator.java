package org.cip4.lib.xjdf.validator.element;

import org.cip4.lib.xjdf.schema.Resource;
import org.cip4.lib.xjdf.schema.ResourceSet;
import org.cip4.lib.xjdf.validator.Ancestors;
import org.cip4.lib.xjdf.validator.ValidationResultBuilder;

/**
 * Validates that a resource set has a non-empty name and only contains resources of that type.
 */
public class ResourceSetValidator extends SimpleValidator<ResourceSet> {

    /**
     * Creates the validator.
     */
    public ResourceSetValidator() {
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
        if (null == resourceSet.getName()) {
            validationResult.append("Attribute //ResourceSet/@Name may not be null.");
        } else if ("".equals(resourceSet.getName())) {
            validationResult.append("Attribute //ResourceSet/@Name may not be empty.");
        } else {
            String resourceSetName = resourceSet.getName();
            for (Resource resource : resourceSet.getResource()) {
                if (resource.getSpecificResource() != null) {
                    String resourceName = resource.getSpecificResource().getName().getLocalPart();
                    if (!resourceName.equals(resourceSetName)) {
                        validationResult.append(String.format(
                            "ResourceSet with @Name='%s' may only contain Resources of type '%s', but '%s' was found.",
                            resourceSetName,
                            resourceSetName,
                            resourceName
                        ));
                    }
                }
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
