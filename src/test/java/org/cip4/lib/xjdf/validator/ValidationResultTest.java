package org.cip4.lib.xjdf.validator;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ValidationResultTest {

    @Test
    public void getViolations() throws Exception {
        ValidationResult validation = new ValidationResult("foo");
        List<String> violations = validation.getViolations();
        assertEquals(1, violations.size());
        assertEquals("foo", violations.get(0));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void getViolationsDoesNotAllowModifications() throws Exception {
        ValidationResult validation = new ValidationResult("foo");
        List<String> violations = validation.getViolations();
        violations.add("bar");
    }

    @Test
    public void isValidWhenNoViolationWasReported() throws Exception {
        ValidationResult validation = new ValidationResult();
        assertTrue(validation.isValid());
    }

    @Test
    public void isNotValidWhenViolationWasReported() throws Exception {
        ValidationResult validation = new ValidationResult("foo");
        assertFalse(validation.isValid());
    }

    @Test
    public void append() throws Exception {
        ValidationResult validation = new ValidationResult();
        List<String> violations = validation.getViolations();
        assertEquals(0, violations.size());
        validation.append(new ValidationResult("foo"));
        assertEquals(1, violations.size());
        assertEquals("foo", violations.get(0));
    }
}