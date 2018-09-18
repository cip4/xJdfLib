package org.cip4.lib.xjdf.validator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Ancestors {

    private List<Object> ancestors;

    public Ancestors() {
        ancestors = Collections.emptyList();
    }

    public Ancestors(final Object... ancestors) {
        this.ancestors = Arrays.asList(ancestors);
    }

    private Ancestors(final List<Object> ancestors) {
        this.ancestors = ancestors;
    }

    public Ancestors push(Object child) {
        List<Object> ancestors = new ArrayList<>(this.ancestors);
        ancestors.add(child);
        return new Ancestors(Collections.unmodifiableList(ancestors));
    }

    @SuppressWarnings("unchecked")
    public <T> T getNearestAncestor(Class<T> type) {
        for (int i = ancestors.size()-1; i>=0; i--) {
            if (type.isInstance(ancestors.get(i))) {
                return (T) ancestors.get(i);
            }
        }
        return null;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ancestors ancestors1 = (Ancestors) o;
        return Objects.equals(ancestors, ancestors1.ancestors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ancestors);
    }
}
