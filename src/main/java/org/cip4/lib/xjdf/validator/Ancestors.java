package org.cip4.lib.xjdf.validator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * Immutable chain of ancestor elements for the element currently being validated.
 *
 * <p>
 * Validators receive an instance and can inspect the surrounding document, for example to find the enclosing
 * {@code XJDF} or {@code ResourceSet} element.
 * </p>
 */
public class Ancestors {

    private final List<Object> ancestors;

    /**
     * Creates an empty chain, for example for the root element.
     */
    public Ancestors() {
        ancestors = Collections.emptyList();
    }

    /**
     * Creates a chain from the given ancestors, ordered from root to parent.
     *
     * @param ancestors The ancestor elements.
     */
    public Ancestors(final Object... ancestors) {
        this.ancestors = Arrays.asList(ancestors);
    }

    private Ancestors(final List<Object> ancestors) {
        this.ancestors = ancestors;
    }

    /**
     * Returns a new chain with the given element appended.
     *
     * @param child The element to append.
     *
     * @return The new chain. This instance is not modified.
     */
    public Ancestors push(Object child) {
        List<Object> ancestors = new ArrayList<>(this.ancestors);
        ancestors.add(child);
        return new Ancestors(Collections.unmodifiableList(ancestors));
    }

    /**
     * Returns the nearest ancestor of the given type.
     *
     * @param type The type to search for.
     * @param <T> The type to search for.
     *
     * @return The nearest matching ancestor, or null if there is none.
     */
    @SuppressWarnings("unchecked")
    public <T> T getNearestAncestor(Class<T> type) {
        for (int i = ancestors.size() - 1; i >= 0; i--) {
            if (type.isInstance(ancestors.get(i))) {
                return (T) ancestors.get(i);
            }
        }
        return null;
    }

    /**
     * Returns the direct parent element.
     *
     * @return The parent, or null for the root element.
     */
    public Object parent() {
        if (ancestors.isEmpty()) {
            return null;
        } else {
            return ancestors.get(ancestors.size() - 1);
        }
    }

    /**
     * Compares two chains by their elements.
     *
     * @param o The object to compare with.
     *
     * @return True in case both chains contain the same elements in the same order.
     */
    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ancestors ancestors1 = (Ancestors) o;
        return Objects.equals(ancestors, ancestors1.ancestors);
    }

    /**
     * Returns a hash code of the chain.
     *
     * @return The hash code.
     */
    @Override
    public int hashCode() {
        return Objects.hash(ancestors);
    }
}
