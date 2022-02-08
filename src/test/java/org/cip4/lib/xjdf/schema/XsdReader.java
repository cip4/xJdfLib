package org.cip4.lib.xjdf.schema;

import org.cip4.lib.xjdf.xml.internal.NamespaceManager;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class XsdReader {

    private Document schema;
    private XPath xPath;

    public XsdReader() throws Exception {
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        builderFactory.setNamespaceAware(true);
        DocumentBuilder builder = builderFactory.newDocumentBuilder();

        try (InputStream inputStream = this.getClass().getResourceAsStream("/JDF21.xsd")) {
            schema = builder.parse(new InputSource(inputStream));
        }

        NamespaceManager nsManager = new NamespaceManager();
        nsManager.addNamespace("xs", XMLConstants.W3C_XML_SCHEMA_NS_URI);

        XPathFactory xPathFactory = XPathFactory.newInstance();
        xPath = xPathFactory.newXPath();
        xPath.setNamespaceContext(nsManager);
    }

    public Set<Node> complexTypeProperties(final String complexType) throws Exception {
        return typeProperties(
            (Node) xPath.evaluate(
                String.format(
                    "//xs:complexType[@name='%s'] | //xs:complexType[../@name='%s']",
                    complexType,
                    complexType
                ),
                schema,
                XPathConstants.NODE
            )
        );
    }

    private Set<Node> typeProperties(Node complexType) {
        Set<Node> properties = new HashSet<>();
        properties.addAll(typeProperties(complexType, "element"));
        properties.addAll(typeProperties(complexType, "attribute"));
        return properties;
    }

    public Collection<Node> typeProperties(Node complexType, String propertyType) {
        try {
            NodeList nodeList = (NodeList) xPath.evaluate(
                String.format(".//xs:%s", propertyType),
                complexType,
                XPathConstants.NODESET
            );
            Set<Node> nodes = new HashSet<>(nodeList.getLength());
            for (int i = 0; i < nodeList.getLength(); ++i) {
                nodes.add(nodeList.item(i));
            }

            String parentType = xPath.evaluate(".//xs:extension/@base", complexType);
            if (!"".equals(parentType) && !"xs:string".equals(parentType)) {
                Node parentComplexTypeNode = (Node) xPath.evaluate(
                    String.format("//xs:complexType[@name='%s']", parentType),
                    schema,
                    XPathConstants.NODE
                );
                nodes.addAll(typeProperties(parentComplexTypeNode, propertyType));
            }
            return nodes;
        } catch (XPathExpressionException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Node> evaluateNodeList(final String xPathExpression) throws XPathExpressionException {
        return nodeListToList((NodeList) xPath.evaluate(
            xPathExpression,
            schema,
            XPathConstants.NODESET
        ));
    }

    public NodeList evaluateNodeList(final String xPathExpression, final Node parentNode)
        throws XPathExpressionException {
        return (NodeList) xPath.evaluate(
            xPathExpression,
            parentNode,
            XPathConstants.NODESET
        );
    }

    public String localNameOfComplexType(final Node complexTypeNode) {
        try {
            return xPath.evaluate(
                "@name | ../@name",
                complexTypeNode
            );
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private List<Node> nodeListToList(NodeList nodeList) {
        List<Node> result = new ArrayList<>(nodeList.getLength());
        for (int i = 0; i < nodeList.getLength(); ++i) {
            result.add(nodeList.item(i));
        }
        return result;
    }
}
