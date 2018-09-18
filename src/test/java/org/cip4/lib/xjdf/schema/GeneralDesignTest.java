package org.cip4.lib.xjdf.schema;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.w3c.dom.Node;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class GeneralDesignTest {

    private XsdReader xsdReader;

    @BeforeEach
    public void setUp() throws Exception {
        xsdReader = new XsdReader();
    }


    @Test
    public void allFieldsOfTypeIDMustBeNamedID() throws Exception {
        List<Node> elements = xsdReader.evaluateNodeList("//xs:attribute[@type='ID']");

        for (Node elementNode : elements) {
            assertEquals(
                "ID",
                elementNode.getAttributes().getNamedItem("name").getNodeValue(),
                "All attributes in XJDF with a data type of ID SHALL be named ID."
            );
        }
    }

    @Test
    public void allFieldsOfWithNameExternalIDShouldHaveTypeNMTOKEN() throws Exception {
        List<Node> elements = xsdReader.evaluateNodeList("//xs:attribute[@name='ExternalID']");

        for (Node elementNode : elements) {
            assertEquals(
                "NMTOKEN",
                elementNode.getAttributes().getNamedItem("type").getNodeValue(),
                "All attributes in XJDF with a name 'ExternalID' SHALL be have type NMTOKEN."
            );
        }
    }

    @Test
    public void allFieldsOfWithNameCostCenterIDShouldHaveTypeNMTOKEN() throws Exception {
        List<Node> elements = xsdReader.evaluateNodeList("//xs:attribute[@name='CostCenterID']");

        for (Node elementNode : elements) {
            assertEquals(
                "NMTOKEN",
                elementNode.getAttributes().getNamedItem("type").getNodeValue(),
                "All attributes in XJDF with a name 'CostCenterID' SHALL be have type NMTOKEN."
            );
        }
    }

    @Test
    public void allFieldsOfWithNameDeviceIDShouldHaveTypeNMTOKEN() throws Exception {
        List<Node> elements = xsdReader.evaluateNodeList("//xs:attribute[not(@type) and not(xs:simpleType)]");
        assertEquals(Collections.EMPTY_LIST, elements);
    }

    @Test
    public void allAttributesMustHaveAType() throws Exception {
        List<Node> elements = xsdReader.evaluateNodeList("//xs:attribute[not(@type) and not(xs:simpleType)]");

        assertEquals(
            Collections.EMPTY_LIST,
            elements,
            "All attributes in XJDF SHALL have a @type."
        );
    }

    @Test
    public void allAttributesMustHaveAUse() throws Exception {
        List<Node> elements = xsdReader.evaluateNodeList("//xs:attribute[not(@use)]");

        assertEquals(
            Collections.EMPTY_LIST,
            elements,
            "All attributes in XJDF SHALL have a @use."
        );
    }

}
