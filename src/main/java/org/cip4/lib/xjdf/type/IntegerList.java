package org.cip4.lib.xjdf.type;

import java.util.List;

/**
 * An IntegerList is an enumerated set of Integers, which is expressed as a list of space separated values.
 *
 * @author s.meissner
 */
public final class IntegerList extends AbstractList<Integer> {

    /**
     * Default constructor.
     */
    public IntegerList() {

        super();
    }

    /**
     * Creates a list from the given values.
     *
     * @param values The list values.
     */
    public IntegerList(Integer... values) {

        super(values);
    }

    /**
     * Creates a list from the given values.
     *
     * @param list The list values. The list is copied.
     */
    public IntegerList(List<Integer> list) {

        super(list);
    }

    /**
     * Parses a space separated list of integers.
     *
     * @param value The space separated list.
     *
     * @throws IllegalArgumentException in case an item is not an integer.
     */
    public IntegerList(String value) {
        super(value);
    }

    /**
     * Parses a single integer item.
     *
     * @param value The raw item.
     *
     * @return The parsed integer.
     *
     * @throws IllegalArgumentException in case the value is not an integer.
     */
    @Override
    protected Integer convertFromString(String value) {

        // convert to Integer
        return XmlValues.parseInt("IntegerList", value);
    }

    /**
     * Returns the values as a space separated string.
     *
     * @return The space separated values.
     */
    @Override
    public String toString() {
        return marshal(this);
    }
}
