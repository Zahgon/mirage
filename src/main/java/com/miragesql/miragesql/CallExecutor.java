package com.miragesql.miragesql;

import java.lang.reflect.Field;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.miragesql.miragesql.annotation.InOut;
import com.miragesql.miragesql.annotation.Out;
import com.miragesql.miragesql.bean.BeanDesc;
import com.miragesql.miragesql.bean.BeanDescFactory;
import com.miragesql.miragesql.bean.PropertyDesc;
import com.miragesql.miragesql.dialect.Dialect;
import com.miragesql.miragesql.exception.SQLRuntimeException;
import com.miragesql.miragesql.naming.NameConverter;
import com.miragesql.miragesql.provider.ConnectionProvider;
import com.miragesql.miragesql.type.ValueType;
import com.miragesql.miragesql.util.JdbcUtil;
import com.miragesql.miragesql.util.ModifierUtil;
import com.miragesql.miragesql.util.ReflectionUtil;
import com.miragesql.miragesql.util.Validate;

public class CallExecutor {

    private static final Logger logger = LoggerFactory.getLogger(CallExecutor.class);

    private BeanDescFactory beanDescFactory;

    private NameConverter nameConverter;

    private ConnectionProvider connectionProvider;

    private List<ValueType<?>> valueTypes = new ArrayList<>();

    private Dialect dialect;

    private EntityOperator entityOperator;

    public void setBeanDescFactory(BeanDescFactory beanDescFactory) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setConnectionProvider(ConnectionProvider connectionProvider) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setNameConverter(NameConverter nameConverter) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setDialect(Dialect dialect) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Sets the value types in order to be able to execute procedure.
     *
     * @param valueTypes the value types to set.
     *
     * @throws IllegalArgumentException if the {@code valueTypes} is {@code null} or
     * an element in the {@code valueTypes} is {@code null}
     */
    public void setValueTypes(List<ValueType<?>> valueTypes) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void addValueType(ValueType<?> valueType) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setEntityOperator(EntityOperator entityOperator) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void call(String sql) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void call(String sql, Object parameter) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public <T> T call(Class<T> resultClass, String sql) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public <T> T call(Class<T> resultClass, String sql, Object parameter) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public <T> List<T> callForList(Class<T> resultClass, String sql) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public <T> List<T> callForList(Class<T> resultClass, String sql, Object parameter) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected void prepareParameters(List<Param> paramList, List<Param> nonParamList, CallableStatement stmt, Object parameter) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected void prepareReturnParameter(List<Param> paramList, boolean resultList, Class<?> resultClass) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @SuppressWarnings("unchecked")
    protected void setParameter(List<Param> paramList, CallableStatement cs) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected boolean execute(CallableStatement stmt, String sql, List<Param> paramList) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private void printParameters(List<Param> paramList) {
        if (paramList == null) {
            return;
        }
        for (Param param : paramList) {
            if (param.paramType == ParameterType.IN || param.paramType == ParameterType.IN_OUT) {
                PropertyDesc pd = param.propertyDesc;
                if (pd != null) {
                    logger.info(String.format("paramName=%s, value=%s", pd.getPropertyName(), param.value));
                } else {
                    logger.info(String.format("paramClass=%s, value=%s", param.paramClass, param.value));
                }
            }
        }
    }

    protected void handleNonParamResultSets(List<Param> nonParamList, final CallableStatement cs, Object parameter, final boolean resultSetGettable) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected Object handleResultSet(PropertyDesc pd, final ResultSet rs) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected <T> T handleSingleResult(final Class<T> resultClass, final ResultSet rs) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @SuppressWarnings("unchecked")
    protected <T> T handleSingleResult(final CallableStatement cs, List<Param> paramList) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @SuppressWarnings("unchecked")
    protected <T> List<T> handleResultList(List<Param> paramList, Class<?> resultClass, final CallableStatement cs) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected <T> List<T> handleResultList(final Class<T> elementClass, final ResultSet rs) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    //	protected Object handleResultSet(ResultSetHandler handler, ResultSet rs) {
    //		Object result = null;
    //		try {
    //			result = handler.handle(rs);
    //		}
    //		catch (SQLException e) {
    //			throw new SQLRuntimeException(e);
    //		}
    //		finally {
    //			JdbcUtil.close(rs);
    //		}
    //		return result;
    //	}
    protected void handleOutParams(List<Param> paramList, final CallableStatement cs, Object parameter, boolean functionCall) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected ResultSet getResultSet(final CallableStatement cs) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected ValueType<?> getValueType(Class<?> type, PropertyDesc propertyDesc) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected void addParam(final List<Param> paramList, final PropertyDesc pd, final Object value, final Class<?> paramClass, final ValueType<?> valueType, final ParameterType paramType) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected Param addParam(List<Param> paramList, Object value, Class<?> paramClass) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected Param addParam(List<Param> paramList, Object value, Class<?> paramClass, ValueType<?> valueType) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected Param addNonParam(final List<Param> nonParamList, final PropertyDesc pd) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected List<ParamDesc> getParamDescs(final Class<?> clazz) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected List<ParamDesc> createParamDesc(final Class<?> clazz) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected static enum ParameterType {

        IN, IN_OUT, OUT, RESULT_SET
    }

    protected static class ParamDesc {

        public PropertyDesc propertyDesc;

        public String name;

        public Class<?> paramClass;

        public ParameterType paramType;

        @SuppressWarnings("rawtypes")
        public ValueType valueType;
    }

    protected static class Param {

        public Object value;

        public Class<?> paramClass;

        public ParameterType paramType = ParameterType.IN;

        @SuppressWarnings("rawtypes")
        public ValueType valueType;

        public PropertyDesc propertyDesc;

        public Param() {
        }

        public Param(Object value, Class<?> paramClass) {
            this.value = value;
            this.paramClass = paramClass;
        }
    }
}
