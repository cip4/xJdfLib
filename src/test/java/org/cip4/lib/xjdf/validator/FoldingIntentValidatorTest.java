package org.cip4.lib.xjdf.validator;

import org.cip4.lib.xjdf.schema.FoldingIntent;
import org.junit.Test;

import static org.junit.Assert.*;

public class FoldingIntentValidatorTest {

    @Test
    public void validateAllowsFoldingIntentWithoutFoldCatalogOrFoldingDetails() throws Exception {
        FoldingIntent foldingIntent = new FoldingIntent();
        Validator<FoldingIntent> validator = new FoldingIntentValidator();
        assertTrue(validator.validate(foldingIntent).isValid());
    }

    @Test
    public void validateAllowsFoldingIntentWithFoldCatalogButNoFoldingDetails() throws Exception {
        FoldingIntent foldingIntent = new FoldingIntent();
        foldingIntent.withFoldCatalog("F4-1");
        Validator<FoldingIntent> validator = new FoldingIntentValidator();
        assertTrue(validator.validate(foldingIntent).isValid());
    }

    @Test
    public void validateAllowsFoldingIntentWithFoldCatalogAndFoldingDetails() throws Exception {
        FoldingIntent foldingIntent = new FoldingIntent();
        foldingIntent.withFoldCatalog("F4-1");
        foldingIntent.withFoldingDetails("CustomFold4");
        Validator<FoldingIntent> validator = new FoldingIntentValidator();
        assertTrue(validator.validate(foldingIntent).isValid());
    }

    @Test
    public void validateDoesNotAllowsFoldingIntentWithoutFoldCatalogButFoldingDetails() throws Exception {
        FoldingIntent foldingIntent = new FoldingIntent();
        foldingIntent.withFoldingDetails("CustomFold4");
        Validator<FoldingIntent> validator = new FoldingIntentValidator();
        assertFalse(validator.validate(foldingIntent).isValid());
    }

}