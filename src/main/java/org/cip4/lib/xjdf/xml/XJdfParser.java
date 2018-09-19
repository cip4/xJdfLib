package org.cip4.lib.xjdf.xml;

import java.io.IOException;
import java.io.OutputStream;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;

import com.sun.xml.bind.marshaller.NamespacePrefixMapper;
import org.cip4.lib.xjdf.schema.XJDF;
import org.cip4.lib.xjdf.xml.internal.AbstractXmlParser;
import org.cip4.lib.xjdf.xml.internal.AbstractXmlValidator;
import org.cip4.lib.xjdf.xml.internal.JAXBContextFactory;
import org.cip4.lib.xjdf.xml.internal.XJdfNamespaceMapper;
import org.xml.sax.SAXException;

/**
 * Parsing logic for building a XML Document from XJDF DOM-Tree and the way around.
 */
public class XJdfParser extends AbstractXmlParser<XJDF> {

    /**
     * Default constructor.
     *
     * @throws JAXBException Thrown in case a JAXBException occurs.
     */
    public XJdfParser() throws JAXBException {
        super(JAXBContextFactory.getInstance());
    }

    /**
     * Parse a XJDF Object Tree to a binary output stream.
     *
     * @param xJdf XJDF Object Tree for parsing.
     * @param os Target OutputStream where XJdfDocument is being parsed.
     *
     * @throws ParserConfigurationException Is thrown in case a serious configuration error occurs.
     * @throws JAXBException Is thrown in case any error while un-/marshalling occurs.
     * @throws SAXException Is thrown in case parsing an xml document fails.
     * @throws IOException Is thrown in case any IO error occurs.
     */
    public final void parseXJdf(final XJDF xJdf, final OutputStream os)
        throws ParserConfigurationException, JAXBException, SAXException, IOException {
        parseXml(xJdf, os);
    }

    /**
     * Parse a XJDF Object Tree to a binary output stream.
     *
     * @param xJdf XJDF Object Tree for parsing.
     * @param os Target OutputStream where XJdfDocument is being parsed.
     * @param skipValidation Skip validation.
     *
     * @throws IOException Is thrown in case any IO error occurs.
     * @throws ParserConfigurationException Is thrown in case a serious configuration error occurs.
     * @throws SAXException Is thrown in case parsing an xml document fails.
     * @throws JAXBException Is thrown in case any error while un-/marshalling occurs.
     */
    public final void parseXJdf(final XJDF xJdf, final OutputStream os, final boolean skipValidation)
        throws JAXBException {
        parseXml(xJdf, os, skipValidation);
    }

    /**
     * Parse a XJDF Object Tree to a byte array.
     *
     * @param xJdf XJDF Object Tree for parsing.
     *
     * @return XJDF as byte array.
     *
     * @throws ParserConfigurationException Is thrown in case a serious configuration error occurs.
     * @throws IOException Is thrown in case any IO error occurs.
     * @throws SAXException Is thrown in case parsing an xml document fails.
     * @throws JAXBException Is thrown in case any error while un-/marshalling occurs.
     */
    public final byte[] parseXJdf(final XJDF xJdf)
        throws ParserConfigurationException, IOException, SAXException, JAXBException {
        return parseXml(xJdf);
    }

    /**
     * Parse a XJDF Object Tree to a byte array.
     *
     * @param xJdf XJDF Object Tree for parsing.
     * @param skipValidation Skip validation.
     *
     * @return XJDF as byte array.
     *
     * @throws ParserConfigurationException Is thrown in case a serious configuration error occurs.
     * @throws JAXBException Is thrown in case any error while un-/marshalling occurs.
     * @throws SAXException Is thrown in case parsing an xml document fails.
     * @throws IOException Is thrown in case any IO error occurs.
     */
    public final byte[] parseXJdf(final XJDF xJdf, final boolean skipValidation)
        throws ParserConfigurationException, JAXBException, SAXException, IOException {
        return parseXml(xJdf, skipValidation);
    }

    @Override
    protected final NamespacePrefixMapper getNamespacePrefixMapper() {
        return new XJdfNamespaceMapper();
    }

    @Override
    protected final String getXmlHeader() {
        String header = "<!-- Generated by CIP4 xJdfLib " + XJdfConstants.XJDF_LIB_VERSION + " -->\r\n";
        header = header.replaceAll("  ", " ");
        return header;
    }

    @Override
    protected final AbstractXmlValidator createValidator() {
        return new XJdfValidator();
    }

}
