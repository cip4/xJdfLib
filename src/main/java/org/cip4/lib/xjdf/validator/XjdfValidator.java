package org.cip4.lib.xjdf.validator;

import org.cip4.lib.xjdf.schema.FoldingIntent;
import org.cip4.lib.xjdf.schema.Intent;
import org.cip4.lib.xjdf.schema.ParameterSet;
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
     * Validator for element ParameterSet.
     */
    private final Validator<ParameterSet> parameterSetValidator;

    /**
     * Constructor.
     */
    public XjdfValidator() {
        this(new FoldingIntentValidator(), new ParameterSetValidator());
    }

    /**
     * Constructor.
     *
     * @param foldingIntentValidator Validator for element FoldingIntent.
     * @param parameterSetValidator Validator for element ParameterSet.
     */
    public XjdfValidator(
        final Validator<FoldingIntent> foldingIntentValidator, final Validator<ParameterSet> parameterSetValidator
    ) {
        this.foldingIntentValidator = foldingIntentValidator;
        this.parameterSetValidator = parameterSetValidator;
    }

    @Override
    public final ValidationResult validate(final XJDF xjdf) {
        ValidationResult result = new ValidationResult();
        if (null != xjdf.getProductList()) {
            for (Product product : xjdf.getProductList().getProduct()) {
                for (Intent intent : product.getIntent()) {
                    if (intent.getIntentType().getValue() instanceof FoldingIntent) {
                        result.append(
                            foldingIntentValidator.validate((FoldingIntent) intent.getIntentType().getValue())
                        );
                    }
                }
            }
        }
        for (ParameterSet parameterSet : xjdf.getParameterSet()) {
            result.append(parameterSetValidator.validate(parameterSet));
        }
        return result;
    }

}
