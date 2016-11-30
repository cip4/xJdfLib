package org.cip4.lib.xjdf.schema;

import org.cip4.lib.xjdf.xml.internal.NamespaceManager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class EnumPartIDKeyTest {

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
    public void testEnumContainsAllAttributesOfPart() throws Exception {
        NamespaceManager nsManager = new NamespaceManager();
        nsManager.addNamespace("xs", XMLConstants.W3C_XML_SCHEMA_NS_URI);

        XPathFactory xPathFactory = XPathFactory.newInstance();
        XPath xPath = xPathFactory.newXPath();
        xPath.setNamespaceContext(nsManager);

        Set<String> enumValues = nodeListToString((NodeList) xPath.evaluate(
                "//xs:attribute[@name=\"PipePartPartIDKeys\"]//xs:enumeration/@value",
                XJDF_SCHEMA,
                XPathConstants.NODESET
        ));

        Set<String> partAttrs = nodeListToString((NodeList) xPath.evaluate(
                "//xs:element[@name=\"Part\"]//xs:attribute/@name",
                XJDF_SCHEMA,
                XPathConstants.NODESET
        ));

        assertTrue(partAttrs.size() > 0);
        assertEquals(partAttrs, enumValues);
    }

    private Set<String> nodeListToString(final NodeList nodeList) {
        Set<String> result = new TreeSet<>();
        for (int i = 0; i < nodeList.getLength(); ++i) {
            result.add(nodeList.item(i).getNodeValue());
        }
        return result;
    }
}
