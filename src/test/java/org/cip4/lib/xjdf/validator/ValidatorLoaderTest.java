package org.cip4.lib.xjdf.validator;

import org.cip4.lib.xjdf.validator.element.Validator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValidatorLoaderTest {

    @Test
    public void findsValidators() {
        Validator[] validators = ValidatorLoader.loadedValidators();

        assertTrue(validators.length > 1);
    }
}