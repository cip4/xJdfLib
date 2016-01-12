package org.cip4.lib.xjdf.xml;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang.StringUtils;
import org.cip4.lib.xjdf.util.IDGeneratorUtil;
import org.cip4.lib.xjdf.xml.internal.AbstractXmlPackager;
import org.cip4.lib.xjdf.xml.internal.PackagerException;

import javax.xml.xpath.XPathExpressionException;
import java.io.OutputStream;
import java.net.URI;

/**
 * Packaging logic for XJDF Documents. Package an XJDF with all references in a ZIP Package.
 */
public class XJdfPackager extends AbstractXmlPackager {

    /**
     * Create a new XJdfPackager.
     *
     * @param out     The underlying OutputStream to write the package to.
     */
    public XJdfPackager(final OutputStream out) {
        super(out, false);
    }

    /**
     * Create a new XJdfPackager.
     *
     * @param out     The underlying OutputStream to write the package to.
     * @param withoutHierarchy Put all files into the zip root.
     */
    public XJdfPackager(final OutputStream out, final boolean withoutHierarchy) {
        super(out, withoutHierarchy);
    }

    /**
     * Packages an XJDF Document to a zipped binary output stream.
     *
     * @param xJdfNavigator The XjdfNavigator containing the data.
     * @param rootUri The root URI to use when dealing with relative URIs.
     *
     * @throws PackagerException If the XML document could not be packaged.
     * @throws XPathExpressionException If the JobId of the XJDF could not be read.
     */
    public final void packageXJdf(
        final XJdfNavigator xJdfNavigator,
        final URI rootUri
    ) throws PackagerException, XPathExpressionException {
        final String jobId = xJdfNavigator.readAttribute(XJdfNavigator.JOB_ID);
        packageXJdf(xJdfNavigator, jobId, rootUri);
    }

	/**
	 * Packages an XJDF Document to a zipped binary output stream.
     *
	 * @param xJdfNavigator The XjdfNavigator containing the data.
	 * @param docName Documents name in ZIP Package.
     * @param rootUri The root URI to use when dealing with relative URIs.
     *
	 * @throws PackagerException If the XJDF could not be packaged.
	 */
	public final void packageXJdf(
        final XJdfNavigator xJdfNavigator,
        final String docName,
        final URI rootUri
    ) throws PackagerException {
        String tmpDocName = docName;
        if (StringUtils.isBlank(tmpDocName)) {
            tmpDocName = IDGeneratorUtil.generateID("XJDF") + ".xjdf";
        } else {
            if (StringUtils.isBlank(FilenameUtils.getExtension(tmpDocName))) {
                tmpDocName += ".xjdf";
            }
        }

        packageXml(xJdfNavigator, tmpDocName, rootUri);
	}
}