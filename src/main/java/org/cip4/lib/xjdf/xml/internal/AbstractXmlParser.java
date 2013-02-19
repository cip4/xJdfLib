/**
 * All rights reserved by
 * 
 * flyeralarm GmbH
 * Alfred-Nobel-Straße 18
 * 97080 Würzburg
 *
 * Email: info@flyeralarm.com
 * Website: http://www.flyeralarm.com
 */
package org.cip4.lib.xjdf.xml.internal;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Constructor;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.ValidationException;

import org.apache.commons.io.IOUtils;
import org.cip4.lib.xjdf.xml.XJdfConstants;

import com.sun.xml.bind.marshaller.NamespacePrefixMapper;

/**
 * Parsing logic for building a XML Document from DOM-Tree and the way around.
 * @author s.meissner
 * @date 26.06.2012
 */
public abstract class AbstractXmlParser<T> {

	private final JAXBContext jaxbContext;

	/**
	 * Custom constructor. Accepting a JAXBContextFactory for initializing.
	 */
	protected AbstractXmlParser(JAXBContext jaxbContext) {

		// init instance varialbes
		this.jaxbContext = jaxbContext;
	}

	/**
	 * Parse a object tree to a byte array.
	 * @param obj Object tree for parsing.
	 * @param abstractValidatorClass
	 * @return XJDF as Byte Array.
	 * @throws Exception Is thrown in case an exception occurs.
	 */
	protected byte[] parseXml(T obj, Class abstractValidatorClass) throws Exception {
		return parseXml(obj, false, abstractValidatorClass);
	}

	/**
	 * Parse a object tree to a binary output stream.
	 * @param object Object tree for parsing.
	 * @param os Target OutputStream where XJdfDocument is being parsed.
	 * @throws ValidationException Is thrown in case XJDF is not valid and validation process is not being skipped.
	 * @throws Exception Is thrown in case an exception occurs.
	 */
	protected void parseXml(T obj, OutputStream os, Class abstractValidatorClass) throws Exception {
		parseXml(obj, os, false, abstractValidatorClass);
	}

	/**
	 * Parse a object tree to a byte array.
	 * @param obj Object tree for parsing.
	 * @param abstractValidatorClass
	 * @param skipValidation Skip validation.
	 * @return XJDF as Byte Array.
	 * @throws Exception Is thrown in case an exception occurs.
	 */
	protected byte[] parseXml(T obj, boolean skipValidation, Class abstractValidatorClass) throws Exception {

		// parse object tree
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		parseXml(obj, bos, skipValidation, abstractValidatorClass);
		bos.close();

		// retrun byte array
		return bos.toByteArray();
	}

	/**
	 * Parse a object tree to a binary output stream.
	 * @param obj Object tree object for parsing.
	 * @param os Target OutputStream where XJdfDocument is being parsed.
	 * @param skipValidation Indicates whether or not validation has to be skipped.
	 * @throws ValidationException Is thrown in case XJDF is not valid and validation process is not being skipped.
	 * @throws Exception Is thrown in case an exception occurs.
	 */
	protected void parseXml(T obj, OutputStream os, boolean skipValidation, Class abstractValidatorClass) throws Exception {

		// marshall XJDF object to output stream
		Marshaller m = jaxbContext.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		m.setProperty("com.sun.xml.bind.namespacePrefixMapper", getNamespacePrefixMapper());
		m.setProperty("com.sun.xml.bind.xmlHeaders", getXmlHeader());

		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		m.marshal(obj, bos);
		bos.close();

		// validate
		if (!skipValidation) {

			InputStream is = new ByteArrayInputStream(bos.toByteArray());

			Constructor ctor = abstractValidatorClass.getDeclaredConstructor(InputStream.class);
			AbstractXmlValidator validator = (AbstractXmlValidator) ctor.newInstance(is);

			if (!validator.isValid()) {
				String err = validator.getMessagesText();
				throw new ValidationException(err);
			}
		}

		// write output
		InputStream is = new ByteArrayInputStream(bos.toByteArray());
		IOUtils.copy(is, os);
		is.close();
	}

	/**
	 * Parse a byte array to a object tree.
	 * @param bytes Byte Array for parsing.
	 * @return Object treee parsed from Byte Array.
	 * @throws Exception Is thrown in cas an exception occurs.
	 */
	protected T parseBytes(byte[] bytes) throws Exception {

		// create Stream
		InputStream is = new ByteArrayInputStream(bytes);

		// retrun object
		return parseStream(is);
	}

	/**
	 * Parse a binary input stream to a object tree.
	 * @param is Binary xjdf input stream for parsing.
	 * @return Object tree parsed from binary input stream.
	 * @throws Exception Is thrown in case an exception occurs.
	 */
	protected T parseStream(InputStream is) throws Exception {

		// unmarshall XJDF stream
		Unmarshaller u = jaxbContext.createUnmarshaller();
		T dom = (T) u.unmarshal(is);

		// return result
		return dom;
	}

	/**
	 * Returns a new specific NamespacePrefixMapper implementation.
	 * @return New specific NamespacePrefixMapper implementation.
	 */
	protected NamespacePrefixMapper getNamespacePrefixMapper() {
		return new XJdfNamespaceMapper();
	}

	/**
	 * Returns the XML Header for marshaling.
	 * @return XML Header as String
	 */
	protected String getXmlHeader() {

		String header = "";

		// build XJDF Header
		header += "\r\n<!-- Generated by CIP4 xJdfLib " + XJdfConstants.XJDF_LIB_VERSION + " -->";
		header = header.replaceAll("  ", " ");

		// return header
		return header;
	}
}