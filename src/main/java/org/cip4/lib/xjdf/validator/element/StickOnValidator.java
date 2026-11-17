package org.cip4.lib.xjdf.validator.element;

import org.cip4.lib.xjdf.schema.StickOn;
import org.cip4.lib.xjdf.validator.Ancestors;
import org.cip4.lib.xjdf.validator.ValidationResultBuilder;

/**
 * Validates that {@code StickOn/@Face} and {@code StickOn/@Folio} are not used together.
 */
public class StickOnValidator implements Validator<StickOn> {

    /**
     * Creates the validator.
     */
    public StickOnValidator() {
    }


    /**
     * Validates the stick-on element.
     *
     * @param element The element to validate.
     * @param ancestors The ancestors of the element.
     * @param validationResult Collector for violations.
     */
    @Override
    public void validate(
        final StickOn element, final Ancestors ancestors, final ValidationResultBuilder validationResult
    ) {
        if (null != element.getFace() && null != element.getFolio()) {
            validationResult.append(
                "StickOn/@Face and StickOn/@Folio are mutually exclusive."
            );
        }
    }

    /**
     * Returns true for {@link StickOn} elements.
     *
     * @param o The candidate element.
     *
     * @return True in case the element is a stick-on element.
     */
    @Override
    public boolean canValidate(final Object o) {
        return o instanceof StickOn;
    }
}
