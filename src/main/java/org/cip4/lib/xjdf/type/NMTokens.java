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
package org.cip4.lib.xjdf.type;

import java.util.List;

/**
 * NMTOKENS is an enumerated set of NMTOKEN, which is expressed as a list of space separated values.
 * @author s.meissner
 * @date 11.01.2013
 */
public class NMTokens extends AbstractList<String> {

	/**
	 * Default constructor.
	 */
	public NMTokens() {

		super();
	}

	/**
	 * Custom constructor. Accepting a variable number of strings.
	 */
	public NMTokens(String... values) {

		super(values);
	}

	/**
	 * Custom constructor. Accepting a list object for initializing.
	 */
	public NMTokens(List<String> list) {

		super(list);
	}

	/**
	 * Custom constructor. Accepting a String object for initializing.
	 */
	public NMTokens(String value) {
		super(value);
	}

	/**
	 * @see org.cip4.lib.xjdf.type.AbstractList#convertFromString(java.lang.String)
	 */
	@Override
	protected String convertFromString(String value) {

		// convert to Integer
		return value;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return marshal(this);
	}

}
