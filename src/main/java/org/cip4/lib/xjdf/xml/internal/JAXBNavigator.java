package org.cip4.lib.xjdf.xml.internal;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.bind.Binder;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

/**
 * Navigator class which simplifies XPath handling using any JAXB object.
 *
 * @param <T> Entity type.
 */
public class JAXBNavigator<T> {

    /**
     * JAXB object to bind.
     */
    private T jaxbObj;

    /**
     * XPath.
     */
    private final XPath xPath;

    /**
     * W3C Document.
     */
    private final Document document;

    /**
     * Binder for the node.
     */
    private final Binder<Node> binder;
    /**
     * Namespace manager.
     */
    private NamespaceManager namespaceManager = new NamespaceManager();

    /**
     * Constructor performing the setup for simplifying XPath handling using any JAXB object.
     *
     * @param jaxbObj The jaxb object to be bound.
     *
     * @throws JAXBException If binding fails.
     * @throws ParserConfigurationException If binding fails.
     */
    public JAXBNavigator(final T jaxbObj) throws JAXBException, ParserConfigurationException {
        this.jaxbObj = jaxbObj;
        xPath = createXPath();
        document = createDocument();
        binder = createBinder((Class<T>) jaxbObj.getClass());
        binder.marshal(jaxbObj, document);
    }

    /**
     * Evaluates an XPath expression. This method works only for xml nodes.
     *
     * @param xPathExpression The expression to evaluate.
     *
     * @return Evaluation result
     * @throws XPathExpressionException If an error occurs in the XPath expression.
     */
    public final Object evaluateNode(final String xPathExpression) throws XPathExpressionException {
        final Node node = (Node) xPath.evaluate(xPathExpression, document, XPathConstants.NODE);
        return binder.getJAXBNode(node);
    }

    /**
     * Evaluates an XPath expression. This method works only for xml node lists.
     *
     * @param xPathExpression The expression to evaluate.
     *
     * @return Evaluation result
     * @throws XPathExpressionException If an error occurs in the XPath expression.
     */
    public final Object[] evaluateNodeList(final String xPathExpression) throws XPathExpressionException {
        final NodeList nodeList = (NodeList) xPath.evaluate(xPathExpression, document, XPathConstants.NODESET);
        Object[] collection = new Object[nodeList.getLength()];
        for (int i = 0; i < nodeList.getLength(); i++) {
            final Object jaxbNode = binder.getJAXBNode(nodeList.item(i));
            collection[i] = jaxbNode;
        }
        return collection;
    }

    /**
     * Adds a namespace to the xpath.
     *
     * @param prefix Namespace prefix.
     * @param namespaceUri URI of the namespace.
     */
    public final void addNamespace(final String prefix, final String namespaceUri) {
        namespaceManager.addNamespace(prefix, namespaceUri);
    }

    /**
     * Get the JAXB object.
     *
     * @return JAXB object.
     */
    public final T getRoot() {
        return jaxbObj;
    }

    /**
     * Initializes the binder.
     *
     * @param jaxbType Class to be bound.
     *
     * @return The binder.
     */
    private Binder<Node> createBinder(final Class<T> jaxbType) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(jaxbType);
            return jaxbContext.createBinder();
        } catch (JAXBException e) {
            throw new IllegalArgumentException("Could not create the binder.", e);
        }
    }

    /**
     * Creates an empty W3C document.
     *
     * @return The W3C document
     * @throws ParserConfigurationException - If creating a W3C document fails.
     */
    private Document createDocument() throws ParserConfigurationException {
        final DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        documentBuilderFactory.setNamespaceAware(true);
        return documentBuilderFactory.newDocumentBuilder().newDocument();
    }

    /**
     * Initializes an XPath.
     *
     * @return The XPath
     */
    private XPath createXPath() {
        XPathFactory xPathFactory = XPathFactory.newInstance();
        final XPath result = xPathFactory.newXPath();
        result.setNamespaceContext(namespaceManager);
        return result;
    }
}
