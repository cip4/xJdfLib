package org.cip4.lib.xjdf.xml.internal;

import org.cip4.lib.xjdf.xml.XJdfConstants;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

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
        binder = initBinder((Class<T>) jaxbType.getClass());
        binder.marshal(jaxbType, document);
    }

    /**
     * Evaluates an XPath expression. This method works only for xml elements. Xml attributes are <b>not</b> supported.
     *
     * @param xPathExpression The expression to evaluate.
     * @param returnType The QName of the return type.
     *
     * @return Evaluation result
     * @throws XPathExpressionException If an error occurs in the XPath expression.
     */
    public final Object evaluate(final String xPathExpression, final QName returnType) throws XPathExpressionException {
        final Object evaluation = xPath.evaluate(xPathExpression, document, returnType);
        if (evaluation instanceof Node) {
            return binder.getJAXBNode((Node) evaluation);
        } else if (evaluation instanceof NodeList) {
            final NodeList nodeList = (NodeList) evaluation;
            Object[] collection = new Object[nodeList.getLength()];
            for (int i = 0; i < nodeList.getLength(); i++) {
                final Object jaxbNode = binder.getJAXBNode(nodeList.item(i));
                collection[i] = jaxbNode;
            }
            return collection;
        }
        throw new IllegalArgumentException(
            String.format(
                "JAXBNavigator only supports node and nodeset as return type. Current type is '%s'",
                returnType
            )
        );
    }

    /**
     * Initializes the binder.
     *
     * @param jaxbType Class to be bound.
     *
     * @return The binder.
     */
    private Binder<Node> initBinder(final Class<T> jaxbType) {
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
