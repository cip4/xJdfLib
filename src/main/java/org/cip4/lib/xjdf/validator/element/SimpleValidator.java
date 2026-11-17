package org.cip4.lib.xjdf.validator.element;

/**
 * Convenience base class for validators that handle exactly one element type.
 *
 * <p>
 * Unlike {@link Validator}, this class has no type parameter for the element, so implementations only need to
 * implement {@link #validate(Object, org.cip4.lib.xjdf.validator.Ancestors, org.cip4.lib.xjdf.validator.ValidationResultBuilder)}
 * and {@link #canValidate(Object)}.
 * </p>
 *
 * @param <T> The element type this validator handles.
 */
public abstract class SimpleValidator<T> implements Validator<T> {

    /**
     * Creates the validator.
     */
    protected SimpleValidator() {
    }

}
