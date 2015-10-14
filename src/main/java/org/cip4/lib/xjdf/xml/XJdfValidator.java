package org.cip4.lib.xjdf.xml;

import java.io.IOException;
import java.io.InputStream;

import org.cip4.lib.xjdf.schema.XJDF;
import org.cip4.lib.xjdf.xml.internal.AbstractXmlValidator;

/**
 * Validation of XJDF Documents based on XJDF schema file.
 *
 * @author s.meissner
 */
public class XJdfValidator extends AbstractXmlValidator<XJDF> {

    /**
     * Custom constructor. Accepting a XJDF Stream for initializing.
     *
     * @param xJdfStream Stream to read the XJDF document from.
     *
     * @throws IOException if an error occurs while reading the document.
     */
    public XJdfValidator(final InputStream xJdfStream) throws IOException {
        super(XJdfConstants.XJDF_XSD_BYTES, xJdfStream, null);
    }

}
