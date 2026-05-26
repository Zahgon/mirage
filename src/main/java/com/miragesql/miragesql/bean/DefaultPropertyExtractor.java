package com.miragesql.miragesql.bean;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * The default implementation of {@link PropertyExtractor}.
 *
 * @author Naoki Takezoe
 */
public class DefaultPropertyExtractor implements PropertyExtractor {

    /**
     * {@inheritDoc}
     */
    public Map<String, PropertyWrapper> extractProperties(Class<?> clazz) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected static String getPropertyName(String methodName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
