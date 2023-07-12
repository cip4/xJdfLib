package org.cip4.lib.xjdf.util;

import jakarta.xml.bind.JAXBElement;
import org.cip4.lib.xjdf.schema.ObjectFactory;
import org.cip4.lib.xjdf.schema.Part;
import org.cip4.lib.xjdf.schema.Resource;
import org.cip4.lib.xjdf.schema.SpecificResource;
import org.cip4.lib.xjdf.XJdfConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.xml.namespace.QName;

public class Resources {

    /**
     * Create a resource element containing a specific resource.
     *
     * @param resourceType The specific resources type
     * @param partition The partition to be added.
     * @return The generated resource element.
     */
    public static @NotNull <T extends SpecificResource> Resource createResource(
            @NotNull final T resourceType, @Nullable final Part partition
    ) {

        // get resource name
        String paramName = resourceType.getClass().getSimpleName();

        // create resource
        Resource resource = new ObjectFactory().createResource();
        QName qname = new QName(XJdfConstants.NAMESPACE_JDF20, paramName);
        JAXBElement obj = new JAXBElement(qname, resourceType.getClass(), null, resourceType);
        resource.setSpecificResource(obj);

        if (partition != null) {
            resource.withPart(partition);
        }

        // return node
        return resource;
    }
}
