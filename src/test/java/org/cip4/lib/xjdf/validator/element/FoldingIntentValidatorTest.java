package org.cip4.lib.xjdf.validator.element;

import org.cip4.lib.xjdf.schema.FoldingIntent;
import org.cip4.lib.xjdf.validator.element.FoldingIntentValidator;
import org.cip4.lib.xjdf.validator.element.Validator;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.cip4.lib.xjdf.validator.element.ElementValid.isValid;

public class FoldingIntentValidatorTest {

    @Test
    public void validateAllowsFoldingIntentWithoutFoldCatalogOrFoldingDetails() throws Exception {
        FoldingIntent foldingIntent = new FoldingIntent();
        Validator<FoldingIntent> validator = new FoldingIntentValidator();
        assertThat(foldingIntent, isValid(validator));
    }

    @Test
    public void validateAllowsFoldingIntentWithFoldCatalogButNoFoldingDetails() throws Exception {
        FoldingIntent foldingIntent = new FoldingIntent();
        foldingIntent.withFoldCatalog("F4-1");
        Validator<FoldingIntent> validator = new FoldingIntentValidator();
        assertThat(foldingIntent, isValid(validator));
    }

    @Test
    public void validateAllowsFoldingIntentWithFoldCatalogAndFoldingDetails() throws Exception {
        FoldingIntent foldingIntent = new FoldingIntent();
        foldingIntent.withFoldCatalog("F4-1");
        foldingIntent.withFoldingDetails("CustomFold4");
        Validator<FoldingIntent> validator = new FoldingIntentValidator();
        assertThat(foldingIntent, isValid(validator));
    }

    @Test
    public void validateDoesNotAllowsFoldingIntentWithoutFoldCatalogButFoldingDetails() throws Exception {
        FoldingIntent foldingIntent = new FoldingIntent();
        foldingIntent.withFoldingDetails("CustomFold4");
        Validator<FoldingIntent> validator = new FoldingIntentValidator();
        ValidationAssertions.assertIsInvalid(validator, foldingIntent);
    }

}