package org.cip4.lib.xjdf.validator;

import java.util.ArrayList;
import java.util.Collection;

public class ValidationResultBuilder {

    private final Collection<ValidationResult> results = new ArrayList<>();

    public final ValidationResult build() {
        return new ValidationResult(results);
    }

    public final void append(final ValidationResult validationResult) {
        results.add(validationResult);
    }

    public final void append(final String violation) {
        results.add(new ValidationResult(violation));
    }

}
