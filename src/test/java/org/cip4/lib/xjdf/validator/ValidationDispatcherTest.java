package org.cip4.lib.xjdf.validator;

import org.cip4.lib.xjdf.schema.ProductList;
import org.cip4.lib.xjdf.schema.XJDF;
import org.cip4.lib.xjdf.validator.element.Validator;
import org.junit.Test;
import org.mockito.Mockito;

public class ValidationDispatcherTest {


    @Test
    public void validateProductList() throws Exception {
        ProductList productList = new ProductList();
        XJDF xjdf = new XJDF().withProductList(productList);

        Validator<ProductList> productListValidator = Mockito.mock(Validator.class);
        Mockito.when(productListValidator.canValidate(xjdf)).thenReturn(false);
        Mockito.when(productListValidator.canValidate(productList)).thenReturn(true);

        ValidationDispatcher dispatcher = new ValidationDispatcher(productListValidator);
        dispatcher.validate(xjdf);
        Mockito.verify(productListValidator).validate(
            Mockito.eq(productList),
            Mockito.eq(new Ancestors(xjdf)),
            Mockito.any(ValidationResultBuilder.class)
        );
    }

}