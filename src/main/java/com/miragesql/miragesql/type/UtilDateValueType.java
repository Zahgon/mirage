package com.miragesql.miragesql.type;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public class UtilDateValueType extends AbstractValueType<java.util.Date> {

    public UtilDateValueType() {
        super(java.util.Date.class);
    }

    public java.util.Date get(Class<? extends java.util.Date> type, ResultSet rs, int columnIndex) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public java.util.Date get(Class<? extends java.util.Date> type, ResultSet rs, String columnName) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void set(Class<? extends java.util.Date> type, PreparedStatement stmt, java.util.Date value, int index) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public java.util.Date get(Class<? extends java.util.Date> type, CallableStatement cs, int index) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public java.util.Date get(Class<? extends java.util.Date> type, CallableStatement cs, String parameterName) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
