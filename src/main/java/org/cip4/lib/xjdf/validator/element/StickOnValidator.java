package org.cip4.lib.xjdf.validator.element;

import org.cip4.lib.xjdf.schema.StickOn;
import org.cip4.lib.xjdf.validator.Ancestors;
import org.cip4.lib.xjdf.validator.ValidationResultBuilder;

public class StickOnValidator implements Validator<StickOn> {


    @Override
    public void validate(
        final StickOn element, final Ancestors ancestors, final ValidationResultBuilder validationResult
    ) {
        if (null != element.getFace() && null != element.getFolio()) {
            validationResult.append(
                "StickOn/@Face and StickOn/@Folio are mutually exclusive."
            );
        }
    }

    @Override
    public boolean canValidate(final Object o) {
        return o instanceof StickOn;
    }
}
