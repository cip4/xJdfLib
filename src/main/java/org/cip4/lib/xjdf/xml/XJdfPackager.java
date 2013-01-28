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

import org.cip4.lib.xjdf.util.IDGeneratorUtil;
import org.cip4.lib.xjdf.xml.internal.AbstractXmlPackager;

/**
 * Packaging logic for XJDF Documents. Package an XJDF with all references in a ZIP Package.
 * @author s.meissner
 * @date 26.01.2013
 */
public class XJdfPackager extends AbstractXmlPackager {

	/**
	 * Custom constructor. Accepting an XJDF Document for initializing.
	 * @param xJdf XJDF Document byte array for packaging.
	 * @throws Exception
	 */
	public XJdfPackager(byte[] xjdf) throws Exception {

		super(xjdf);

	}

	/**
	 * Packages an XJDF Document to a zipped binary output stream.
	 * @param os Target OutputStream where XJdfDocument is being packaged.
	 * @throws Exception
	 */
	public void packageXJdf(OutputStream os, String docName) throws Exception {

		// register files
		registerFiles("//FileSpec/@URL", "artwork");

		// create main doc Name
		if (docName == null || docName.equals("")) {
			docName = IDGeneratorUtil.generateID("XJDF") + ".xjdf";
		}

		// package xml
		packageXml(os, docName);
	}

}