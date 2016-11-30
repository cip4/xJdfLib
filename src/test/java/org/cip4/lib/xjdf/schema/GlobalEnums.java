package org.cip4.lib.xjdf.schema;

import org.junit.Before;
import org.junit.Ignore;
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

    @Test
    @Ignore("Used to generate draft for XJDF-197")
    public void globalEnums() throws Exception {
        List<Node> enumNodes = xsdReader.evaluateNodeList("//xs:simpleType[@name and xs:restriction/xs:enumeration]");

        List<String> singleReferencedEnums = new ArrayList<>();
        for (Node enumNode : enumNodes) {
            String enumName = enumNode.getAttributes().getNamedItem("name").getNodeValue();
            List<Node> references = xsdReader.evaluateNodeList(String.format(
                "//xs:attribute[@type='%s' or xs:simpleType/xs:list/@itemType='%s']",
                enumName,
                enumName
            ));
            if (references.size() > 1) {
                System.out.println(String.format(
                    "Introduce '%s' in the following locations:",
                    enumName
                ));
                for (Node reference : references) {
                    Node element = xsdReader.evaluateNodeList("./ancestor::*[@name]", reference).item(0);
                    System.out.println(String.format(
                        "* %s/@%s",
                        element.getAttributes().getNamedItem("name").getNodeValue(),
                        reference.getAttributes().getNamedItem("name").getNodeValue()
                    ));
                }
                System.out.println();
                singleReferencedEnums.add(enumName);
            }
        }
    }




}
