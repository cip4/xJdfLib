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
     * Private constructor for utility class.
     */
    private Partitions() {
        throw new RuntimeException("Class cannot be instantiated.");
    }

    /**
     * Get partition keys plus values of a given resource set.
     *
     * @param resourceSet The resource set to be analyzed.
     * @return Map of partition keys plus values.
     */
    public static Map<String, List<Object>> getPartKeyValues(ResourceSet resourceSet) throws IllegalAccessException {
        Map<String, List<Object>> partKeyValues = new HashMap<>();

        if (resourceSet != null) {
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


    public static Resource getResourceByPart(final ResourceSet resourceSet, final Part part) {
        List<Resource> resources = getResourcesByPart(resourceSet, part);

        if(resources.size() > 1) {
            throw new IllegalArgumentException("Multiple resources have been found matching this part object.");
        }

        return resources.isEmpty() ? null : resources.get(0);
    }

    public static List<Resource> getResourcesByPart(final ResourceSet resourceSet, final Part part) {
        List<Resource> result = new ArrayList<>();

        // catch all, if no part, or parts without keys is specified in resource
        for (Resource resource : resourceSet.getResource()) {
            if (resource.getPart().isEmpty()) {
                return List.of(resource);
            }

            for (Part resourcePart : resource.getPart()) {
                if (getPartitionKeys(resourcePart).isEmpty()) {
                    return List.of(resource);
                }
            }
        }

        // iterate over all parts in all resources from top to bottom
        for (Resource resource : resourceSet.getResource()) {
            for (Part resourcePart : resource.getPart()) {
                if(Partitions.matches(resourcePart, part)) {
                    result.add(resource);
                    break;
                }

            }
        }

        return result;
    }

    static boolean matches(final Part resourcePart, final Part givenPart) {
        List<String> givenPartKeys = getPartitionKeys(givenPart);

        try {
            for (String givenPartKey : givenPartKeys) {
                Object resValue = FieldUtils.readField(resourcePart, givenPartKey, true);
                Object givenValue = FieldUtils.readField(givenPart, givenPartKey, true);

                if (resValue == null || !resValue.equals(givenValue)) {
                    return false;
                }
            }
        } catch (IllegalAccessException ex) {
            throw new IllegalArgumentException(ex);
        }

        return true;
    }

    /**
     * Get list of active partition keys of a part element.
     *
     * @param part The Part element to be analyzed.
     * @return List of active parition keys.
     */
    static List<String> getPartitionKeys(final Part part) {
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

        return Collections.unmodifiableList(new ArrayList<>(partKeys));
    }
}
