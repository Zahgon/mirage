package com.miragesql.miragesql.util;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import com.miragesql.miragesql.EntityOperator;
import com.miragesql.miragesql.EntityOperator.ColumnInfo;
import com.miragesql.miragesql.EntityOperator.PrimaryKeyInfo;
import com.miragesql.miragesql.annotation.Column;
import com.miragesql.miragesql.annotation.PrimaryKey.GenerationType;
import com.miragesql.miragesql.annotation.Table;
import com.miragesql.miragesql.bean.BeanDesc;
import com.miragesql.miragesql.bean.BeanDescFactory;
import com.miragesql.miragesql.bean.PropertyDesc;
import com.miragesql.miragesql.dialect.Dialect;
import com.miragesql.miragesql.naming.NameConverter;
import com.miragesql.miragesql.parser.SqlContext;
import com.miragesql.miragesql.parser.SqlContextImpl;
import com.miragesql.miragesql.type.ValueType;

public class MirageUtil {

    public static ValueType<?> getValueType(Class<?> propertyType, PropertyDesc propertyDesc, Dialect dialect, List<ValueType<?>> valueTypes) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns the {@link SqlContext} instance.
     *
     * @param beanDescFactory the bean descriptor factory
     * @param param the parameter object
     *
     * @return {@link SqlContext} instance
     */
    public static SqlContext getSqlContext(BeanDescFactory beanDescFactory, Object param) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns the table name from the entity.
     * <p>
     * <b>Note:</b> This should not be used for Maps as entities.
     * <p>
     * If the entity class has {@link Table} annotation then this method returns the annotated table name,
     * otherwise creates table name from the entity class name using {@link NameConverter}.
     *
     * @param entityClass the entity class
     * @param nameConverter the name converter
     *
     * @return the table name
     */
    public static String getTableName(Class<?> entityClass, NameConverter nameConverter) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns the column name from the property.
     * <p>
     * If the property has {@link Column} annotation then this method returns the annotated column name,
     * otherwise creates column name from the property name using {@link NameConverter}.
     *
     * @param entityOperator the entity operator
     * @param pd the property
     * @param clazz the class
     * @param nameConverter the name converter
     *
     * @return the column name
     */
    public static String getColumnName(EntityOperator entityOperator, Class<?> clazz, PropertyDesc pd, NameConverter nameConverter) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Builds select (by primary keys) SQL from the entity class.
     *
     * @param beanDescFactory the bean descriptor factory
     * @param entityOperator the entity operator
     * @param clazz the entity class to select
     * @param nameConverter the name converter
     *
     * @return Select SQL
     *
     * @throws RuntimeException the entity class has no primary keys
     * @deprecated use {@link #buildSelectSQL(String, BeanDescFactory, EntityOperator, Class, NameConverter)} instead
     */
    public static String buildSelectSQL(BeanDescFactory beanDescFactory, EntityOperator entityOperator, Class<?> clazz, NameConverter nameConverter) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Builds a select (by using the primary key) SQL from the entity class. If the entity is a Map, than 'id' is assumed as a PK.
     *
     * @param entityName the entity name to select
     * @param beanDescFactory the bean descriptor factory
     * @param entityOperator the entity operator
     * @param clazz the entity class to select
     * @param nameConverter the name converter
     *
     * @return Select SQL
     *
     * @throws RuntimeException the entity class has no primary keys
     */
    public static String buildSelectSQL(String entityName, BeanDescFactory beanDescFactory, EntityOperator entityOperator, Class<?> clazz, NameConverter nameConverter) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Builds an insert SQL (a PreparedStatement) with correct parameters from the entity.
     *
     * @param beanDescFactory the bean descriptor factory
     * @param entityOperator the entity operator
     * @param entityType the entity class insert
     * @param nameConverter the name converter
     * @param propDescs the list of parameters
     *
     * @return Insert SQL
     * @deprecated use {@link #buildInsertSql(String, BeanDescFactory, EntityOperator, Object, NameConverter, List)} instead
     */
    public static String buildInsertSql(BeanDescFactory beanDescFactory, EntityOperator entityOperator, Class<?> entityType, NameConverter nameConverter, List<PropertyDesc> propDescs) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Builds an insert SQL (a PreparedStatement) with correct parameters from the entity (or from a Map). In the case
     * of a Map as an entity, if the <code>id</code> key is present, it will be inserted, since there's no other way
     * for now to specify a different generation type for the PK.
     *
     * @param entityName the entity name to select
     * @param beanDescFactory the bean descriptor factory
     * @param entityOperator the entity operator
     * @param entity the entity to insert
     * @param nameConverter the name converter
     * @param propDescs the list of parameters
     *
     * @return Insert SQL
     */
    public static String buildInsertSql(String entityName, BeanDescFactory beanDescFactory, EntityOperator entityOperator, Object entity, NameConverter nameConverter, List<PropertyDesc> propDescs) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Builds update SQL and correct parameters from the entity.
     *
     * @param beanDescFactory the bean descriptor factory
     * @param entityOperator the entity operator
     * @param entityType the entity class to update
     * @param nameConverter the name converter
     * @param propDescs the list of parameters
     *
     * @return Update SQL
     * @deprecated use {@link #buildUpdateSql(String, BeanDescFactory, EntityOperator, Object, NameConverter, List)} instead
     */
    public static String buildUpdateSql(BeanDescFactory beanDescFactory, EntityOperator entityOperator, Class<?> entityType, NameConverter nameConverter, List<PropertyDesc> propDescs) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Builds update SQL and correct parameters from the entity.
     *
     * @param entityName the entity name to select
     * @param beanDescFactory the bean descriptor factory
     * @param entityOperator the entity operator
     * @param entity the entity to update
     * @param nameConverter the name converter
     * @param propDescs the list of parameters
     *
     * @return Update SQL
     */
    public static String buildUpdateSql(String entityName, BeanDescFactory beanDescFactory, EntityOperator entityOperator, Object entity, NameConverter nameConverter, List<PropertyDesc> propDescs) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Builds delete SQL and correct parameters from the entity.
     *
     * @param beanDescFactory the bean descriptor factory
     * @param entityOperator the entity operator
     * @param entityType the entity class to delete
     * @param nameConverter the name converter
     * @param propDescs the list of parameters
     *
     * @return Delete SQL
     * @deprecated use {@link #buildDeleteSql(String, BeanDescFactory, EntityOperator, Object, NameConverter, List)} instead
     */
    public static String buildDeleteSql(BeanDescFactory beanDescFactory, EntityOperator entityOperator, Class<?> entityType, NameConverter nameConverter, List<PropertyDesc> propDescs) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Builds delete SQL and correct parameters from the entity.
     *
     * @param entityName the entity name to select
     * @param beanDescFactory the bean descriptor factory
     * @param entityOperator the entity operator
     * @param entity the entity to delete
     * @param nameConverter the name converter
     * @param propDescs the list of parameters
     *
     * @return Delete SQL
     */
    public static String buildDeleteSql(String entityName, BeanDescFactory beanDescFactory, EntityOperator entityOperator, Object entity, NameConverter nameConverter, List<PropertyDesc> propDescs) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static String placeHolderForInsertAndUpdate(PropertyDesc desc) {
        assert desc != null;
        Column col = desc.getAnnotation(Column.class);
        return col != null ? desc.getAnnotation(Column.class).placeHolder() : "?";
    }
}
