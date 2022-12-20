package org.cip4.lib.xjdf.validator;

import org.cip4.lib.xjdf.validator.element.Validator;
import org.jetbrains.annotations.NotNull;

import jakarta.xml.bind.JAXBElement;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class ValidationDispatcher {

    class ChildElements implements Iterable<Object> {

        private final Collection<Object> elements = new LinkedList<>();

        public void addIfAppropriate(Object o) {
            if (o != null
                && o.getClass().getPackage().getName().startsWith("org.cip4.lib.xjdf")) {
                elements.add(o);
            }
        }

        public void addAllAppropriate(Collection<Object> os) {
            for (Object o : os) {
                addIfAppropriate(o);
            }
        }

        @NotNull
        @Override
        public Iterator<Object> iterator() {
            return elements.iterator();
        }

    }

    private final Collection<Validator> validators;

    public ValidationDispatcher(final Validator... validators) {
        this.validators = Arrays.asList(validators);
    }

    public ValidationDispatcher(final Collection<Validator> validators) {
        this.validators = validators;
    }

    public ValidationResult validate(Object element) {
        ValidationResultBuilder validationResult = new ValidationResultBuilder();
        this.validate(element, new Ancestors(), validationResult);
        return validationResult.build();
    }

    @SuppressWarnings("unchecked")
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

    public ChildElements getChildElements(final Object element) {
        ChildElements childElements = new ChildElements();
        ClassInspector inspector = new ClassInspector(element.getClass());
        for (Method method : inspector.getGetters()) {
            if (inspector.isReference(method)) {
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
            if (propertyValue instanceof Collection) {
                childElements.addAllAppropriate((Collection) propertyValue);
            } else if (propertyValue instanceof Map) {
                childElements.addAllAppropriate(((Map) propertyValue).values());
            } else {
                childElements.addIfAppropriate(propertyValue);
            }
        }

        return childElements;
    }

}
