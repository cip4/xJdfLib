package org.cip4.lib.xjdf.validator;

import org.cip4.lib.xjdf.schema.FoldingIntent;
import org.cip4.lib.xjdf.schema.Intent;
import org.cip4.lib.xjdf.schema.Product;
import org.cip4.lib.xjdf.schema.XJDF;

/**
 * Extended validation for element //XJDF.
 */
public class XjdfValidator implements Validator<XJDF> {

    /**
     * Validator for element FoldingIntent.
     */
    private final Validator<FoldingIntent> foldingIntentValidator;

    /**
     * Constructor.
     */
    public XjdfValidator() {
        this(new FoldingIntentValidator());
    }

    /**
     * Constructor.
     *
     * @param foldingIntentValidator Validator for element FoldingIntent.
     */
    public XjdfValidator(final Validator<FoldingIntent> foldingIntentValidator) {
        this.foldingIntentValidator = foldingIntentValidator;
    }

    @Override
    public final ValidationResult validate(final XJDF xjdf) {
        ValidationResult result = new ValidationResult();
        for (Product product : xjdf.getProductList().getProduct()) {
            for (Intent intent : product.getIntent()) {
                if (intent.getIntentType().getValue() instanceof FoldingIntent) {
                    result.append(
                        foldingIntentValidator.validate((FoldingIntent) intent.getIntentType().getValue())
                    );
                }
            }
        }
        return result;
    }

}
