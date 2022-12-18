package org.cip4.lib.xjdf.xml.internal;

import org.apache.commons.io.output.XmlStreamWriter;
import org.apache.commons.lang3.StringUtils;
import org.cip4.lib.xjdf.type.AbstractXJdfType;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBException;
import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;

/**
 * Navigator class which simplify XPath handling using XML Documents.
 *
 * @author s.meissner
 * @author michel hartmann
 */
public class XmlNavigator {

    protected final XPath xPath;

    protected final Document xmlDocument;

    protected final NamespaceManager nsManager;

    /**
     * Custom constructor. Accepting a XML Document as Byte Array for initializing.
     *
     * @param xmlBytes XML Document as Byte Array.
     *
     * @throws ParserConfigurationException if a DocumentBuilder cannot be created
     * which satisfies the configuration requested.
     * @throws SAXException - If any parse errors occur.
     * @throws IOException - If any IO errors occur.
     */
    public XmlNavigator(final byte[] xmlBytes) throws ParserConfigurationException, SAXException, IOException {

        // chained constructor call
        this(xmlBytes, false);
    }

    /**
     * Custom constructor. Accepting a XML Document as Byte Array for initializing.
     *
     * @param xmlBytes XML Document as Byte Array.
     * @param namespaceAware True if navigator should be XML Namespace aware.
     *
     * @throws ParserConfigurationException if a DocumentBuilder cannot be created
     * which satisfies the configuration requested.
     * @throws SAXException - If any parse errors occur.
     * @throws IOException - If any IO errors occur.
     */
    public XmlNavigator(
        final byte[] xmlBytes,
        final boolean namespaceAware
    ) throws IOException, SAXException, ParserConfigurationException {

        // chained constructor call
        this(new ByteArrayInputStream(xmlBytes), namespaceAware);
    }

    /**
     * Custom constructor. Accepting a XML Document as Stream for initializing.
     *
     * @param xmlStream XML Document as Input Stream.
     *
     * @throws ParserConfigurationException if a DocumentBuilder cannot be created
     * which satisfies the configuration requested.
     * @throws SAXException - If any parse errors occur.
     * @throws IOException - If any IO errors occur.
     */
    public XmlNavigator(final InputStream xmlStream) throws IOException, SAXException, ParserConfigurationException {

        // chained constructor call
        this(xmlStream, false);
    }

    /**
     * Custom constructor. Accepting a XML Document as Stream for initializing.
     *
     * @param xmlStream XML Document as Input Stream.
     * @param namespaceAware True if navigator should be XML Namespace aware.
     *
     * @throws ParserConfigurationException if a DocumentBuilder cannot be created
     * which satisfies the configuration requested.
     * @throws SAXException - If any parse errors occur.
     * @throws IOException - If any IO errors occur.
     */
    public XmlNavigator(
        final InputStream xmlStream,
        final boolean namespaceAware
    ) throws ParserConfigurationException, IOException, SAXException {

        // init namespace manager
        nsManager = new NamespaceManager();

        // parse input stream
        DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
        docBuilderFactory.setNamespaceAware(namespaceAware);
        DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
        try (InputStream inputStream = xmlStream) {
            xmlDocument = docBuilder.parse(new InputSource(inputStream));
        }

        // create xPathFactory object
        XPathFactory xPathFactory = XPathFactory.newInstance();
        this.xPath = xPathFactory.newXPath();
        this.xPath.setNamespaceContext(nsManager);

    }

    /**
     * Getter for xmlDocument attribute.
     *
     * @return the xmlDocument
     */
    public Document getXmlDocument() {
        return xmlDocument;
    }

    /**
     * Add XML Namespace if navigator works namespace aware.
     *
     * @param prefix Prefix of Namespace.
     * @param uri Namespace URI.
     */
    public void addNamespace(String prefix, String uri) {

        // add namespace
        nsManager.addNamespace(prefix, uri);
    }

    /**
     * Read attribute from XML Document using XPath.
     *
     * @param xPath XPath expression of attribute to read.
     *
     * @return Value of attribute as String.
     * @throws XPathExpressionException Is being thrown in case an exception occurs.
     */
    public String readAttribute(String xPath) throws XPathExpressionException {

        // evaluate as string
        return (String) evaluate(xPath, XPathConstants.STRING);
    }

    /**
     * Read attribute from XML Document using XPath and convert to JDF Datatype.
     *
     * @param xPath XPath expression to evaluate.
     * @param xJdfType Target JDF Data Type of attribute.
     *
     * @return Value as JDF Data Type.
     * @throws XPathExpressionException Is thrown in case an XPath Exception occurs.
     * @throws ReflectiveOperationException Is thrown in case reflection fails.
     */
    public Object readAttribute(
        final String xPath,
        final Class xJdfType
    ) throws XPathExpressionException, ReflectiveOperationException {
        // evaluate as String
        String value = evaluateString(xPath);

        // convert to data type
        Constructor ctor = xJdfType.getDeclaredConstructor(String.class);
        return ctor.newInstance(value);
    }

