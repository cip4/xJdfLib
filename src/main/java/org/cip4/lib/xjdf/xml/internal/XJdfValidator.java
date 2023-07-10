package org.cip4.lib.xjdf.xml.internal;

import org.apache.commons.lang3.StringUtils;
import org.cip4.lib.xjdf.exception.XJdfValidationException;
import org.cip4.lib.xjdf.xml.XJdfConstants;
import org.w3c.dom.Document;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class XJdfValidator {

    /**
     * Default constructor.
     */
    public XJdfValidator() {
    }

    /**
     * Validation of xml based on the XJDF Schema.
     *
     * @param xjdf The xjdf document to be checked as byte array.
     */
    public final void validate(final byte[] xjdf) throws XJdfValidationException {

        // validate xml syntax
        validateSyntax(xjdf);

        // validate semantic
        validateSemantic(xjdf);
    }

    /**
     * Syntax validation of the XJDF Document.
     *
     * @param xjdf The XJDF Document to be checked as byte array.
     */
    void validateSyntax(final byte[] xjdf) throws XJdfValidationException {
        XJdfErrorHandler errorHandler = new XJdfErrorHandler();

        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            documentBuilderFactory.setNamespaceAware(true);

            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            documentBuilder.setErrorHandler(errorHandler);

            Document doc = documentBuilder.parse(new ByteArrayInputStream(xjdf));

            if (!errorHandler.getMessages().isEmpty()) {
                final List<String> messages = errorHandler.getMessages();

                throw new XJdfValidationException(
                    "Validation of the document's syntax failed due to following error messages: "
                        + System.lineSeparator()
                        + StringUtils.join(messages, System.lineSeparator())
                );
            }
        } catch (ParserConfigurationException | SAXException | IOException e) {
            throw new XJdfValidationException(e.getMessage(), e);
        }
    }

    /**
     * Semantic validation of XJDF Document based on XJDF Schema.
     *
     * @param xjdf The XJDF Document to be checked as byte array.
     */
    final void validateSemantic(final byte[] xjdf) throws XJdfValidationException {
        try {
            // create a SchemaFactory and a Schema
            SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);

            StreamSource xsdSource = new StreamSource(new ByteArrayInputStream(XJdfConstants.XJDF_XSD_BYTES_CURRENT));
            Schema schema = schemaFactory.newSchema(xsdSource);

            // new error handler
            XJdfErrorHandler errorHandler = new XJdfErrorHandler();

            // validate
            Validator validator = schema.newValidator();
            validator.setErrorHandler(errorHandler);
            validator.validate(new StreamSource(new ByteArrayInputStream(xjdf)));

            // get result
            final List<String> messages = errorHandler.getMessages();
            if (messages.size() > 0) {
                throw new XJdfValidationException(
                    "Validation of the document's semantic failed due to following error messages: "
                        + System.lineSeparator()
                        + StringUtils.join(messages, System.lineSeparator())
                );
            }
        } catch (SAXException | IOException e) {
            throw new XJdfValidationException(e.getMessage(), e);
        }
    }

    /**
     * XJDF Error Handler Implementation for Validation.
     */
    private static class XJdfErrorHandler implements ErrorHandler {

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
}
