package org.cip4.lib.xjdf.xml.internal;

import org.apache.commons.lang3.reflect.FieldUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.bind.Binder;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.lang.reflect.Field;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Navigator class which simplifies XPath handling using any JAXB object.
 *
 * @param <T> Entity type.
 */
public class JAXBNavigator<T> {

    /**
     * Regex to identify xpath expressions with attribute.
     */
    private static final Pattern XPATH_WITH_ATTR_PATTERN = Pattern.compile("^(.+)(/@[a-zA-Z0-9_-]+)$");

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
    private Document document;

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
        binder = createBinder((Class<T>) jaxbObj.getClass());
        sync();

    }

    /**
     * Evaluates an XPath expression.
     *
     * @param xPathExpression The expression to evaluate.
     *
     * @return Evaluation result
     * @throws XPathExpressionException If an error occurs in the XPath expression.
     */
    private Object evaluate(final String xPathExpression) throws XPathExpressionException {
        final Matcher matcher = XPATH_WITH_ATTR_PATTERN.matcher(xPathExpression);

        if (matcher.matches()) {
            final Node node = (Node) xPath.evaluate(matcher.group(1), document, XPathConstants.NODE);
            if (node != null) {
                final Object ownerObj = binder.getJAXBNode(node);

                if (ownerObj != null) {
                    final String fieldName = matcher.group(2).substring(2);

                    final Field[] fields = FieldUtils.getFieldsWithAnnotation(ownerObj.getClass(), XmlAttribute.class);
                    for (final Field field : fields) {
                        final XmlAttribute xmlAttribute = field.getAnnotation(XmlAttribute.class);
                        if (fieldName.equals(xmlAttribute.name())) {
                            try {
                                return FieldUtils.readField(field, ownerObj, true);
                            } catch (IllegalAccessException e) {
                                throw new RuntimeException(
                                    String.format("Could not get value from field '%s'.", field.getName()),
                                    e
                                );
                            }
                        }
                    }
                }
            }

            return null;
        }

        final Node node = (Node) xPath.evaluate(xPathExpression, document, XPathConstants.NODE);
        if (node == null) {
            return null;
        }

        return binder.getJAXBNode(node);
    }

    /**
     * Evaluates an XPath expression and returns an Integer value as result.
     *
     * @param xPathExpression The expression to evaluate.
     *
     * @return Evaluation result as Integer
     * @throws XPathExpressionException If an error occurs in the XPath expression.
     */
    public final Integer evaluateInt(final String xPathExpression) throws XPathExpressionException {
        return (Integer) evaluate(xPathExpression);
    }

    /**
     * Evaluates an XPath expression and returns an Double value as result.
     *
     * @param xPathExpression The expression to evaluate.
     *
     * @return Evaluation result as Double
     * @throws XPathExpressionException If an error occurs in the XPath expression.
     */
    public final Double evaluateDouble(final String xPathExpression) throws XPathExpressionException {
        return (Double) evaluate(xPathExpression);
    }

    /**
     * Evaluates an XPath expression and returns an String value as result.
     *
     * @param xPathExpression The expression to evaluate.
     *
     * @return Evaluation result as String
     * @throws XPathExpressionException If an error occurs in the XPath expression.
     */
    public final String evaluateString(final String xPathExpression) throws XPathExpressionException {
        return (String) evaluate(xPathExpression);
    }

    /**
     * Evaluates an XPath expression and returns the Object.
     *
     * @param xPathExpression The expression to evaluate.
     *
     * @return Evaluation result
     * @throws XPathExpressionException If an error occurs in the XPath expression.
     */
    public final Object evaluateNode(final String xPathExpression) throws XPathExpressionException {
        return evaluate(xPathExpression);
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
     *
     * @return this JAXBNavigator
     */
    public final JAXBNavigator<T> addNamespace(final String prefix, final String namespaceUri) {
        namespaceManager.addNamespace(prefix, namespaceUri);
        return this;
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

    /**
     * Sync changes made on the object graph.
     *
     * @return this JAXBNavigator
     * @throws JAXBException If any unexpected problem occurs during the marshalling.
     * @throws ParserConfigurationException If creating a W3C document fails.
     */
    public final JAXBNavigator<T> sync() throws JAXBException, ParserConfigurationException {
        document = createDocument();
        binder.marshal(jaxbObj, document);

        return this;
    }
}