    /**
     * Evaluates an XPath expression on XML Document and returns an generic object as result.
     *
     * @param xPath XPath expression to execute to.
     * @param qname QName as javax.xml.xpath.XPathConstants
     *
     * @return Generic result.
     * @throws XPathExpressionException Is thrown in case an XPath Exception occurs.
     */
    private Object evaluate(String xPath, QName qname) throws XPathExpressionException {

        // execute xpath
        return this.xPath.evaluate(xPath, xmlDocument, qname);
    }

    /**
     * Evaluates an XPath expression on XML Document and returns a Double object as result.
     *
     * @param xPath XPath expression to execute to.
     *
     * @return Expression result as double.
     * @throws XPathExpressionException Is thrown in case an XPath Exception occurs.
     */
    public double evaluateDouble(String xPath) throws XPathExpressionException {

        // evaluate and return result.
        return (Double) evaluate(xPath, XPathConstants.NUMBER);
    }

    /**
     * Evaluates an XPath expression on XML Document and returns an Integer value as result.
     *
     * @param xPath XPath expression to execute to.
     *
     * @return Expression result as integer.
     * @throws XPathExpressionException Is thrown in case an XPath Exception occurs.
     */
    public Integer evaluateInt(String xPath) throws XPathExpressionException {

        // evaluate expression.
        String s = (String) evaluate(xPath, XPathConstants.STRING);

        // convert to integer
        Integer result = null;

        if (!StringUtils.isEmpty(s) && StringUtils.isNumeric(s)) {
            result = Integer.parseInt(s);
        }

        // return result
        return result;
    }

    /**
     * Evaluates an XPath expression on XML Document and returns an Long value as result.
     *
     * @param xPath XPath expression to execute to.
     *
     * @return Expression result as long.
     * @throws XPathExpressionException Is thrown in case an XPath Exception occurs.
     */
    public Long evaluateLong(String xPath) throws XPathExpressionException {

        // evaluate expression.
        String s = (String) evaluate(xPath, XPathConstants.STRING);

        // convert to integer
        Long result = null;

        if (!StringUtils.isEmpty(s) && StringUtils.isNumeric(s)) {
            result = Long.parseLong(s);
        }

        // return result
        return result;
    }

    /**
     * Evaluates an XPath expression on XML Document and returns a String object as result.
     *
     * @param xPath XPath expression to execute to.
     *
     * @return Expression result as string.
     * @throws XPathExpressionException Is thrown in case an XPath Exception occurs.
     */
    public String evaluateString(String xPath) throws XPathExpressionException {

        // evaluate and return result.
        return (String) evaluate(xPath, XPathConstants.STRING);
    }

    /**
     * Evaluates an XPath expression on XML Document and returns a Node object as result.
     *
     * @param xPath XPath expression to execute to.
     *
     * @return Expression result as node.
     * @throws XPathExpressionException Is thrown in case an XPath Exception occurs.
     */
    public Node evaluateNode(String xPath) throws XPathExpressionException {

        // evaluate and return result.
        return (Node) evaluate(xPath, XPathConstants.NODE);
    }

    /**
     * Evaluates an XPath expression on XML Document and returns a NodeList object as result.
     *
     * @param xPath XPath expression to execute to.
     *
     * @return Expression result as node list.
     * @throws XPathExpressionException Is thrown in case an XPath Exception occurs.
     */
    public NodeList evaluateNodeList(String xPath) throws XPathExpressionException {

        // evaluate and return result.
        return (NodeList) evaluate(xPath, XPathConstants.NODESET);
    }

    /**
     * Evaluates an XPath expression on XML Document and returns the result as XJDF DataType.
     *
     * @param xPath XPath expression to execute to.
     * @param xJdfType The desired result data type.
     * @param <T> Type of the desired value object.
     *
     * @return Result as desired data type.
     * @throws XPathExpressionException Is thrown in case an XPath Exception occurs.
     * @throws ReflectiveOperationException Is thrown in case reflection fails.
     */
    public final <T extends AbstractXJdfType> T evaluate(
        final String xPath,
        final Class<T> xJdfType
    ) throws XPathExpressionException, ReflectiveOperationException {

        // evaluate string
        String value = evaluateString(xPath);

        // convert to data type
        Constructor ctor = xJdfType.getDeclaredConstructor(String.class);
        return xJdfType.cast(ctor.newInstance(value));
    }

    /**
     * Extract an XML Node from XML Document and return parsed result. <br>
     * !! WORKS ONLY IF NAVIGATOR IS NAMESPACE AWARE !!
     *
     * @param xPath XPath expression in order to locate the node.
     *
     * @return Expression result as parsed XML Node object.
     * @throws XPathExpressionException Is thrown in case an XPath Exception occurs.
     */
    protected Object extractNode(String xPath, AbstractXmlParser parser)
        throws XPathExpressionException, JAXBException {

        // evaluate and return result.
        Node node = evaluateNode(xPath);

        return parser.parseNode(node);
    }

