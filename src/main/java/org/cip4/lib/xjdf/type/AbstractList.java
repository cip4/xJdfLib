package org.cip4.lib.xjdf.type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A list is an enumerated set of values, which is expressed as a list of space separated values.
 *
 * @param <T> The type of the list items.
 * @author s.meissner
 */
public abstract class AbstractList<T> extends AbstractXJdfType<String, AbstractList<T>> {

    private final static String LIST_SEPARATOR = " ";

    private List<T> list;

    /**
     * Default constructor.
     */
    public AbstractList() {
        this(new ArrayList<>());
    }

    /**
     * Custom constructor. Accepting a variable number of integers.
     *
     * @param values List of values.
     */
    @SafeVarargs
    public AbstractList(T... values) {
        this(Arrays.asList(values));
    }

    /**
     * Custom constructor, accepting a list object for initializing.
     *
     * @param list List of elements.
     */
    public AbstractList(List<T> list) {

        // make list unmodifiable and detach it from the caller's list
        this.list = Collections.unmodifiableList(new ArrayList<>(list));
    }

    /**
     * Custom constructor, accepting a String object for initializing.
     *
     * @param value A single String value.
     */
    public AbstractList(String value) {

        // split string
        final String[] items = XmlValues.split(value);

        // convert items
        List<T> lst = new ArrayList<>(items.length);

        for (String item : items) {
            lst.add(convertFromString(item));
        }

        this.list = Collections.unmodifiableList(lst);
    }

    /**
     * Returns the element on position i.
     *
     * @param i Position.
     *
     * @return Element on position i.
     */
    public T get(int i) {
        return getList().get(i);
    }

    /**
     * Returns true in case obj is conatined in the list.
     * @param obj The object to be checked.
     * @return True in case the obj is contained. Otherwise false.
     */
    public boolean contains(T obj) {
        return getList().contains(obj);
    }

    /**
     * Getter for list attribute.
     *
     * @return the list
     */
    public List<T> getList() {
        return list;
    }

    /**
     * Setter for list attribute.
     *
     * @param list the list to set
     *
     * @deprecated The list is immutable. Use the constructor instead; this method will be removed in a future
     *     release.
     */
    @Deprecated(since = "2.3", forRemoval = true)
    public void setList(List<T> list) {
        this.list = Collections.unmodifiableList(new ArrayList<>(list));
    }

    /**
     * Converts the data type from a String value.
     *
     * @param value String expression.
     *
     * @return String as target data type.
     */
    protected abstract T convertFromString(String value);

    /**
     * Serializes the list to a space separated XML value.
     *
     * @param obj The list to serialize.
     *
     * @return The space separated value, or null in case the list is null.
     */
    @Override
    public String marshal(AbstractList<T> obj) {

        if (obj == null)
            return null;

        // build result
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < obj.list.size(); i++) {

            if (result.length() > 0) {
                result.append(LIST_SEPARATOR);
            }
            result.append(obj.list.get(i).toString());
        }

        // return result
        return result.toString();
    }

    /**
     * Parses a space separated XML value into a new list of this type.
     *
     * @param v The space separated value.
     *
     * @return The parsed list.
     *
     * @throws Exception in case the concrete list type cannot be instantiated or contains invalid items.
     */
    @Override
    public AbstractList<T> unmarshal(String v) throws Exception {
        return getClass().getConstructor(String.class).newInstance(v);
    }

}
