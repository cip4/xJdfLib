package org.cip4.lib.xjdf.schema;

import org.cip4.lib.xjdf.xml.XJdfValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.w3c.dom.Node;

import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class ForeignNamespaces {

    private XsdReader xsdReader;

    @BeforeEach
    public void setUp() throws Exception {
        xsdReader = new XsdReader();
    }

    @Test
    public void attributesAllowedAnywhere() throws Exception {
        XJdfValidator validator = new XJdfValidator();
        validator.validate(this.getClass().getResourceAsStream("attributeFromForeignNS.xjdf"));
    }

    @Test
    public void allowAttributesFromForeignNamespaceInAllElements() throws Exception {
        List<Node> complexTypes = xsdReader.evaluateNodeList("//xs:complexType");

        for (Node complexType : complexTypes) {
            Collection<Node> anyAttributeNodes;

            try {
                anyAttributeNodes = xsdReader.typeProperties(complexType, "anyAttribute");
            } catch (Exception ex) {
                fail("Error processing " + getXPath(complexType), ex);
                return;
            }
            assertEquals(
                1,
                anyAttributeNodes.size(),
                String.format(
                    "Complex type '%s' must contain exactly one xs:anyAttribute.",
                    xsdReader.localNameOfComplexType(complexType)
                )
            );
            Node anyAttributeNode = anyAttributeNodes.iterator().next();
            assertEquals(
                "##other",
                anyAttributeNode.getAttributes().getNamedItem("namespace").getNodeValue()
            );
            assertEquals(
                "lax",
                anyAttributeNode.getAttributes().getNamedItem("processContents").getNodeValue()
            );
        }
    }

    private String getXPath(Node complexType) {
        final String xPath;
        Node attrName;

        // complexType
        attrName = complexType.getAttributes().getNamedItem("name");

        if(attrName != null) {
            xPath = "//" + complexType.getLocalName() + "[@name='" + attrName.getNodeValue() + "']";
        } else {
            attrName = complexType.getParentNode().getAttributes().getNamedItem("name");
            xPath = "//" + complexType.getParentNode().getLocalName() + "[@name='" + attrName.getNodeValue() + "']/" + complexType.getLocalName();
        }

        return xPath;
    }
}
