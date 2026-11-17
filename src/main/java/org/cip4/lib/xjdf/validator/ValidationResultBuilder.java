package org.cip4.lib.xjdf.validator;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Collects violations while a document is validated.
 *
 * <p>
 * Validators append violations or nested results to the builder; the dispatcher turns them into an immutable
 * {@link ValidationResult} at the end of the run.
 * </p>
 */
public class ValidationResultBuilder {

    /**
     * Creates the validator.
     */
    public ValidationResultBuilder() {
    }

    private final Collection<ValidationResult> results = new ArrayList<>();

    /**
     * Creates the final validation result.
     *
     * @return The validation result containing all appended violations.
     */
    public final ValidationResult build() {
        return new ValidationResult(results);
    }

    /**
     * Appends a nested validation result.
     *
     * @param validationResult The result to append.
     */
    public final void append(final ValidationResult validationResult) {
        results.add(validationResult);
    }

    /**
     * Appends a single violation message.
     *
     * @param violation The violation message.
     */
    public final void append(final String violation) {
        results.add(new ValidationResult(violation));
    }

}
