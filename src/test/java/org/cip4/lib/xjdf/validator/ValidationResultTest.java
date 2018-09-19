package org.cip4.lib.xjdf.validator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ValidationResultTest {

    @Test
    public void getViolations() {
        ValidationResult validation = new ValidationResult("foo");
        List<String> violations = validation.getViolations();
        assertEquals(1, violations.size());
        assertEquals("foo", violations.get(0));
    }

    @Test
    public void getViolationsDoesNotAllowModifications() {
        ValidationResult validation = new ValidationResult("foo");
        final List<String> violations = validation.getViolations();

        assertThrows(
            UnsupportedOperationException.class,
            new Executable() {
                @Override
                public void execute() {
                    violations.add("bar");
                }
            }
        );
    }

    @Test
    public void isValidWhenNoViolationWasReported() {
        ValidationResult validation = new ValidationResult();
        assertTrue(validation.isValid());
    }

    @Test
    public void isNotValidWhenViolationWasReported() {
        ValidationResult validation = new ValidationResult("foo");
        assertFalse(validation.isValid());
    }

    @Test
    public void append() {
        ValidationResult validation = new ValidationResult();
        List<String> violations = validation.getViolations();
        assertEquals(0, violations.size());
        validation.append(new ValidationResult("foo"));
        assertEquals(1, violations.size());
        assertEquals("foo", violations.get(0));
    }
}