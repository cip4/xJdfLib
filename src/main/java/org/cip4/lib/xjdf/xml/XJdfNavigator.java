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

import org.cip4.lib.xjdf.xml.internal.XmlNavigator;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Navigator class which simplify XPath handling using XJdf Documents.
 *
 * @author s.meissner
 * @author michel hartmann
 */
public class XJdfNavigator extends XmlNavigator {

    /**
     * XPath to attribute 'JobID' in XJDF Document.
     */
    public static final String JOB_ID = "/xjdf:XJDF/@JobID";

    /**
     * XPath to attribute 'Category' in XJDF Document.
     */
    public static final String CATEGORY = "/xjdf:XJDF/@Category";

    /**
     * XPath to attribute 'IDValue' of GeneralID 'CatalogID' in XJDF Document.
     */
    public static final String GENERAL_CATALOG_ID = "/xjdf:XJDF/xjdf:GeneralID[@IDUsage='CatalogID']/@IDValue";

    /**
     * XPath to attribute 'IDValue' of GeneralID 'LineID' in XJDF Document.
     */
    public static final String GENERAL_LINE_ID = "/xjdf:XJDF/xjdf:GeneralID[@IDUsage='LineID']/@IDValue";

    /**
     * XPath to attribute 'URL' of a single RunList/FileSpec definition in XJDF Document.
     */
    public static final String FILE_SPEC_URL = "/xjdf:XJDF/xjdf:ParameterSet[@Name='RunList']/xjdf:Parameter/xjdf:RunList/xjdf:FileSpec/@URL";

    /**
     * XPath to attribute 'MinApprovals' of ApprovalParams Node in XJDF Document.
     */
    public static final String MIN_APPROVALS = "/xjdf:XJDF/xjdf:ParameterSet[@Name='ApprovalParams']/xjdf:Parameter/xjdf:ApprovalParams/@MinApprovals";

    /**
     * XPath to attribute 'CustomerID' of CustomerInfo Node in XJDF Document.
     */
    public static final String CUSTOMER_ID = "/xjdf:XJDF/xjdf:ParameterSet[@Name='CustomerInfo']/xjdf:Parameter/xjdf:CustomerInfo/@CustomerID";

    /**
     * XPath to attribute 'Amount' of Product Node in XJDF Document.
     */
    public static final String AMOUNT = "/xjdf:XJDF/xjdf:ProductList/xjdf:Product/@Amount";

    /**
     * XPath to attribute 'MediaQuality' of MediaIntent Node in XJDF Document.
     */
    public static final String MEDIA_QUALITY = "/xjdf:XJDF/xjdf:ProductList/xjdf:Product/xjdf:Intent[@Name='MediaIntent']/xjdf:MediaIntent/@MediaQuality";

    /**
     * XPath to attribute 'FinishedDimensions' of LayoutIntent Node in XJDF Document.
     */
    public static final String LAYOUT_FINISHED_DIMENSIONS = "/xjdf:XJDF/xjdf:ProductList/xjdf:Product/xjdf:Intent[@Name='LayoutIntent']/xjdf:LayoutIntent/@FinishedDimensions";

    /**
     * XPath to attribute 'Dimensions' of LayoutIntent Node in XJDF Document.
     */
    public static final String LAYOUT_DIMENSIONS = "/xjdf:XJDF/xjdf:ProductList/xjdf:Product/xjdf:Intent[@Name='LayoutIntent']/xjdf:LayoutIntent/@Dimensions";

    /**
     * XPath to attribute 'PrintProcess' of ProductionIntent Node in XJDF Document.
     */
    public static final String PRODUCTION_PRINT_PROCESS = "/xjdf:XJDF/xjdf:ProductList/xjdf:Product/xjdf:Intent[@Name='ProductionIntent']/xjdf:ProductionIntent/@PrintProcess";

    /**
     * XPath to attribute 'FoldingCatalog' of FoldingIntent Node in XJDF Document.
     */
    public static final String FOLDING_CATALOG = "/xjdf:XJDF/xjdf:ProductList/xjdf:Product/xjdf:Intent[@Name='FoldingIntent']/xjdf:FoldingIntent/@FoldingCatalog";

    /**
     * XPath to attribute 'NumColors' of ColorIntent Node in XJDF Document.
     */
    public static final String COLOR_NUM_COLORS = "/xjdf:XJDF/xjdf:ProductList/xjdf:Product/xjdf:Intent[@Name='ColorIntent']/xjdf:ColorIntent/@NumColors";

    /**
     * Custom constructor. Accepting a XJdf InputStream for initializing.
     *
     * @param xJdfStream The XJDF Input Stream.
     *
     * @throws ParserConfigurationException if a DocumentBuilder cannot be created
     * which satisfies the configuration requested.
     * @throws SAXException - If any parse errors occur.
     * @throws IOException - If any IO errors occur.
     */
    public XJdfNavigator(final InputStream xJdfStream) throws ParserConfigurationException, SAXException, IOException {
        this(xJdfStream, false);
    }

