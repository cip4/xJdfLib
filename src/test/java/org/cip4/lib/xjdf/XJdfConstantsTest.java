package org.cip4.lib.xjdf;

import java.io.ByteArrayInputStream;

import org.cip4.lib.xjdf.XJdfConstants;
import org.cip4.lib.xjdf.schema.Version;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

/**
 * JUnit test case for XmlConstants class.
 */
public class XJdfConstantsTest {

    @Test
    public void loadXJdfXsdByteArray_2_0() throws Exception {

        // arrange

        // act
        byte[] xsdBytes = XJdfConstants.XJDF_XSD_BYTES.get(Version.V2_0);

        // assert
        Document xml = DocumentBuilderFactory.newInstance()
                .newDocumentBuilder()
                .parse(new ByteArrayInputStream(xsdBytes));

		XPath xPath = XPathFactory.newInstance().newXPath();
		String version = (String) xPath.compile("/schema/@version").evaluate(xml, XPathConstants.STRING);

        System.out.println("Version: " + version);
        Assertions.assertTrue(version.startsWith("2.0."), "Wrong version.");
    }

    @Test
    public void loadXJdfXsdByteArray_2_1() throws Exception {

        // arrange

        // act
        byte[] xsdBytes = XJdfConstants.XJDF_XSD_BYTES.get(Version.V2_1);

		// assert
		Document xml = DocumentBuilderFactory.newInstance()
				.newDocumentBuilder()
				.parse(new ByteArrayInputStream(xsdBytes));

		XPath xPath = XPathFactory.newInstance().newXPath();
		String version = (String) xPath.compile("/schema/@version").evaluate(xml, XPathConstants.STRING);

		System.out.println("Version: " + version);
		Assertions.assertTrue(version.startsWith("2.1."), "Wrong version.");
    }
}
