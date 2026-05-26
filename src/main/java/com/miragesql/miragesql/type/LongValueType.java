package com.miragesql.miragesql.type;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LongValueType extends AbstractValueType<Long> {

    public LongValueType() {
        super(Long.class);
    }

    public Long get(Class<? extends Long> type, ResultSet rs, int columnIndex) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long get(Class<? extends Long> type, ResultSet rs, String columnName) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void set(Class<? extends Long> type, PreparedStatement stmt, Long value, int index) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long get(Class<? extends Long> type, CallableStatement cs, int index) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long get(Class<? extends Long> type, CallableStatement cs, String parameterName) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
