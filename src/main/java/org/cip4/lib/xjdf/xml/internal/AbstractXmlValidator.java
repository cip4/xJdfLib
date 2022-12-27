package org.cip4.lib.xjdf.xml.internal;

import org.apache.commons.lang3.StringUtils;
import org.apache.xerces.dom.DOMInputImpl;
import org.cip4.lib.xjdf.XJdfDocument;
import org.cip4.lib.xjdf.exception.XJdfParseException;
import org.cip4.lib.xjdf.exception.XJdfValidationException;
import org.w3c.dom.Document;
import org.w3c.dom.ls.LSInput;
import org.w3c.dom.ls.LSResourceResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

import javax.xml.XMLConstants;
import jakarta.xml.bind.ValidationException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Abstract Validation of XML Documents based on XSD schema file.
 */
public abstract class AbstractXmlValidator {

    /**
     * XJDF Error Handler Implementation for Validation.
     */
    private class XJdfErrorHandler implements ErrorHandler {

        /**
         * List of found messages.
         */
        private final List<String> messages = new ArrayList<>();

        /**
         * Getter for messages attribute.
         *
         * @return the messages
         */
        public List<String> getMessages() {
            return messages;
        }

        @Override
        public void warning(final SAXParseException exception) {
            String msg =
                "WARNING in XJDF Doc at line " + exception.getLineNumber() + ", column " + exception.getColumnNumber()
                    + ": " + exception.getMessage();
            messages.add(msg);
        }

        @Override
        public void error(final SAXParseException exception) {
            String msg =
                "ERROR in XJDF Doc at line " + exception.getLineNumber() + ", column " + exception.getColumnNumber()
                    + ": " + exception.getMessage();
            messages.add(msg);
        }

        @Override
        public void fatalError(final SAXParseException exception) {
            // add fatal error
            String msg = "FATAL in XJDF Doc ERROR at line " + exception.getLineNumber() + ", column "
                + exception.getColumnNumber() + ": " + exception.getMessage();
            messages.add(msg);
        }
    }

    /**
     * Resolver class for resolving XSD Imports.
     */
    private class ResourceResolver implements LSResourceResolver {

        @Override
        public final LSInput resolveResource(
            final String type, final String namespaceURI, final String publicId, final String systemId,
            final String baseURI
        ) {
            LSInput lsInput = new DOMInputImpl(publicId, systemId, null);

            if (xsdDependencies != null && xsdDependencies.containsKey(systemId)) {
                lsInput.setByteStream(new ByteArrayInputStream(xsdDependencies.get(systemId)));
                lsInput.setSystemId(systemId);
            }

            return lsInput;
        }
    }

    /**
     * The XSD Schema for validation.
     */
    private final byte[] xsd;

    /**
     * Map of dependent XSD files.
     */
    private final Map<String, byte[]> xsdDependencies;

    /**
     * Custom constructor.
     *
     * @param xsd The xsd schema.
     */
    public AbstractXmlValidator(byte[] xsd) {
        this(xsd, null);
    }

    /**
     * Custom constructor.
     *
     * @param xsd The XSD schema for validation.
     * @param xsdDependencies Dependencies for the XSD.
     */
    public AbstractXmlValidator(final byte[] xsd, final Map<String, byte[]> xsdDependencies) {
        this.xsd = xsd;
        this.xsdDependencies = xsdDependencies;
    }

    /**
     * Validation of XJDF Document based on XJDF Schema.
     *
     * @param xJdfDocument Byte array to read document from.
     *
     * @throws ValidationException Is thrown in case the underlying document is invalid.
     */
    public final void validate(final XJdfDocument xJdfDocument) throws IOException, XJdfParseException, XJdfValidationException {
        validate(xJdfDocument.toXml());
    }

    /**
     * Validation of XJDF Document based on XJDF Schema.
     *
     * @param document Byte array to read document from.
     *
     * @throws ValidationException Is thrown in case the underlying document is invalid.
     */
    public final void validate(final byte[] document) throws XJdfValidationException {
        validate(new ByteArrayInputStream(document));
    }

    /**
     * Validation of XJDF Document based on XJDF Schema.
     *
     * @param documentStream Stream to read document from.
     *
     * @throws ValidationException Is thrown in case the underlying document is invalid.
     */
    public final void validate(final InputStream documentStream) throws XJdfValidationException {
        XJdfErrorHandler errorHandler = new XJdfErrorHandler();

        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            dbf.setNamespaceAware(true);
            DocumentBuilder db = dbf.newDocumentBuilder();
            db.setErrorHandler(errorHandler);
            Document doc = db.parse(documentStream);

            if (!errorHandler.getMessages().isEmpty()) {
                final List<String> messages = errorHandler.getMessages();
                throw new XJdfValidationException(
                    "Validation of the document failed due to following error messages: "
                        + System.lineSeparator()
                        + StringUtils.join(messages, System.lineSeparator())
                );
            }

            try {
                validate(new DOMSource(doc));
            } catch (ValidationException e) {
                throw new XJdfValidationException(e);
            }
        } catch (ParserConfigurationException | SAXException | IOException e) {
            throw new XJdfValidationException(e.getMessage(), e);
        }
    }

    /**
     * Validation of XJDF Document based on XJDF Schema.
     *
     * @param source XML source to validate
     *
     * @throws ValidationException Is thrown in case the underlying document is invalid.
     */
    protected final void validate(final Source source) throws ValidationException {
        try {
            // create a SchemaFactory and a Schema
            SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            schemaFactory.setResourceResolver(new ResourceResolver());
            Schema schema = schemaFactory.newSchema(new StreamSource(new ByteArrayInputStream(this.xsd)));

            // new error handler
            XJdfErrorHandler errorHandler = new XJdfErrorHandler();

            // validate
            Validator validator = schema.newValidator();
            validator.setErrorHandler(errorHandler);
            validator.validate(source);

            // get result
            final List<String> messages = errorHandler.getMessages();
            if (messages.size() > 0) {
                throw new ValidationException(
                    "Validation of the document failed due to following error messages: "
                        + System.lineSeparator()
                        + StringUtils.join(messages, System.lineSeparator())
                );
            }
        } catch (SAXException | IOException e) {
            throw new ValidationException(e.getMessage(), e);
        }
    }
}