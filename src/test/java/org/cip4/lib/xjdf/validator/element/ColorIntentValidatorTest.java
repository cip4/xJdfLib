package org.cip4.lib.xjdf.validator.element;

import org.cip4.lib.xjdf.schema.BindingIntent;
import org.cip4.lib.xjdf.schema.ColorIntent;
import org.cip4.lib.xjdf.schema.Side;
import org.cip4.lib.xjdf.schema.SurfaceColor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColorIntentValidatorTest {

    @Test
    void canValidateColorIntent() {
        ColorIntentValidator validator = new ColorIntentValidator();
        assertTrue(validator.canValidate(new ColorIntent()));
    }

    @Test
    void canNotValidateBindingIntent() {
        ColorIntentValidator validator = new ColorIntentValidator();
        assertFalse(validator.canValidate(new BindingIntent()));
    }

    @Test
    void ColorIntentWithoutSurfaceColorIsValid() {
        ValidationAssertions.assertIsValid(
            new ColorIntentValidator(),
            new ColorIntent()
        );
    }

    @Test
    void ColorIntentWithSingleSurfaceColorIsValid() {
        ValidationAssertions.assertIsValid(
            new ColorIntentValidator(),
            new ColorIntent().withSurfaceColor(new SurfaceColor().withSurface(Side.FRONT))
        );
    }

    @Test
    void ColorIntentWithTwoSurfaceColorIsValid() {
        ValidationAssertions.assertIsValid(
            new ColorIntentValidator(),
            new ColorIntent()
                .withSurfaceColor(new SurfaceColor().withSurface(Side.FRONT))
                .withSurfaceColor(new SurfaceColor().withSurface(Side.BACK))
        );
    }

    @Test
    void ColorIntentWithDuplicateSurfaceIsNotValid() {
        ValidationAssertions.assertIsInvalid(
            new ColorIntentValidator(),
            new ColorIntent()
                .withSurfaceColor(new SurfaceColor().withSurface(Side.FRONT))
                .withSurfaceColor(new SurfaceColor().withSurface(Side.FRONT)),
            "SurfaceColor/@Surface must be unique"
        );
    }
}