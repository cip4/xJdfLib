package org.cip4.lib.xjdf.validator.element;

import org.cip4.lib.xjdf.schema.ResourceSet;
import org.cip4.lib.xjdf.schema.XJDF;
import org.cip4.lib.xjdf.type.IntegerList;
import org.cip4.lib.xjdf.validator.Ancestors;
import org.cip4.lib.xjdf.validator.ValidationResultBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ResourceSetAmbiguityValidator implements Validator<XJDF> {

    private class ResourceSetIdentity {
        String name;
        ResourceSet.Usage usage;
        String processUsage;
        IntegerList combinedProcessIndex;

        public ResourceSetIdentity(
            final String name, final ResourceSet.Usage usage, final String processUsage,
            final IntegerList combinedProcessIndex
        ) {
            this.name = name;
            this.usage = usage;
            this.processUsage = processUsage;
            this.combinedProcessIndex = combinedProcessIndex;
        }

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

    @Override
    public boolean canValidate(final Object o) {
        return o instanceof XJDF;
    }
}
