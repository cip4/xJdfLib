package org.cip4.lib.xjdf.type;

import java.util.List;

/**
 * An IntegerList is an enumerated set of Integers, which is expressed as a list of space separated values.
 * @author s.meissner
 */
public class IntegerList extends AbstractList<Integer> {

	/**
	 * Default constructor.
	 */
	public IntegerList() {

		super();
	}

	/**
	 * Custom constructor. Accepting a variable number of integers.
	 */
	public IntegerList(Integer... values) {

		super(values);
	}

	/**
	 * Custom constructor. Accepting a list object for initializing.
	 */
	public IntegerList(List<Integer> list) {

		super(list);
	}

	/**
	 * Custom constructor. Accepting a String object for initializing.
	 */
	public IntegerList(String value) {
		super(value);
	}

	/**
	 * @see org.cip4.lib.xjdf.type.AbstractList#convertFromString(java.lang.String)
	 */
	@Override
	protected Integer convertFromString(String value) {

		// convert to Integer
		return Integer.valueOf(value);
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return marshal(this);
	}
}
