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
import java.io.IOException;
import java.io.InputStream;

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

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
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
	 * Private default constructor.
	 * @throws IOException
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

		// read attribute
		String result = (String) this.xPath.evaluate(xPath, xmlDocument, XPathConstants.STRING);

		// return result
		return result;
	}

	/**
	 * Execute an XPath expression on XML Document.
	 * @param xPath XPath expression to execute to.
	 * @return List of affected nodes.
	 * @throws XPathExpressionException Is thrown in case an XPath Exception occurs.
	 */
	public NodeList executeXPath(String xPath) throws XPathExpressionException {

		// execute xpath
		NodeList result = (NodeList) this.xPath.evaluate(xPath, xmlDocument, XPathConstants.NODESET);

		// reteurn result
		return result;
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
		Attr result = (Attr) this.xPath.evaluate(exprString, xmlDocument, XPathConstants.NODE);
		result.setValue(value);
	}

	/**
	 * Return the XML Document as input stream.
	 * @return XML document as input stream.
	 */
	public InputStream getXmlStream() throws Exception {

		// save the result
		Transformer xformer = TransformerFactory.newInstance().newTransformer();

		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		xformer.transform(new DOMSource(xmlDocument), new StreamResult(bos));

		InputStream resultStream = new ByteArrayInputStream(bos.toByteArray());
		bos.close();

		// return result stream
		return resultStream;
	}

}