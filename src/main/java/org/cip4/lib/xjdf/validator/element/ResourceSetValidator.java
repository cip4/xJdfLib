package org.cip4.lib.xjdf.validator.element;

import org.cip4.lib.xjdf.schema.Resource;
import org.cip4.lib.xjdf.schema.ResourceSet;
import org.cip4.lib.xjdf.validator.Ancestors;
import org.cip4.lib.xjdf.validator.ValidationResult;
import org.cip4.lib.xjdf.validator.ValidationResultBuilder;

/**
 * Validator for element ResourceSet.
 */
public class ResourceSetValidator extends SimpleValidator<ResourceSet> {

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

    @Override
    public boolean canValidate(final Object o) {
        return o instanceof ResourceSet;
    }

}
