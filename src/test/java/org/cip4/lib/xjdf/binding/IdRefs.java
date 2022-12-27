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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class IdRefs {

    private BindingReader bindingReader;
    private XsdReader xsdReader;

    private class AttributeLocation {
        private final String elementName;
        private final String attributeName;

        AttributeLocation(final String elementName, final String attributeName) {
            this.elementName = elementName;
            this.attributeName = attributeName;
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            AttributeLocation that = (AttributeLocation) o;
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
    public void attributesOfTypeIdrefAreBoundToDatatype() throws Exception {
        Set<AttributeLocation> attrsInXsd = new HashSet<>();
        List<Node> attributes = xsdReader.evaluateNodeList("//xs:attribute[@type='xs:IDREF' or @type='xs:IDREFS']");
        for (Node attributeNode : attributes) {
            attrsInXsd.add(extractAttrLocationFromXsdAttribute(attributeNode));
        }

        Set<AttributeLocation> enumsInBindings = new HashSet<>();
        NodeList bindings;
        try {
            bindings = bindingReader.evaluateNodeList("//xjb:bindings[xjb:property/xjb:baseType[@name]]");
        } catch (XPathExpressionException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < bindings.getLength(); ++i) {
            Node bindingNode = bindings.item(i);
            String node = bindingNode.getAttributes().getNamedItem("node").getNodeValue();
            enumsInBindings.add(extractAttrLocationFromXPath(node));
        }

        Set<AttributeLocation> exceptions = new HashSet<>();
        exceptions.add(new AttributeLocation("GangElement", "MediaRef"));
        exceptions.add(new AttributeLocation("GangElement", "RunListRef"));

        assertNotEquals(0, attrsInXsd.size());
        attrsInXsd.removeAll(enumsInBindings);
        attrsInXsd.removeAll(exceptions);

        assertEquals(Collections.EMPTY_SET, attrsInXsd, "Not all IDREF/IDREFS are bound to a classname.");
    }

    @Test
    public void attributeNameMatchesPropertyName() {
        NodeList bindings;
        try {
            bindings = bindingReader.evaluateNodeList("//xjb:bindings[xjb:property/xjb:baseType[@name]]");
        } catch (XPathExpressionException e) {
            throw new RuntimeException(e);
        }
        loopOverBindings:
        for (int i = 0; i < bindings.getLength(); ++i) {
            Node bindingNode = bindings.item(i);
            String node = bindingNode.getAttributes().getNamedItem("node").getNodeValue();
            AttributeLocation attributeLocation = extractAttrLocationFromXPath(node);
            if (null == attributeLocation) {
                continue;
            }
            for (int j = 0; j < bindingNode.getChildNodes().getLength(); ++j) {
                Node propertyNode = bindingNode.getChildNodes().item(j);
                if ("property".equals(propertyNode.getLocalName())) {
                    assertEquals(
                        translateAttributeToProperty(attributeLocation.attributeName),
                        propertyNode.getAttributes().getNamedItem("name").getNodeValue(),
                        String.format("Property name does not match attribute name for %s", attributeLocation)
                    );
                    continue loopOverBindings;
                }
            }
            fail(String.format("Element 'xjb:property' not found for '%s'", attributeLocation));
        }
    }

    private String translateAttributeToProperty(String attributeName) {
        String propertyName = attributeName.replace("Ref", "");
        propertyName = propertyName.substring(0,1).toLowerCase() + propertyName.substring(1);
        switch (propertyName) {
            case "childs":
                return "children";
            case "r":
                return "rRef";
            default:
                return propertyName;
        }
    }

    private AttributeLocation extractAttrLocationFromXPath(String xPath) {
        Pattern xPathPattern = Pattern.compile(".+@name='([^']+)'\\]//xs:attribute\\[@name='([^']+)'\\]");
        Matcher matcher = xPathPattern.matcher(xPath);
        if (!matcher.matches()) {
            return null;
        }
        return new AttributeLocation(matcher.group(1), matcher.group(2));
    }

    private AttributeLocation extractAttrLocationFromXsdAttribute(Node attributeNode) {
        NodeList nameAttribute;
        try {
            nameAttribute = xsdReader.evaluateNodeList("./../../@name | ./../../../@name", attributeNode);
        } catch (XPathExpressionException e) {
            throw new RuntimeException(e);
        }
        if (nameAttribute.getLength() != 1) {
            throw new RuntimeException(String.format(
                "Expected exactly ONE element name, but found %s",
                nameAttribute.getLength()
            ));
        }
        return new AttributeLocation(
            nameAttribute.item(0).getNodeValue(),
            attributeNode.getAttributes().getNamedItem("name").getNodeValue()
        );
    }
}
