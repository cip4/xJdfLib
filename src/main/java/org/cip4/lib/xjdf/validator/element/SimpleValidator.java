package org.cip4.lib.xjdf.validator.element;

import java.lang.reflect.ParameterizedType;

public abstract class SimpleValidator<T> implements Validator<T> {

    @Override
    public final boolean canValidate(final Object o) {
        return ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0].equals(o.getClass());
    }
}
