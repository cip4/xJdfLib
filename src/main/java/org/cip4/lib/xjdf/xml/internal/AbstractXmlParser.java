package org.cip4.lib.xjdf.xml.internal;

import com.sun.xml.bind.marshaller.NamespacePrefixMapper;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.output.XmlStreamWriter;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.ValidationException;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

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
     * @throws JAXBException Is thrown in case parsing a node fails.
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
     * @throws JAXBException Is thrown in case parsing a node fails.
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
     * @throws ParserConfigurationException Is thrown in case a serious configuration error occurs.
     * @throws JAXBException Is thrown in case any error while un-/marshalling occurs.
     * @throws SAXException Is thrown in case parsing an xml document fails.
     * @throws IOException Is thrown in case any IO error occurs.
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
     * @throws ParserConfigurationException Is thrown in case a serious configuration error occurs.
     * @throws JAXBException Is thrown in case any error while un-/marshalling occurs.
     * @throws SAXException Is thrown in case parsing an xml document fails.
     * @throws IOException Is thrown in case any IO error occurs.
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
     * @throws ParserConfigurationException Is thrown in case a serious configuration error occurs.
     * @throws JAXBException Is thrown in case any error while un-/marshalling occurs.
     * @throws SAXException Is thrown in case parsing an xml document fails.
     * @throws IOException Is thrown in case any IO error occurs.
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
     * @throws ParserConfigurationException Is thrown in case a serious configuration error occurs.
     * @throws JAXBException Is thrown in case any error while un-/marshalling occurs.
     * @throws SAXException Is thrown in case parsing an xml document fails.
     * @throws IOException Is thrown in case any IO error occurs.
     */
    protected final void parseXml(final T obj, final OutputStream os, final boolean skipValidation)
        throws JAXBException, IOException, ParserConfigurationException, SAXException {
        Marshaller m = createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        m.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
        m.setProperty("com.sun.xml.bind.xmlHeaders", getXmlHeader());

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        XmlStreamWriter xmlWriter = new XmlStreamWriter(bos, "UTF-8");
        m.marshal(obj, xmlWriter);

        byte[] doc = bos.toByteArray();

        if (!skipValidation) {
            AbstractXmlValidator validator = createValidator();
            InputStream is = new ByteArrayInputStream(doc);
            ValidationResult validationResult = validator.validate(is);
            if (!validationResult.isValid()) {
                throw new ValidationException(validationResult.getMessagesText());
            }
        }

        InputStream is = new ByteArrayInputStream(doc);
        IOUtils.copy(is, os);
        is.close();
    }

    /**
     * Parse a binary input stream to a object tree.
     *
     * @param is Binary document input stream for parsing.
     *
     * @return Object tree parsed from binary input stream.
     * @throws JAXBException Is thrown in case any error while un-/marshalling occurs.
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
     * @throws JAXBException Is thrown in case any error while un-/marshalling occurs.
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
    protected abstract AbstractXmlValidator<T> createValidator();

}