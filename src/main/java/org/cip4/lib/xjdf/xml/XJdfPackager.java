/**
 * All rights reserved by
 * 
 * flyeralarm GmbH
 * Alfred-Nobel-Straße 18
 * 97080 Würzburg
 *
 * Email: info@flyeralarm.com
 * Website: http://www.flyeralarm.com
 */
package org.cip4.lib.xjdf.xml;

import java.io.OutputStream;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang.StringUtils;
import org.cip4.lib.xjdf.util.IDGeneratorUtil;
import org.cip4.lib.xjdf.xml.internal.AbstractXmlPackager;

/**
 * Packaging logic for XJDF Documents. Package an XJDF with all references in a ZIP Package.
 * @author s.meissner
 * @date 26.01.2013
 */
public class XJdfPackager extends AbstractXmlPackager {

	/**
	 * Custom constructor. Accepting an XJDF Path for initializing.
	 * @param xjdfPath Path to XJDF Document.
	 * @throws Exception
	 */
	public XJdfPackager(String xjdfPath) throws Exception {
		super(xjdfPath);
	}

	/**
	 * Custom constructor. Accepting an XJDF Document for initializing.
	 * @param xJdf XJDF Document byte array for packaging.
	 * @throws Exception
	 */
	public XJdfPackager(byte[] xjdf) throws Exception {
		this(xjdf, null);
	}

	/**
	 * Custom constructor. Accepting an XJDF Document for initializing.
	 * @param xJdf XJDF Document byte array for packaging.
	 * @param rootPath The root path of the document.
	 * @throws Exception
	 */
	public XJdfPackager(byte[] xjdf, String rootPath) throws Exception {
		super(xjdf, rootPath);
	}

	/**
	 * Packages an XJDF Document to a zipped binary output stream.
	 * @param os Target OutputStream where XJdfDocument is being packaged.
	 * @throws Exception
	 */
	public void packageXJdf(OutputStream os) throws Exception {

		XJdfNavigator nav = new XJdfNavigator(getXmlDoc());

		// get document name
		String jobId = nav.readAttribute(XJdfNavigator.JOB_ID);

		if (jobId != null) {
			jobId += ".xjdf";
		}

		// package
		packageXJdf(os, jobId);
	}

	/**
	 * Packages an XJDF Document to a zipped binary output stream.
	 * @param os Target OutputStream where XJdfDocument is being packaged.
	 * @param docName Documents name in ZIP Package.
	 * @throws Exception
	 */
	public void packageXJdf(OutputStream os, String docName) throws Exception {
		packageXJdf(os, docName, false);
	}

	/**
	 * Packages an XJDF Document to a zipped binary output stream.
	 * @param os Target OutputStream where XJdfDocument is being packaged.
	 * @param docName Documents name in ZIP Package.
	 * @param withoutHierarchy Put all files into the ZIP Root.
	 * @throws Exception
	 */
	public void packageXJdf(OutputStream os, String docName, boolean withoutHierarchy) throws Exception {

		// register files
		if (withoutHierarchy) {
			registerFiles("//FileSpec/@URL", "");
			registerFiles("//Preview/@URL", "");
			registerFiles("//XJDF/@CommentURL", "");
		} else {
			registerFiles("//FileSpec/@URL", "artwork");
			registerFiles("//Preview/@URL", "preview");
			registerFiles("//XJDF/@CommentURL", "docs");
		}

		// create main doc Name
		if (docName == null || docName.equals("")) {
			docName = IDGeneratorUtil.generateID("XJDF") + ".xjdf";

		} else if (StringUtils.isEmpty(FilenameUtils.getExtension(docName))) {
			docName = docName + ".ptk";
		}

		// package xml
		packageXml(os, docName);
	}

}
