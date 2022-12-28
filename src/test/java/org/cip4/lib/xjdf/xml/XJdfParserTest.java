package org.cip4.lib.xjdf.xml;

import org.cip4.lib.xjdf.exception.XJdfParseException;
import org.cip4.lib.xjdf.schema.XJDF;
import org.cip4.lib.xjdf.xml.XJdfParser.XJdfNamespacePrefixMapper;
import org.junit.jupiter.api.Test;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

class XJdfParserTest {


    @Test
    void writeXml_1() throws Exception {

        // arrange
        XJdfParser<XJDF> xJdfParser = new XJdfParser<>();

        XJDF xjdf = new XJDF()
            .withJobID("MyJobID")
            .withTypes("Product");

        // act
        byte[] result = xJdfParser.writeXml(xjdf);

        // assert
        System.out.print(new String(result, StandardCharsets.UTF_8));

        DocumentBuilder documentBuilder = DocumentBuilderFactory.newDefaultInstance().newDocumentBuilder();
        Document xmlDocument = documentBuilder.parse(new ByteArrayInputStream(result));

        XPath xPath = XPathFactory.newInstance().newXPath();
        String jobId = (String) xPath.compile("/XJDF/@JobID").evaluate(xmlDocument, XPathConstants.STRING);
        String types = (String) xPath.compile("/XJDF/@Types").evaluate(xmlDocument, XPathConstants.STRING);

        assertEquals("MyJobID", jobId);
        assertEquals("Product", types);
    }

    @Test
    void readXml_1() throws Exception {

        // arrange
        XJdfParser<XJDF> xJdfParser = new XJdfParser<>();
        byte[] bytes = loadFile("parser-read-1.xjdf");

        // act
        XJDF xjdf = xJdfParser.readXml(bytes);

        // assert
        assertEquals("JID", xjdf.getJobID());
        assertEquals("ConventionalPrinting", xjdf.getTypes().get(0));
        assertEquals(1, xjdf.getTypes().size());

        assertEquals("aÄoÖuÜsß", xjdf.getComment().get(0).getValue());
    }

    @Test
    void readXml_2() throws Exception {

        // arrange
        XJdfParser<XJDF> xJdfParser = new XJdfParser<>();
        byte[] bytes = null;

        // act
        Exception exception = assertThrows(XJdfParseException.class, () -> xJdfParser.readXml(bytes));

        // assert
        assertEquals("Cannot read an XML byte array of null.", exception.getMessage());
    }

    /**
     * Helper method to load a file.
     * @param filename The files name.
     * @return The file as byte array.
     */
    private byte[] loadFile(String filename) throws IOException {
        return XJdfValidatorTest.class.getResourceAsStream("/org/cip4/lib/xjdf/xml/" + filename).readAllBytes();
    }

    @Test
    public void getPreferredPrefix_optional() throws Exception {

        // arrange
        XJdfNamespacePrefixMapper xJdfNamespacePrefixMapper = new XJdfNamespacePrefixMapper();

        // act
        String prefix = xJdfNamespacePrefixMapper.getPreferredPrefix(XJdfConstants.NAMESPACE_JDF20, "foo", false);

        // assert
        assertEquals("", prefix, "Prefix is wrong.");
    }

    @Test
    public void getPreferredPrefix_optional_suggestion() throws Exception {

        // arrange
        XJdfNamespacePrefixMapper xJdfNamespacePrefixMapper = new XJdfNamespacePrefixMapper();

        // act
        String prefix = xJdfNamespacePrefixMapper.getPreferredPrefix("bar", "foo", false);

        // assert
        assertEquals("", prefix, "Prefix is wrong.");
    }

    @Test
    public void getPreferredPrefix_optional_requirePrefix() throws Exception {

        // arrange
        XJdfNamespacePrefixMapper xJdfNamespacePrefixMapper = new XJdfNamespacePrefixMapper();

        // act
        String prefix = xJdfNamespacePrefixMapper.getPreferredPrefix(XJdfConstants.NAMESPACE_JDF20, "foo", true);

        // assert
        assertEquals("xjdf", prefix, "Prefix is wrong.");
    }

    @Test
    public void getPreferredPrefix_optional_suggestion_requirePrefix() throws Exception {

        // arrange
        XJdfNamespacePrefixMapper xJdfNamespacePrefixMapper = new XJdfNamespacePrefixMapper();

        // act
        String prefix = xJdfNamespacePrefixMapper.getPreferredPrefix("bar", "foo", true);

        // assert
        assertEquals("foo", prefix, "Prefix is wrong.");
    }
}