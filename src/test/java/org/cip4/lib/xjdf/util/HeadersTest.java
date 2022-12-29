package org.cip4.lib.xjdf.util;

import org.cip4.lib.xjdf.schema.Header;
import org.cip4.lib.xjdf.xml.XJdfConstants;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.parallel.ExecutionMode.SAME_THREAD;

@Execution(SAME_THREAD)
class HeadersTest {

    @Test
    void createDefaultHeader_1() {

        // arrange
        XJdfConstants.DEVICE_ID = "";
        XJdfConstants.AGENT_NAME = "";
        XJdfConstants.AGENT_VERSION = "";

        // act
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, Headers::createDefaultHeader);

        // assert
        assertEquals("Constant 'XJdfConstants.DEVICE_ID' is not defined. Please ensure that DEVICE_ID, AGENT_NAME, and AGENT_VERSION is set properly.", exception.getMessage());

    }

    @Test
    void createDefaultHeader_2() {

        // arrange
        XJdfConstants.DEVICE_ID = "MY_DEVICE_ID";
        XJdfConstants.AGENT_NAME = null;
        XJdfConstants.AGENT_VERSION = "";

        // act
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, Headers::createDefaultHeader);

        // assert
        assertEquals("Constant 'XJdfConstants.AGENT_NAME' is not defined. Please ensure that DEVICE_ID, AGENT_NAME, and AGENT_VERSION is set properly.", exception.getMessage());

    }

    @Test
    void createDefaultHeader_3() {

        // arrange
        XJdfConstants.DEVICE_ID = "MY_DEVICE_ID";
        XJdfConstants.AGENT_NAME = "MY_AGENT_NAME";
        XJdfConstants.AGENT_VERSION = "";

        // act
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, Headers::createDefaultHeader);

        // assert
        assertEquals("Constant 'XJdfConstants.AGENT_VERSION' is not defined. Please ensure that DEVICE_ID, AGENT_NAME, and AGENT_VERSION is set properly.", exception.getMessage());
    }

    @Test
    void createDefaultHeader_4() {

        // arrange
        XJdfConstants.DEVICE_ID = "MY_DEVICE_ID";
        XJdfConstants.AGENT_NAME = "MY_AGENT_NAME";
        XJdfConstants.AGENT_VERSION = "MY_AGENTS_VERSION";

        // act
        Header header = Headers.createDefaultHeader();

        // assert
        assertEquals("MY_DEVICE_ID", header.getDeviceID());
        assertEquals("MY_AGENT_NAME", header.getAgentName());
        assertEquals("MY_AGENTS_VERSION", header.getAgentVersion());
        assertNotNull(header.getTime());
    }
}
