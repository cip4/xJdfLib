package org.cip4.lib.xjdf.validator;

import org.cip4.lib.xjdf.schema.XJDF;

public class XjdfValidator {

    private ValidationDispatcher validationDispatcher;

    public XjdfValidator() {
        this(
            new ValidationDispatcher(ValidatorLoader.loadedValidators())
        );
    }

    XjdfValidator(final ValidationDispatcher validationDispatcher) {
        this.validationDispatcher = validationDispatcher;
    }

    public ValidationResult validate(XJDF xjdf) {
        return validationDispatcher.validate(xjdf);
    }
}
