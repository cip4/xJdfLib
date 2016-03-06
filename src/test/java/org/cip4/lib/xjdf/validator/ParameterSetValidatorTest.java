package org.cip4.lib.xjdf.validator;

import org.cip4.lib.xjdf.XJdfNodeFactory;
import org.cip4.lib.xjdf.schema.DeliveryParams;
import org.cip4.lib.xjdf.schema.ParameterSet;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class ParameterSetValidatorTest {

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
    public void validateAllowsParameterOfCorrectName() throws Exception {
        ParameterSet parameterSet = new ParameterSet().withName("DeliveryParams");
        parameterSet.withParameter(xJdfNodeFactory.createParameter(new DeliveryParams()));

        ParameterSetValidator validator = new ParameterSetValidator(acceptAllValidator);

        assertTrue(validator.validate(parameterSet).isValid());
    }

    @Test
    public void validateAllowsSetWithoutParameter() throws Exception {
        ParameterSet parameterSet = new ParameterSet().withName("DeliveryParams");

        ParameterSetValidator validator = new ParameterSetValidator(acceptAllValidator);

        assertTrue(validator.validate(parameterSet).isValid());
    }

    @Test
    public void validateDisallowsParameterOfDifferentName() throws Exception {
        ParameterSet parameterSet = new ParameterSet().withName("PreflightParams");
        parameterSet.withParameter(xJdfNodeFactory.createParameter(new DeliveryParams()));

        ParameterSetValidator validator = new ParameterSetValidator(acceptAllValidator);

        assertFalse(validator.validate(parameterSet).isValid());
    }

    @Test
    public void validateDisallowsNameEmpty() throws Exception {
        ParameterSet parameterSet = new ParameterSet().withName("");

        ParameterSetValidator validator = new ParameterSetValidator(acceptAllValidator);

        assertFalse(validator.validate(parameterSet).isValid());
    }

    @Test
    public void validateDisallowsNameNull() throws Exception {
        ParameterSet parameterSet = new ParameterSet().withName(null);

        ParameterSetValidator validator = new ParameterSetValidator(acceptAllValidator);

        assertFalse(validator.validate(parameterSet).isValid());
    }

    @Test
    public void validateFailsIfDeliveryParamsValidatorFails() throws Exception {
        ParameterSet parameterSet = new ParameterSet().withName("DeliveryParams");
        parameterSet.withParameter(xJdfNodeFactory.createParameter(new DeliveryParams()));

        Validator<DeliveryParams> deliveryParamsValidator = Mockito.mock(Validator.class);
        Mockito.when(deliveryParamsValidator.validate(Mockito.any(DeliveryParams.class))).thenReturn(
            new ValidationResult("foo")
        );

        ParameterSetValidator validator = new ParameterSetValidator(deliveryParamsValidator);

        assertFalse(validator.validate(parameterSet).isValid());
    }
}