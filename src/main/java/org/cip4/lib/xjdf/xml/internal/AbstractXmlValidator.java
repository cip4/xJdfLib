/**
 * All rights reserved by
 * 
 * flyeralarm GmbH
 * Alfred-Nobel-Straße 18
 * 97080 Würzburg
 *
 * info@flyeralarm.com
 * http://www.flyeralarm.com
 */
package org.cip4.lib.xjdf.xml.internal;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.w3c.dom.bootstrap.DOMImplementationRegistry;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSInput;
import org.w3c.dom.ls.LSResourceResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

/**
 * Abstract Validation of XML Documents based on XSD schema file.
 * @author s.meissner
 * @date 11.04.2012
 */
public abstract class AbstractXmlValidator<T> {

	private final List<String> messages;

	private final byte[] xsdFile;

	private final InputStream fileStream;

	private final Map<String, byte[]> xsdDependencies;

	private Boolean documentIsValid;

	/**
	 * Custom constructor. Accepting a XML Schema file as byte array.
	 * @throws IOException
	 */
	private AbstractXmlValidator(byte[] xsd, InputStream fileStream) throws IOException {
		this(xsd, fileStream, null);
	}

	/**
	 * Custom constructor. Accepting a XML Schema file as byte array.
	 * @throws IOException
	 */
	public AbstractXmlValidator(byte[] xsd, InputStream fileStream, Map<String, byte[]> xsdDependencies) throws IOException {

		// initialize instance variables
		this.messages = new ArrayList<String>();
		this.xsdFile = xsd;
		this.fileStream = fileStream;
		this.documentIsValid = null;
		this.xsdDependencies = xsdDependencies;
	}

	/**
	 * Getter for messages attribute.
	 * @return the messages
	 */
	public List<String> getMessages() {
		return messages;
	}

	/**
	 * Getter for messages as single text.
	 * @return the messages
	 */
	public String getMessagesText() {

		String result = null;

		if (!documentIsValid) {
			StringBuilder builder = new StringBuilder();
			builder.append("XJDF Document is invalid:");

			for (String msg : messages) {
				builder.append("\n");
				builder.append(msg);
			}

			result = builder.toString();
		}

		// return result
		return result;
	}

	/**
	 * Validation of XJDF Document based on XJDF Schema.
	 * @throws SAXException
	 * @throws ParserConfigurationException
	 * @throws IOException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws ClassNotFoundException
	 */
	private T validate() throws SAXException, ParserConfigurationException, IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {

		// load XJDF schema
		InputStream isSchema = new ByteArrayInputStream(xsdFile);

		// create a SchemaFactory and a Schema
		SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		schemaFactory.setResourceResolver(new ResourceResolver());
		Source schemaSource = new StreamSource(isSchema);
		Schema schema = schemaFactory.newSchema(schemaSource);

		// new error handler
		XJdfErrorHandler errorHandler = new XJdfErrorHandler();

		// validate
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		dbf.setNamespaceAware(true);
		dbf.setSchema(schema);
		DocumentBuilder db = dbf.newDocumentBuilder();
		db.setErrorHandler(errorHandler);
		db.parse(fileStream);

		// get result
		if (errorHandler.getMessages() != null)
			messages.addAll(errorHandler.getMessages());

		// return current instance
		return (T) this;
	}

	/**
	 * Returns whether or not checked XJDF Document is valid.
	 * @return True in case XJDF Document is valid. Other wise false.
	 * @throws IOException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws ClassNotFoundException
	 */
	public boolean isValid() throws ClassNotFoundException, IllegalAccessException, InstantiationException, SAXException, ParserConfigurationException, IOException {

		// check whether document already is validated.
		if (documentIsValid == null) {

			// validate
			validate();

			// analyze result
			documentIsValid = messages.size() == 0;
		}

		// return result
		return documentIsValid.booleanValue();
	}

	/**
	 * XJdf Error Handler Implementation for Validation.
	 * @author s.meissner
	 * @date 11.04.2012
	 */
	class XJdfErrorHandler implements ErrorHandler {

		private final List<String> messages;

		/**
		 * Default constructor.
		 */
		private XJdfErrorHandler() {
			// initialize messages
			messages = new ArrayList<String>();
		}

		/**
		 * Getter for messages attribute.
		 * @return the messages
		 */
		public List<String> getMessages() {
			return messages;
		}

		/**
		 * @see org.xml.sax.ErrorHandler#warning(org.xml.sax.SAXParseException)
		 */
		@Override
		public void warning(SAXParseException exception) throws SAXException {

			// add warning
			String msg = "WARNING in XJDF Doc at line " + exception.getLineNumber() + ", column " + exception.getColumnNumber() + ": " + exception.getMessage();
			messages.add(msg);
		}

		/**
		 * @see org.xml.sax.ErrorHandler#error(org.xml.sax.SAXParseException)
		 */
		@Override
		public void error(SAXParseException exception) throws SAXException {

			// add error
			String msg = "ERROR in XJDF Doc at line " + exception.getLineNumber() + ", column " + exception.getColumnNumber() + ": " + exception.getMessage();
			messages.add(msg);
		}

		/**
		 * @see org.xml.sax.ErrorHandler#fatalError(org.xml.sax.SAXParseException)
		 */
		@Override
		public void fatalError(SAXParseException exception) throws SAXException {

			// add fatal error
			String msg = "FATAL in XJDF Doc ERROR at line " + exception.getLineNumber() + ", column " + exception.getColumnNumber() + ": " + exception.getMessage();
			messages.add(msg);
		}
	}

	/**
	 * Resolver class for resolving XSD Imports.
	 * @author s.meissner
	 * @date 04.07.2012
	 */
	private class ResourceResolver implements LSResourceResolver {

		private final DOMImplementationLS domImplementationLS;

		/**
		 * Default constructor.
		 * @throws ClassNotFoundException
		 * @throws IllegalAccessException
		 * @throws InstantiationException
		 */
		private ResourceResolver() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
			// System.setProperty(DOMImplementationRegistry.PROPERTY, "org.apache.xerces.dom.DOMImplementationSourceImpl");
			DOMImplementationRegistry registry = DOMImplementationRegistry.newInstance();
			domImplementationLS = (DOMImplementationLS) registry.getDOMImplementation("LS");
		}

		/**
		 * @see org.w3c.dom.ls.LSResourceResolver#resolveResource(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
		 */
		@Override
		public LSInput resolveResource(String type, String namespaceURI, String publicId, String systemId, String baseURI) {
			LSInput lsInput = domImplementationLS.createLSInput();

			if (xsdDependencies != null && xsdDependencies.containsKey(systemId)) {
				byte[] xsdBytes = xsdDependencies.get(systemId);

				lsInput.setByteStream(new ByteArrayInputStream(xsdBytes));
				lsInput.setSystemId(systemId);
			}

			return lsInput;
		}

	}

}