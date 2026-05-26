package com.miragesql.miragesql.bean;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Map;

public class MapPropertyDescImpl implements PropertyDesc {

    private Object value;

    private String propertyName;

    public MapPropertyDescImpl(String propertyName, Object value) {
        this.propertyName = propertyName;
        this.value = value;
    }

    //	@Override
    /**
     * {@inheritDoc}
     */
    public <T extends Annotation> T getAnnotation(Class<T> type) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    //	@Override
    /**
     * {@inheritDoc}
     */
    public Field getField() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    //	@Override
    /**
     * {@inheritDoc}
     */
    public String getPropertyName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    //	@Override
    /**
     * {@inheritDoc}
     */
    public Class<?> getPropertyType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    //	@Override
    //	@SuppressWarnings("unchecked")
    /**
     * {@inheritDoc}
     */
    public Object getValue(Object entity) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    //	@Override
    /**
     * {@inheritDoc}
     */
    public boolean isReadable() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    //	@Override
    /**
     * {@inheritDoc}
     */
    public boolean isWritable() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    //	@Override
    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    public void setValue(Object entity, Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    //	@Override
    /**
     * {@inheritDoc}
     */
    public boolean isTransient() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
