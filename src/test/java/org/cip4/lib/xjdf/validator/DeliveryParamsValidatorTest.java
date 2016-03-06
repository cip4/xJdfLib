package org.cip4.lib.xjdf.validator;

import org.cip4.lib.xjdf.schema.DeliveryParams;
import org.cip4.lib.xjdf.schema.FileSpec;
import org.junit.Test;

import static org.junit.Assert.*;

public class DeliveryParamsValidatorTest {

    @Test
    public void validateAllowsSingleOccurrence() throws Exception {
        DeliveryParamsValidator validator = new DeliveryParamsValidator();
        ValidationResult validationResult = validator.validate(
            getDeliveryParams("RemoteURL")
        );
        assertTrue(validationResult.isValid());
    }

    @Test
    public void validateAllowsNoOccurrence() throws Exception {
        DeliveryParamsValidator validator = new DeliveryParamsValidator();
        ValidationResult validationResult = validator.validate(
            getDeliveryParams()
        );
        assertTrue(validationResult.isValid());
    }

    @Test
    public void validateDisallowsDuplicate() throws Exception {
        DeliveryParamsValidator validator = new DeliveryParamsValidator();
        ValidationResult validationResult = validator.validate(
            getDeliveryParams("RemoteURL", "RemoteURL")
        );
        assertFalse(validationResult.isValid());
    }

    @Test
    public void validateDisallowsUnknownResourceUsages() throws Exception {
        DeliveryParamsValidator validator = new DeliveryParamsValidator();
        ValidationResult validationResult = validator.validate(
            getDeliveryParams("SomeInvalidString")
        );
        assertFalse(validationResult.isValid());
    }

    @Test
    public void validateDisallowsEmptyResourceUsage() throws Exception {
        DeliveryParamsValidator validator = new DeliveryParamsValidator();
        ValidationResult validationResult = validator.validate(
            getDeliveryParams("")
        );
        assertFalse(validationResult.isValid());
    }

    @Test
    public void validateDisallowsResourceUsageNull() throws Exception {
        DeliveryParamsValidator validator = new DeliveryParamsValidator();
        ValidationResult validationResult = validator.validate(
            getDeliveryParams(new String[]{null})
        );
        assertFalse(validationResult.isValid());
    }

    private DeliveryParams getDeliveryParams(String... fileSpecResourceUsages) {
        DeliveryParams deliveryParams = new DeliveryParams();
        for (String resourceUsage : fileSpecResourceUsages) {
            deliveryParams.withFileSpec(new FileSpec().withResourceUsage(resourceUsage));
        }
        return deliveryParams;
    }
}