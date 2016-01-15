package org.cip4.lib.xjdf.xml.internal;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

public class ValidationResultTest {

    @Test
    public void getMessagesTextIsNullWithoutMessage() throws Exception {
        ValidationResult result = new ValidationResult();
        assertNull(result.getMessagesText());
    }

    @Test
    public void getMessagesTextIsNotNullWithMessage() throws Exception {
        ValidationResult result = new ValidationResult(Collections.singletonList("Foo"));
        assertNotNull(result.getMessagesText());
    }

    @Test
    public void isValidWithoutMessage() throws Exception {
        ValidationResult result = new ValidationResult();
        assertTrue(result.isValid());
    }

    @Test
    public void isNotValidWithMessage() throws Exception {
        ValidationResult result = new ValidationResult(Collections.singletonList("Foo"));
        assertFalse(result.isValid());
    }
}