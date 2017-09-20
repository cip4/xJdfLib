package org.cip4.lib.xjdf.validator.element;

import org.cip4.lib.xjdf.validator.Ancestors;
import org.cip4.lib.xjdf.validator.ValidationResult;
import org.cip4.lib.xjdf.validator.ValidationResultBuilder;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

public class ElementValid<T> extends TypeSafeMatcher<T> {

    private final Validator<T> validator;
    private final Ancestors ancestors;
    private ValidationResult lastValidationResult;

    public ElementValid(final Validator<T> validator, final Ancestors ancestors) {
        this.validator = validator;
        this.ancestors = ancestors;
    }

    public static <T> Matcher isValid(Validator<T> validator) {
        return isValid(validator, new Ancestors());
    }

    public static <T> Matcher isValid(Validator<T> validator, Ancestors ancestors) {
        return new ElementValid<>(validator, ancestors);
    }

    @Override
    protected boolean matchesSafely(final T item) {
        ValidationResultBuilder resultBuilder = new ValidationResultBuilder();
        validator.validate(item, ancestors, resultBuilder);
        lastValidationResult = resultBuilder.build();
        return lastValidationResult.isValid();
    }

    @Override
    protected void describeMismatchSafely(final T item, final Description description) {
        description.appendText("contained violations: ").appendValue(lastValidationResult.getViolations());
    }

    @Override
    public void describeTo(final Description description) {
        description.appendText("valid");
    }

}
