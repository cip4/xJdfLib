package org.cip4.lib.xjdf.xml;

import java.io.ByteArrayInputStream;

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

    @Test
    public void loadLibraryVersion() {

        // arrange

        // act
        String version = XJdfConstants.XJDFLIB_VERSION;

        // assert


        Assertions.assertTrue(version.startsWith(XJdfConstants.XJDF_CURRENT_VERSION.value()), "Wrong version.");
    }

    @Test
    public void loadLibraryBuildDate() {

        // arrange

        // act
        String buildDate = XJdfConstants.XJDFLIB_BUILD_DATE;

        // assert
        System.out.println(buildDate);
        Assertions.assertTrue(buildDate.matches("20[0-9]{2}-[0-9]{2}-[0-9]{2}T[0-9]{2}:[0-9]{2}:[0-9]{2}.[0-9]{3}Z"));// ISO8601
    }
}
