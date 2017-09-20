package org.cip4.lib.xjdf.validator;

import org.cip4.lib.xjdf.schema.XJDF;
import org.cip4.lib.xjdf.validator.element.AssemblingIntentValidator;
import org.cip4.lib.xjdf.validator.element.DeliveryParamsValidator;
import org.cip4.lib.xjdf.validator.element.DeviceInfoValidator;
import org.cip4.lib.xjdf.validator.element.FoldingIntentValidator;
import org.cip4.lib.xjdf.validator.element.IntentValidator;
import org.cip4.lib.xjdf.validator.element.ProductValidator;
import org.cip4.lib.xjdf.validator.element.ResourceSetValidator;

public class XjdfValidator {

    ValidationDispatcher validationDispatcher;

    public XjdfValidator() {
        this(
            new ValidationDispatcher(
                new AssemblingIntentValidator(),
                new DeliveryParamsValidator(),
                new DeviceInfoValidator(),
                new FoldingIntentValidator(),
                new IntentValidator(),
                new ProductValidator(),
                new ResourceSetValidator()
            )
        );
    }

    XjdfValidator(final ValidationDispatcher validationDispatcher) {
        this.validationDispatcher = validationDispatcher;
    }

    public ValidationResult validate(XJDF xjdf) {
        return validationDispatcher.validate(xjdf);
    }
}
