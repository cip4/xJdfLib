package org.cip4.lib.xjdf.validator;

import org.cip4.lib.xjdf.schema.ProductList;
import org.cip4.lib.xjdf.schema.RefAnchor;
import org.cip4.lib.xjdf.schema.Resource;
import org.cip4.lib.xjdf.schema.VariableIntent;
import org.cip4.lib.xjdf.schema.XJDF;
import org.cip4.lib.xjdf.validator.element.Validator;
import org.hamcrest.collection.IsEmptyIterable;
import org.hamcrest.collection.IsIterableContainingInAnyOrder;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

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
        assertThat(
            dispatcher.getChildElements(refAnchor),
            IsEmptyIterable.emptyIterable()
        );
    }

    @Test
    public void getChildElementsContainsChildElement() throws Exception {
        ProductList productList = new ProductList();
        XJDF xjdf = new XJDF().withProductList(productList);

        ValidationDispatcher dispatcher = new ValidationDispatcher();
        assertThat(
            dispatcher.getChildElements(xjdf),
            IsIterableContainingInAnyOrder.containsInAnyOrder(
                (Object) productList
            )
        );
    }

    @Test
    public void enumHasNoChildElements() throws Exception {
        VariableIntent.VariableType enumValue = VariableIntent.VariableType.AREA;

        ValidationDispatcher dispatcher = new ValidationDispatcher();
        assertThat(
            dispatcher.getChildElements(enumValue),
            IsEmptyIterable.emptyIterable()
        );
    }

    @Test
    public void ignoreChildElementsFromForeignPackages() throws Exception {
        XJDF xjdf = new XJDF().withJobID("JobID");

        ValidationDispatcher dispatcher = new ValidationDispatcher();
        assertThat(
            dispatcher.getChildElements(xjdf),
            IsEmptyIterable.emptyIterable()
        );
    }

    @Test
    public void violationsAreReturned() {
        Validator validator = Mockito.mock(Validator.class);
        Mockito.when(validator.canValidate(Mockito.any())).thenReturn(true);
        Mockito.doAnswer(new Answer() {
            @Override
            public Object answer(final InvocationOnMock invocation) throws Throwable {
                ValidationResultBuilder resultBuilder = invocation.getArgument(2);
                resultBuilder.append("some violation");
                return null;
            }
        }).when(validator).validate(Mockito.any(), Mockito.any(Ancestors.class), Mockito.any(ValidationResultBuilder.class));
        ValidationDispatcher dispatcher = new ValidationDispatcher(validator);
        ValidationResult result = dispatcher.validate(new XJDF());
        assertFalse(result.isValid());
        assertEquals(Collections.singletonList("some violation"), result.getViolations());
    }
}