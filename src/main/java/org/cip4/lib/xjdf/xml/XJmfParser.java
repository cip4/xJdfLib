package org.cip4.lib.xjdf.xml;

import com.sun.xml.bind.marshaller.NamespacePrefixMapper;
import jakarta.xml.bind.JAXBException;
import org.cip4.lib.xjdf.schema.XJMF;
import org.cip4.lib.xjdf.xml.internal.AbstractXmlParser;
import org.cip4.lib.xjdf.xml.internal.AbstractXmlValidator;
import org.cip4.lib.xjdf.xml.internal.JAXBContextFactory;
import org.cip4.lib.xjdf.xml.internal.XJdfNamespaceMapper;


import java.io.IOException;
import java.io.OutputStream;

/**
 * Parsing logic for building a XML Document from XJMF DOM-Tree and the way around.
 */
public class XJmfParser extends AbstractXmlParser<XJMF> {

    /**
     * Default constructor.
     *
     * @throws JAXBException Thrown in case a JAXBException occurs.
     */
    public XJmfParser() throws JAXBException {
        super(JAXBContextFactory.getInstance());
    }

    /**
     * Parse a XJMF Object Tree to a binary output stream.
     *
     * @param xjmf XJMF Object Tree for parsing.
     * @param os Target OutputStream where XJMF is being parsed.
     *
     * @throws JAXBException Is thrown in case any error while un-/marshalling occurs.
     */
    public final void parseXJmf(final XJMF xjmf, final OutputStream os)
        throws JAXBException {
        parseXml(xjmf, os);
    }

    /**
     * Parse a XJMF Object Tree to a binary output stream.
     *
     * @param xjmf XJMF Object Tree for parsing.
     * @param os Target OutputStream where XJMF is being parsed.
     * @param skipValidation Skip validation.
     */
    public final void parseXJmf(final XJMF xjmf, final OutputStream os, final boolean skipValidation)
        throws JAXBException {
        parseXml(xjmf, os, skipValidation);
    }

    /**
     * Parse a XJMF Object Tree to a byte array.
     *
     * @param xjmf XJMF Object Tree for parsing.
     *
     * @return XJMF as byte array.
     * @throws IOException Is thrown in case any IO error occurs.
     */
    public final byte[] parseXJmf(final XJMF xjmf)
        throws IOException, JAXBException {
        return parseXml(xjmf);
    }

    /**
     * Parse a XJMF Object Tree to a byte array.
     *
     * @param xjmf XJMF Object Tree for parsing.
     * @param skipValidation Skip validation.
     *
     * @return XJMF as byte array.
     * @throws JAXBException Is thrown in case any error while un-/marshalling occurs.
     * @throws IOException Is thrown in case any IO error occurs.
     */
    public final byte[] parseXJmf(final XJMF xjmf, final boolean skipValidation)
        throws JAXBException, IOException {
        return parseXml(xjmf, skipValidation);
    }

    @Override
    protected final NamespacePrefixMapper getNamespacePrefixMapper() {
        return new XJdfNamespaceMapper();
    }

    @Override
    protected String getXmlHeader() {
        String header = "<!-- Generated by CIP4 xJdfLib " + XJdfConstants.XJDF_LIB_VERSION + " -->\r\n";
        header = header.replaceAll("  ", " ");
        return header;
    }

    @Override
    protected final AbstractXmlValidator createValidator() {
        return new XJdfValidator();
    }
}
