package com.miragesql.miragesql.bean;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Factory class to build <code>BeanDesc</code> instances depending on the bean types.
 */
public class BeanDescFactory {

    private Map<Class<?>, BeanDesc> cacheMap = new ConcurrentHashMap<>();

    private boolean cacheEnabled = false;

    private PropertyExtractor propertyExtractor = new DefaultPropertyExtractor();

    public void setCacheEnabled(boolean cacheEnabled) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isCacheEnabled() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setPropertyExtractor(PropertyExtractor propertyExtractor) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Constructs a bean descriptor out of an Object instance.
     *
     * @param obj the object to create the descriptor from (the object can also be a Map)
     * @return a descriptor
     */
    @SuppressWarnings("unchecked")
    public BeanDesc getBeanDesc(Object obj) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Constructs a bean descriptor out of a class.
     *
     * @param clazz the class to create the descriptor from. For <code>Map.class</code>, <code>HashMap.class</code> and
     *              <code>LinkedHashMap.class</code> no properties can be extracted, so this operations needs to be done later.
     * @return a descriptor
     */
    public BeanDesc getBeanDesc(Class<?> clazz) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
