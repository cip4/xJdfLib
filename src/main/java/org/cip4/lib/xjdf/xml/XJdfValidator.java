package org.cip4.lib.xjdf.xml;

import org.cip4.lib.xjdf.xml.internal.AbstractXmlValidator;

/**
 * Validation of XJDF Documents based on XJDF schema file.
 */
public class XJdfValidator extends AbstractXmlValidator {

    /**
     * Default constructor.
     */
    public XJdfValidator() {
        super(XJdfConstants.XJDF_XSD_BYTES_CURRENT);
    }
}
