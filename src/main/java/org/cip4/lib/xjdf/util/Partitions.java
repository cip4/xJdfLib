package org.cip4.lib.xjdf.util;

import jakarta.xml.bind.annotation.XmlAttribute;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.cip4.lib.xjdf.schema.Part;
import org.cip4.lib.xjdf.schema.Resource;
import org.cip4.lib.xjdf.schema.ResourceSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Partitions utility class providing partitioning functionality.
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
     * Get partition keys plus values of a given resource set.
     * @param resourceSet The resource set to be analyzed.
     * @return Map of partition keys plus values.
     */
    public static Map<String, List<Object>> getPartKeyValues(ResourceSet resourceSet) throws IllegalAccessException {
        Map<String, List<Object>> partKeyValues = new HashMap<>();

        if(resourceSet != null) {
            for (Resource resource : resourceSet.getResource()) {
                for (Part part : resource.getPart()) {

                    // get active partition keys
                    Field[] fields = FieldUtils.getAllFields(Part.class);

                    for (Field field : fields) {
                        if (FieldUtils.readField(field, part, true) != null && !field.getName().equals("otherAttributes")) {

                            // get part key
                            String partKey = field.getAnnotation(XmlAttribute.class).name();
                            Object value = FieldUtils.readField(field, part, true);

                            // create new part key in result list - if not yet there
                            if (!partKeyValues.containsKey(partKey)) {
                                partKeyValues.put(partKey, new ArrayList<>());
                            }

                            // add value if not present
                            if (!partKeyValues.get(partKey).contains(value)) {
                                partKeyValues.get(partKey).add(value);
                            }
                        }
                    }
                }
            }
        }

        return partKeyValues;
    }

    public static List<Resource> getResourcesByPartKeys(final ResourceSet resourceSet, final String... partKeys) {
        List<Resource> result = new ArrayList<>();

        // iterate over all parts in all resources from top to bottom
        for (Resource resource : resourceSet.getResource()) {
            for (Part resPart : resource.getPart()) {

                // make all keys lowercase
                Set<String> resourceKeysSet = getPartitionKeys(resPart).stream()
                        .map(String::toLowerCase)
                        .collect(Collectors.toSet());

                Set<String> partKeysSet = Arrays.stream(partKeys)
                        .map(String::toLowerCase)
                        .collect(Collectors.toSet());

                // check if all partition keys are in the set of given keys
                if (partKeysSet.containsAll(resourceKeysSet) && resourceKeysSet.containsAll(partKeysSet)) {
                    result.add(resource);
                    break;
                }
            }
        }

        // no resource in set does match
        return result;
    }

    /**
     * Identifies and returns a Resource within a ResourceSet using parition keys. <br>
     * This is the official CIP4 reference implementation of the XJDF partitioning algorithm.
     *
     * @param resourceSet The ResourceSet containing a set of partitioned Resources.
     * @param part        The given Partition Keys used to identify a particular Resource
     * @return The Resource identified using partition keys.
     */
    public static Resource getResourceByPart(final ResourceSet resourceSet, final Part part) {

        // iterate over all parts in all resources from top to bottom
        for (Resource resource : resourceSet.getResource()) {

            // catch all, if no part is specified in resource
            if (resource.getPart().size() == 0) {
                return resource;
            }

            for (Part resPart : resource.getPart()) {

                // check if all partition keys are in the set of given keys
                Set<String> givenKeys = getPartitionKeys(part);
                Set<String> resourceKeys = getPartitionKeys(resPart);

                if (givenKeys.containsAll(resourceKeys)) {

                    // compare values of keys
                    boolean isSelected = true;

                    for (String resourceKey : resourceKeys) {
                        if (isSelected) {
                            isSelected = comparePartKeyValues(resourceKey, resPart, part);
                        }
                    }

                    if (isSelected) {
                        return resource;
                    }
                }
            }
        }

        // no resource in set does match
        return null;
    }

    /**
     * Compares the value of the resource partition key with the value of the given partition key.
     * If the values are equal or the resource partition key value is a subset of the given one the result is 'true'.
     * Otherwise the result is 'false'.
     *
     * @param fieldName    The field name of the fields to be compared.
     * @param resourcePart The part element of the resource.
     * @param givenPart    The given part element.
     * @return True in case the resource partition key value is equal or a subset of the given partition key value.
     */
    private static boolean comparePartKeyValues(final String fieldName, final Part resourcePart, final Part givenPart) {

        try {
            Object resValue = FieldUtils.readField(resourcePart, fieldName, true);
            Object givenValue = FieldUtils.readField(givenPart, fieldName, true);

            return resValue.equals(givenValue);

        } catch (IllegalAccessException ex) {
            throw new IllegalArgumentException(ex);
        }
    }

    /**
     * Get list of active partition keys of a part element.
     *
     * @param part The Part element to be analyzed.
     * @return List of active parition keys.
     */
    private static Set<String> getPartitionKeys(final Part part) {
        Set<String> partKeys = new HashSet<>();

        if (part != null) {
            Field[] fields = FieldUtils.getAllFields(Part.class);

            for (Field field : fields) {

                try {
                    if (FieldUtils.readField(field, part, true) != null && !field.getName().equals("otherAttributes")) {
                        partKeys.add(field.getName());
                    }
                } catch (IllegalAccessException ex) {
                    throw new IllegalArgumentException(ex);
                }
            }
        }

        return partKeys;
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
