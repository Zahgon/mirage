package com.miragesql.miragesql.type;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class IntegerPrimitiveValueType extends AbstractValueType<Integer> {

    public IntegerPrimitiveValueType() {
        super(Integer.TYPE);
    }

    public Integer get(Class<? extends Integer> type, ResultSet rs, int columnIndex) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Integer get(Class<? extends Integer> type, ResultSet rs, String columnName) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void set(Class<? extends Integer> type, PreparedStatement stmt, Integer value, int index) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Integer get(Class<? extends Integer> type, CallableStatement cs, int index) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Integer get(Class<? extends Integer> type, CallableStatement cs, String parameterName) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Integer getDefaultValue() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
