package org.cip4.lib.xjdf.validator.element;

import org.cip4.lib.xjdf.schema.Intent;
import org.cip4.lib.xjdf.validator.Ancestors;
import org.cip4.lib.xjdf.validator.ValidationResultBuilder;

public class IntentValidator extends SimpleValidator<Intent> {
    @Override
    public void validate(
        final Intent intent, final Ancestors ancestors, ValidationResultBuilder validationResult
    ) {
        if (intent.getProductIntent() != null
            && !intent.getName().equals(intent.getProductIntent().getName().getLocalPart())
            ) {
            validationResult.append(String.format(
                "The name of the element within //Intent SHALL be equal to //Intent/@Name. "
                    + "Found //Intent/@Name='%s' containing element with name '%s'",
                intent.getName(),
                intent.getProductIntent().getName().getLocalPart()
            ));
        }
    }

    @Override
    public boolean canValidate(final Object o) {
        return o instanceof Intent;
    }
}
