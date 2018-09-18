package org.cip4.lib.xjdf.validator.element;

import org.cip4.lib.xjdf.schema.Face;
import org.cip4.lib.xjdf.schema.Glue;
import org.cip4.lib.xjdf.schema.StickOn;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StickOnValidatorTest {

    @Test
    public void canValidateStickOn() {
        assertTrue(
            new StickOnValidator().canValidate(new StickOn())
        );
    }

    @Test
    public void canNotValidateGlue() {
        assertFalse(
            new StickOnValidator().canValidate(new Glue())
        );
    }

    @Test
    public void faceIsAllowed() {
        ValidationAssertions.assertIsValid(
            new StickOnValidator(),
            new StickOn().withFace(Face.FRONT)
        );
    }

    @Test
    public void folioIsAllowed() {
        ValidationAssertions.assertIsValid(
            new StickOnValidator(),
            new StickOn().withFolio(1)
        );
    }

    @Test
    public void folioAndFaceAreOptional() {
        ValidationAssertions.assertIsValid(
            new StickOnValidator(),
            new StickOn()
        );
    }

    @Test
    public void folioAndFaceAreMutuallyExclusive() {
        ValidationAssertions.assertIsInvalid(
            new StickOnValidator(),
            new StickOn().withFace(Face.FRONT).withFolio(2),
            "mutually exclusive"
        );
    }


}