    /**
     * Remove a node from XML Document locaed by the XPath expression.
     *
     * @param xPath Location of the node to be removed.
     */
    public void removeNode(String xPath) throws XPathExpressionException {

        // load old node for removal
        Node node = (Node) evaluate(xPath, XPathConstants.NODE);

        // remove
        Node parentNode = node.getParentNode();
        parentNode.removeChild(node);
    }

    /**
     * Replace a node in XML Document located by the XPath expression. <br>
     * !! WORKS ONLY IF NAVIGATOR IS NAMESPACE AWARE !!
     *
     * @param xPath Location of the node to be replaced.
     * @param replacement The new node.
     * @param parser XML Parser.
     */
    protected void replaceNode(String xPath, Object replacement, AbstractXmlParser parser)
        throws XPathExpressionException, JAXBException, ParserConfigurationException {

        // new temporarily xml document
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setNamespaceAware(true);
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.newDocument();

        // parse new node
        parser.parseNode(replacement, doc);
        Node newNode = getXmlDocument().adoptNode(doc.getFirstChild());

        // load old node for removal
        Node node = (Node) evaluate(xPath, XPathConstants.NODE);

        // replace
        Node parentNode = node.getParentNode();
        parentNode.removeChild(node);
        parentNode.appendChild(newNode);
    }

    /**
     * Evaluate an XPath expression on XML Document and returns an Boolean value as result.
     *
     * @param xPath XPath expression to execute to.
     *
     * @return Expression result as boolean value.
     * @throws XPathExpressionException Is thrown in case an XPath Exception occurs.
     */
    public boolean evaluateBoolean(String xPath) throws XPathExpressionException {

        // get value as String
        String value = evaluateString(xPath);

        // convert to boolean.
        return Boolean.parseBoolean(value);
    }

    /**
     * Update attribute in XML Document.
     *
     * @param xPath XPath expression of attribute to read.
     * @param value New value of attribute defined by xPath.
     *
     * @throws XPathExpressionException Is thrown in case an XPath Exception occurs.
     */
    public void updateAttribute(String xPath, AbstractXJdfType value) throws XPathExpressionException {

        // update
        updateAttribute(xPath, value.toString());
    }

    /**
     * Update attribute in XML Document.
     *
     * @param xPath XPath expression of attribute to read.
     * @param value New value of attribute defined by xPath.
     *
     * @throws XPathExpressionException Is thrown in case an XPath Exception occurs.
     */
    public void updateAttribute(String xPath, String value) throws XPathExpressionException {

        // locate and modify the node
        Attr result = (Attr) evaluate(xPath, XPathConstants.NODE);
        result.setValue(value);
    }

    /**
     * Return the XML Document as input stream.
     *
     * @return XML document as input stream.
     * @throws TransformerException If this document could not be transformed.
     * @throws IOException If any IO errors occur.
     */
    public InputStream getXmlStream() throws TransformerException, IOException {

        return new ByteArrayInputStream(getXmlBytes());
    }

    /**
     * Return the XML Document as Byte Array.
     *
     * @return XML Document as Byte Array.
     * @throws TransformerException If this document could not be transformed.
     * @throws IOException - If any IO errors occur.
     */
    public byte[] getXmlBytes() throws TransformerException, IOException {

        ByteArrayOutputStream bos;

        // new transformer
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer transformer = tf.newTransformer();
        transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
        transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");

        // transform document to string
        {
            bos = new ByteArrayOutputStream();
            XmlStreamWriter xmlWriter = new XmlStreamWriter(bos, "UTF-8");
            transformer.transform(new DOMSource(xmlDocument), new StreamResult(xmlWriter));
            bos.close();
        }

        byte[] strResult = bos.toByteArray();

        // make only line XML (reset formatting)
        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(strResult)));
        String line;
        StringBuilder sb = new StringBuilder();

        while ((line = br.readLine()) != null) {
            sb.append(line.trim());
        }

        // final formatting
        byte[] onlyLineResult = sb.toString().getBytes();

        {
            // new format
            bos = new ByteArrayOutputStream();
            XmlStreamWriter xmlWriter = new XmlStreamWriter(bos, "UTF-8");
            transformer.transform(
                new StreamSource(new ByteArrayInputStream(onlyLineResult)),
                new StreamResult(xmlWriter)
            );
            bos.close();
        }

        // add linebreake after comment
        String xml = new String(bos.toByteArray());
        StringBuilder b = new StringBuilder(xml);

        if (b.indexOf("--><") != -1)
            b.insert(b.indexOf("--><") + 3, "\r\n");

        xml = b.toString();

        // return bytes
        return xml.getBytes();
    }
}