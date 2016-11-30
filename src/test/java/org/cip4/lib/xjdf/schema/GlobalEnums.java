package org.cip4.lib.xjdf.schema;

import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class GlobalEnums {

    private XsdReader xsdReader;

    @Before
    public void setUp() throws Exception {
        xsdReader = new XsdReader();
    }

    @Test
    public void globalEnumsAreReferencedMultipleTimes() throws Exception {
        List<Node> enumNodes = xsdReader.evaluateNodeList("//xs:simpleType[@name and xs:restriction/xs:enumeration]");

        List<String> singleReferencedEnums = new ArrayList<>();
        for (Node enumNode : enumNodes) {
            String enumName = enumNode.getAttributes().getNamedItem("name").getNodeValue();
            List<Node> references = xsdReader.evaluateNodeList(String.format(
                "//xs:attribute[@type='%s' or xs:simpleType/xs:list/@itemType='%s']",
                enumName,
                enumName
            ));
            if (references.size() <= 1) {
                singleReferencedEnums.add(enumName);
            }
        }
        assertEquals(
            "Global Enums SHALL be references more than one time",
            Collections.EMPTY_LIST,
            singleReferencedEnums
        );
    }

}
