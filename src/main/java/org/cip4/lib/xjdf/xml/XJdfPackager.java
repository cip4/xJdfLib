package org.cip4.lib.xjdf.xml;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang.StringUtils;
import org.cip4.lib.xjdf.util.IDGeneratorUtil;
import org.cip4.lib.xjdf.xml.internal.AbstractXmlPackager;

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
     * @param rootUri The root URI to use when dealing with relative URIs.
     */
    public XJdfPackager(OutputStream out, URI rootUri) {
        super(out, rootUri);
    }

    /**
     * Packages an XJDF Document to a zipped binary output stream.
     *
     * @param xJdfNavigator The XjdfNavigator containing the data.
     *
     * @throws Exception If the XML document could not be packaged.
     */
    public void packageXJdf(XJdfNavigator xJdfNavigator) throws Exception {
        String jobId = xJdfNavigator.readAttribute(XJdfNavigator.JOB_ID);
        if (jobId != null) {
            jobId += ".xjdf";
        }

        packageXJdf(xJdfNavigator, jobId);
    }

	/**
	 * Packages an XJDF Document to a zipped binary output stream.
     *
	 * @param xJdfNavigator The XjdfNavigator containing the data.
	 * @param docName Documents name in ZIP Package.
     *
	 * @throws Exception If the XML document could not be packaged.
	 */
	public void packageXJdf(XJdfNavigator xJdfNavigator, String docName) throws Exception {
        packageXJdf(xJdfNavigator, docName, false);
	}

    /**
     * Packages an XJDF Document to a zipped binary output stream.
     *
     * @param xJdfNavigator The XjdfNavigator containing the data.
     * @param docName Documents name in ZIP Package.
     * @param withoutHierarchy Put all files into the ZIP Root.
     *
     * @throws Exception If the XML document could not be packaged.
     */
    public void packageXJdf(XJdfNavigator xJdfNavigator, String docName, boolean withoutHierarchy) throws Exception {
        if (StringUtils.isNotBlank(docName)) {
            if (StringUtils.isBlank(FilenameUtils.getExtension(docName))) {
                docName += ".xjdf";
            }
        } else {
            docName = IDGeneratorUtil.generateID("XJDF") + ".xjdf";
        }

        packageXml(xJdfNavigator, docName, withoutHierarchy);
    }

}
