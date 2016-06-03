package org.cip4.lib.xjdf.validator;

import org.cip4.lib.xjdf.XJdfNodeFactory;
import org.cip4.lib.xjdf.schema.DeliveryParams;
import org.cip4.lib.xjdf.schema.ResourceSet;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class ResourceSetValidatorTest {

    private XJdfNodeFactory xJdfNodeFactory;
    private Validator acceptAllValidator;

    @Before
    public void setUp() throws Exception {
        xJdfNodeFactory = new XJdfNodeFactory();
        acceptAllValidator = Mockito.mock(Validator.class);
        Mockito.when(acceptAllValidator.validate(Mockito.any())).thenReturn(
            new ValidationResult()
        );
    }

    @Test
    public void validateAllowsResourceOfCorrectName() throws Exception {
        ResourceSet parameterSet = new ResourceSet().withName("DeliveryParams");
        parameterSet.withResource(xJdfNodeFactory.createResource(new DeliveryParams()));

        ResourceSetValidator validator = new ResourceSetValidator(acceptAllValidator);

        assertTrue(validator.validate(parameterSet).isValid());
    }

    @Test
    public void validateAllowsSetWithoutResource() throws Exception {
        ResourceSet parameterSet = new ResourceSet().withName("DeliveryParams");

        ResourceSetValidator validator = new ResourceSetValidator(acceptAllValidator);

        assertTrue(validator.validate(parameterSet).isValid());
    }

    @Test
    public void validateDisallowsResourceOfDifferentName() throws Exception {
        ResourceSet parameterSet = new ResourceSet().withName("PreflightParams");
        parameterSet.withResource(xJdfNodeFactory.createResource(new DeliveryParams()));

        ResourceSetValidator validator = new ResourceSetValidator(acceptAllValidator);

        assertFalse(validator.validate(parameterSet).isValid());
    }

    @Test
    public void validateDisallowsNameEmpty() throws Exception {
        ResourceSet parameterSet = new ResourceSet().withName("");

        ResourceSetValidator validator = new ResourceSetValidator(acceptAllValidator);

        assertFalse(validator.validate(parameterSet).isValid());
    }

    @Test
    public void validateDisallowsNameNull() throws Exception {
        ResourceSet parameterSet = new ResourceSet().withName(null);

        ResourceSetValidator validator = new ResourceSetValidator(acceptAllValidator);

        assertFalse(validator.validate(parameterSet).isValid());
    }

    @Test
    public void validateFailsIfDeliveryParamsValidatorFails() throws Exception {
        ResourceSet parameterSet = new ResourceSet().withName("DeliveryParams");
        parameterSet.withResource(xJdfNodeFactory.createResource(new DeliveryParams()));

        Validator<DeliveryParams> deliveryParamsValidator = Mockito.mock(Validator.class);
        Mockito.when(deliveryParamsValidator.validate(Mockito.any(DeliveryParams.class))).thenReturn(
            new ValidationResult("foo")
        );

        ResourceSetValidator validator = new ResourceSetValidator(deliveryParamsValidator);

        assertFalse(validator.validate(parameterSet).isValid());
    }
}