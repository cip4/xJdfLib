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
		byte[] bytes = super.findMasterDocument();

		// return as navigator
		return new XJdfNavigator(bytes, true);
	}

    /**
     * Returns the XJDF Document covered by the XJDFNavigator.
     *
     * @param namespaceAware Flag whether or not the navigator should be aware of the namespaces.
     *
     * @return XJDF document covered by the XJDFNavigator.
     *
     * @throws Exception
     */
    public final XJdfNavigator getXJdfDocument(boolean namespaceAware) throws Exception {
        byte[] bytes = super.findMasterDocument();
        return new XJdfNavigator(bytes, namespaceAware);
    }

	/**
	 * Unpackage an XJDF Package to a temporary directory.
	 * @param pathPackage XJDF Package to be unpackaged.
	 * @return The path of the master document.
	 * @throws IOException
	 */
	public String unpackageXJdfTemp(String appName) throws IOException {

		// call super method
		return super.unpackageZipTemp(appName);
	}

	/**
	 * Unpackage an XJDF Package to a temporary directory.
	 * @param pathPackage XJDF Package to be unpackaged.
	 * @return The path of the master document.
	 * @throws IOException
	 */
	public String unpackageXJdfTemp() throws IOException {

		// call super method
		return super.unpackageZipTemp();
	}

	/**
	 * Unpackage an XJDF Package to a target directory.
	 * @param pathPackage XJDF Package to be unpackaged.
	 * @param targetDir Target directory for unpackaging.
	 * @return The path of the master document.
	 * @throws IOException
	 */
	public String unpackageXJdf(String targetDir) throws IOException {

		// call super method
		return super.unpackageZip(targetDir);
	}

	/**
	 * @see org.cip4.lib.xjdf.xml.internal.AbstractXmlUnpackager#getMasterExtension()
	 */
	@Override
	protected String[] getMasterExtension() {
		return new String[] { "xjdf" };
	}
}
