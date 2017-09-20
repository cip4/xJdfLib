package org.cip4.lib.xjdf.validator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Result of a validation run.
 */
public class ValidationResult {

    /**
     * List of discovered violations.
     */
    private final List<String> violations = new ArrayList<>();

    /**
     * Constructor.
     *
     * @param violations Validation violations
     */
    public ValidationResult(final String... violations) {
        this.violations.addAll(Arrays.asList(violations));
    }

    public ValidationResult(final Collection<ValidationResult> results) {
        for (ValidationResult validationResult : results) {
            append(validationResult);
        }
    }

    /**
     * Get discovered violations.
     *
     * @return Reported violations.
     */
    public final List<String> getViolations() {
        return Collections.unmodifiableList(violations);
    }

    /**
     * Check if the validation was successful.
     *
     * @return true if the document is valid, false otherwise.
     */
    public final boolean isValid() {
        return violations.isEmpty();
    }

    /**
     * Append additional violations to the report.
     *
     * @param validationResult Additional violations.
     */
    final void append(final ValidationResult validationResult) {
        violations.addAll(validationResult.violations);
    }

    /**
     * Append an violation to the report.
     *
     * @param violation Additional violation
     */
    final void append(final String violation) {
        violations.add(violation);
    }
}