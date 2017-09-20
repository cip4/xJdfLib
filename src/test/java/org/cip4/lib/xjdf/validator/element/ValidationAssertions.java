package org.cip4.lib.xjdf.validator.element;

import org.cip4.lib.xjdf.validator.Ancestors;
import org.cip4.lib.xjdf.validator.ValidationResult;
import org.cip4.lib.xjdf.validator.ValidationResultBuilder;
import static org.cip4.lib.xjdf.validator.element.ElementValid.isValid;
import org.hamcrest.core.StringContains;
import org.junit.Assert;

public class ValidationAssertions {

    public static <T> void assertIsValid(Validator<T> validator, T validElement) {
        assertIsValid(validator, new Ancestors(), validElement);
    }

    public static <T> void assertIsValid(Validator<T> validator, Ancestors ancestors, T validElement) {
        ValidationResultBuilder resultBuilder = new ValidationResultBuilder();
        validator.validate(validElement, ancestors, resultBuilder);
        Assert.assertTrue(resultBuilder.build().isValid());
    }

    public static <T> void assertIsInvalid(final Validator<T> validator, final T invalidElement) {
        assertIsInvalid(validator, new Ancestors(), invalidElement);
    }

    public static <T> void assertIsInvalid(final Validator<T> validator, Ancestors ancestors, final T invalidElement) {
        ValidationResultBuilder resultBuilder = new ValidationResultBuilder();
        validator.validate(invalidElement, ancestors, resultBuilder);
        Assert.assertFalse(resultBuilder.build().isValid());
    }

    public static <T> void assertIsInvalid(final Validator<T> validator, final T invalidElement, String messagePart) {
        assertIsInvalid(validator, new Ancestors(), invalidElement, messagePart);
    }

    public static <T> void assertIsInvalid(
        final Validator<T> validator, Ancestors ancestors, final T invalidElement, String messagePart
    ) {
        ValidationResultBuilder resultBuilder = new ValidationResultBuilder();
        validator.validate(invalidElement, ancestors, resultBuilder);
        ValidationResult result = resultBuilder.build();
        Assert.assertFalse(result.isValid());
        Assert.assertEquals(1, result.getViolations().size());
        Assert.assertThat(result.getViolations().get(0), StringContains.containsString(messagePart));
    }
}
