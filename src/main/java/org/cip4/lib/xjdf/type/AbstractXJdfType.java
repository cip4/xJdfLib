package org.cip4.lib.xjdf.type;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

import java.io.Serializable;

/**
 * Base class for immutable XJDF values that also act as JAXB adapters.
 *
 * @param <ValueType> The XML representation type, usually {@link String}.
 * @param <BoundType> The Java value type.
 * @author stefan.meissner
 */
public abstract class AbstractXJdfType<ValueType, BoundType> extends XmlAdapter<ValueType, BoundType>
    implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Creates a new value.
     */
    protected AbstractXJdfType() {
    }

    /**
     * Returns the XML representation of this value.
     *
     * @return The XML representation.
     */
    @Override
    public abstract String toString();

    /**
     * Returns a hash code derived from the XML representation.
     *
     * @return The hash code.
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((toString() == null) ? 0 : toString().hashCode());
        return result;
    }

    /**
     * Compares two values by their XML representation and exact runtime type.
     *
     * @param obj The object to compare with.
     *
     * @return True in case both values have the same type and XML representation.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        AbstractXJdfType other = (AbstractXJdfType) obj;
        if (toString() == null) {
            return other.toString() == null;
        } else {
            return toString().equals(other.toString());
        }
    }

}
