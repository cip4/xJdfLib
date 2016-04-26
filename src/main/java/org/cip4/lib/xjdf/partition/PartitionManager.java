package org.cip4.lib.xjdf.partition;

import org.apache.commons.lang3.reflect.FieldUtils;
import org.cip4.lib.xjdf.schema.Part;
import org.cip4.lib.xjdf.schema.Resource;
import org.cip4.lib.xjdf.schema.ResourceSet;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

/**
 * Manager class containing all the partitioning logic.
 */
public class PartitionManager {

    /**
     * Identifies and returns a Resource within a ResourceSet using parition keys. <br />
     * This is the official CIP4 reference implementation of the XJDF partitioning algorithm.
     *
     * @param resourceSet The ResourceSet containing a set of partitioned Resources.
     * @param part The given Partition Keys used to identify a particular Resource
     *
     * @return The Resource identified using partition keys.
     * @throws IllegalAccessException Is thrown in case the partition isn't accessible in Part class.
     * @throws NoSuchFieldException Is thrown in case the partition key wasn't found in Part class.
     */
    public final Resource getResourceByPart(final ResourceSet resourceSet, final Part part)
        throws IllegalAccessException, NoSuchFieldException {

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
     * @param fieldName The field name of the fields to be compared.
     * @param resourcePart The part element of the resource.
     * @param givenPart The given part element.
     *
     * @return True in case the resource partition key value is equal or a subset of the given partition key value.
     * @throws IllegalAccessException Is thrown in case the partition isn't accessible in Part class.
     * @throws NoSuchFieldException Is thrown in case the partition key wasn't found in Part class.
     */
    private boolean comparePartKeyValues(final String fieldName, final Part resourcePart, final Part givenPart)
        throws NoSuchFieldException, IllegalAccessException {

        Field field = FieldUtils.getDeclaredField(Part.class, fieldName, true);
        Object resValue = FieldUtils.readField(field, resourcePart);
        Object givenValue = FieldUtils.readField(field, givenPart);

        return resValue.equals(givenValue);
    }

    /**
     * Get list of active partition keys of a part element.
     *
     * @param part The Part element to be analyzed.
     *
     * @return List of active parition keys.
     * @throws IllegalAccessException Is thrown in case the partition isn't accessible in Part class.
     */
    private Set<String> getPartitionKeys(final Part part) throws IllegalAccessException {
        Set<String> partKeys = new HashSet<>();

        if (part != null) {
            Field[] fields = FieldUtils.getAllFields(Part.class);

            for (Field field : fields) {
                if (FieldUtils.readField(field, part, true) != null) {
                    partKeys.add(field.getName());
                }
            }
        }

        return partKeys;
    }
}
