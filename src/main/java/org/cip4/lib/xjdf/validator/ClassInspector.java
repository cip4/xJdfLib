package org.cip4.lib.xjdf.validator;

import jakarta.xml.bind.annotation.XmlIDREF;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.LinkedList;

/**
 * Reflection helper that describes the properties of a generated schema class.
 *
 * <p>
 * Used by the validation dispatcher to walk the element tree and to skip JAXB reference properties.
 * </p>
 */
public class ClassInspector {

    private final Class aClass;

    /**
     * Creates an inspector for the given class.
     *
     * @param aClass The class to inspect.
     */
    public ClassInspector(final Class aClass) {
        this.aClass = aClass;
    }

    /**
     * Returns all public getters of the class and its superclasses.
     *
     * @return The getter methods.
     */
    public Collection<Method> getGetters() {
        Collection<Method> getters = new LinkedList<>();
        readGetters(getters, aClass);
        return getters;
    }

    private void readGetters(Collection<Method> getters, Class c) {
        if (c.equals(Object.class) || c.equals(Enum.class)) {
            return;
        }
        for (Method method : c.getDeclaredMethods()) {
            if (isGetter(method)) {
                getters.add(method);
            }
        }
        readGetters(getters, c.getSuperclass());
    }

    /**
     * Returns true in case the method is a public getter without parameters and with a return value.
     *
     * @param method The method to check.
     *
     * @return True in case the method is a getter.
     */
    public boolean isGetter(Method method) {
        return Modifier.isPublic(method.getModifiers())
            && method.getName().startsWith("get")
            && method.getParameterTypes().length == 0
            && !method.getReturnType().equals(void.class);
    }

    /**
     * Returns true in case the field backing the getter is a JAXB reference.
     *
     * @param method The getter to check.
     *
     * @return True in case the property is annotated with {@code XmlIDREF}.
     */
    public boolean isReference(Method method) {
        try {
            return isReference(getFieldByGetter(method));
        } catch (NoSuchFieldException e) {
            return false;
        }
    }

    /**
     * Returns true in case the field is a JAXB reference.
     *
     * @param field The field to check.
     *
     * @return True in case the field is annotated with {@code XmlIDREF}.
     */
    public boolean isReference(Field field) {
        return field.isAnnotationPresent(XmlIDREF.class);
    }

    /**
     * Returns the field that backs the given getter.
     *
     * @param getter The getter, for example {@code getPreviewFileType()}.
     *
     * @return The backing field, for example {@code previewFileType}.
     *
     * @throws NoSuchFieldException in case no matching field exists.
     */
    public Field getFieldByGetter(Method getter) throws NoSuchFieldException {
        String propertyName = getter.getName().substring(3);
        propertyName = propertyName.substring(0, 1).toLowerCase() + propertyName.substring(1);
        return aClass.getDeclaredField(propertyName);
    }
}
