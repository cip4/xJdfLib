package org.cip4.lib.xjdf.binding;

import org.cip4.lib.xjdf.schema.XsdReader;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class XmlRootElementAnnotation {

    private BindingReader bindingReader;

    @BeforeEach
    public void setUp() throws Exception {
        bindingReader = new BindingReader();
    }

    @ParameterizedTest
    @MethodSource("provideSubstitutes")
    public void attributesOfTypeIdrefAreBoundToDatatype(String substitute) throws Exception {
        String xPath = String.format("//xjb:bindings[@node=\"//xs:complexType[@name='%s']\"]/annox:annotate", substitute);
        NodeList annoxNodes = bindingReader.evaluateNodeList(xPath);
        assertEquals(1, annoxNodes.getLength(), "annotation not present");
        Node annox = annoxNodes.item(0);
        assertEquals(
            String.format("@jakarta.xml.bind.annotation.XmlRootElement(name = \"%s\")", substitute),
            annox.getTextContent()
        );
    }

    private static Stream<String> provideSubstitutes() throws Exception {
        XsdReader xsdReader = new XsdReader();
        Set<String> complexTypes = new HashSet<>();
        List<Node> substitutes = xsdReader.evaluateNodeList("//xs:element[not(@abstract='true') and @substitutionGroup]");
        for (Node substitute : substitutes) {
            complexTypes.add(substitute.getAttributes().getNamedItem("name").getNodeValue());
        }
        return complexTypes.stream();
    }
}
