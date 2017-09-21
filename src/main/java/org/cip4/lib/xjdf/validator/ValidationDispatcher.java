package org.cip4.lib.xjdf.validator;

import org.cip4.lib.xjdf.validator.element.Validator;

import javax.xml.bind.JAXBElement;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;

public class ValidationDispatcher {

    private Collection<Validator> validators = new HashSet<>();

    public ValidationDispatcher(final Validator... validators) {
        this.validators = Arrays.asList(validators);
    }

    public ValidationDispatcher(final Collection<Validator> validators) {
        this.validators = validators;
    }

    public ValidationResult validate(Object element) {
        ValidationResultBuilder validationResult = new ValidationResultBuilder();
        this.validate(element, new Ancestors(), new ValidationResultBuilder());
        return validationResult.build();
    }

    private void validate(Object element, Ancestors ancestors, ValidationResultBuilder validationResult) {
        for (Validator validator : validators) {
            if (validator.canValidate(element)) {
                validator.validate(element, ancestors, validationResult);
            }
        }
        Ancestors newAncestors = ancestors.push(element);
        for (Object child : getChildElements(element)) {
            validate(child, newAncestors, validationResult);
        }
    }

    public Collection<Object> getChildElements(final Object element) {
        Collection<Object> result = new ArrayList<>();
        Collection<Method> getters = new ArrayList<>();
        getGetters(element.getClass(), getters);
        for (Method method : getters) {
            if (!method.getName().startsWith("get") || method.getGenericParameterTypes().length != 0) {
                continue;
            }
            Object propertyValue;
            try {
                propertyValue = method.invoke(element);
            } catch (IllegalAccessException | InvocationTargetException e) {
                continue;
            }
            if (propertyValue instanceof JAXBElement) {
                propertyValue = ((JAXBElement) propertyValue).getValue();
            }
            if (propertyValue == null) {
                continue;
            }
            if (propertyValue instanceof Collection) {
                result.addAll((Collection) propertyValue);
            } else if (propertyValue instanceof Map) {
                result.addAll(((Map) propertyValue).values());
            } else {
                result.add(propertyValue);
            }
        }
        return result;
    }

    private void getGetters(Class c, Collection<Method> getters) {
        if (c.getClass().equals(Object.class)) {
            return;
        }
        for (Method method : c.getDeclaredMethods()) {
            if (isGetter(method)) {
                getters.add(method);
            }
        }

    }

    private boolean isGetter(Method method) {
        return Modifier.isPublic(method.getModifiers())
            && method.getName().startsWith("get")
            && method.getTypeParameters().length == 0
            && !method.getReturnType().equals(void.class);
    }

}
