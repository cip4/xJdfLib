package org.cip4.lib.xjdf.validator;

import org.cip4.lib.xjdf.schema.FoldingIntent;
import org.junit.Test;

import static org.junit.Assert.*;

public class FoldingIntentValidatorTest {

    @Test
    public void validateAllowsFoldingIntentWithoutFoldingCatalogOrFoldingDetails() throws Exception {
        FoldingIntent foldingIntent = new FoldingIntent();
        Validator<FoldingIntent> validator = new FoldingIntentValidator();
        assertTrue(validator.validate(foldingIntent).isValid());
    }

    @Test
    public void validateAllowsFoldingIntentWithFoldingCatalogButNoFoldingDetails() throws Exception {
        FoldingIntent foldingIntent = new FoldingIntent();
        foldingIntent.withFoldingCatalog("F4-1");
        Validator<FoldingIntent> validator = new FoldingIntentValidator();
        assertTrue(validator.validate(foldingIntent).isValid());
    }

    @Test
    public void validateAllowsFoldingIntentWithFoldingCatalogAndFoldingDetails() throws Exception {
        FoldingIntent foldingIntent = new FoldingIntent();
        foldingIntent.withFoldingCatalog("F4-1");
        foldingIntent.withFoldingDetails("CustomFold4");
        Validator<FoldingIntent> validator = new FoldingIntentValidator();
        assertTrue(validator.validate(foldingIntent).isValid());
    }

    @Test
    public void validateDoesNotAllowsFoldingIntentWithoutFoldingCatalogButFoldingDetails() throws Exception {
        FoldingIntent foldingIntent = new FoldingIntent();
        foldingIntent.withFoldingDetails("CustomFold4");
        Validator<FoldingIntent> validator = new FoldingIntentValidator();
        assertFalse(validator.validate(foldingIntent).isValid());
    }

}