package org.cip4.lib.xjdf;

import java.util.HashMap;
import java.util.Map;

import org.cip4.lib.xjdf.schema.Version;

/**
 * This class provides common XJdf default values.
 */
public class XJdfConstants {

    /**
     * Namespace XJDF,
     */
    public static final String NAMESPACE_JDF20 = "http://www.CIP4.org/JDFSchema_2_0";

    /**
     * Namespace XML
     */
    public static final String NAMESPACE_W3_XML = "http://www.w3.org/2001/XMLSchema";

    /**
     * A map containing all XJDF Schemes as byte array.
     */
    public static final Map<Version, byte[]> XJDF_XSD_BYTES = loadXJdfXsdByteArray();

    /**
     * Returns the current XJDF Version
     */
    public static final Version XJDF_CURRENT_VERSION = Version.V2_2;

    /**
     * Returns the current XJDF Version
     */
    public static final byte[] XJDF_XSD_BYTES_CURRENT = XJDF_XSD_BYTES.get(XJDF_CURRENT_VERSION);

    /**
     * Media Type for XJDF Documents.
     */
    public static final String MEDIA_TYPE_XJDF = "application/vnd.cip4-xjdf+xml";

    /**
     * Media Type for XJMF Messages.
     */
    public static final String MEDIA_TYPE_XJMF = "application/vnd.cip4-xjmf+xml";

    /**
     * Media Type for XJDF packages.
     */
    public static final String MEDIA_TYPE_XJDF_ZIP = "application/vnd.cip4-xjdf+zip";

    /**
     * Media Type for XJMF packages.
     */
    public static final String MEDIA_TYPE_XJMF_ZIP = "application/vnd.cip4-xjmf+zip";

    public static String DEVICE_ID = null;

    public static String AGENT_NAME = null;

    public static String AGENT_VERSION = null;

    /**
     * Helper method to load all XJDF schemes as a map of byte array.
     *
     * @return XJDF Schemes as byte array map.
     */
    private static Map<Version, byte[]> loadXJdfXsdByteArray() {
        Map<Version, byte[]> xsdMap = new HashMap<>();

        try {
            xsdMap.put(
                    Version.V2_0,
                    XJdfConstants.class.getResourceAsStream("/org/cip4/lib/xjdf/schema/jdfschema_2_0.xsd"
                    ).readAllBytes());
        } catch (Exception e) {
            throw new RuntimeException("Error loading XJDF Schema 2.0", e);
        }

        try{
            xsdMap.put(
                    Version.V2_1,
                    XJdfConstants.class.getResourceAsStream("/org/cip4/lib/xjdf/schema/jdfschema_2_1.xsd"
                    ).readAllBytes());
        } catch (Exception e) {
            throw new RuntimeException("Error loading XJDF Schema 2.1", e);
        }

        try{
            xsdMap.put(
                    Version.V2_2,
                    XJdfConstants.class.getResourceAsStream("/org/cip4/lib/xjdf/schema/jdfschema_2_2.xsd"
                    ).readAllBytes());
        } catch (Exception e) {
            throw new RuntimeException("Error loading XJDF Schema 2.1", e);
        }

        return xsdMap;
    }
}
