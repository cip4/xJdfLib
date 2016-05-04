package org.cip4.lib.xjdf.validator;

import org.cip4.lib.xjdf.schema.DeliveryParams;
import org.cip4.lib.xjdf.schema.Parameter;
import org.cip4.lib.xjdf.schema.ParameterSet;

/**
 * Validator for element ParameterSet.
 */
public class ParameterSetValidator implements Validator<ParameterSet> {

    /**
     * Validator for parameters of type DeliveryParams.
     */
    private final Validator<DeliveryParams> deliveryParamsValidator;

    /**
     * Default constructor.
     */
    public ParameterSetValidator() {
        this(new DeliveryParamsValidator());
    }

    /**
     * Constructor for injecting custom sub validators.
     *
     * @param deliveryParamsValidator Validator for element DeliveryParams.
     */
    public ParameterSetValidator(final Validator<DeliveryParams> deliveryParamsValidator) {
        this.deliveryParamsValidator = deliveryParamsValidator;
    }

    @Override
    public final ValidationResult validate(final ParameterSet parameterSet) {
        ValidationResult result = new ValidationResult();
        if (null == parameterSet.getName()) {
            result.append("Attribute //ParameterSet/@Name may not be null.");
        } else if ("".equals(parameterSet.getName())) {
            result.append("Attribute //ParameterSet/@Name may not be empty.");
        } else {
            String parameterSetName = parameterSet.getName();
            for (Parameter parameter : parameterSet.getParameter()) {
                String parameterName = parameter.getParameterType().getName().getLocalPart();
                if (!parameterName.equals(parameterSetName)) {
                    result.append(String.format(
                        "ParameterSet with @Name='%s' may only contain Parameters of type '%s', but '%s' was found.",
                        parameterSetName,
                        parameterSetName,
                        parameterName
                    ));
                }
            }
            switch (parameterSetName) {
                case "DeliveryParams":
                    for (Parameter parameter : parameterSet.getParameter()) {
                        result.append(
                            deliveryParamsValidator.validate((DeliveryParams) parameter.getParameterType().getValue())
                        );
                    }
                    break;
                default:
            }
        }
        return result;
    }
}
