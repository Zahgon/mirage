package com.miragesql.miragesql.bean;

import java.lang.annotation.Annotation;
import java.util.*;
import java.util.Map.Entry;

public class MapBeanDescImpl implements BeanDesc {

    private Map<String, Object> map;

    private PropertyDesc[] propertyArray;

    // keep the order of original properties
    private final Map<String, PropertyDesc> propertyMap = Collections.synchronizedMap(new LinkedHashMap<>());

    public MapBeanDescImpl() {
    }

    public MapBeanDescImpl(Map<String, Object> map) {
        this.map = map;
        List<PropertyDesc> properties = new ArrayList<>();
        for (Entry<String, Object> entry : map.entrySet()) {
            String propertyName = entry.getKey();
            Object value = entry.getValue();
            PropertyDesc pd = new MapPropertyDescImpl(propertyName, value);
            properties.add(pd);
            addToMap(propertyName, pd);
        }
        this.propertyArray = properties.toArray(new PropertyDesc[properties.size()]);
    }

    //	@Override
    /**
     * {@inheritDoc}
     */
    public PropertyDesc getPropertyDesc(String name) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    //	@Override
    /**
     * {@inheritDoc}
     */
    public PropertyDesc getPropertyDesc(int i) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    //	@Override
    /**
     * {@inheritDoc}
     */
    public int getPropertyDescSize() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    //	@Override
    /**
     * {@inheritDoc}
     */
    public Class<?> getType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    //	@Override
    /**
     * {@inheritDoc}
     */
    public <T extends Annotation> T getAnnotation(Class<T> type) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private void addToMap(String propertyName, PropertyDesc pd) {
        synchronized (propertyMap) {
            propertyMap.put(propertyName, pd);
        }
    }
}
