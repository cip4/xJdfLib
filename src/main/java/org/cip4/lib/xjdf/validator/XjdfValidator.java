package org.cip4.lib.xjdf.validator;

import org.cip4.lib.xjdf.schema.FoldingIntent;
import org.cip4.lib.xjdf.schema.Intent;
import org.cip4.lib.xjdf.schema.Product;
import org.cip4.lib.xjdf.schema.ResourceSet;
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
     * Validator for element ResourceSet.
     */
    private final Validator<ResourceSet> resourceSetValidator;

    /**
     * Constructor.
     */
    public XjdfValidator() {
        this(new FoldingIntentValidator(), new ResourceSetValidator());
    }

    /**
     * Constructor.
     *
     * @param foldingIntentValidator Validator for element FoldingIntent.
     * @param resourceSetValidator Validator for element ResourceSet.
     */
    public XjdfValidator(
        final Validator<FoldingIntent> foldingIntentValidator, final Validator<ResourceSet> resourceSetValidator
    ) {
        this.foldingIntentValidator = foldingIntentValidator;
        this.resourceSetValidator = resourceSetValidator;
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
        for (ResourceSet resourceSet : xjdf.getResourceSet()) {
            result.append(resourceSetValidator.validate(resourceSet));
        }
        return result;
    }

}
