package com.miragesql.miragesql.util;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.List;

public abstract class GenericUtil {

    protected GenericUtil() {
    }

    public static boolean isTypeOf(final Type type, final Class<?> clazz) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Class<?> getRawClass(final Type type) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Type[] getGenericParameter(final Type type) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Type getGenericParameter(final Type type, final int index) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Type getElementTypeOfList(final Type type) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
