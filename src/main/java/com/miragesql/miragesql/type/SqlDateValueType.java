package com.miragesql.miragesql.type;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SqlDateValueType extends AbstractValueType<java.sql.Date> {

    public SqlDateValueType() {
        super(java.sql.Date.class);
    }

    public java.sql.Date get(Class<? extends java.sql.Date> type, ResultSet rs, int columnIndex) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public java.sql.Date get(Class<? extends java.sql.Date> type, ResultSet rs, String columnName) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void set(Class<? extends java.sql.Date> type, PreparedStatement stmt, java.sql.Date value, int index) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public java.sql.Date get(Class<? extends java.sql.Date> type, CallableStatement cs, int index) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public java.sql.Date get(Class<? extends java.sql.Date> type, CallableStatement cs, String parameterName) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
