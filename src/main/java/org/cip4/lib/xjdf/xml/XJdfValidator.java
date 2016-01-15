package org.cip4.lib.xjdf.xml;

import java.net.URL;

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
     * Custom constructor. Accepting a XJDF Stream for initializing.
     */
    public XJdfValidator() {
        super(null);
    }

    @Override
    protected final URL getSchema() {
        return SCHEMA;
    }
}
