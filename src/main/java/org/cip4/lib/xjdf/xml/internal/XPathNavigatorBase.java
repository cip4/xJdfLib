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
package org.cip4.lib.xjdf.xml.internal;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.cip4.lib.xjdf.type.AbstractXJdfType;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

/**
 * Navigator class which simplify XPath handling using XML Documents.
 * @author s.meissner
 * @date 26.06.2012
 */
public class XPathNavigatorBase {

	protected final XPath xPath;

	protected final Document xmlDocument;

	/**
	 * Custom constructor. Accepting a XML Document as Byte Array for initializing.
	 * @param xmlBytes
	 * @throws Exception
	 */
	protected XPathNavigatorBase(byte[] xmlBytes) throws Exception {

		// chained constructor call
		this(new ByteArrayInputStream(xmlBytes));
	}

	/**
	 * Custom constructor. Accepting a XML Document as Stream for initializing.
	 */
	protected XPathNavigatorBase(InputStream xmlStream) throws Exception {

		// parse input stream
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		xmlDocument = docBuilder.parse(new InputSource(xmlStream));
		xmlStream.close();

		// create xPathFactory object
		XPathFactory xPathFactory = XPathFactory.newInstance();
		this.xPath = xPathFactory.newXPath();
	}

	/**
	 * Read attribute from XML Document using XPath.
	 * @param xPath XPath expression of attribute to read.
	 * @return Value of attribute as String.
	 * @throws XPathExpressionException Is being thrown in case an exception occurs.
	 */
	public String readAttribute(String xPath) throws XPathExpressionException {

		// evaluate as string
		return (String) evaluate(xPath, XPathConstants.STRING);
	}

	/**
	 * Read attribute from XML Document using XPath and convert to JDF Datatype.
	 * @param xPath XPath expression to evaluate.
	 * @param xJdfType Target JDF Data Type of attribute.
	 * @return Value as JDF Data Type.
	 * @throws XPathExpressionException
	 * @throws SecurityException
	 * @throws NoSuchMethodException
	 * @throws InvocationTargetException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 */
	public Object readAttribute(String xPath, Class xJdfType) throws XPathExpressionException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {

		// evaluate as String
		String value = (String) evaluate(xPath, XPathConstants.STRING);

		// convert to data type
		Constructor ctor = xJdfType.getDeclaredConstructor(String.class);
		AbstractXJdfType validator = (AbstractXJdfType) ctor.newInstance(value);

		// return object
		return validator;
	}

	/**
	 * Evaluate an XPath expression on XML Document.
	 * @param xPath XPath expression to execute to.
	 * @param qname QName as javax.xml.xpath.XPathConstants
	 * @return Generic result.
	 * @throws XPathExpressionException Is thrown in case an XPath Exception occurs.
	 */
	public Object evaluate(String xPath, QName qname) throws XPathExpressionException {

		// execute xpath
		Object result = this.xPath.evaluate(xPath, xmlDocument, qname);

		// return result
		return result;
	}

	/**
	 * Update attribute in XML Document.
	 * @param xPath XPath expression of attribute to read.
	 * @value value New value of attribute defined by xPath.
	 * @throws Exception Is being thrown in case an exception occurs.
	 */
	public void updateAttribute(String xPath, AbstractXJdfType value) throws Exception {

		// update
		updateAttribute(xPath, value.toString());
	}

	/**
	 * Update attribute in XML Document.
	 * @param xPath XPath expression of attribute to read.
	 * @value value New value of attribute defined by xPath.
	 * @throws Exception Is being thrown in case an exception occurs.
	 */
	public void updateAttribute(String xPath, String value) throws Exception {

		// finalize XPath expression
		String exprString = xPath;

		// locate and modify the node
		Attr result = (Attr) evaluate(exprString, XPathConstants.NODE);
		result.setValue(value);
	}

	/**
	 * Return the XML Document as input stream.
	 * @return XML document as input stream.
	 */
	public InputStream getXmlStream() throws Exception {

		// get bytes
		InputStream resultStream = new ByteArrayInputStream(getXmlBytes());

		// return result stream
		return resultStream;
	}

	/**
	 * Return the XML Document as Byte Array.
	 * @return XML Document as Byte Array.
	 * @throws Exception Is thrown in case an Exception occurs.
	 */
	public byte[] getXmlBytes() throws Exception {

		// save the result
		Transformer xformer = TransformerFactory.newInstance().newTransformer();

		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		xformer.transform(new DOMSource(xmlDocument), new StreamResult(bos));
		bos.close();

		// return bytes
		return bos.toByteArray();

	}

}