package org.cip4.lib.xjdf.partition;

import jakarta.xml.bind.annotation.XmlAttribute;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.cip4.lib.xjdf.schema.Part;
import org.cip4.lib.xjdf.schema.Resource;
import org.cip4.lib.xjdf.schema.ResourceSet;

import java.lang.reflect.Field;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Manager class containing all the partitioning logic.
 */
public class PartitionManager {

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
}
