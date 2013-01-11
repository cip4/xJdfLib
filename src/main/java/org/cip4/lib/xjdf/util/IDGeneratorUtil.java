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
package org.cip4.lib.xjdf.util;

/**
 * Static helper class for generating IDs.
 * @author s.meissner
 * @date 09.01.2013
 */
public class IDGeneratorUtil {

	private final static String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

	private final static String DEFAULT_PREFIX = "ID";

	private final static int ID_LENGTH = 8;

	/**
	 * Private constructor.<br/>
	 * This class cannot be instantiated.
	 */
	private IDGeneratorUtil() {

		// protection from reflection
		throw new AssertionError("Class cannot be instantiated.");
	}

	/**
	 * Generates an (almost) unique ID.
	 * @return An almost unique ID.
	 */
	public static String generateID() {
		return generateID(null);
	}

	/**
	 * Generates an (almost) unique ID.
	 * @return An almost unique ID.
	 */
	public static String generateID(String prefix) {

		// generate random part
		char[] id = new char[ID_LENGTH];

		for (int i = 0; i < ID_LENGTH; i++) {
			int pos = (int) (Math.random() * CHARACTERS.length());
			id[i] = CHARACTERS.charAt(pos);
		}

		String val = new String(id);

		// add prefix
		if (prefix == null || prefix.isEmpty()) {
			prefix = DEFAULT_PREFIX;
		}

		String result = prefix.toUpperCase() + "_" + val;

		// return result
		return result;
	}
}
