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

import javax.xml.bind.JAXBException;

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
	 * Private default constructor.
	 * @throws JAXBException Thrown in case a JAXBException occurs.
	 */
	private XJdfParser() throws JAXBException {

		// call super class
		super(JAXBContextFactory.getInstance());
	}

	/**
	 * Factory method for getting a new XJdfParser instance.
	 * @return New XJdfParser instance.
	 */
	public static XJdfParser newInstance() {

		try {

			// return new instance
			return new XJdfParser();

		} catch (JAXBException e) {

			// error
			e.printStackTrace();
			throw new AssertionError(e);

		}
	}
}
