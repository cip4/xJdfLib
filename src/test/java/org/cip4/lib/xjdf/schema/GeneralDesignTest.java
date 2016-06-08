package org.cip4.lib.xjdf.schema;

import org.cip4.lib.xjdf.xml.internal.NamespaceManager;
import org.junit.Before;
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
import javax.xml.xpath.XPathFactory;
import java.io.InputStream;

import static org.junit.Assert.*;

public class GeneralDesignTest {

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
    public void allFieldsOfTypeIDMustBeNamedID() throws Exception {
        NamespaceManager nsManager = new NamespaceManager();
        nsManager.addNamespace("xs", XMLConstants.W3C_XML_SCHEMA_NS_URI);

        XPathFactory xPathFactory = XPathFactory.newInstance();
        XPath xPath = xPathFactory.newXPath();
        xPath.setNamespaceContext(nsManager);

        NodeList elements = (NodeList) xPath.evaluate(
            "//xs:attribute[@type='ID']",
            XJDF_SCHEMA,
            XPathConstants.NODESET
        );

        for (int i = 0; i < elements.getLength(); i++) {
            Node elementNode = elements.item(i);

            // TODO: Remove once XJDF-615 is solved.
            if ("GangElementID".equals(elementNode.getAttributes().getNamedItem("name").getNodeValue())) {
                continue;
            }

            assertEquals(
                "All attributes in XJDF with a data type of ID SHALL be named ID.",
                "ID",
                elementNode.getAttributes().getNamedItem("name").getNodeValue()
            );
        }
    }
}
