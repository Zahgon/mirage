package com.miragesql.miragesql.type;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LongPrimitiveValueType extends AbstractValueType<Long> {

    public LongPrimitiveValueType() {
        super(Long.TYPE);
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

    @Override
    public Long getDefaultValue() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
