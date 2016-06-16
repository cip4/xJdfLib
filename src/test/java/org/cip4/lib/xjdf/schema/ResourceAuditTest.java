package org.cip4.lib.xjdf.schema;

import org.cip4.lib.xjdf.xml.internal.NamespaceManager;
import org.junit.Before;
import org.junit.ComparisonFailure;
import org.junit.Test;
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
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;


public class ResourceAuditTest {

    private static Document XJDF_SCHEMA;
    private XPath xPath;

    @Before
    public void setUp() throws Exception {
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        builderFactory.setNamespaceAware(true);
        DocumentBuilder builder = builderFactory.newDocumentBuilder();

        try (InputStream inputStream = this.getClass().getResourceAsStream("/JDF20.xsd")) {
            XJDF_SCHEMA = builder.parse(new InputSource(inputStream));
        }

        NamespaceManager nsManager = new NamespaceManager();
        nsManager.addNamespace("xs", XMLConstants.W3C_XML_SCHEMA_NS_URI);

        XPathFactory xPathFactory = XPathFactory.newInstance();
        xPath = xPathFactory.newXPath();
        xPath.setNamespaceContext(nsManager);
    }

    @Test
    public void signalResourceAndResourceAuditAreAligned() throws Exception {
        Set<Node> signalResourceProperties = typeProperties(
            (Node) xPath.evaluate("//xs:complexType[@name='SignalResource']", XJDF_SCHEMA, XPathConstants.NODE)
        );
        Set<Node> auditResourceProperties = typeProperties(
            (Node) xPath.evaluate("//xs:complexType[@name='ResourceAudit']", XJDF_SCHEMA, XPathConstants.NODE)
        );

        assertTrue(signalResourceProperties.size() > 0);
        assertSetEquals(signalResourceProperties, auditResourceProperties);
    }

    private void assertSetEquals(final Set<Node> expectedSet, final Set<Node> actualSet) {
        if (!isSubset(expectedSet, actualSet) || !isSubset(actualSet, expectedSet)) {
            throw new ComparisonFailure(
                null,
                nodeSetToString(expectedSet),
                nodeSetToString(actualSet)
            );
        }
    }

    private boolean isSubset(final Set<Node> subset, final Set<Node> superSet) {
        for (Node needle : subset) {
            if (!contains(needle, superSet)) {
                return false;
            }
        }
        return true;
    }

    private boolean contains(final Node needle, final Collection<Node> collection) {
        for (Node candidate : collection) {
            if (needle.isEqualNode(candidate)) {
                return true;
            }
        }
        return false;
    }

    private String nodeSetToString(Set<Node> nodes) {
        StringBuilder strBuf = new StringBuilder("<");
        for (Node node : nodes) {
            strBuf.append(nodeToString(node)).append(", ");
        }
        return strBuf.append(">").toString();
    }

    private String nodeToString(Node node) {
        if ("attribute".equals(node.getLocalName())) {
            return String.format(
                "[%s:%s]",
                node.getLocalName(),
                node.getAttributes().getNamedItem("name").getNodeValue()
            );
        } else if ("element".equals(node.getLocalName())) {
            return String.format(
                "[%s:%s]",
                node.getLocalName(),
                node.getAttributes().getNamedItem("ref").getNodeValue()
            );
        } else {
            return node.toString();
        }
    }

    private Set<Node> typeProperties(Node complexType) throws Exception {
        Set<Node> properties = new HashSet<>();
        properties.addAll(typeProperties(complexType, "element"));
        properties.addAll(typeProperties(complexType, "attribute"));
        return properties;
    }

    private Set<Node> typeProperties(Node complexType, String propertyType) throws XPathExpressionException {
        NodeList nodeList = (NodeList) xPath.evaluate(
            String.format(".//xs:%s", propertyType),
            complexType,
            XPathConstants.NODESET
        );
        Set<Node> nodes = new HashSet<>(nodeList.getLength());
        for (int i = 0; i < nodeList.getLength(); ++i) {
            nodes.add(nodeList.item(i));
        }

        String parentType =  xPath.evaluate(".//xs:extension/@base", complexType);
        if (!"".equals(parentType)) {
            Node parentComplexTypeNode = (Node) xPath.evaluate(
                String.format("//xs:complexType[@name='%s']", parentType),
                XJDF_SCHEMA,
                XPathConstants.NODE
            );
            nodes.addAll(typeProperties(parentComplexTypeNode, propertyType));
        }
        return nodes;
    }

}
