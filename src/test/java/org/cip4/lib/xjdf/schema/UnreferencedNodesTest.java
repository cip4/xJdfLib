package org.cip4.lib.xjdf.schema;

import org.cip4.lib.xjdf.xml.internal.NamespaceManager;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import java.io.InputStream;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UnreferencedNodesTest {

    private static Document XJDF_SCHEMA;

    @Before
    public void setUp() throws Exception {
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        builderFactory.setNamespaceAware(true);
        DocumentBuilder builder = builderFactory.newDocumentBuilder();

        try (InputStream inputStream = this.getClass().getResourceAsStream("/JDF20.xsd")) {
            XJDF_SCHEMA = builder.parse(new InputSource(inputStream));
        }

    }

    @Test
    public void unusedElements() throws Exception {
        NamespaceManager nsManager = new NamespaceManager();
        nsManager.addNamespace("xs", XMLConstants.W3C_XML_SCHEMA_NS_URI);

        XPathFactory xPathFactory = XPathFactory.newInstance();
        XPath xPath = xPathFactory.newXPath();
        xPath.setNamespaceContext(nsManager);

        NodeList elements = (NodeList) xPath.evaluate(
            "/xs:schema/xs:element[not(@substitutionGroup='ParameterType') and not(@substitutionGroup='ResourceType') and not(@substitutionGroup='IntentType')]",
            XJDF_SCHEMA,
            XPathConstants.NODESET
        );

        for (int i = 0; i < elements.getLength(); i++) {
            Node elementNode = elements.item(i);
            String elementName = elementNode.getAttributes().getNamedItem("name").getNodeValue();
            if (elementName.equals("XJDF") || elementName.equals("XJMF")) {
                continue;
            }
            NodeList matches = (NodeList) xPath.evaluate(
                String.format(
                    "//xs:element[@ref='%s' or @substitutionGroup='%s']",
                    elementName,
                    elementName
                ), XJDF_SCHEMA, XPathConstants.NODESET
            );
            assertTrue(
                String.format("Element '%s' is defined but not referenced from another element.", elementName),
                matches.getLength() > 0
            );
        }
    }

    @Test
    public void unusedSimpleTypes() throws Exception {
        NamespaceManager nsManager = new NamespaceManager();
        nsManager.addNamespace("xs", XMLConstants.W3C_XML_SCHEMA_NS_URI);

        XPathFactory xPathFactory = XPathFactory.newInstance();
        XPath xPath = xPathFactory.newXPath();
        xPath.setNamespaceContext(nsManager);

        NodeList elements = (NodeList) xPath.evaluate(
            "/xs:schema/xs:simpleType",
            XJDF_SCHEMA,
            XPathConstants.NODESET
        );

        for (int i = 0; i < elements.getLength(); i++) {
            Node elementNode = elements.item(i);
            String elementName = elementNode.getAttributes().getNamedItem("name").getNodeValue();
            NodeList attributeUsages = (NodeList) xPath.evaluate(
                String.format(
                    "//xs:attribute[@type='%s' or .//xs:list/@itemType='%s']",
                    elementName,
                    elementName
                ), XJDF_SCHEMA, XPathConstants.NODESET
            );
            NodeList elementUsages = (NodeList) xPath.evaluate(
                String.format(
                    "//xs:element[@type='%s']",
                    elementName
                ), XJDF_SCHEMA, XPathConstants.NODESET
            );
            assertTrue(
                String.format("SimpleType '%s' is defined but not referenced from an element.", elementName),
                (attributeUsages.getLength() > 0) || (elementUsages.getLength() > 0)
            );
        }
    }

    @Test
    public void unusedComplexTypes() throws Exception {
        NamespaceManager nsManager = new NamespaceManager();
        nsManager.addNamespace("xs", XMLConstants.W3C_XML_SCHEMA_NS_URI);

        XPathFactory xPathFactory = XPathFactory.newInstance();
        XPath xPath = xPathFactory.newXPath();
        xPath.setNamespaceContext(nsManager);

        NodeList elements = (NodeList) xPath.evaluate(
            "/xs:schema/xs:complexType[@Name!='SetType']",
            XJDF_SCHEMA,
            XPathConstants.NODESET
        );

        for (int i = 0; i < elements.getLength(); i++) {
            Node elementNode = elements.item(i);
            String elementName = elementNode.getAttributes().getNamedItem("name").getNodeValue();
            NodeList elementUsages = (NodeList) xPath.evaluate(
                String.format(
                    "//xs:element[@type='%s']",
                    elementName
                ), XJDF_SCHEMA, XPathConstants.NODESET
            );
            assertTrue(
                String.format("SimpleType '%s' is defined but not referenced from an element.", elementName),
                elementUsages.getLength() > 0
            );
        }
    }
}
