package com.miragesql.miragesql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.miragesql.miragesql.annotation.PrimaryKey;
import com.miragesql.miragesql.annotation.PrimaryKey.GenerationType;
import com.miragesql.miragesql.bean.BeanDesc;
import com.miragesql.miragesql.bean.BeanDescFactory;
import com.miragesql.miragesql.bean.PropertyDesc;
import com.miragesql.miragesql.dialect.Dialect;
import com.miragesql.miragesql.exception.BreakIterationException;
import com.miragesql.miragesql.exception.SQLRuntimeException;
import com.miragesql.miragesql.naming.NameConverter;
import com.miragesql.miragesql.provider.ConnectionProvider;
import com.miragesql.miragesql.type.ValueType;
import com.miragesql.miragesql.util.JdbcUtil;
import com.miragesql.miragesql.util.MirageUtil;
import com.miragesql.miragesql.util.Validate;

public class SqlExecutor {

    private static final Logger logger = LoggerFactory.getLogger(SqlExecutor.class);

    private BeanDescFactory beanDescFactory;

    private NameConverter nameConverter;

    private ConnectionProvider connectionProvider;

    private Dialect dialect;

    private List<ValueType<?>> valueTypes = new ArrayList<>();

    private EntityOperator entityOperator;

    public void setBeanDescFactory(BeanDescFactory beanDescFactory) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected BeanDescFactory getBeanDescFactory() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setConnectionProvider(ConnectionProvider connectionProvider) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setNameConverter(NameConverter nameConverter) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Sets the value types in order to be able to execute the SQL.
     *
     * @param valueTypes the value types to set.
     *
     * @throws IllegalArgumentException if the {@code valueTypes} is {@code null} or
     *         an element in the {@code valueTypes} is {@code null}
     */
    public void setValueTypes(List<ValueType<?>> valueTypes) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void addValueType(ValueType<?> valueType) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setDialect(Dialect dialect) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setEntityOperator(EntityOperator entityOperator) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static void printSql(String sql) {
        sql = sql.replace("\r\n", "\n");
        sql = sql.replace("\r", "\n");
        StringBuilder sb = new StringBuilder();
        for (String line : sql.split("\n")) {
            if (line.trim().length() != 0) {
                sb.append(line).append(System.getProperty("line.separator"));
            }
        }
        logger.debug(sb.toString().trim());
    }

    private static void printParameters(PropertyDesc[] propDescs, Object entity) {
        if (propDescs == null) {
            return;
        }
        for (int i = 0; i < propDescs.length; i++) {
            logger.debug(String.format("params[%d]=%s", i, propDescs[i].getValue(entity)));
        }
    }

    private static void printParameters(Object[] params) {
        if (params == null) {
            return;
        }
        for (int i = 0; i < params.length; i++) {
            logger.debug(String.format("params[%d]=%s", i, params[i]));
        }
    }

    /**
     * Returns a list of entities from the DB after executing the SQL.
     *
     * @param <T> the entity type
     * @param clazz the class of the entity to select
     * @param sql the SQL to execute
     * @param params parameters required to execute the SQL
     *
     * @return a List of entities
     *
     * @throws SQLRuntimeException if a database access error occurs
     */
    public <T> List<T> getResultList(Class<T> clazz, String sql, Object[] params) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Iterate over a ResultSet with entities.
     *
     * @param <T> the entity type
     * @param <R> the result type
     * @param clazz the class of the entity
     * @param callback callback to execute
     * @param sql the SQL to execute
     * @param params the parameters of the SQL
     *
     * @return a result entity
     *
     * @throws SQLRuntimeException if a database access error occurs
     */
    public <T, R> R iterate(Class<T> clazz, IterationCallback<T, R> callback, String sql, Object[] params) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a single entity from the first row of an SQL.
     *
     * @param <T> the entity type
     * @param clazz the class of the entity
     * @param sql the SQL to execute
     * @param params the parameters to execute the SQL
     * @return the entity from the result set.
     *
     * @throws SQLRuntimeException if a database access error occurs
     */
    public <T> T getSingleResult(Class<T> clazz, String sql, Object[] params) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Executes an update SQL.
     *
     * @param sql the update SQL to execute
     * @param propDescs the array of parameters
     * @param entity the entity object in insertion, otherwise null
     *
     * @return the number of updated rows
     *
     * @throws SQLRuntimeException if a database access error occurs
     */
    public int executeUpdateSql(String sql, PropertyDesc[] propDescs, Object entity) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Executes the update SQL.
     *
     * @param sql the update SQL to execute
     * @param params the array of parameters
     * @param entity the entity object in insertion, otherwise null
     *
     * @return the number of updated rows
     *
     * @throws SQLRuntimeException if a database access error occurs
     */
    public int executeUpdateSql(String sql, Object[] params, Object entity) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Executes the update SQL.
     *
     * @param sql the update SQL to execute
     * @param propDescsList the list of parameter arrays.
     * @param entities the entities object in insertion, otherwise null
     *
     * @return the number of updated rows
     *
     * @throws SQLRuntimeException if a database access error occurs
     */
    public int executeBatchUpdateSql(String sql, List<PropertyDesc[]> propDescsList, Object[] entities) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Sets GenerationType.IDENTITY properties value.
     *
     * @param entity the entity
     * @param rs the result set
     *
     * @throws SQLException if something goes wrong.
     */
    @SuppressWarnings("unchecked")
    protected void fillIdentityPrimaryKeys(Object entity, ResultSet rs) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Sets parameters to the PreparedStatement.
     *
     * @param stmt the prepared statement
     * @param propDescs the property descriptors
     * @param entity the entity
     *
     * @throws SQLException if something goes wrong
     */
    @SuppressWarnings("unchecked")
    protected void setParameters(PreparedStatement stmt, PropertyDesc[] propDescs, Object entity) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Sets parameters to the PreparedStatement.
     *
     * @param stmt the prepared statement
     * @param params the parameters
     *
     * @throws SQLException if something goes wrong.
     */
    @SuppressWarnings("unchecked")
    protected void setParameters(PreparedStatement stmt, Object[] params) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
