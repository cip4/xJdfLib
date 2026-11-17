package org.cip4.lib.xjdf.validator.element;

import org.cip4.lib.xjdf.schema.Intent;
import org.cip4.lib.xjdf.validator.Ancestors;
import org.cip4.lib.xjdf.validator.ValidationResultBuilder;

/**
 * Validates that {@code Intent/@Name} matches the name of the contained product intent element.
 */
public class IntentValidator extends SimpleValidator<Intent> {

    /**
     * Creates the validator.
     */
    public IntentValidator() {
    }
    /**
     * Validates the intent.
     *
     * @param intent The element to validate.
     * @param ancestors The ancestors of the element.
     * @param validationResult Collector for violations.
     */
    @Override
    public void validate(
        final Intent intent, final Ancestors ancestors, ValidationResultBuilder validationResult
    ) {
        if (intent.getProductIntent() != null
            && !intent.getName().equals(intent.getProductIntent().getName().getLocalPart())
        ) {
            validationResult.append(String.format(
                "The name of the element within //Intent SHALL be equal to //Intent/@Name. "
                    + "Found //Intent/@Name='%s' containing element with name '%s'",
                intent.getName(),
                intent.getProductIntent().getName().getLocalPart()
            ));
        }
    }

    /**
     * Returns true for {@link Intent} elements.
     *
     * @param o The candidate element.
     *
     * @return True in case the element is an intent.
     */
    @Override
    public boolean canValidate(final Object o) {
        return o instanceof Intent;
    }
}
