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
package org.cip4.lib.xjdf.xml;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

/**
 * Validation of XJDF Documents based on XJDF schema file.
 * @author s.meissner
 * @date 11.04.2012
 */
public class XJdfValidator {

	private List<String> messages;

	/**
	 * Private default constructor.
	 */
	private XJdfValidator() {
		messages = null;
	}

	/**
	 * Factory method for getting a new XJdfValidator instance.
	 * @return New XJdfValidator Instance
	 */
	public static XJdfValidator newInstance() {

		// return new instance
		return new XJdfValidator();
	}

	/**
	 * Getter for messages attribute.
	 * @return the messages
	 */
	public List<String> getMessages() {
		return messages;
	}

	/**
	 * Getter for messages as error text.
	 * @return the messages
	 */
	public String getMessagesErrorText() {

		String result = null;

		if (!isValid()) {
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
	 */
	public XJdfValidator check(InputStream xJdfFileStream) throws Exception {

		// reset messages
		messages = null;

		// load XJDF schema
		InputStream isSchema = XJdfValidator.class.getResourceAsStream(XJdfConstants.RES_JDF20_XSD);

		// create a SchemaFactory and a Schema
		SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
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
		db.parse(xJdfFileStream);

		// get result
		messages = errorHandler.getMessages();

		// return current instance
		return this;
	}

	/**
	 * Returns whether or not checked XJDF Document is valid.
	 * @return True in case XJDF Document is valid. Other wise false.
	 */
	public boolean isValid() {

		if (messages == null) {
			throw new NullPointerException("No XJDF Document was checked. Check a document before calling this method.");
		}

		// return result
		return messages.size() == 0;
	}

	/**
	 * XJdf Error Handler Implementation for Validation.
	 * @author s.meissner
	 * @date 11.04.2012
	 */
	private class XJdfErrorHandler implements ErrorHandler {

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
		public void warning(SAXParseException exception) throws SAXException {

			// add warning
			String msg = "WARNING in XJDF Doc at line " + exception.getLineNumber() + ", column " + exception.getColumnNumber() + ": " + exception.getMessage();
			messages.add(msg);
		}

		/**
		 * @see org.xml.sax.ErrorHandler#error(org.xml.sax.SAXParseException)
		 */
		public void error(SAXParseException exception) throws SAXException {

			// add error
			String msg = "ERROR in XJDF Doc at line " + exception.getLineNumber() + ", column " + exception.getColumnNumber() + ": " + exception.getMessage();
			messages.add(msg);
		}

		/**
		 * @see org.xml.sax.ErrorHandler#fatalError(org.xml.sax.SAXParseException)
		 */
		public void fatalError(SAXParseException exception) throws SAXException {

			// add fatal error
			String msg = "FATAL in XJDF Doc ERROR at line " + exception.getLineNumber() + ", column " + exception.getColumnNumber() + ": " + exception.getMessage();
			messages.add(msg);
		}
	}

}
