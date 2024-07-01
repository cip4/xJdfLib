package org.cip4.lib.xjdf.util;

import org.cip4.lib.xjdf.XJdfConstants;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class XJdfLibTest {

    @Test
    public void loadLibraryVersion() {

        // arrange

        // act
        String version = XJdfLib.VERSION;

        // assert
        assertTrue(version.startsWith(XJdfConstants.XJDF_CURRENT_VERSION.value()), String.format("The version '%s' does not start with '%s'.", version, XJdfConstants.XJDF_CURRENT_VERSION.value()));
    }

    @Test
    public void loadLibraryBuildDate() {

        // arrange

        // act
        String buildDate = XJdfLib.BUILD_DATE;

        // assert
        System.out.println(buildDate);
        assertTrue(buildDate.matches("20[0-9]{2}-[0-9]{2}-[0-9]{2}T[0-9]{2}:[0-9]{2}:[0-9]{2}.[0-9]{3}Z"));// ISO8601
    }

}