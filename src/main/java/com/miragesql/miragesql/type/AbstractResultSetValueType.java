package com.miragesql.miragesql.type;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import com.miragesql.miragesql.bean.PropertyDesc;

public class AbstractResultSetValueType implements ValueType<Object> {

    private int sqlType;

    public AbstractResultSetValueType(int sqlType) {
        this.sqlType = sqlType;
    }

    //	@Override
    public Object getDefaultValue() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    //	@Override
    public Object get(Class<?> type, ResultSet rs, int index) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    //	@Override
    public Object get(Class<?> type, ResultSet rs, String columnName) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    //	@Override
    public Object get(Class<?> type, CallableStatement cs, int index) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    //	@Override
    public Object get(Class<?> type, CallableStatement cs, String parameterName) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    //	@Override
    public boolean isSupport(Class<?> type, PropertyDesc propertyDesc) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    //	@Override
    public void registerOutParameter(Class<?> type, CallableStatement cs, int index) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    //	@Override
    public void registerOutParameter(Class<?> type, CallableStatement cs, String parameterName) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    //	@Override
    public void set(Class<?> type, PreparedStatement stmt, Object value, int index) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Class<?> getJavaType(int sqlType) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
