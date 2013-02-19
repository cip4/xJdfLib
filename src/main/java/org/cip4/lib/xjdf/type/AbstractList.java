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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A list is an enumerated set of values, which is expressed as a list of space separated values.
 * @author s.meissner
 * @date 10.01.2013
 */
public abstract class AbstractList<T> extends AbstractXJdfType<String, AbstractList<T>> {

	private final static String LIST_SEPARATOR = " ";

	private List<T> list;

	/**
	 * Default constructor.
	 */
	public AbstractList() {

		// create empty list
		this(new ArrayList<T>());
	}

	/**
	 * Custom constructor. Accepting a variable number of integers.
	 */
	public AbstractList(T... values) {

		List<T> list = new ArrayList<T>(values.length);

		for (int i = 0; i < values.length; i++) {
			list.add(values[i]);
		}

		// make list unmodifiable
		this.list = Collections.unmodifiableList(list);
	}

	/**
	 * Custom constructor, accepting a list object for initializing.
	 */
	public AbstractList(List<T> list) {

		// make list unmodifiable
		this.list = Collections.unmodifiableList(list);
	}

	/**
	 * Custom constructor, accepting a String object for initializing.
	 */
	public AbstractList(String value) {

		// split string
		String[] items = value.split(LIST_SEPARATOR);

		// convert items
		List<T> lst = new ArrayList<T>(items.length);

		for (int i = 0; i < items.length; i++) {
			lst.add(convertFromString(items[i]));
		}

		this.list = Collections.unmodifiableList(lst);
	}

	/**
	 * Getter for list attribute.
	 * @return the list
	 */
	public List<T> getList() {
		return list;
	}

	/**
	 * Setter for list attribute.
	 * @param list the list to set
	 */
	public void setList(List<T> list) {
		this.list = list;
	}

	/**
	 * Converts the data type from a String value.
	 * @param value String expression.
	 * @return String as target data type.
	 */
	protected abstract T convertFromString(String value);

	/**
	 * @see javax.xml.bind.annotation.adapters.XmlAdapter#marshal(java.lang.Object)
	 */
	@Override
	public String marshal(AbstractList<T> obj) {

		if (obj == null)
			return null;

		// build result
		String result = null;

		for (int i = 0; i < obj.list.size(); i++) {

			if (result == null) {
				result = obj.list.get(i).toString();

			} else {
				result += LIST_SEPARATOR + obj.list.get(i).toString();
			}

		}

		// return result
		return result;
	}

	/**
	 * @see javax.xml.bind.annotation.adapters.XmlAdapter#unmarshal(java.lang.Object)
	 */
	@Override
	public AbstractList<T> unmarshal(String v) throws Exception {
		return (AbstractList<T>) getClass().getConstructor(String.class).newInstance(v);
	}

}
