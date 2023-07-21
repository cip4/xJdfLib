package org.cip4.lib.xjdf.util;

import org.apache.commons.lang3.StringUtils;
import org.cip4.lib.xjdf.schema.Header;
import org.cip4.lib.xjdf.type.DateTime;
import org.cip4.lib.xjdf.XJdfConstants;

/**
 * Headers utility class providing creation functionality.
 */
public class Headers {

    /**
     * Private constructor for utility class.
     */
    private Headers() {
    }

    /**
     * Helper method to create a default header.
     * @return The default header.
     */
    public static Header createDefaultHeader() {

        if(StringUtils.isEmpty(XJdfConstants.DEVICE_ID)) {
            throw new IllegalArgumentException("Constant 'XJdfConstants.DEVICE_ID' is not defined. Please ensure that DEVICE_ID, AGENT_NAME, and AGENT_VERSION is set properly.");
        }

        if(StringUtils.isEmpty(XJdfConstants.AGENT_NAME)) {
            throw new IllegalArgumentException("Constant 'XJdfConstants.AGENT_NAME' is not defined. Please ensure that DEVICE_ID, AGENT_NAME, and AGENT_VERSION is set properly.");
        }

        if(StringUtils.isEmpty(XJdfConstants.AGENT_VERSION)) {
            throw new IllegalArgumentException("Constant 'XJdfConstants.AGENT_VERSION' is not defined. Please ensure that DEVICE_ID, AGENT_NAME, and AGENT_VERSION is set properly.");
        }

        return new Header()
            .withDeviceID(XJdfConstants.DEVICE_ID)
            .withAgentName(XJdfConstants.AGENT_NAME)
            .withAgentVersion(XJdfConstants.AGENT_VERSION)
            .withTime(new DateTime());
    }
}
