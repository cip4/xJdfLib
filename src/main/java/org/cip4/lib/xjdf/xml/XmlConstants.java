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

import java.io.InputStream;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.cip4.lib.xjdf.xml.internal.NamespaceManager;
import org.xml.sax.InputSource;

/**
 * This class provides common XJdf default values.
 * @author s.meissner
 * @date 06.03.2012
 */
public class XmlConstants {

	/**
	 * Default Namespace xJdf,
	 */
	public static final String NAMESPACE_JDF20 = loadNamespaceJdf20();

	public static final String MEDIA_TYPE_VND_JMF = "application/vnd.cip4-jmf+xml";

	public static final String MEDIA_TYPE_VND_JDF = "application/vnd.cip4-jdf+xml";

	private static final String RES_JDF20_XSD = "/org/cip4/lib/xjdf/xsd/JDF20.xsd";

	private static final String NAMESPACE_W3_XML = "http://www.w3.org/2001/XMLSchema";

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
			InputStream is = XmlConstants.class.getResourceAsStream(RES_JDF20_XSD);
			result = xPathExpression.evaluate(new InputSource(is));

		} catch (Exception ex) {
			// throw error
			throw new AssertionError(ex);
		}

		// return result
		return result;
	}
}
