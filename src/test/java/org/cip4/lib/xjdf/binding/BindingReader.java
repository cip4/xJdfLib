package org.cip4.lib.xjdf.binding;

import org.cip4.lib.xjdf.xml.internal.NamespaceManager;
import org.w3c.dom.Document;
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

class BindingReader {

    private Document schema;
    private XPath xPath;

    BindingReader() throws Exception {
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        builderFactory.setNamespaceAware(true);
        DocumentBuilder builder = builderFactory.newDocumentBuilder();

        try (InputStream inputStream = this.getClass().getResourceAsStream("/binding.xjb")) {
            schema = builder.parse(new InputSource(inputStream));
        }

        NamespaceManager nsManager = new NamespaceManager();
        nsManager.addNamespace("xs", XMLConstants.W3C_XML_SCHEMA_NS_URI);
        nsManager.addNamespace("xjb", "http://java.sun.com/xml/ns/jaxb");

        XPathFactory xPathFactory = XPathFactory.newInstance();
        xPath = xPathFactory.newXPath();
        xPath.setNamespaceContext(nsManager);
    }

    public NodeList evaluateNodeList(final String xPathExpression) throws XPathExpressionException {
        return (NodeList) xPath.evaluate(
            xPathExpression,
            schema,
            XPathConstants.NODESET
        );
    }

}
