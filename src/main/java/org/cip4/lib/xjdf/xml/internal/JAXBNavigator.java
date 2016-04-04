package org.cip4.lib.xjdf.xml.internal;

import org.cip4.lib.xjdf.xml.XJdfConstants;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import javax.xml.bind.Binder;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

/**
 * Navigator between java and xml representations of an entity.
 *
 * @param <T> Entity type.
 */
public class JAXBNavigator<T> {

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
     * Constructor.
     *
     * @param jaxbType The type to be bound.
     *
     * @throws JAXBException If binding fails.
     */
    public JAXBNavigator(final T jaxbType) throws JAXBException {
        xPath = initXpath();
        document = createDocument();
        binder = initBinder();
        binder.marshal(jaxbType, document);
    }

    /**
     * Evaluates an XPath expression.
     *
     * @param xPathExpression The expression to evaluate.
     * @param returnType The QName of the return type.
     *
     * @return Evaluation result
     *
     * @throws XPathExpressionException If an error exists in the XPath expression.
     */
    public final Object evaluate(final String xPathExpression, final QName returnType) throws XPathExpressionException {
        return xPath.evaluate(xPathExpression, document, returnType);
    }

    /**
     * Get the JAXB node equivalent for the given node.
     *
     * @param node Given node.
     *
     * @return Corresponding JAXB node.
     */
    public final Object getJAXBNode(final Node node) {
        return binder.getJAXBNode(node);
    }

    /**
     * Initializes the binder.
     *
     * @return The binder.
     */
    private Binder<Node> initBinder() {
        try {
            JAXBContext jaxbContext = JAXBContextFactory.getInstance();
            return jaxbContext.createBinder();
        } catch (JAXBException e) {
            throw new IllegalArgumentException("Could not create the binder.", e);
        }
    }

    /**
     * Creates an empty W3C document.
     *
     * @return The W3C document
     */
    private Document createDocument() {
        try {
            final DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            documentBuilderFactory.setNamespaceAware(true);
            return documentBuilderFactory.newDocumentBuilder().newDocument();
        } catch (ParserConfigurationException e) {
            throw new IllegalArgumentException("Could not initialize the document.", e);
        }
    }

    /**
     * Initializes an XPath.
     *
     * @return The XPath
     */
    private static XPath initXpath() {
        XPathFactory xPathFactory = XPathFactory.newInstance();
        XPath xPath = xPathFactory.newXPath();
        final NamespaceManager namespaceManager = new NamespaceManager();
        namespaceManager.addNamespace("xjdf", XJdfConstants.NAMESPACE_JDF20);
        xPath.setNamespaceContext(namespaceManager);
        return xPath;
    }
}
