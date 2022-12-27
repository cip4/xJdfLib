package org.cip4.lib.xjdf.xml.internal;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import jakarta.xml.bind.ValidationException;
import jakarta.xml.bind.util.JAXBSource;
import javax.xml.transform.Source;

import org.cip4.lib.xjdf.exception.XJdfParseException;
import org.glassfish.jaxb.runtime.marshaller.NamespacePrefixMapper;
import org.w3c.dom.Node;

/**
 * Parsing logic for building a XML Document from DOM-Tree and the way around.
 *
 * @param <T> Object type that will be parsed.
 */
public abstract class AbstractXmlParser<T> {

    /**
     * Context for JAXB-handling.
     */
    private final JAXBContext jaxbContext;

    /**
     * Character encoding for xml files.
     */
    private static final Charset CHARSET = StandardCharsets.UTF_8;

    /**
     * Custom constructor. Accepting a JAXBContextFactory for initializing.
     *
     * @param jaxbContext Context for JAXB-Handling.
     */
    protected AbstractXmlParser(final JAXBContext jaxbContext) {
        this.jaxbContext = jaxbContext;
    }

    /**
     * Parse a W3C Node to a XML Node.
     *
     * @param w3cNode The W3C Node to be parsed.
     *
     * @return The XML Node as object.
     */
    protected final Object parseNode(final Node w3cNode) throws XJdfParseException {

        try {
            Unmarshaller u = jaxbContext.createUnmarshaller();
            return u.unmarshal(w3cNode);

        } catch (JAXBException jaxbException) {
            throw new XJdfParseException(jaxbException);
        }
    }

    /**
     * Parse an XML Node to a W3C Node.
     *
     * @param xmlNode The XML Node to be parsed.
     * @param w3cNode The W3C Result node.
     */
    protected final void parseNode(final Object xmlNode, final Node w3cNode) throws XJdfParseException {
        Marshaller m = createMarshaller();

        try {
            m.marshal(xmlNode, w3cNode);
        } catch (JAXBException jaxbException) {
            throw new XJdfParseException(jaxbException);
        }
    }

    /**
     * Parse a object tree to a byte array.
     *
     * @param obj Object tree for parsing.
     * @param skipValidation Skip validation.
     *
     * @return Document as Byte Array.
     */
    protected final byte[] parseXml(final T obj, final boolean skipValidation)
            throws XJdfParseException, IOException {
        // parse object tree
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        parseXml(obj, bos, skipValidation);
        bos.close();

        return bos.toByteArray();
    }

    /**
     * Parse an object tree to a binary output stream.
     *
     * @param obj Object tree object for parsing.
     * @param os Target OutputStream where document is being parsed.
     * @param skipValidation Indicates whether or not validation has to be skipped.
     *
     * @throws ValidationException Is thrown in case the document is not valid and validation process is not being
     * skipped.
     */
    protected final void parseXml(final T obj, final OutputStream os, final boolean skipValidation)
        throws XJdfParseException {

        try {
            if (!skipValidation) {
                AbstractXmlValidator validator = createValidator();
                Source xmlSource = new JAXBSource(jaxbContext, obj);
                validator.validate(xmlSource);
            }

            Marshaller m = createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            m.setProperty(Marshaller.JAXB_ENCODING, CHARSET.name());
            m.setProperty("org.glassfish.jaxb.xmlHeaders", getXmlHeader());

            OutputStreamWriter writer = new OutputStreamWriter(os, CHARSET);
            m.marshal(obj, writer);

        } catch (JAXBException jaxbException) {
            throw new XJdfParseException(jaxbException);
        }
    }

    /**
     * Parse a binary input stream to a object tree.
     *
     * @param is Binary document input stream for parsing.
     *
     * @return Object tree parsed from binary input stream.
     */
    @SuppressWarnings("unchecked")
    public final T parseStream(final InputStream is) throws XJdfParseException {
        try {
            Unmarshaller u = jaxbContext.createUnmarshaller();
            return (T) u.unmarshal(is);

        } catch (JAXBException jaxbException) {
            throw new XJdfParseException(jaxbException);
        }
    }

    /**
     * Returns a new specific NamespacePrefixMapper implementation.
     *
     * @return New specific NamespacePrefixMapper implementation.
     */
    protected abstract NamespacePrefixMapper getNamespacePrefixMapper();

    /**
     * Returns the XML Header for marshaling.
     *
     * @return XML Header as String
     */
    protected abstract String getXmlHeader();

    /**
     * Creates and returns a new marshaller object.
     *
     * @return New Marshaller object.
     */
    private Marshaller createMarshaller() throws XJdfParseException {
        Marshaller m;

        try {
            // create marshaller
            m = jaxbContext.createMarshaller();
            m.setProperty("org.glassfish.jaxb.namespacePrefixMapper", getNamespacePrefixMapper());

        } catch (JAXBException jaxbException) {
            throw new XJdfParseException(jaxbException);
        }

        // return marshaller
        return m;
    }

    /**
     * Create validator for validating documents.
     *
     * @return Validator
     */
    protected abstract AbstractXmlValidator createValidator();

}