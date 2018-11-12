package org.cip4.lib.xjdf.validator.element;

import org.cip4.lib.xjdf.schema.ColorIntent;
import org.cip4.lib.xjdf.validator.Ancestors;
import org.cip4.lib.xjdf.validator.ValidationResultBuilder;

public class ColorIntentValidator implements Validator<ColorIntent> {
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

    @Override
    public boolean canValidate(final Object o) {
        return o instanceof ColorIntent;
    }
}
