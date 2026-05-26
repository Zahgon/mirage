package com.miragesql.miragesql.type;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ObjectValueType extends AbstractValueType<Object> {

    public ObjectValueType() {
        super(Object.class);
    }

    public Object get(Class<? extends Object> type, ResultSet rs, int columnIndex) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Object get(Class<? extends Object> type, ResultSet rs, String columnName) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void set(Class<? extends Object> type, PreparedStatement stmt, Object value, int index) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Object get(Class<? extends Object> type, CallableStatement cs, int index) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Object get(Class<? extends Object> type, CallableStatement cs, String parameterName) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
