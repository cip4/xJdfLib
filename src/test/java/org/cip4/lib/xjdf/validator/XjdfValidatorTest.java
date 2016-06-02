package org.cip4.lib.xjdf.validator;

import org.cip4.lib.xjdf.builder.ProductBuilder;
import org.cip4.lib.xjdf.schema.FoldingIntent;
import org.cip4.lib.xjdf.schema.ResourceSet;
import org.cip4.lib.xjdf.schema.ProductList;
import org.cip4.lib.xjdf.schema.XJDF;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class XjdfValidatorTest {

    private Validator acceptAllValidator;

    @Before
    public void setUp() throws Exception {
        acceptAllValidator = Mockito.mock(Validator.class);
        Mockito.when(acceptAllValidator.validate(Mockito.any())).thenReturn(
            new ValidationResult()
        );
    }

    @Test
    public void validateExecutesFoldingIntentValidator() throws Exception {
        Validator<FoldingIntent> foldingIntentValidator = Mockito.mock(Validator.class);
        Mockito.when(foldingIntentValidator.validate(Mockito.any(FoldingIntent.class))).thenReturn(
            new ValidationResult(
                "foo"
            )
        );
        XjdfValidator validator = new XjdfValidator(foldingIntentValidator, acceptAllValidator);
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
    public void validateDoesNotRequireProductList() throws Exception {
        XjdfValidator validator = new XjdfValidator(acceptAllValidator, acceptAllValidator);
        XJDF xjdf = new XJDF();
        xjdf.setProductList(null);

        assertTrue(validator.validate(xjdf).isValid());
    }

    @Test
    public void validateExecutesResourceSetValidator() throws Exception {
        Validator<ResourceSet> parameterSetValidator = Mockito.mock(Validator.class);
        Mockito.when(parameterSetValidator.validate(Mockito.any(ResourceSet.class))).thenReturn(
            new ValidationResult(
                "foo"
            )
        );
        XjdfValidator validator = new XjdfValidator(Mockito.mock(Validator.class), parameterSetValidator);
        XJDF xjdf = new XJDF();
        xjdf.withResourceSet(new ResourceSet());

        ValidationResult result = validator.validate(xjdf);
        Mockito.verify(parameterSetValidator, Mockito.times(1)).validate(Mockito.any(ResourceSet.class));
        assertEquals(1, result.getViolations().size());
        assertEquals("foo", result.getViolations().get(0));
    }

}