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
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.cip4.lib.xjdf.xml.internal.XmlNavigator;

/**
 * Navigator class which simplify XPath handling using XJdf Documents.
 * @author s.meissner
 * @date 06.03.2012
 */
public class XJdfNavigator extends XmlNavigator {

	/**
	 * XPath to attribute 'JobID' in XJDF Document.
	 */
	public static final String JOB_ID = "/XJDF/@JobID";

	/**
	 * XPath to attribute 'Category' in XJDF Document.
	 */
	public static final String CATEGORY = "/XJDF/@Category";

	/**
	 * XPath to attribute 'IDValue' of GeneralID 'CatalogID' in XJDF Document.
	 */
	public static final String GENERAL_CATALOG_ID = "/XJDF/GeneralID[@IDUsage='CatalogID']/@IDValue";

	/**
	 * XPath to attribute 'IDValue' of GeneralID 'LineID' in XJDF Document.
	 */
	public static final String GENERAL_LINE_ID = "/XJDF/GeneralID[@IDUsage='LineID']/@IDValue";

	/**
	 * XPath to attribute 'URL' of a single RunList/FileSpec definition in XJDF Document.
	 */
	public static final String FILE_SPEC_URL = "/XJDF/ParameterSet[@Name='RunList']/Parameter/RunList/FileSpec/@URL";

	/**
	 * XPath to attribute 'MinApprovals' of ApprovalParams Node in XJDF Document.
	 */
	public static final String MIN_APPROVALS = "/XJDF/ParameterSet[@Name='ApprovalParams']/Parameter/ApprovalParams/@MinApprovals";

	/**
	 * XPath to attribute 'CustomerID' of CustomerInfo Node in XJDF Document.
	 */
	public static final String CUSTOMER_ID = "/XJDF/ParameterSet[@Name='CustomerInfo']/Parameter/CustomerInfo/@CustomerID";

	/**
	 * XPath to attribute 'Amount' of Product Node in XJDF Document.
	 */
	public static final String AMOUNT = "/XJDF/ProductList/Product/@Amount";

	/**
	 * XPath to attribute 'MediaQuality' of MediaIntent Node in XJDF Document.
	 */
	public static final String MEDIA_QUALITY = "/XJDF/ProductList/Product/Intent[@Name='MediaIntent']/MediaIntent/@MediaQuality";

	/**
	 * XPath to attribute 'FinishedDimensions' of LayoutIntent Node in XJDF Document.
	 */
	public static final String LAYOUT_FINISHED_DIMENSIONS = "/XJDF/ProductList/Product/Intent[@Name='LayoutIntent']/LayoutIntent/@FinishedDimensions";

	/**
	 * XPath to attribute 'Dimensions' of LayoutIntent Node in XJDF Document.
	 */
	public static final String LAYOUT_DIMENSIONS = "/XJDF/ProductList/Product/Intent[@Name='LayoutIntent']/LayoutIntent/@Dimensions";

	/**
	 * XPath to attribute 'PrintProcess' of ProductionIntent Node in XJDF Document.
	 */
	public static final String PRODUCTION_PRINT_PROCESS = "/XJDF/ProductList/Product/Intent[@Name='ProductionIntent']/ProductionIntent/@PrintProcess";

	/**
	 * XPath to attribute 'FoldingCatalog' of FoldingIntent Node in XJDF Document.
	 */
	public static final String FOLDING_CATALOG = "/XJDF/ProductList/Product/Intent[@Name='FoldingIntent']/FoldingIntent/@FoldingCatalog";

	/**
	 * XPath to attribute 'NumColors' of ColorIntent Node in XJDF Document.
	 */
	public static final String COLOR_NUM_COLORS = "/XJDF/ProductList/Product/Intent[@Name='ColorIntent']/ColorIntent/@NumColors";

	/**
	 * Custom constructor. Accepting a XJdf InputStream for initializing.
	 * @param xJdfStream The XJDF Input Stream.
	 */
	public XJdfNavigator(InputStream xJdfStream) throws Exception {
		this(xJdfStream, false);
	}

	/**
	 * Custom constructor. Accepting a XJdf InputStream for initializing.
	 * @param xJdfStream The XJDF Input Stream.
	 * @param namespaceAware True if navigator should be XML Namespace aware.
	 */
	public XJdfNavigator(InputStream xJdfStream, boolean namespaceAware) throws Exception {

		// call super class
		super(xJdfStream, namespaceAware);

		// add namespace
		addNamespace("xjdf", XJdfConstants.NAMESPACE_JDF20);
	}

	/**
	 * Custom constructor. Accepting a path for initializing.
	 * @param xjdfPath The path to the XJDF Document.
	 * @throws Exception
	 */
	public XJdfNavigator(String xjdfPath) throws Exception {
		this(new FileInputStream(xjdfPath));
	}

	/**
	 * Custom constructor. Accepting a path for initializing.
	 * @param xjdfPath The path to the XJDF Document.
	 * @param namespaceAware True if navigator should be XML Namespace aware.
	 * @throws Exception
	 */
	public XJdfNavigator(String xjdfPath, boolean namespaceAware) throws Exception {
		this(new FileInputStream(xjdfPath), namespaceAware);
	}

	/**
	 * Custom constructor. Accepting a file for initializing.
	 * @param xjdfPath The file of the XJDF Document.
	 * @throws Exception
	 */
	public XJdfNavigator(File xjdfFile) throws Exception {
		this(new FileInputStream(xjdfFile));
	}

	/**
	 * Custom constructor. Accepting a file for initializing.
	 * @param xjdfPath The file of the XJDF Document.
	 * @param namespaceAware True if navigator should be XML Namespace aware.
	 * @throws Exception
	 */
	public XJdfNavigator(File xjdfFile, boolean namespaceAware) throws Exception {
		this(new FileInputStream(xjdfFile), namespaceAware);
	}

	/**
	 * Custom constructor. Accepting a XJdf InputStream for initializing.
	 * @param xJdfBytes The XJDF as byte array.
	 * @throws Exception
	 */
	public XJdfNavigator(byte[] xJdfBytes) throws Exception {
		this(new ByteArrayInputStream(xJdfBytes));
	}

	/**
	 * Custom constructor. Accepting a XJdf InputStream for initializing.
	 * @param xJdfBytes The XJDF as byte array.
	 * @param namespaceAware True if navigator should be XML Namespace aware.
	 * @throws Exception
	 */
	public XJdfNavigator(byte[] xJdfBytes, boolean namespaceAware) throws Exception {
		this(new ByteArrayInputStream(xJdfBytes), namespaceAware);
	}

	/**
	 * Evaluates an XPath expression on XML Document and returns a parsed Node object as result.
	 * @param xPath XPath expression to execute to.
	 * @return The parsed XJDF Node object.
	 * @throws XPathExpressionException
	 * @throws JAXBException
	 */
	public Object extractNode(String xPath) throws XPathExpressionException, JAXBException {
		return super.extractNode(xPath, new XJdfParser());
	}

	/**
	 * Replace a node in XML Document located by the XPath expression.
	 * @param xPath Location of the node to be replaced.
	 * @param replacement The new node.
	 * @throws ParserConfigurationException
	 * @throws JAXBException
	 * @throws XPathExpressionException
	 */
	public void replaceNode(String xPath, Object replacement) throws XPathExpressionException, JAXBException, ParserConfigurationException {
		super.replaceNode(xPath, replacement, new XJdfParser());
	}

}
