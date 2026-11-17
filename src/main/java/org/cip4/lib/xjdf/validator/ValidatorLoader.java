package org.cip4.lib.xjdf.validator;

import org.cip4.lib.xjdf.validator.element.Validator;
import org.reflections.Reflections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Discovers and caches the validators that live in the {@code validator.element} package.
 */
class ValidatorLoader {

    private static Validator[] validators;

    /**
     * Returns all discovered validators, discovering them on first use.
     *
     * @return The validators.
     */
    public static Validator[] loadedValidators() {
        if (null == validators) {
            Reflections reflections = new Reflections(Validator.class.getPackage().getName());
            Set<Class<? extends Validator>> discoveredClasses = reflections.getSubTypesOf(Validator.class);

            List<Validator> discoveredValidators = new ArrayList<>(discoveredClasses.size());
            for (Class<? extends Validator> validatorClass : discoveredClasses) {
                try {
                    discoveredValidators.add(validatorClass.newInstance());
                } catch (InstantiationException | IllegalAccessException e) {
                    // skip invalid
                }
            }

            validators = discoveredValidators.toArray(new Validator[0]);
        }
        return validators;
    }
}
