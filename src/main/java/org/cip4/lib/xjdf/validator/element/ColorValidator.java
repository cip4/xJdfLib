package org.cip4.lib.xjdf.validator.element;

import org.cip4.lib.xjdf.schema.Color;
import org.cip4.lib.xjdf.schema.Part;
import org.cip4.lib.xjdf.schema.Resource;
import org.cip4.lib.xjdf.validator.Ancestors;
import org.cip4.lib.xjdf.validator.ValidationResultBuilder;

/**
 * Validates that every Color resource has a {@code Part/@Separation}.
 */
public class ColorValidator extends SimpleValidator<Color> {

    /**
     * Creates the validator.
     */
    public ColorValidator() {
    }
    /**
     * Validates the color resource.
     *
     * @param color The element to validate.
     * @param ancestors The ancestors of the element.
     * @param validationResult Collector for violations.
     */
    @Override
    public void validate(
        final Color color, final Ancestors ancestors, ValidationResultBuilder validationResult
    ) {
        Resource resource = ancestors.getNearestAncestor(Resource.class);

        if (null == resource) {
            return;
        }

        if (resource.getPart().isEmpty()) {
            validationResult.append(
                "Resource/Part/@Separation SHALL be specified for each ResourceSet[@Name=\"Color\"]/Resource. "
                    + "But there was no Part element at all."
            );
        }

        for (Part part : resource.getPart()) {
            if (null == part.getSeparation()) {
                validationResult.append(
                    "Resource/Part/@Separation SHALL be specified for each ResourceSet[@Name=\"Color\"]/Resource."
                );
            }
        }
    }

    /**
     * Returns true for {@link Color} elements.
     *
     * @param o The candidate element.
     *
     * @return True in case the element is a color resource.
     */
    @Override
    public boolean canValidate(final Object o) {
        return o instanceof Color;
    }
}
