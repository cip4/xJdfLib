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
package org.cip4.lib.xjdf.builder;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

import javax.xml.bind.Marshaller;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.cip4.lib.xjdf.builder.AbstractXJdfNodeBuilder;
import org.cip4.lib.xjdf.xml.XJdfConstants;
import org.cip4.lib.xjdf.xml.internal.JAXBContextFactory;
import org.cip4.lib.xjdf.xml.internal.NamespaceManager;
import org.cip4.lib.xjdf.xml.internal.XJdfNamespaceMapper;
import org.xml.sax.InputSource;

/**
 * Abstract JUnit test case for all Builder classes.
 * @author s.meissner
 * @date 05.03.2012
 */
public abstract class AbstractBuilderTest<T> {

	protected final boolean outputConsole = true;

	/**
	 * Default constructor.
	 */
	public AbstractBuilderTest() {

		try {
			JAXBContextFactory.init();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * Get XJDF Document as byte stream.
	 * @param xJdfBuilder
	 * @return
	 * @throws Exception
	 */
	protected byte[] marsahlResult(AbstractXJdfNodeBuilder<T> builder) throws Exception {

		// get XJDF Node
		T obj = builder.build();

		// marshall XJDF document
		ByteArrayOutputStream bos = new ByteArrayOutputStream();

		Marshaller m = JAXBContextFactory.getInstance().createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		m.setProperty("com.sun.xml.bind.namespacePrefixMapper", new XJdfNamespaceMapper());
		m.marshal(obj, bos);

		bos.flush();
		bos.close();

		byte[] bytes = bos.toByteArray();

		// output console
		if (outputConsole) {
			String doc = new String(bytes);
			System.out.println("------------------------------------------------------------------------");
			System.out.println("");
			System.out.print(doc);
			System.out.println("");
		}

		// return bytes
		return bytes;
	}

	/**
	 * Helper method for analyzing JAXB output by xpath.
	 * @param bytes Current XJdf Document as byte array.
	 * @param xPath XPath to validate.
	 * @return Value as String.
	 */
	protected String getXPathValue(byte[] bytes, String xPathExpr) throws Exception {

		// create XPath query
		NamespaceManager nsManager = new NamespaceManager();
		nsManager.addNamespace("ns", XJdfConstants.NAMESPACE_JDF20);

		XPathFactory xPathFactory = XPathFactory.newInstance();
		XPath xPath = xPathFactory.newXPath();
		xPath.setNamespaceContext(nsManager);

		XPathExpression xPathExpression = xPath.compile(xPathExpr);

		// execute xPath query
		InputStream is = new ByteArrayInputStream(bytes);

		String result = xPathExpression.evaluate(new InputSource(is));

		// return result
		return result;
	}
}