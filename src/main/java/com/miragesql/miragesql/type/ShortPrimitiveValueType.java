package com.miragesql.miragesql.type;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ShortPrimitiveValueType extends AbstractValueType<Short> {

    public ShortPrimitiveValueType() {
        super(Short.TYPE);
    }

    public Short get(Class<? extends Short> type, ResultSet rs, int columnIndex) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Short get(Class<? extends Short> type, ResultSet rs, String columnName) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void set(Class<? extends Short> type, PreparedStatement stmt, Short value, int index) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Short get(Class<? extends Short> type, CallableStatement cs, int index) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Short get(Class<? extends Short> type, CallableStatement cs, String parameterName) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Short getDefaultValue() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
