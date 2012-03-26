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
 * Navigator class which simplify XPath handling using XJdf Documents.
 * @author s.meissner
 * @date 06.03.2012
 */
public class XPathNavigator {

	private final XPath xPath;
	
	private final Document xmlDocument;

	/**
	 * Private default constructor.
	 * @throws IOException
	 */
	private XPathNavigator(InputStream xJdfStream) throws Exception {

		// parse input stream
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		xmlDocument = docBuilder.parse(new InputSource(xJdfStream));
		xJdfStream.close();

		// create xPathFactory object
		XPathFactory xPathFactory = XPathFactory.newInstance();
		this.xPath = xPathFactory.newXPath();
	}

	/**
	 * Factory method for creating a new XPathNavigator object.
	 * @param xJdfStream XJdf document as input stream.
	 * @return Initialized XPathNavigator instance.
	 * @throws IOException Is being thrown in case an exception occurs.
	 */
	public static XPathNavigator newInstance(InputStream xJdfStream) throws Exception {

		// create and return new instance
		return new XPathNavigator(xJdfStream);
	}

	/**
	 * Read attribute from XJdf Document using XPath.
	 * @param xPath XPath expression of attribute to read.
	 * @return Value of attribute as String.
	 * @throws XPathExpressionException Is being thrown in case an exception occurs.
	 */
	public String readAttribute(String xPath) throws XPathExpressionException {
		
		String result;

		// reading of modified documents
        NodeList nodes = (NodeList) this.xPath.evaluate(xPath, xmlDocument, XPathConstants.NODESET);
        
        if(nodes.getLength() > 0) {
        	result = nodes.item(0).getNodeValue();
        } else {
        	result = null;
        }

        // return result
		return result;
	}

	/**
	 * Update attribute in XML Document. <br/>
	 * !! ATTENTION: WHEN CALLING THIS METHOD READ OPERATIONS BECOME SLOWER !!
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
	 * Return the xJdf document as input stream.
	 * @return XJdf document as input stream.
	 */
	public InputStream getXJdfStream() throws Exception {
		
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
