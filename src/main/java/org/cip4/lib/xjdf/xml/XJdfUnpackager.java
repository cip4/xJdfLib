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
	 * Unpackage an XJDF Package to a temporary directory.
	 * @param pathPackage XJDF Package to be unpackaged.
	 * @return The target directory.
	 * @throws IOException
	 */
	public String unpackageXJdf(String pathPackage) throws IOException {

		// call super method
		return super.unpackageZip(pathPackage);
	}

	/**
	 * Unpackage an XJDF Package to a target directory.
	 * @param pathPackage XJDF Package to be unpackaged.
	 * @param targetDir Target directory for unpackaging.
	 * @return The target directory.
	 * @throws IOException
	 */
	public String unpackageXJdf(String pathPackage, String targetDir) throws IOException {

		// call super method
		return super.unpackageZip(pathPackage, targetDir);
	}
}
