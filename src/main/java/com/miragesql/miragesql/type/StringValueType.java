package com.miragesql.miragesql.type;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StringValueType extends AbstractValueType<String> {

    public StringValueType() {
        super(String.class);
    }

    public String get(Class<? extends String> type, ResultSet rs, int columnIndex) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String get(Class<? extends String> type, ResultSet rs, String columnName) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void set(Class<? extends String> type, PreparedStatement stmt, String value, int index) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String get(Class<? extends String> type, CallableStatement cs, int index) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String get(Class<? extends String> type, CallableStatement cs, String parameterName) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
