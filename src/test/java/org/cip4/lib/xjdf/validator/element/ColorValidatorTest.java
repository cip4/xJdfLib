package org.cip4.lib.xjdf.validator.element;

import org.cip4.lib.xjdf.schema.Color;
import org.cip4.lib.xjdf.schema.ColorIntent;
import org.cip4.lib.xjdf.schema.Part;
import org.cip4.lib.xjdf.schema.Resource;
import org.cip4.lib.xjdf.validator.Ancestors;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ColorValidatorTest {

    @Test
    public void validateColorNotWithinResource() {
        Color color = new Color();

        ColorValidator validator = new ColorValidator();
        ValidationAssertions.assertIsValid(
            validator,
            new Ancestors(),
            color
        );
    }

    @Test
    public void validateColorNotValidIfResourceIsNotPartitionedBySeparation() {
        Color color = new Color();

        ColorValidator validator = new ColorValidator();
        ValidationAssertions.assertIsInvalid(
            validator,
            new Ancestors(new Resource().withPart(new Part())),
            color,
            "Resource/Part/@Separation SHALL be specified"
        );
    }

    @Test
    public void validateColorNotValidIfResourceIsNotPartitioned() {
        Color color = new Color();

        ColorValidator validator = new ColorValidator();
        ValidationAssertions.assertIsInvalid(
            validator,
            new Ancestors(new Resource()),
            color,
            "Resource/Part/@Separation SHALL be specified"
        );
    }

    @Test
    public void canValidateColor() {
        ColorValidator validator = new ColorValidator();
        Color color = new Color();

        assertTrue(validator.canValidate(color));
    }

    @Test
    public void canNotValidateColorIntent() {
        ColorValidator validator = new ColorValidator();
        ColorIntent colorIntent = new ColorIntent();

        assertFalse(validator.canValidate(colorIntent));
    }
}