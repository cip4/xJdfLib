package org.cip4.lib.xjdf.util;

import org.cip4.lib.xjdf.XJdfNodeFactory;
import org.cip4.lib.xjdf.comparator.ResourceSetComparator;
import org.cip4.lib.xjdf.schema.Part;
import org.cip4.lib.xjdf.schema.Resource;
import org.cip4.lib.xjdf.schema.ResourceSet;
import org.cip4.lib.xjdf.schema.SpecificResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.ListIterator;
import java.util.UUID;

/**
 * This class provides access to Resources within ResourceSets.
 */
public class Resources {

    /**
     * List of sets of resources to operate on.
     */
    private final List<ResourceSet> resourceSets;

    /**
     * Comparator to use for ordering resource sets.
     */
    private final ResourceSetComparator resourceSetComparator = new ResourceSetComparator();

    /**
     * Factory to use for creating xjdf nodes.
     */
    private final XJdfNodeFactory nodeFactory = new XJdfNodeFactory();

    /**
     * Constructor.
     *
     * @param resourceSets List of ResourceSets to operate on.
     */
    public Resources(@NotNull final List<ResourceSet> resourceSets) {
        this.resourceSets = resourceSets;
    }

    /**
     * Add an Resource to the corresponding ResourceSet.
     * If the corresponding ResourceSet does not exist it will be created. New ResourceSets are added in lexicographic
     * order of their attribute "name" while adding new entries after existing entries with the same "name".
     * This method assumes that the ResourceSets are already ordered in lexicographic order of their "name"-attributes.
     *
     * @param resource Resource to add
     * @param processUsage Process usage of the resource
     */
    public final void addResource(@NotNull final Resource resource, @Nullable final String processUsage) {
        String resourceName = getResourceName(resource);

        ResourceSet resourceSet = findResourceSet(resourceName, processUsage);
        if (null == resourceSet) {
            resourceSet = new ResourceSet();
            resourceSet.withName(resourceName).withProcessUsage(processUsage);
            addResourceSet(resourceSet);
        }
        resourceSet.getResource().add(resource);
    }

    /**
     * Add an Resource to the corresponding ResourceSet.
     *
     * @param specificResource Resource to add
     * @param part Partition to add the resource to
     * @param processUsage Process usage of the resource
     */
    public final void addResource(
        @NotNull final SpecificResource specificResource, @Nullable final Part part, @Nullable final String processUsage
    ) {
        addResource(createResource(specificResource, part), processUsage);
    }

    /**
     * Find the first resourceSet with a given name and processUsage.
     *
     * @param resourceName Name of the resource
     * @param processUsage Process usage of the resource
     *
     * @return Matching resourceSet or NULL if no matching set was found.
     */
    @Nullable
    @SuppressWarnings("unchecked")
    final ResourceSet findResourceSet(@NotNull final String resourceName, @Nullable final String processUsage) {
        for (ResourceSet resourceSet : resourceSets) {
            if (resourceSet.getName().equals(resourceName)
                && (
                (processUsage == null && resourceSet.getProcessUsage() == null)
                    || (processUsage != null && processUsage.equals(resourceSet.getProcessUsage())))
                ) {
                return resourceSet;
            }
        }
        return null;
    }

    /**
     * Add an ResourceSet to the known resources.
     * This method will insert the resources in lexicographic order while adding new sets with the same name
     * after existing elements with the same name.
     *
     * @param resourceSet Set of resources to add.
     */
    public final void addResourceSet(final ResourceSet resourceSet) {
        ListIterator<ResourceSet> listIterator = resourceSets.listIterator();
        while (listIterator.hasNext()) {
            ResourceSet currentSet = listIterator.next();
            if (resourceSetComparator.compare(currentSet, resourceSet) > 0) {
                if (listIterator.hasPrevious()) {
                    listIterator.previous();
                }
                break;
            }
        }
        ((ListIterator<ResourceSet>) listIterator).add(resourceSet);
    }

    /**
     * Getter for the factory for xjdf nodes.
     *
     * @return Factory for creating xjdf nodes.
     */
    @NotNull
    <V extends SpecificResource> Resource createResource(
        @NotNull final V resourceType, @Nullable final Part partition
    ) {
        Resource resource = getNodeFactory().createResource(resourceType, partition);
        if (null == resource.getID()) {
            resource.setID(resource.getSpecificResource().getName().getLocalPart() + "_" + UUID.randomUUID());
        }
        return resource;
    }

    /**
     * Get the name of an resource.
     *
     * @param resource Resource to get the name of
     *
     * @return Name of the resource
     */
    @NotNull
    final String getResourceName(@NotNull final Resource resource) {
        return resource.getSpecificResource().getName().getLocalPart();
    }

    /**
     * Getter for the factory for xjdf nodes.
     *
     * @return Factory for creating xjdf nodes.
     */
    @NotNull
    protected final XJdfNodeFactory getNodeFactory() {
        return nodeFactory;
    }
}
