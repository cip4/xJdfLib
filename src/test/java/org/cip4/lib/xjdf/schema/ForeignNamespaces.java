package org.cip4.lib.xjdf.schema;

import org.cip4.lib.xjdf.xml.XJdfValidator;
import org.junit.*;
import org.w3c.dom.Node;

import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;


public class ForeignNamespaces {

    private XsdReader xsdReader;

    @Before
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
            Collection<Node> anyAttributeNodes = xsdReader.typeProperties(complexType, "anyAttribute");
            assertEquals(
                String.format(
                    "Complex type '%s' must contain exactly one xs:anyAttribute.",
                    xsdReader.localNameOfComplexType(complexType)
                ),
                1,
                anyAttributeNodes.size()
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
}
