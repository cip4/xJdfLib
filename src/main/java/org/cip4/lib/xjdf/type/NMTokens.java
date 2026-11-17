package org.cip4.lib.xjdf.type;

import java.util.List;

/**
 * NMTOKENS is an enumerated set of NMTOKEN, which is expressed as a list of space separated values.
 *
 * @author s.meissner
 */
public final class NMTokens extends AbstractList<String> {

    /**
     * Default constructor.
     */
    public NMTokens() {

        super();
    }

    /**
     * Creates a list from the given values.
     *
     * @param values The list values.
     */
    public NMTokens(String... values) {

        super(values);
    }

    /**
     * Creates a list from the given values.
     *
     * @param list The list values. The list is copied.
     */
    public NMTokens(List<String> list) {

        super(list);
    }

    /**
     * Parses a space separated list of NMTOKEN values.
     *
     * @param value The space separated list.
     */
    public NMTokens(String value) {
        super(value);
    }

    /**
     * Returns the item unchanged.
     *
     * @param value The raw item.
     *
     * @return The item.
     */
    @Override
    protected String convertFromString(String value) {

        // convert to Integer
        return value;
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
