package org.cip4.lib.xjdf.validator.element;

import org.cip4.lib.xjdf.schema.ColorIntent;
import org.cip4.lib.xjdf.validator.Ancestors;
import org.cip4.lib.xjdf.validator.ValidationResultBuilder;

/**
 * Validates that {@code SurfaceColor/@Surface} is unique within a {@code ColorIntent}.
 */
public class ColorIntentValidator implements Validator<ColorIntent> {

    /**
     * Creates the validator.
     */
    public ColorIntentValidator() {
    }
    /**
     * Validates the color intent.
     *
     * @param element The element to validate.
     * @param ancestors The ancestors of the element.
     * @param validationResult Collector for violations.
     */
    @Override
    public void validate(
        final ColorIntent element, final Ancestors ancestors, final ValidationResultBuilder validationResult
    ) {
        if (element.getSurfaceColor().size() == 2) {
            if (element.getSurfaceColor().get(0).getSurface() == element.getSurfaceColor().get(1).getSurface()) {
                validationResult.append("SurfaceColor/@Surface must be unique within each ColorIntent.");
            }
        }
    }

    /**
     * Returns true for {@link ColorIntent} elements.
     *
     * @param o The candidate element.
     *
     * @return True in case the element is a color intent.
     */
    @Override
    public boolean canValidate(final Object o) {
        return o instanceof ColorIntent;
    }
}
