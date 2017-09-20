package org.cip4.lib.xjdf.validator.element;

import org.cip4.lib.xjdf.validator.Ancestors;
import org.cip4.lib.xjdf.validator.ValidationResult;
import org.cip4.lib.xjdf.validator.ValidationResultBuilder;

public class CachedValidator<T> implements Validator<T> {

    private ValidationResult validationResult;
    private Validator<T> wrappedValidator;

    public CachedValidator(final ValidationResult validationResult) {
        this.validationResult = validationResult;
    }

    @Override
    public void validate(
        final T element, final Ancestors ancestors, final ValidationResultBuilder resultBuilder
    ) {
        if (validationResult == null) {
            wrappedValidator.validate(element, ancestors, resultBuilder);
        }
    }

    @Override
    public boolean canValidate(final Object o) {
        return false;
    }
}
