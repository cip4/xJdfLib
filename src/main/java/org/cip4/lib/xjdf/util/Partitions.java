package org.cip4.lib.xjdf.util;

import org.cip4.lib.xjdf.schema.Part;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Utility class for handling partitions of parameters and resources.
 */
public final class Partitions {

    /**
     * List of all getters defined available for objects of type Part.
     */
    private static final List<Method> GETTERS = readGetters();

    /**
     * Private constructor for utility class.
     */
    private Partitions() {
    }

    /**
     * Check two partitions for mismatching attributes.
     *
     * @param partition1 First partition to check.
     * @param partition2 Other partition to check.
     *
     * @return Will return true if both partitions define the same attribute but with different values and false
     * otherwise.
     */
    public static boolean hasMismatchingAttributes(@NotNull final Part partition1, @NotNull final Part partition2) {
        for (Method method : GETTERS) {
            try {
                Object partAttr1 = method.invoke(partition1);
                if (!isEmptyAttributeValue(partAttr1)) {
                    Object partAttr2 = method.invoke(partition2);
                    if (!isEmptyAttributeValue(partAttr2) && !partAttr1.equals(partAttr2)) {
                        return true;
                    }
                }
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not access public getter method.", e);
            } catch (InvocationTargetException e) {
                throw new IllegalStateException("Could not invoke getter of Part object.", e);
            }
        }
        return false;
    }

    /**
     * Check if the provided value of a partition attribute is empty.
     *
     * @param attribute Value of an partition attribute.
     *
     * @return True if value corresponds to an unset attribute.
     */
    private static boolean isEmptyAttributeValue(@Nullable final Object attribute) {
        if (attribute instanceof List) {
            return ((List) attribute).isEmpty();
        }
        return attribute == null;
    }

    /**
     * Get a list of all getters defined by the class Part.
     *
     * @return List of all public getter methods.
     */
    @NotNull
    static List<Method> readGetters() {
        List<Method> getters = new ArrayList<>();
        for (Method method : Part.class.getMethods()) {
            if (method.getName().startsWith("get")
                && method.getParameterTypes().length == 0
                && method.getDeclaringClass().equals(Part.class)
                ) {
                getters.add(method);
            }
        }
        return getters;
    }

}
