package org.cip4.lib.xjdf.validator;

import jakarta.xml.bind.annotation.XmlIDREF;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.LinkedList;

public class ClassInspector {

    private final Class aClass;

    public ClassInspector(final Class aClass) {
        this.aClass = aClass;
    }

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

    public boolean isGetter(Method method) {
        return Modifier.isPublic(method.getModifiers())
            && method.getName().startsWith("get")
            && method.getParameterTypes().length == 0
            && !method.getReturnType().equals(void.class);
    }

    public boolean isReference(Method method) {
        try {
            return isReference(getFieldByGetter(method));
        } catch (NoSuchFieldException e) {
            return false;
        }
    }

    public boolean isReference(Field field) {
        return field.isAnnotationPresent(XmlIDREF.class);
    }

    public Field getFieldByGetter(Method getter) throws NoSuchFieldException {
        String propertyName = getter.getName().substring(3);
        propertyName = propertyName.substring(0, 1).toLowerCase() + propertyName.substring(1);
        return aClass.getDeclaredField(propertyName);
    }
}
