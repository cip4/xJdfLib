package org.cip4.lib.xjdf.xml;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.StringUtils;
import org.cip4.lib.xjdf.schema.XJDF;
import org.cip4.lib.xjdf.util.IDGeneratorUtil;
import org.cip4.lib.xjdf.xml.internal.AbstractXmlPackager;
import org.cip4.lib.xjdf.xml.internal.PackagerException;

import javax.xml.xpath.XPathExpressionException;
import java.io.OutputStream;
import java.nio.file.Path;

/**
 * Packaging logic for XJDF Documents. Package an XJDF with all references in a ZIP Package.
 */
public class XJdfPackager extends AbstractXmlPackager<XJDF> {

    /**
     * Create a new XJdfPackager.
     *
     * @param out The underlying OutputStream to write the package to.
     */
    public XJdfPackager(final OutputStream out) {
        super(out);
    }

    /**
     * Create a new XJdfPackager.
     *
     * This constructor should be used if an existing archive should be enhanced.
     *
     * @param zipPath The path to an existing archive.
     * @param out The underlying OutputStream to write the package to.
     */
    public XJdfPackager(final Path zipPath, final OutputStream out) {
        super(zipPath, out);
    }

    /**
     * Packages an XML Document to a zipped binary output stream.
     *
     * @param xjdf The XJDF document to package.
     *
     * @throws PackagerException If the XML document could not be packaged.
     */
    public final void packageXjdf(final XJDF xjdf) throws PackagerException {
        packageXjdf(xjdf, xjdf.getJobID());
    }

    /**
     * Packages an XML Document to a zipped binary output stream.
     *
     * @param xjdf The XJDF to package.
     * @param docName Document's name in the zipped package.
     *
     * @throws PackagerException If the XML document could not be packaged.
     */
    public final void packageXjdf(final XJDF xjdf, String docName) throws PackagerException {
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
    protected final byte[] parseDocument(final XJDF xjdf, final boolean validation) throws Exception {
        return new XJdfParser().parseXJdf(xjdf, !validation);
    }
}