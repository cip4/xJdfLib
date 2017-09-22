package org.cip4.lib.xjdf.validator;

import org.cip4.lib.xjdf.schema.ProductList;
import org.cip4.lib.xjdf.schema.RefAnchor;
import org.cip4.lib.xjdf.schema.Resource;
import org.cip4.lib.xjdf.schema.VariableIntent;
import org.cip4.lib.xjdf.schema.XJDF;
import org.cip4.lib.xjdf.validator.element.Validator;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

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

    @Test
    public void getChildElementsDoesNotContainRefElements() throws Exception {
        Resource resource = new Resource();
        RefAnchor refAnchor = new RefAnchor().withRRef(resource);

        ValidationDispatcher dispatcher = new ValidationDispatcher();
        assertEquals(Collections.emptyList(), dispatcher.getChildElements(refAnchor));
    }

    @Test
    public void getChildElementsContainsChildElement() throws Exception {
        ProductList productList = new ProductList();
        XJDF xjdf = new XJDF().withProductList(productList);

        ValidationDispatcher dispatcher = new ValidationDispatcher();
        assertEquals(Arrays.asList(productList), dispatcher.getChildElements(xjdf));
    }

    @Test
    public void enumHasNoChildElements() throws Exception {
        VariableIntent.VariableType enumValue =VariableIntent.VariableType.AREA;

        ValidationDispatcher dispatcher = new ValidationDispatcher();
        assertEquals(Collections.emptyList(), dispatcher.getChildElements(enumValue));
    }
}