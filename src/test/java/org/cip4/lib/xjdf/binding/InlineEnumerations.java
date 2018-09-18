package org.cip4.lib.xjdf.binding;

import org.cip4.lib.xjdf.schema.XsdReader;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.xpath.XPathExpressionException;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

public class InlineEnumerations {

    private BindingReader bindingReader;
    private XsdReader xsdReader;

    private class EnumLocation {
        private final String elementName;
        private final String attributeName;

        EnumLocation(final String elementName, final String attributeName) {
            this.elementName = elementName;
            this.attributeName = attributeName;
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            EnumLocation that = (EnumLocation) o;
            return Objects.equals(elementName, that.elementName) &&
                Objects.equals(attributeName, that.attributeName);
        }

        @Override
        public int hashCode() {
            return Objects.hash(elementName, attributeName);
        }

        @Override
        public String toString() {
            return String.format("%s/@%s", elementName, attributeName);
        }
    }

    @BeforeEach
    public void setUp() throws Exception {
        bindingReader = new BindingReader();
        xsdReader = new XsdReader();
    }

    @Test
    public void inlineEnumerationsAreAssignedAClassName() throws Exception {
        Set<EnumLocation> enumsInXsd = new HashSet<>();
        List<Node> inlineEnums = xsdReader.evaluateNodeList("//xs:attribute[.//xs:restriction/xs:enumeration]");
        for (Node attributeNode : inlineEnums) {
            enumsInXsd.add(extractEnumLocationFromXsdAttribute(attributeNode));
        }

        Set<EnumLocation> enumsInBindings = new HashSet<>();
        NodeList bindings;
        try {
            bindings = bindingReader.evaluateNodeList("//xjb:bindings[xjb:typesafeEnumClass[@name]]");
        } catch (XPathExpressionException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < bindings.getLength(); ++i) {
            Node bindingNode = bindings.item(i);
            String node = bindingNode.getAttributes().getNamedItem("node").getNodeValue();
            enumsInBindings.add(extractEnumLocationFromXPath(node));
        }

        enumsInXsd.removeAll(enumsInBindings);

        assertEquals(Collections.EMPTY_SET, enumsInXsd, "Not all inline enumerations are bound to a classname.");
    }

    @Test
    public void attributeNameMatchesClassname() throws Exception {
        NodeList bindings;
        try {
            bindings = bindingReader.evaluateNodeList("//xjb:bindings[xjb:typesafeEnumClass[@name]]");
        } catch (XPathExpressionException e) {
            throw new RuntimeException(e);
        }
        loopOverBindings:
        for (int i = 0; i < bindings.getLength(); ++i) {
            Node bindingNode = bindings.item(i);
            String node = bindingNode.getAttributes().getNamedItem("node").getNodeValue();
            EnumLocation enumLocation = extractEnumLocationFromXPath(node);
            for (int j = 0; j < bindingNode.getChildNodes().getLength(); ++j) {
                Node typesafeEnumClassNode = bindingNode.getChildNodes().item(j);
                if ("typesafeEnumClass".equals(typesafeEnumClassNode.getLocalName())) {
                    assertEquals(
                        translateAttributeNameToClassName(enumLocation.attributeName),
                        typesafeEnumClassNode.getAttributes().getNamedItem("name").getNodeValue()
                    );
                    continue loopOverBindings;
                }
            }
            fail(String.format("Element 'xjb:typesafeEnumClass' not found for '%s'", enumLocation));

        }
    }

    private String translateAttributeNameToClassName(String attributeName) {
        switch (attributeName) {
            case "Classes":
                return "Class";
            default:
                return attributeName;
        }
    }

    private EnumLocation extractEnumLocationFromXPath(String xPath) {
        Pattern xPathPattern = Pattern.compile(".+@name='([^']+)'\\]//xs:attribute\\[@name='([^']+)'\\].*");
        Matcher matcher = xPathPattern.matcher(xPath);
        if (!matcher.matches()) {
            throw new IllegalArgumentException(String.format("Unsupported xPath for binding: %s", xPath));
        }
        return new EnumLocation(matcher.group(1), matcher.group(2));
    }

    private EnumLocation extractEnumLocationFromXsdAttribute(Node attributeNode) {
        NodeList nameAttribute;
        try {
            nameAttribute = xsdReader.evaluateNodeList("./ancestor::*/@name", attributeNode);
        } catch (XPathExpressionException e) {
            throw new RuntimeException(e);
        }
        if (nameAttribute.getLength() != 1) {
            throw new RuntimeException(String.format(
                "Expected exactly ONE element name, but found %s",
                nameAttribute.getLength()
            ));
        }
        return new EnumLocation(
            nameAttribute.item(0).getNodeValue(),
            attributeNode.getAttributes().getNamedItem("name").getNodeValue()
        );
    }
}
