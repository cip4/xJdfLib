package org.cip4.lib.xjdf.validator;

import org.cip4.lib.xjdf.schema.DeliveryParams;
import org.cip4.lib.xjdf.schema.Resource;
import org.cip4.lib.xjdf.schema.ResourceSet;

/**
 * Validator for element ResourceSet.
 */
public class ResourceSetValidator implements Validator<ResourceSet> {

    /**
     * Validator for resources of type DeliveryParams.
     */
    private final Validator<DeliveryParams> deliveryParamsValidator;

    /**
     * Default constructor.
     */
    public ResourceSetValidator() {
        this(new DeliveryParamsValidator());
    }

    /**
     * Constructor for injecting custom sub validators.
     *
     * @param deliveryParamsValidator Validator for element DeliveryParams.
     */
    public ResourceSetValidator(final Validator<DeliveryParams> deliveryParamsValidator) {
        this.deliveryParamsValidator = deliveryParamsValidator;
    }

    @Override
    public final ValidationResult validate(final ResourceSet resourceSet) {
        ValidationResult result = new ValidationResult();
        if (null == resourceSet.getName()) {
            result.append("Attribute //ResourceSet/@Name may not be null.");
        } else if ("".equals(resourceSet.getName())) {
            result.append("Attribute //ResourceSet/@Name may not be empty.");
        } else {
            String resourceSetName = resourceSet.getName();
            for (Resource resource : resourceSet.getResource()) {
                String resourceName = resource.getSpecificResource().getName().getLocalPart();
                if (!resourceName.equals(resourceSetName)) {
                    result.append(String.format(
                        "ResourceSet with @Name='%s' may only contain Resources of type '%s', but '%s' was found.",
                        resourceSetName,
                        resourceSetName,
                        resourceName
                    ));
                }
            }
            switch (resourceSetName) {
                case "DeliveryParams":
                    for (Resource resource : resourceSet.getResource()) {
                        result.append(
                            deliveryParamsValidator.validate((DeliveryParams) resource.getSpecificResource().getValue())
                        );
                    }
                    break;
                default:
            }
        }
        return result;
    }
}
