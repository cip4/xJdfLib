package org.cip4.lib.xjdf;

import java.util.HashMap;
import java.util.Map;

import org.cip4.lib.xjdf.schema.Version;

/**
 * Common XJDF defaults and global agent settings.
 *
 * <p>
 * The constants in this class are process-wide defaults: namespaces, the supported schema versions and media types.
 * The mutable fields {@link #DEVICE_ID}, {@link #AGENT_NAME} and {@link #AGENT_VERSION} must be set once at
 * application start. They are used by {@link org.cip4.lib.xjdf.util.Headers} to generate headers and audit entries.
 * </p>
 *
 * <pre>{@code
 * XJdfConstants.AGENT_NAME = "PreviewService";
 * XJdfConstants.AGENT_VERSION = "1.2.34";
 * XJdfConstants.DEVICE_ID = "PREVIEW_SERVICE";
 * }</pre>
 */
public class XJdfConstants {

    /**
     * Private constructor for constants class.
     */
    private XJdfConstants() {
    }

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
    public static final Version XJDF_CURRENT_VERSION = Version.V2_3;

    /**
     * Returns the current XJDF Schema location
     */
    public static final String XJDF_SCHEMA_LOCATION = "https://schema.cip4.org/jdfschema_2_x/xjdf.xsd";

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

    /**
     * The device ID reported in generated headers, for example {@code "PREVIEW_SERVICE"}.
     */
    public static String DEVICE_ID = null;

    /**
     * The agent name reported in generated headers, for example {@code "PreviewService"}.
     */
    public static String AGENT_NAME = null;

    /**
     * The agent version reported in generated headers, for example {@code "1.2.34"}.
     */
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
            throw new RuntimeException("Error loading XJDF Schema 2.2", e);
        }

        try{
            xsdMap.put(
                    Version.V2_3,
                    XJdfConstants.class.getResourceAsStream("/org/cip4/lib/xjdf/schema/jdfschema_2_x.xsd"
                    ).readAllBytes());
        } catch (Exception e) {
            throw new RuntimeException("Error loading XJDF Schema 2.x", e);
        }

        return xsdMap;
    }
}
