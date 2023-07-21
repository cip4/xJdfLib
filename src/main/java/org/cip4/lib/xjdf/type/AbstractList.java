package org.cip4.lib.xjdf.type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A list is an enumerated set of values, which is expressed as a list of space separated values.
 *
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
     */
    public AbstractList(T... values) {

        List<T> list = new ArrayList<>(values.length);

        list.addAll(Arrays.asList(values));

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
     */
    public void setList(List<T> list) {
        this.list = list;
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
     * @see jakarta.xml.bind.annotation.adapters.XmlAdapter#marshal(java.lang.Object)
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
     * @see jakarta.xml.bind.annotation.adapters.XmlAdapter#unmarshal(java.lang.Object)
     */
    @Override
    public AbstractList<T> unmarshal(String v) throws Exception {
        return getClass().getConstructor(String.class).newInstance(v);
    }

}
