package org.cip4.lib.xjdf.util;

import org.cip4.lib.xjdf.XJdfDocument;
import org.cip4.lib.xjdf.XJdfDocumentTest;
import org.cip4.lib.xjdf.schema.BinderySignature;
import org.cip4.lib.xjdf.schema.Contact;
import org.cip4.lib.xjdf.schema.ResourceSet;
import org.cip4.lib.xjdf.schema.RunList;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ResourceSetsTest {

    private final String RES_ROOT = "/org/cip4/lib/xjdf/";

    @Test
    public void getPartKeyValues_1() throws Exception {

        // arrange
        byte[] xjdfBytes = XJdfDocumentTest.class.getResourceAsStream(RES_ROOT + "sheet.xjdf").readAllBytes();
        XJdfDocument xJdfDocument = new XJdfDocument(xjdfBytes);

        ResourceSet resourceSet = xJdfDocument.getResourceSet(BinderySignature.class);

        // act
        Map<String, List<Object>> partKeyValues = new ResourceSets(resourceSet).getPartKeyValues();

        // assert
        assertNotNull(partKeyValues, "Result is null.");
        assertEquals(1, partKeyValues.size(), "Number of PartKeys is wrong.");
        assertEquals(3, partKeyValues.get("BinderySignatureID").size(), "Number of BinderSignatureID values is wrong.");
    }

    @Test
    public void getPartKeyValues_2() throws Exception {

        // arrange
        byte[] xjdfBytes = XJdfDocumentTest.class.getResourceAsStream(RES_ROOT + "sheet.xjdf").readAllBytes();
        XJdfDocument xJdfDocument = new XJdfDocument(xjdfBytes);

        ResourceSet resourceSet = xJdfDocument.getResourceSet(Contact.class);

        // act
        Map<String, List<Object>> partKeyValues = new ResourceSets(resourceSet).getPartKeyValues();

        // assert
        assertNotNull(partKeyValues, "Result is null.");
        assertEquals(0, partKeyValues.size(), "Number of PartKeys is wrong.");
    }

    @Test
    public void getPartKeyValues_3() throws Exception {

        // arrange
        byte[] xjdfBytes = XJdfDocumentTest.class.getResourceAsStream(RES_ROOT + "sheet.xjdf").readAllBytes();
        XJdfDocument xJdfDocument = new XJdfDocument(xjdfBytes);

        ResourceSet resourceSet = xJdfDocument.getResourceSet(RunList.class);

        // act
        Map<String, List<Object>> partKeyValues = new ResourceSets(resourceSet).getPartKeyValues();

        // assert
        assertNotNull(partKeyValues, "Result is null.");
        assertEquals(1, partKeyValues.size(), "Number of PartKeys is wrong.");
        assertEquals(1, partKeyValues.get("BinderySignatureID").size(), "Number of BinderSignatureID values is wrong.");
    }
}
