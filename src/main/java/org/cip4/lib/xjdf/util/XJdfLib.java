package org.cip4.lib.xjdf.util;

import org.cip4.lib.xjdf.exception.XJdfInitException;
import org.cip4.lib.xjdf.xml.JAXBContextFactory;

import java.io.IOException;
import java.util.Properties;

public class XJdfLib {

    /**
     * XJdfLib Version
     */
    public static final String VERSION = loadLibraryVersion();

    /**
     * XJdfLib Build datetime
     */
    public static final String BUILD_DATE = loadLibraryBuildDate();

    /**
     * Helper method to initialize the library's JAXBContext.
     */
    public static void init() throws XJdfInitException {
        JAXBContextFactory.init();
    }

    /**
     * Helper method to load the version number of the library.
     *
     * @return The libraries version.
     */
    private static String loadLibraryVersion() {
        String result;

        Properties props = new Properties();

        try {
            props.load(XJdfLib.class.getResourceAsStream("/org/cip4/lib/xjdf/build.properties"));
            result = props.getProperty("version", "n. a.");
        } catch (IOException e) {
            result = "n. a.";
        }

        return result;
    }

    /**
     * Helper method to load the build date of the library.
     *
     * @return The libraries build date.
     */
    private static String loadLibraryBuildDate() {
        String result;

        Properties props = new Properties();

        try {
            props.load(XJdfLib.class.getResourceAsStream("/org/cip4/lib/xjdf/build.properties"));
            result = props.getProperty("build.date", "n. a.");
        } catch (IOException e) {
            result = "n. a.";
        }

        return result;
    }
}
