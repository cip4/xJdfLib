package org.cip4.lib.xjdf.validator.element;

import org.cip4.lib.xjdf.schema.ResourceSet;
import org.cip4.lib.xjdf.schema.XJDF;
import org.cip4.lib.xjdf.type.IntegerList;
import org.cip4.lib.xjdf.validator.Ancestors;
import org.cip4.lib.xjdf.validator.ValidationResultBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Validates that no two resource sets with the same name, usage and process usage share combined process indices.
 *
 * <p>
 * Resource sets are ambiguous if they have the same {@code @Name}, {@code @Usage} and {@code @ProcessUsage} and
 * either both have no {@code @CombinedProcessIndex} or their indices overlap.
 * </p>
 */
public class ResourceSetAmbiguityValidator implements Validator<XJDF> {

    /**
     * Creates the validator.
     */
    public ResourceSetAmbiguityValidator() {
    }

    /**
     * Identity of a resource set for ambiguity detection.
     */
    private class ResourceSetIdentity {
        final String name;
        final ResourceSet.Usage usage;
        final String processUsage;
        final IntegerList combinedProcessIndex;

        /**
         * Creates the identity of a resource set.
         *
         * @param name The resource set name.
         * @param usage The usage.
         * @param processUsage The process usage, may be null.
         * @param combinedProcessIndex The combined process indices, may be null.
         */
        public ResourceSetIdentity(
            final String name, final ResourceSet.Usage usage, final String processUsage,
            final IntegerList combinedProcessIndex
        ) {
            this.name = name;
            this.usage = usage;
            this.processUsage = processUsage;
            this.combinedProcessIndex = combinedProcessIndex;
        }

        /**
         * Returns true in case this identity and the other identity describe the same resource set.
         *
         * @param o The other identity.
         *
         * @return True in case both identities are ambiguous.
         */
        public boolean ambiguous(final ResourceSetIdentity o) {
            return Objects.equals(name, o.name) &&
                usage == o.usage &&
                Objects.equals(processUsage, o.processUsage) &&
                combinedProcessIndexIsAmbiguous(o);
        }

        private boolean combinedProcessIndexIsAmbiguous(ResourceSetIdentity o) {
            if (null == this.combinedProcessIndex || null == o.combinedProcessIndex) {
                return true;
            }
            List<Integer> combinedProcessIndex = this.combinedProcessIndex.getList();
            for (Integer processIndex : o.combinedProcessIndex.getList()) {
                if (combinedProcessIndex.contains(processIndex)) {
                    return true;
                }
            }
            return false;
        }
    }


    /**
     * Validates the resource sets of an XJDF document.
     *
     * @param element The document to validate.
     * @param ancestors The ancestors of the element.
     * @param validationResult Collector for violations.
     */
    @Override
    public void validate(
        final XJDF element, final Ancestors ancestors, final ValidationResultBuilder validationResult
    ) {
        List<ResourceSet> resourceSets = element.getResourceSet();

        List<ResourceSetIdentity> identities = new ArrayList<>(resourceSets.size());
        for (ResourceSet resourceSet : resourceSets) {
            ResourceSetIdentity identity = new ResourceSetIdentity(
                resourceSet.getName(),
                resourceSet.getUsage(),
                resourceSet.getProcessUsage(),
                resourceSet.getCombinedProcessIndex()
            );
            if (ambiguous(identities, identity)) {
                validationResult.append(
                    "ResourceSet elements with the same values of @Name, @Usage, @ProcessUsage and common or no entries"
                        + " in @CombinedProcessIndex SHALL NOT be specified."
                );
            }
            identities.add(identity);
        }
    }

    private boolean ambiguous(List<ResourceSetIdentity> identities, ResourceSetIdentity identity) {
        for (ResourceSetIdentity existingIdentity : identities) {
            if (existingIdentity.ambiguous(identity)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Returns true for {@link XJDF} elements.
     *
     * @param o The candidate element.
     *
     * @return True in case the element is an XJDF document.
     */
    @Override
    public boolean canValidate(final Object o) {
        return o instanceof XJDF;
    }
}
