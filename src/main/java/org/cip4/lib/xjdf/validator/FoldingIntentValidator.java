package org.cip4.lib.xjdf.validator;

import org.apache.commons.lang.StringUtils;
import org.cip4.lib.xjdf.schema.FoldingIntent;

/**
 * Extended validation for element //FoldingIntent.
 */
public class FoldingIntentValidator implements Validator<FoldingIntent> {

    @Override
    public final ValidationResult validate(final FoldingIntent foldingIntent) {
        if (StringUtils.isEmpty(foldingIntent.getFoldingCatalog())
            && StringUtils.isNotEmpty(foldingIntent.getFoldingDetails())) {
            return new ValidationResult("@FoldingDetails SHALL NOT be specified if @FoldCatalog is not present");
        }
        return new ValidationResult();
    }

}
