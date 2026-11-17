package org.cip4.lib.xjdf.validator.element;

import org.apache.commons.lang3.StringUtils;
import org.cip4.lib.xjdf.schema.FoldingIntent;
import org.cip4.lib.xjdf.validator.Ancestors;
import org.cip4.lib.xjdf.validator.ValidationResultBuilder;

/**
 * Validates that {@code @FoldingDetails} is only present when {@code @FoldCatalog} is set.
 */
public class FoldingIntentValidator extends SimpleValidator<FoldingIntent> {

    /**
     * Creates the validator.
     */
    public FoldingIntentValidator() {
    }

    /**
     * Validates the folding intent.
     *
     * @param foldingIntent The element to validate.
     * @param ancestors The ancestors of the element.
     * @param validationResult Collector for violations.
     */
    @Override
    public final void validate(
        final FoldingIntent foldingIntent, final Ancestors ancestors, ValidationResultBuilder validationResult
    ) {
        if (StringUtils.isEmpty(foldingIntent.getFoldCatalog())
            && StringUtils.isNotEmpty(foldingIntent.getFoldingDetails())) {
            validationResult.append("@FoldingDetails SHALL NOT be specified if @FoldCatalog is not present");
        }
    }

    /**
     * Returns true for {@link FoldingIntent} elements.
     *
     * @param o The candidate element.
     *
     * @return True in case the element is a folding intent.
     */
    @Override
    public boolean canValidate(final Object o) {
        return o instanceof FoldingIntent;
    }

}
