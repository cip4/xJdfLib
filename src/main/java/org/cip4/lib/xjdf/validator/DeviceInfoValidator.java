package org.cip4.lib.xjdf.validator;

import org.cip4.lib.xjdf.schema.DeviceInfo;
import org.cip4.lib.xjdf.schema.FileSpec;

import java.util.List;

/**
 * Extended validation for element //FoldingIntent.
 */
public class DeviceInfoValidator implements Validator<DeviceInfo> {

    @Override
    public final ValidationResult validate(final DeviceInfo deviceInfo) {
        ValidationResult result = new ValidationResult();
        validateFileSpec(deviceInfo, result);
        validateIdleStartTime(deviceInfo, result);
        return result;
    }

    /**
     * Validate rules of attribute @IdleStartTime.
     *
     * @param deviceInfo DeviceInfo element to validate.
     * @param validationResult Container validations will be reported to.
     */
    private void validateIdleStartTime(final DeviceInfo deviceInfo, final ValidationResult validationResult) {
        if (null != deviceInfo.getIdleStartTime()) {
            if (null != deviceInfo.getJobPhase() && !deviceInfo.getJobPhase().isEmpty()) {
                validationResult.append(
                    "//DeviceInfo/@IdleStartTime SHALL NOT be specified if JobPhase Elements are present in the "
                        + "DeviceInfo"
                );
            }
        }
    }

    /**
     * Validate that only allowed FileSpec elements appear within the DeviceInfo element.
     *
     * @param deviceInfo DeviceInfo element to validate.
     * @param validationResult Container validations will be reported to.
     */
    private void validateFileSpec(final DeviceInfo deviceInfo, final ValidationResult validationResult) {
        List<FileSpec> fileSpecs = deviceInfo.getFileSpec();
        for (FileSpec fileSpec : fileSpecs) {
            if (!"Schema".equals(fileSpec.getResourceUsage()) && !"CurrentSchema".equals(fileSpec.getResourceUsage())) {
                validationResult.append(String.format(
                    "Element DeviceInfo may only contain FileSpec with @ResourceUsage='Schema', but @ResourceUsage='%s' "
                        + "was given",
                    fileSpec.getResourceUsage()
                ));
            }
        }
    }

}
