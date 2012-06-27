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

import java.io.IOException;
import java.io.InputStream;

import org.cip4.lib.xjdf.xml.internal.AbstractXPathNavigator;

/**
 * Navigator class which simplify XPath handling using XJdf Documents.
 * @author s.meissner
 * @date 06.03.2012
 */
public class XJdfNavigator extends AbstractXPathNavigator {

	/**
	 * Custom private default constructor. Accepting a XJdf InputStream for initializing.
	 * @param xJdfStream The XJDF Input Stream.
	 */
	private XJdfNavigator(InputStream xJdfStream) throws Exception {
		super(xJdfStream);
	}

	/**
	 * Factory method for creating a new XJdfNavigator object.
	 * @param xmlStream XML document as input stream.
	 * @return Initialized XPathNavigator instance.
	 * @throws IOException Is being thrown in case an exception occurs.
	 */
	public static XJdfNavigator newInstance(InputStream xmlStream) throws Exception {

		// create and return new instance
		return new XJdfNavigator(xmlStream);
	}
}
