package org.cip4.lib.xjdf.xml;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang.StringUtils;
import org.cip4.lib.xjdf.schema.XJDF;
import org.cip4.lib.xjdf.util.IDGeneratorUtil;
import org.cip4.lib.xjdf.xml.internal.AbstractXmlPackager;
import org.cip4.lib.xjdf.xml.internal.PackagerException;

import javax.xml.xpath.XPathExpressionException;
import java.io.OutputStream;

/**
 * Packaging logic for XJDF Documents. Package an XJDF with all references in a ZIP Package.
 */
public class XJdfPackager extends AbstractXmlPackager {

    /**
     * Create a new XJdfPackager.
     *
     * @param out The underlying OutputStream to write the package to.
     */
    public XJdfPackager(final OutputStream out) {
        super(out);
    }

    /**
     * Packages an XML Document to a zipped binary output stream.
     *
     * @param xjdf The XJDF document to package.
     *
     * @throws PackagerException If the XML document could not be packaged.
     * @throws XPathExpressionException If the JobId of the XJDF could not be read.
     */
    public final void packageXjdf(
        final XJDF xjdf
    ) throws PackagerException, XPathExpressionException {
        packageXjdf(xjdf, xjdf.getJobID());
    }

    /**
     * Packages an XML Document to a zipped binary output stream.
     *
     * @param xjdf The XJDF to package.
     * @param docName Document's name in the zipped package.
     *
     * @throws PackagerException If the XML document could not be packaged.
     * @throws XPathExpressionException If the JobId of the XJDF could not be read.
     */
    public final void packageXjdf(
        final XJDF xjdf,
        String docName
    ) throws PackagerException, XPathExpressionException {
        if (StringUtils.isBlank(docName)) {
            docName = IDGeneratorUtil.generateID("XJDF") + ".xjdf";
        } else {
            if (StringUtils.isBlank(FilenameUtils.getExtension(docName))) {
                docName += ".xjdf";
            }
        }

        packageXml(xjdf, docName);
    }

    @Override
    protected final byte[] parseDocument(final Object document) throws Exception {
        return new XJdfParser().parseXJdf((XJDF) document);
    }
}