package org.cip4.lib.xjdf.validator.element;

import org.cip4.lib.xjdf.validator.Ancestors;
import org.cip4.lib.xjdf.validator.ValidationResultBuilder;

/**
 * Validator for a specific element within an XJDF document.
 *
 * <p>
 * Implementations are discovered automatically and receive every element of the document tree for which
 * {@link #canValidate(Object)} returns true.
 * </p>
 *
 * @param <T> Type of the element within the XJDF document that can be validated.
 */
public interface Validator<T> {

    /**
     * Validates a single element.
     *
     * @param element The element to validate.
     * @param ancestors The ancestors of the element, ordered from root to parent.
     * @param validationResult Collector for the discovered violations.
     */
    void validate(final T element, final Ancestors ancestors, ValidationResultBuilder validationResult);

    /**
     * Returns true in case this validator can validate the given object.
     *
     * @param o The candidate element.
     *
     * @return True in case the element type is supported.
     */
    boolean canValidate(final Object o);
}
