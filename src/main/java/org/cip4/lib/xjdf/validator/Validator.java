package org.cip4.lib.xjdf.validator;

/**
 * Validator for a specific element within an XJDf document.
 *
 * @param <T> Type of the element within the XJDf document that can be validated.
 */
public interface Validator<T> {

    /**
     * Validate that an element is consistent.
     *
     * @param element Element to validate
     *
     * @return Result fo the validation.
     */
    ValidationResult validate(final T element);
}
