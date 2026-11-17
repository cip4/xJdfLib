package org.cip4.lib.xjdf.validator.element;

import org.cip4.lib.xjdf.schema.FoldingIntent;
import org.junit.jupiter.api.Test;

public class FoldingIntentValidatorTest {

    @Test
    public void validateAllowsFoldingIntentWithoutFoldCatalogOrFoldingDetails() {
        FoldingIntent foldingIntent = new FoldingIntent();
        Validator<FoldingIntent> validator = new FoldingIntentValidator();
        ValidationAssertions.assertIsValid(validator, foldingIntent);
    }

    @Test
    public void validateAllowsFoldingIntentWithFoldCatalogButNoFoldingDetails() {
        FoldingIntent foldingIntent = new FoldingIntent();
        foldingIntent.withFoldCatalog("F4-1");
        Validator<FoldingIntent> validator = new FoldingIntentValidator();
        ValidationAssertions.assertIsValid(validator, foldingIntent);
    }

    @Test
    public void validateAllowsFoldingIntentWithFoldCatalogAndFoldingDetails() {
        FoldingIntent foldingIntent = new FoldingIntent();
        foldingIntent.withFoldCatalog("F4-1");
        foldingIntent.withFoldingDetails("CustomFold4");
        Validator<FoldingIntent> validator = new FoldingIntentValidator();
        ValidationAssertions.assertIsValid(validator, foldingIntent);
    }

    @Test
    public void validateDoesNotAllowsFoldingIntentWithoutFoldCatalogButFoldingDetails() {
        FoldingIntent foldingIntent = new FoldingIntent();
        foldingIntent.withFoldingDetails("CustomFold4");
        Validator<FoldingIntent> validator = new FoldingIntentValidator();
        ValidationAssertions.assertIsInvalid(validator, foldingIntent);
    }

}