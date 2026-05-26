package com.miragesql.miragesql;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.miragesql.miragesql.annotation.Column;
import com.miragesql.miragesql.annotation.PrimaryKey;
import com.miragesql.miragesql.bean.BeanDesc;
import com.miragesql.miragesql.bean.PropertyDesc;
import com.miragesql.miragesql.dialect.Dialect;
import com.miragesql.miragesql.naming.NameConverter;
import com.miragesql.miragesql.type.ValueType;
import com.miragesql.miragesql.util.MirageUtil;

public class DefaultEntityOperator implements EntityOperator {

    private static final Logger logger = LoggerFactory.getLogger(DefaultEntityOperator.class);

    /**
     * Creates and returns one entity instance from the ResultSet.
     *
     * @param <T> the type parameter of entity class
     * @param entityType the entity class
     * @param rs the ResultSet
     * @param meta the ResultSetMetaData
     * @param columnCount the column count
     * @param beanDesc the BeanDesc of the entity class
     * @param dialect the Dialect
     * @param valueTypes the list of ValueTypes
     * @param nameConverter the NameConverter
     *
     * @return the instance of entity class or Map
     *
     * @throws EntityCreationFailedException if {@link EntityOperator} failed to create a result entity
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public <T> T createEntity(Class<T> entityType, ResultSet rs, ResultSetMetaData meta, int columnCount, BeanDesc beanDesc, Dialect dialect, List<ValueType<?>> valueTypes, NameConverter nameConverter) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public PrimaryKeyInfo getPrimaryKeyInfo(Class<?> clazz, PropertyDesc propertyDesc, NameConverter nameConverter) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ColumnInfo getColumnInfo(Class<?> clazz, PropertyDesc propertyDesc, NameConverter nameConverter) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
