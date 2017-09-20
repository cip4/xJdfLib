package org.cip4.lib.xjdf.validator.element;

import org.cip4.lib.xjdf.validator.Ancestors;
import org.cip4.lib.xjdf.validator.ValidationResult;
import org.cip4.lib.xjdf.validator.ValidationResultBuilder;

/**
 * Validator for a specific element within an XJDf document.
 *
 * @param <T> Type of the element within the XJDf document that can be validated.
 */
public interface Validator<T> {

    void validate(final T element, final Ancestors ancestors, ValidationResultBuilder validationResult);

    boolean canValidate(final Object o);
}
