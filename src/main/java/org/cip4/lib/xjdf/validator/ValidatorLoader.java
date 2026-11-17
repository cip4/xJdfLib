package org.cip4.lib.xjdf.validator;

import org.cip4.lib.xjdf.validator.element.Validator;
import org.reflections.Reflections;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Discovers and caches the validators that live in the {@code validator.element} package.
 *
 * <p>
 * The validators are discovered once, kept in a thread-safe cache and sorted by class name, so that the validation
 * result does not depend on the iteration order of the class scanner.
 * </p>
 */
class ValidatorLoader {

    private static volatile Validator[] validators;

    /**
     * Returns all discovered validators, discovering them on first use.
     *
     * @return The validators, sorted by class name.
     */
    public static Validator[] loadedValidators() {
        Validator[] result = validators;

        if (result == null) {
            synchronized (ValidatorLoader.class) {
                result = validators;

                if (result == null) {
                    Reflections reflections = new Reflections(Validator.class.getPackage().getName());
                    Set<Class<? extends Validator>> discoveredClasses = reflections.getSubTypesOf(Validator.class);

                    List<Validator> discoveredValidators = discoveredClasses.stream()
                        .filter(validatorClass -> !java.lang.reflect.Modifier.isAbstract(
                            validatorClass.getModifiers()
                        ))
                        .sorted(Comparator.comparing(Class::getName))
                        .map(ValidatorLoader::instantiate)
                        .collect(Collectors.toList());

                    result = discoveredValidators.toArray(new Validator[0]);
                    validators = result;
                }
            }
        }

        return result;
    }

    private static Validator instantiate(final Class<? extends Validator> validatorClass) {
        try {
            java.lang.reflect.Constructor<? extends Validator> constructor =
                validatorClass.getDeclaredConstructor();
            constructor.setAccessible(true);
            return constructor.newInstance();
        } catch (ReflectiveOperationException e) {
            throw new IllegalStateException(
                "Cannot instantiate validator " + validatorClass.getName() + ".", e
            );
        }
    }
}
