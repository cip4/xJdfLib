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
import java.io.OutputStream;

import javax.xml.bind.JAXBException;
import javax.xml.bind.ValidationException;

import org.cip4.lib.xjdf.schema.XJDF;
import org.cip4.lib.xjdf.xml.internal.AbstractXmlParser;
import org.cip4.lib.xjdf.xml.internal.JAXBContextFactory;

/**
 * Parsing logic for building a XML Document from XJDF DOM-Tree and the way around.
 * @author s.meissner
 * @date 06.03.2012
 */
public class XJdfParser extends AbstractXmlParser<XJDF> {

	/**
	 * Default constructor.
	 * @throws JAXBException Thrown in case a JAXBException occurs.
	 */
	public XJdfParser() throws JAXBException {

		// call super class
		super(JAXBContextFactory.getInstance());
	}

	/**
	 * Parse a XJDF Object Tree to a binary output stream.
	 * @param xJdf XJDF Object Tree for parsing.
	 * @param os Target OutputStream where XJdfDocument is being parsed.
	 * @throws ValidationException Is thrown in case XJDF is not valid and validation process is not being skipped.
	 * @throws Exception Is thrown in case an exception occurs.
	 */
	public void parseXJdf(XJDF xJdf, OutputStream os) throws Exception {
		parseXml(xJdf, os, XJdfValidator.class);
	}

	/**
	 * Parse a XJDF Object Tree to a binary output stream.
	 * @param xJdf XJDF Object Tree for parsing.
	 * @param os Target OutputStream where XJdfDocument is being parsed.
	 * @param skipValidation Indicates whether or not validation has to be skipped.
	 * @throws ValidationException Is thrown in case XJDF is not valid and validation process is not being skipped.
	 * @throws Exception Is thrown in case an exception occurs.
	 */
	public void parseXJdf(XJDF xJdf, OutputStream os, boolean skipValidation) throws Exception {
		parseXml(xJdf, os, skipValidation, XJdfValidator.class);
	}

	/**
	 * Parse a binary input stream to a XJDF Object Tree.
	 * @param is Binary XJDF Input Stream for parsing.
	 * @return XJDF Object Tree parsed from binary input stream.
	 * @throws Exception Is thrown in case an exception occurs.
	 */
	@Override
	public XJDF parseStream(InputStream is) throws Exception {
		return super.parseStream(is);
	}
}