    /**
     * Custom constructor. Accepting a XJdf InputStream for initializing.
     *
     * @param xJdfStream The XJDF Input Stream.
     * @param namespaceAware True if navigator should be XML Namespace aware.
     *
     * @throws ParserConfigurationException if a DocumentBuilder cannot be created
     * which satisfies the configuration requested.
     * @throws SAXException - If any parse errors occur.
     * @throws IOException - If any IO errors occur.
     */
    public XJdfNavigator(
        final InputStream xJdfStream,
        final boolean namespaceAware
    ) throws IOException, SAXException, ParserConfigurationException {

        // call super class
        super(xJdfStream, namespaceAware);

        // add namespace
        addNamespace("xjdf", XJdfConstants.NAMESPACE_JDF20);
    }

    /**
     * Custom constructor. Accepting a path for initializing.
     *
     * @param xjdfPath The path to the XJDF Document.
     *
     * @throws ParserConfigurationException if a DocumentBuilder cannot be created
     * which satisfies the configuration requested.
     * @throws SAXException - If any parse errors occur.
     * @throws IOException - If any IO errors occur.
     */
    public XJdfNavigator(final String xjdfPath) throws IOException, SAXException, ParserConfigurationException {
        this(new FileInputStream(xjdfPath));
    }

    /**
     * Custom constructor. Accepting a path for initializing.
     *
     * @param xjdfPath The path to the XJDF Document.
     * @param namespaceAware True if navigator should be XML Namespace aware.
     *
     * @throws ParserConfigurationException if a DocumentBuilder cannot be created
     * which satisfies the configuration requested.
     * @throws SAXException - If any parse errors occur.
     * @throws IOException - If any IO errors occur.
     */
    public XJdfNavigator(
        final String xjdfPath,
        final boolean namespaceAware
    ) throws IOException, ParserConfigurationException, SAXException {
        this(new FileInputStream(xjdfPath), namespaceAware);
    }

    /**
     * Custom constructor. Accepting a file for initializing.
     *
     * @param xjdfFile The file of the XJDF Document.
     *
     * @throws ParserConfigurationException if a DocumentBuilder cannot be created
     * which satisfies the configuration requested.
     * @throws SAXException - If any parse errors occur.
     * @throws IOException - If any IO errors occur.
     */
    public XJdfNavigator(final File xjdfFile) throws IOException, SAXException, ParserConfigurationException {
        this(new FileInputStream(xjdfFile));
    }

    /**
     * Custom constructor. Accepting a file for initializing.
     *
     * @param xjdfFile The file of the XJDF Document.
     * @param namespaceAware True if navigator should be XML Namespace aware.
     *
     * @throws ParserConfigurationException if a DocumentBuilder cannot be created
     * which satisfies the configuration requested.
     * @throws SAXException - If any parse errors occur.
     * @throws IOException - If any IO errors occur.
     */
    public XJdfNavigator(
        final File xjdfFile,
        final boolean namespaceAware
    ) throws IOException, ParserConfigurationException, SAXException {
        this(new FileInputStream(xjdfFile), namespaceAware);
    }

    /**
     * Custom constructor. Accepting a XJdf InputStream for initializing.
     *
     * @param xJdfBytes The XJDF as byte array.
     *
     * @throws ParserConfigurationException if a DocumentBuilder cannot be created
     * which satisfies the configuration requested.
     * @throws SAXException - If any parse errors occur.
     * @throws IOException - If any IO errors occur.
     */
    public XJdfNavigator(final byte[] xJdfBytes) throws IOException, SAXException, ParserConfigurationException {
        this(new ByteArrayInputStream(xJdfBytes));
    }

    /**
     * Custom constructor. Accepting a XJdf InputStream for initializing.
     *
     * @param xJdfBytes The XJDF as byte array.
     * @param namespaceAware True if navigator should be XML Namespace aware.
     *
     * @throws ParserConfigurationException if a DocumentBuilder cannot be created
     * which satisfies the configuration requested.
     * @throws SAXException - If any parse errors occur.
     * @throws IOException - If any IO errors occur.
     */
    public XJdfNavigator(
        final byte[] xJdfBytes,
        final boolean namespaceAware
    ) throws ParserConfigurationException, SAXException, IOException {
        this(new ByteArrayInputStream(xJdfBytes), namespaceAware);
    }

    /**
     * Evaluates an XPath expression on XML Document and returns a parsed Node object as result.
     *
     * @param xPath XPath expression to execute to.
     *
     * @return The parsed XJDF Node object.
     * @throws XPathExpressionException
     * @throws JAXBException
     */
    public Object extractNode(String xPath) throws XPathExpressionException, JAXBException {
        return super.extractNode(xPath, new XJdfParser());
    }

    /**
     * Replace a node in XML Document located by the XPath expression.
     *
     * @param xPath Location of the node to be replaced.
     * @param replacement The new node.
     *
     * @throws ParserConfigurationException
     * @throws JAXBException
     * @throws XPathExpressionException
     */
    public void replaceNode(String xPath, Object replacement)
        throws XPathExpressionException, JAXBException, ParserConfigurationException {
        super.replaceNode(xPath, replacement, new XJdfParser());
    }

}
