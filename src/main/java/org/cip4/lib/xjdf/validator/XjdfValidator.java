package org.cip4.lib.xjdf.validator;

import org.cip4.lib.xjdf.schema.XJDF;

/**
 * Validates XJDF documents against the rules that are not expressible in the XML schema.
 *
 * <p>
 * The validator walks the whole element tree and applies every discovered
 * {@link org.cip4.lib.xjdf.validator.element.Validator}. It does not check the XML schema; combine it with
 * {@link org.cip4.lib.xjdf.xml.XJdfValidator} for full validation.
 * </p>
 *
 * <pre>{@code
 * ValidationResult result = new XjdfValidator().validate(xjdf);
 * if (!result.isValid()) {
 *     result.getViolations().forEach(System.err::println);
 * }
 * }</pre>
 */
public class XjdfValidator {

    private final ValidationDispatcher validationDispatcher;

    /**
     * Creates a validator with all validators discovered on the classpath.
     */
    public XjdfValidator() {
        this(
            new ValidationDispatcher(ValidatorLoader.loadedValidators())
        );
    }

    XjdfValidator(final ValidationDispatcher validationDispatcher) {
        this.validationDispatcher = validationDispatcher;
    }

    /**
     * Validates an XJDF document and all of its elements.
     *
     * @param xjdf The document to validate.
     *
     * @return The collected violations.
     */
    public ValidationResult validate(XJDF xjdf) {
        return validationDispatcher.validate(xjdf);
    }
}
