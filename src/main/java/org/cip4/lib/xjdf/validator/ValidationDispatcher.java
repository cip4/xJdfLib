package org.cip4.lib.xjdf.validator;

import org.cip4.lib.xjdf.validator.element.Validator;

import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

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
        try {
            for (PropertyDescriptor propertyDescriptor :
                Introspector.getBeanInfo(element.getClass(), Object.class).getPropertyDescriptors()) {
                Method propertyReadMethod = propertyDescriptor.getReadMethod();
                if (propertyReadMethod == null) {
                    continue;
                }
                Object propertyValue = propertyReadMethod.invoke(element);
                if (propertyValue == null) {
                    continue;
                }
                if (propertyValue instanceof Collection) {
                    result.addAll((Collection) propertyValue);
                } else {
                    result.add(propertyValue);
                }
            }
        } catch (IntrospectionException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException("Could not validate descendant elements.", e);
        }
        return result;
    }

}
