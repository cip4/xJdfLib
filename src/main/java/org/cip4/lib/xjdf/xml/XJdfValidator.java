package org.cip4.lib.xjdf.xml;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.cip4.lib.xjdf.schema.XJDF;
import org.cip4.lib.xjdf.xml.internal.AbstractXmlValidator;

/**
 * Validation of XJDF Documents based on XJDF schema file.
 */
public class XJdfValidator extends AbstractXmlValidator<XJDF> {

    /**
     * URL of the internal XJDF schema.
     */
    private static final URL SCHEMA = XJdfValidator.class.getResource("/JDF20.xsd");

    /**
     * Custom constructor.
     */
    public XJdfValidator() {
        super(loadXsdDependencies());
    }

    @Override
    protected final URL getSchema() {
        return SCHEMA;
    }

    /**
     * Private helper method for load XSD Dependencies.
     *
     * @return XSD Dependencies
     */
    private static Map<String, byte[]> loadXsdDependencies() {
        Map<String, byte[]> map = new HashMap<>(2);
        map.put("./JDF20.xsd", XJdfConstants.XJDF_XSD_BYTES);

        return map;
    }
}
