package org.cip4.lib.xjdf.validator.element;

import org.cip4.lib.xjdf.schema.DeviceInfo;
import org.cip4.lib.xjdf.schema.FileSpec;
import org.junit.jupiter.api.Test;

import static org.cip4.lib.xjdf.validator.element.ElementValid.isValid;
import static org.hamcrest.MatcherAssert.assertThat;

public class DeviceInfoValidatorTest {

    @Test
    public void validateAllowsNoFileSpec() throws Exception {
        DeviceInfo deviceInfo = new DeviceInfo();
        DeviceInfoValidator validator = new DeviceInfoValidator();

        assertThat(deviceInfo, isValid(validator));
    }

    @Test
    public void validateAllowsSchemaFileSpec() throws Exception {
        DeviceInfo deviceInfo = new DeviceInfo().withFileSpec(new FileSpec().withResourceUsage("Schema"));
        DeviceInfoValidator validator = new DeviceInfoValidator();

        assertThat(deviceInfo, isValid(validator));
    }

    @Test
    public void validateAllowsCurrentSchemaFileSpec() throws Exception {
        DeviceInfo deviceInfo = new DeviceInfo().withFileSpec(new FileSpec().withResourceUsage("CurrentSchema"));
        DeviceInfoValidator validator = new DeviceInfoValidator();

        assertThat(deviceInfo, isValid(validator));
    }

    @Test
    public void validateDisallowsEmptyResourceUsage() throws Exception {
        DeviceInfo deviceInfo = new DeviceInfo().withFileSpec(new FileSpec().withResourceUsage(""));
        DeviceInfoValidator validator = new DeviceInfoValidator();

        ValidationAssertions.assertIsInvalid(validator, deviceInfo);
    }

    @Test
    public void validateDisallowsNullResourceUsage() throws Exception {
        DeviceInfo deviceInfo = new DeviceInfo().withFileSpec(new FileSpec().withResourceUsage(null));
        DeviceInfoValidator validator = new DeviceInfoValidator();

        ValidationAssertions.assertIsInvalid(validator, deviceInfo);
    }

    @Test
    public void validateDisallowsDifferentResourceUsage() throws Exception {
        DeviceInfo deviceInfo = new DeviceInfo().withFileSpec(new FileSpec().withResourceUsage("Foo"));
        DeviceInfoValidator validator = new DeviceInfoValidator();

        ValidationAssertions.assertIsInvalid(validator, deviceInfo);
    }
}