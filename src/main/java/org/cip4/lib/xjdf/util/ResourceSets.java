package org.cip4.lib.xjdf.util;

import jakarta.xml.bind.annotation.XmlAttribute;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.cip4.lib.xjdf.schema.Part;
import org.cip4.lib.xjdf.schema.Resource;
import org.cip4.lib.xjdf.schema.ResourceSet;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Resources utility class providing ResourceSets management functionality.
 */
public class ResourceSets {

    private final ResourceSet resourceSet;

    /**
     * Custom constructor. Accepting a resource set object for initializing.
     * @param resourceSet The resource set object.
     */
    public ResourceSets(ResourceSet resourceSet) {
        this.resourceSet = resourceSet;
    }

    public Map<String, List<Object>> getPartKeyValues() throws Exception {
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
}
