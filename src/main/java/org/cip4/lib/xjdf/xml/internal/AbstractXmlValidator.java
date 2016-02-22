package org.cip4.lib.xjdf.xml.internal;

import com.sun.org.apache.xerces.internal.dom.DOMInputImpl;
import org.apache.commons.lang.StringUtils;
import org.w3c.dom.ls.LSInput;
import org.w3c.dom.ls.LSResourceResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

import javax.xml.XMLConstants;
import javax.xml.bind.ValidationException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Abstract Validation of XML Documents based on XSD schema file.
 *
 * @param <T> Document type that will be validated.
 */
public abstract class AbstractXmlValidator<T> {

    /**
     * XJdf Error Handler Implementation for Validation.
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
     *
     * @author s.meissner
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
     * Map of dependent XSD files.
     */
    private final Map<String, byte[]> xsdDependencies;

    /**
     * Custom constructor.
     *
     * @param xsdDependencies Dependencies for the XSD.
     */
    public AbstractXmlValidator(final Map<String, byte[]> xsdDependencies) {
        this.xsdDependencies = xsdDependencies;
    }

    /**
     * Validation of XJDF Document based on XJDF Schema.
     *
     * @param documentStream Stream to read document from.
     *
     * @throws ValidationException Is thrown in case the underlying document is invalid.
     */
    public final void validate(final InputStream documentStream) throws ValidationException {
        try {
            // create a SchemaFactory and a Schema
            SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            schemaFactory.setResourceResolver(new ResourceResolver());
            Schema schema = schemaFactory.newSchema(getSchema());

            // new error handler
            XJdfErrorHandler errorHandler = new XJdfErrorHandler();

            // validate
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            dbf.setNamespaceAware(true);
            dbf.setSchema(schema);
            DocumentBuilder db = dbf.newDocumentBuilder();
            db.setErrorHandler(errorHandler);
            db.parse(documentStream);

            // get result
            final List<String> messages = errorHandler.getMessages();
            if (messages.size() > 0) {
                throw new ValidationException(
                    "Validation of the document failed due to following error messages: "
                        + System.lineSeparator()
                        + StringUtils.join(messages, System.lineSeparator())
                );
            }
        } catch (ParserConfigurationException | SAXException | IOException e) {
            throw new ValidationException(e.getMessage(), e);
        }
    }

    /**
     * Get the URL of the schema to validate against.
     *
     * @return Internal URL to of the schema.
     */
    protected abstract URL getSchema();

}