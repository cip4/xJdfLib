package org.cip4.lib.xjdf.validator;

import org.cip4.lib.xjdf.schema.Device;
import org.cip4.lib.xjdf.schema.DeviceInfo;
import org.cip4.lib.xjdf.schema.FileSpec;
import org.junit.Test;

import static org.junit.Assert.*;

public class DeviceInfoValidatorTest {

    @Test
    public void validateAllowsNoFileSpec() throws Exception {
        DeviceInfo deviceInfo = new DeviceInfo();
        DeviceInfoValidator validator = new DeviceInfoValidator();

        assertTrue(validator.validate(deviceInfo).isValid());
    }

    @Test
    public void validateAllowsSchemaFileSpec() throws Exception {
        DeviceInfo deviceInfo = new DeviceInfo().withFileSpec(new FileSpec().withResourceUsage("Schema"));
        DeviceInfoValidator validator = new DeviceInfoValidator();

        assertTrue(validator.validate(deviceInfo).isValid());
    }

    @Test
    public void validateAllowsCurrentSchemaFileSpec() throws Exception {
        DeviceInfo deviceInfo = new DeviceInfo().withFileSpec(new FileSpec().withResourceUsage("CurrentSchema"));
        DeviceInfoValidator validator = new DeviceInfoValidator();

        assertTrue(validator.validate(deviceInfo).isValid());
    }

    @Test
    public void validateDisallowsEmptyResourceUsage() throws Exception {
        DeviceInfo deviceInfo = new DeviceInfo().withFileSpec(new FileSpec().withResourceUsage(""));
        DeviceInfoValidator validator = new DeviceInfoValidator();

        assertFalse(validator.validate(deviceInfo).isValid());
    }

    @Test
    public void validateDisallowsNullResourceUsage() throws Exception {
        DeviceInfo deviceInfo = new DeviceInfo().withFileSpec(new FileSpec().withResourceUsage(null));
        DeviceInfoValidator validator = new DeviceInfoValidator();

        assertFalse(validator.validate(deviceInfo).isValid());
    }

    @Test
    public void validateDisallowsDifferentResourceUsage() throws Exception {
        DeviceInfo deviceInfo = new DeviceInfo().withFileSpec(new FileSpec().withResourceUsage("Foo"));
        DeviceInfoValidator validator = new DeviceInfoValidator();

        assertFalse(validator.validate(deviceInfo).isValid());
    }

    @Test
    public void validateAllowsRandomDeviceIDIfNoDeviceGiven() throws Exception {
        DeviceInfo deviceInfo = new DeviceInfo().withDeviceID("Foo");
        DeviceInfoValidator validator = new DeviceInfoValidator();

        assertTrue(validator.validate(deviceInfo).isValid());
    }
}