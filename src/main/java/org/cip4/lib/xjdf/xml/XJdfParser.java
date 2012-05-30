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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.ValidationException;

import org.cip4.lib.xjdf.schema.jdf.XJDF;
import org.cip4.lib.xjdf.util.IOUtils;
import org.cip4.lib.xjdf.xml.internal.JAXBContextFactory;
import org.cip4.lib.xjdf.xml.internal.XJdfNamespaceMapper;

/**
 * Parsing logic for building a XML Document from XJDF DOM-Tree and the way around.
 * @author s.meissner
 * @date 06.03.2012
 */
public class XJdfParser {

	/**
	 * Private default constructor.
	 */
	private XJdfParser() {
	}

	/**
	 * Factory method for getting a new XJdfParser instance.
	 * @return
	 */
	public static XJdfParser newInstance() {

		// return new instance
		return new XJdfParser();
	}

	/**
	 * Parse a XJDF object to a binary output stream.
	 * @param xJdf XJdf object for parsing.
	 * @param os Target OutputStream where XJdfDocument is being parsed.
	 * @param skipValidation Indicates whether or not validation has to be skipped.
	 * @throws ValidationException Is thrown in case XJDF is not valid and validation process is not being skipped.
	 * @throws Exception Is thrown in case an exception occurs.
	 */
	public void parseXJdf(XJDF xJdf, OutputStream os) throws Exception {
		parseXJdf(xJdf, os, false);
	}

	/**
	 * Parse a XJDF object to a binary output stream.
	 * @param xJdf XJdf object for parsing.
	 * @param os Target OutputStream where XJdfDocument is being parsed.
	 * @param skipValidation Indicates whether or not validation has to be skipped.
	 * @throws ValidationException Is thrown in case XJDF is not valid and validation process is not being skipped.
	 * @throws Exception Is thrown in case an exception occurs.
	 */
	public void parseXJdf(XJDF xJdf, OutputStream os, boolean skipValidation) throws Exception {

		// marshall XJDF object to output stream
		Marshaller m = JAXBContextFactory.getInstance().createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		m.setProperty("com.sun.xml.bind.namespacePrefixMapper", new XJdfNamespaceMapper());

		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		m.marshal(xJdf, bos);
		bos.close();

		// validate
		if (!skipValidation) {

			InputStream is = new ByteArrayInputStream(bos.toByteArray());
			XJdfValidator validator = XJdfValidator.newInstance();
			validator.check(is);

			if (!validator.isValid()) {
				String err = validator.getMessagesText();
				throw new ValidationException(err);
			}
		}

		// write output
		InputStream is = new ByteArrayInputStream(bos.toByteArray());
		IOUtils.copy(is, os);
	}

	/**
	 * Parse a binary input stream to a XJDF object.
	 * @param is Binary xjdf input stream for parsing.
	 * @return XJdf object parsed from binary input stream.
	 * @throws Exception Is thrown in case an exception occurs.
	 */
	public XJDF parseStream(InputStream is) throws Exception {

		// unmarshall XJDF stream
		Unmarshaller u = JAXBContextFactory.getInstance().createUnmarshaller();
		XJDF xJdf = (XJDF) u.unmarshal(is);

		// return result
		return xJdf;
	}
}
