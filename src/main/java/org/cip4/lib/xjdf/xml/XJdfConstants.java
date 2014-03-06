/**
 * All rights reserved by
 * 
 * flyeralarm GmbH
 * Alfred-Nobel-Straße 18
 * 97080 Würzburg
 *
 * info@flyeralarm.com
 * http://www.flyeralarm.com
 */
package org.cip4.lib.xjdf.xml;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.apache.commons.io.IOUtils;
import org.cip4.lib.xjdf.xml.internal.NamespaceManager;
import org.xml.sax.InputSource;

/**
 * This class provides common XJdf default values.
 * @author s.meissner
 * @date 06.03.2012
 */
public class XJdfConstants {

	/**
	 * Default Namespace xJdf,
	 */
	public static final String NAMESPACE_JDF20 = loadNamespaceJdf20();

	public static final String NAMESPACE_W3_XML = "http://www.w3.org/2001/XMLSchema";

	public static final String XJDF_CURRENT_VERSION = "2.0";

	public static final String XJDF_LIB_VERSION = loadLibraryVersion();

	public static final String XJDF_LIB_BUILD_DATE = loadLibraryBuildDate();

	public static final String JMF_ICS_VERSION = "JMF_L1-2.0";

	public static final byte[] XJDF_XSD_BYTES = loadXJdfXsdByteArray();

	public static final String MEDIA_TYPE_VND_JMF = "application/vnd.cip4-jmf+xml";

	public static final String MEDIA_TYPE_VND_JDF = "application/vnd.cip4-jdf+xml";

	private static final String RES_BUILD_PROPS = "/org/cip4/lib/xjdf/build.properties";

	private static final String RES_JDF20_XSD = "/JDF20.xsd";

	/**
	 * Load XJDF XSD as byte array.
	 * @return XJDF Schema as byte array.
	 */
	private static byte[] loadXJdfXsdByteArray() {

		// load xsd
		byte[] bytes = null;

		try {
			InputStream is = XJdfConstants.class.getResourceAsStream(RES_JDF20_XSD);
			bytes = IOUtils.toByteArray(is);
			is.close();
		} catch (Exception ex) {
		}

		// return
		return bytes;
	}

	/**
	 * Load the JDF20 Namespace from schema file.
	 * @return
	 */
	private static String loadNamespaceJdf20() {

		String result;

		// new namespace manager
		NamespaceManager nsManager = new NamespaceManager();
		nsManager.addNamespace("xs", NAMESPACE_W3_XML);

		// create xpath query
		XPathFactory xPathFactory = XPathFactory.newInstance();
		XPath xPath = xPathFactory.newXPath();
		xPath.setNamespaceContext(nsManager);

		try {
			XPathExpression xPathExpression = xPath.compile("/xs:schema/@targetNamespace");

			// execute xPath query
			InputStream is = XJdfConstants.class.getResourceAsStream(RES_JDF20_XSD);
			result = xPathExpression.evaluate(new InputSource(is));

		} catch (Exception ex) {
			// throw error
			throw new AssertionError(ex);
		}

		// return result
		return result;
	}

	/**
	 * Load Version Number from Package.
	 * @return Version Number as String
	 */
	private static String loadLibraryVersion() {

		String result = null;

		// load Version
		Properties props = new Properties();

		try {
			props.load(XJdfConstants.class.getResourceAsStream(RES_BUILD_PROPS));
			result = props.getProperty("version", "UNKNOWN");

		} catch (IOException e) {
		}

		// default
		if (result == null) {
			// result = "[version not specified]";
			result = "";
		}

		// return result
		return result;
	}

	/**
	 * Load Build Date from Package.
	 * @return Version Number as String
	 */
	private static String loadLibraryBuildDate() {

		String result = null;

		// load Version
		Properties props = new Properties();

		try {
			props.load(XJdfConstants.class.getResourceAsStream(RES_BUILD_PROPS));
			result = props.getProperty("build.date", "UNKNOWN");

		} catch (IOException e) {
		}

		// default
		if (result == null) {
			result = "";
		}

		// return result
		return result;
	}
}
