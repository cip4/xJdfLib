package org.cip4.lib.xjdf.validator.element;

import org.apache.commons.lang3.StringUtils;
import org.cip4.lib.xjdf.schema.FoldingIntent;
import org.cip4.lib.xjdf.validator.Ancestors;
import org.cip4.lib.xjdf.validator.ValidationResult;
import org.cip4.lib.xjdf.validator.ValidationResultBuilder;

/**
 * Extended validation for element //FoldingIntent.
 */
public class FoldingIntentValidator extends SimpleValidator<FoldingIntent> {

    @Override
    public final void validate(
        final FoldingIntent foldingIntent, final Ancestors ancestors, ValidationResultBuilder validationResult
    ) {
        if (StringUtils.isEmpty(foldingIntent.getFoldCatalog())
            && StringUtils.isNotEmpty(foldingIntent.getFoldingDetails())) {
            validationResult.append("@FoldingDetails SHALL NOT be specified if @FoldCatalog is not present");
        }
    }

    @Override
    public boolean canValidate(final Object o) {
        return o instanceof FoldingIntent;
    }

}
