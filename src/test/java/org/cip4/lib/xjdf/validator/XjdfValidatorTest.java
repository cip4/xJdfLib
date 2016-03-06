package org.cip4.lib.xjdf.validator;

import org.cip4.lib.xjdf.builder.ProductBuilder;
import org.cip4.lib.xjdf.schema.BindingIntent;
import org.cip4.lib.xjdf.schema.FoldingIntent;
import org.cip4.lib.xjdf.schema.ProductList;
import org.cip4.lib.xjdf.schema.XJDF;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class XjdfValidatorTest {

    @Test
    public void validateExecutesFoldingIntentValidator() throws Exception {
        Validator<FoldingIntent> foldingIntentValidator = Mockito.mock(Validator.class);
        Mockito.when(foldingIntentValidator.validate(Mockito.any(FoldingIntent.class))).thenReturn(
            new ValidationResult(
                "foo"
            )
        );
        XjdfValidator validator = new XjdfValidator(foldingIntentValidator);
        XJDF xjdf = new XJDF();
        ProductBuilder productBuilder = new ProductBuilder();
        productBuilder.addIntent(new FoldingIntent());
        xjdf.withProductList(
            new ProductList().withProduct(
                productBuilder.build()
            )
        );

        ValidationResult result = validator.validate(xjdf);
        Mockito.verify(foldingIntentValidator, Mockito.times(1)).validate(Mockito.any(FoldingIntent.class));
        assertEquals(1, result.getViolations().size());
        assertEquals("foo", result.getViolations().get(0));
    }

    @Test
    public void validateDoesNotExecutesFoldingIntentValidatorWhenNoFoldingIntentPresent() throws Exception {
        Validator<FoldingIntent> foldingIntentValidator = Mockito.mock(Validator.class);
        Mockito.when(foldingIntentValidator.validate(Mockito.any(FoldingIntent.class))).thenReturn(new ValidationResult());
        XjdfValidator validator = new XjdfValidator(foldingIntentValidator);
        XJDF xjdf = new XJDF();
        ProductBuilder productBuilder = new ProductBuilder();
        productBuilder.addIntent(new BindingIntent());
        xjdf.withProductList(
            new ProductList().withProduct(
                productBuilder.build()
            )
        );

        validator.validate(xjdf);
        Mockito.verify(foldingIntentValidator, Mockito.never()).validate(Mockito.any(FoldingIntent.class));
    }
}