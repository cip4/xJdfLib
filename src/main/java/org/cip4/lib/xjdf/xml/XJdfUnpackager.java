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

import java.io.IOException;

import org.cip4.lib.xjdf.xml.internal.AbstractXmlUnpackager;

/**
 * Unpackaging logic for XJDF Packages.
 * @author s.meissner
 * @date 12.08.2013
 */
public class XJdfUnpackager extends AbstractXmlUnpackager {

	/**
	 * Custom constructor. Accepting a XJDF Package Path for initializing.
	 * @param pathPackage Path to XJDF Package.
	 * @throws IOException
	 */
	public XJdfUnpackager(String pathPackage) throws IOException {
		super(pathPackage);
	}

	/**
	 * Returns the XJDF Document covered by the XJDFNavigator.
	 * @return XJDF Document coverd by the XJDFNavigator.
	 * @throws Exception
	 */
	public XJdfNavigator getXJdfDocument() throws Exception {

		// find XJDF master document
		byte[] bytes = super.findMasterDocument("xjdf");

		// return as navigator
		return new XJdfNavigator(bytes);
	}

	/**
	 * Unpackage an XJDF Package to a temporary directory.
	 * @param pathPackage XJDF Package to be unpackaged.
	 * @return The target directory.
	 * @throws IOException
	 */
	public String unpackageXJdf() throws IOException {

		// call super method
		return super.unpackageZip();
	}

	/**
	 * Unpackage an XJDF Package to a target directory.
	 * @param pathPackage XJDF Package to be unpackaged.
	 * @param targetDir Target directory for unpackaging.
	 * @return The target directory.
	 * @throws IOException
	 */
	public String unpackageXJdf(String targetDir) throws IOException {

		// call super method
		return super.unpackageZip(targetDir);
	}
}
