package org.cip4.lib.xjdf.schema;

import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Node;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class GeneralDesignTest {

    private XsdReader xsdReader;

    @Before
    public void setUp() throws Exception {
        xsdReader = new XsdReader();
    }


    @Test
    public void allFieldsOfTypeIDMustBeNamedID() throws Exception {
        List<Node> elements = xsdReader.evaluateNodeList("//xs:attribute[@type='ID']");

        for (Node elementNode : elements) {
            assertEquals(
                "All attributes in XJDF with a data type of ID SHALL be named ID.",
                "ID",
                elementNode.getAttributes().getNamedItem("name").getNodeValue()
            );
        }
    }

    @Test
    public void allFieldsOfWithNameExternalIDShouldHaveTypeNMTOKEN() throws Exception {
        List<Node> elements = xsdReader.evaluateNodeList("//xs:attribute[@name='ExternalID']");

        for (Node elementNode : elements) {
            assertEquals(
                "All attributes in XJDF with a name 'ExternalID' SHALL be have type NMTOKEN.",
                "NMTOKEN",
                elementNode.getAttributes().getNamedItem("type").getNodeValue()
            );
        }
    }

    @Test
    public void allFieldsOfWithNameCostCenterIDShouldHaveTypeNMTOKEN() throws Exception {
        List<Node> elements = xsdReader.evaluateNodeList("//xs:attribute[@name='CostCenterID']");

        for (Node elementNode : elements) {
            assertEquals(
                "All attributes in XJDF with a name 'CostCenterID' SHALL be have type NMTOKEN.",
                "NMTOKEN",
                elementNode.getAttributes().getNamedItem("type").getNodeValue()
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
            "All attributes in XJDF SHALL have a @type.",
            Collections.EMPTY_LIST,
            elements
        );
    }

    @Test
    public void allAttributesMustHaveAUse() throws Exception {
        List<Node> elements = xsdReader.evaluateNodeList("//xs:attribute[not(@use)]");

        assertEquals(
            "All attributes in XJDF SHALL have a @use.",
            Collections.EMPTY_LIST,
            elements
        );
    }

}
