package org.cip4.lib.xjdf.xml.internal;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.ValidationException;
import javax.xml.bind.util.JAXBSource;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Source;

import org.w3c.dom.Node;

import com.sun.xml.bind.marshaller.NamespacePrefixMapper;
import org.xml.sax.SAXException;

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
     * @throws JAXBException
     */
    protected final Object parseNode(final Node w3cNode) throws JAXBException {
        Unmarshaller u = jaxbContext.createUnmarshaller();
        return u.unmarshal(w3cNode);
    }

    /**
     * Parse an XML Node to a W3C Node.
     *
     * @param xmlNode The XML Node to be parsed.
     * @param w3cNode The W3C Result node.
     *
     * @throws JAXBException
     */
    protected final void parseNode(final Object xmlNode, final Node w3cNode) throws JAXBException {
        Marshaller m = createMarshaller();
        m.marshal(xmlNode, w3cNode);
    }

    /**
     * Parse the object tree of an document to a byte array.
     *
     * @param obj Object tree for parsing.
     *
     * @return XML-representation of the document as array of bytes.
     */
    protected final byte[] parseXml(final T obj)
        throws ParserConfigurationException, JAXBException, SAXException, IOException {
        return parseXml(obj, false);
    }

    /**
     * Parse the object tree of an document to a binary output stream.
     *
     * @param obj Object tree for parsing.
     * @param os OutputStream the write the document to.
     *
     * @throws ValidationException Is thrown in case document is not valid and validation process is not being skipped.
     */
    protected final void parseXml(final T obj, final OutputStream os)
        throws IOException, ParserConfigurationException, SAXException, JAXBException {
        parseXml(obj, os, false);
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
        throws IOException, ParserConfigurationException, SAXException, JAXBException {
        // parse object tree
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        parseXml(obj, bos, skipValidation);
        bos.close();

        // retrun byte array
        return bos.toByteArray();
    }

    /**
     * Parse a object tree to a binary output stream.
     *
     * @param obj Object tree object for parsing.
     * @param os Target OutputStream where document is being parsed.
     * @param skipValidation Indicates whether or not validation has to be skipped.
     *
     * @throws ValidationException Is thrown in case the document is not valid and validation process is not being
     * skipped.
     */
    protected final void parseXml(final T obj, final OutputStream os, final boolean skipValidation)
        throws JAXBException, IOException, ParserConfigurationException, SAXException {
        if (!skipValidation) {
            AbstractXmlValidator validator = createValidator();
            Source xmlSource = new JAXBSource(jaxbContext, obj);
            validator.validate(xmlSource);
        }

        Marshaller m = createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        m.setProperty(Marshaller.JAXB_ENCODING, CHARSET.name());
        m.setProperty("com.sun.xml.bind.xmlHeaders", getXmlHeader());

        OutputStreamWriter writer = new OutputStreamWriter(os, CHARSET);
        m.marshal(obj, writer);
    }

    /**
     * Parse a binary input stream to a object tree.
     *
     * @param is Binary document input stream for parsing.
     *
     * @return Object tree parsed from binary input stream.
     */
    @SuppressWarnings("unchecked")
    public final T parseStream(final InputStream is) throws JAXBException {
        Unmarshaller u = jaxbContext.createUnmarshaller();
        return (T) u.unmarshal(is);
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
     * @throws JAXBException
     */
    private Marshaller createMarshaller() throws JAXBException {
        // create marshaller
        Marshaller m = jaxbContext.createMarshaller();
        m.setProperty("com.sun.xml.bind.namespacePrefixMapper", getNamespacePrefixMapper());

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