package com.miragesql.miragesql.type;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FloatPrimitiveValueType extends AbstractValueType<Float> {

    public FloatPrimitiveValueType() {
        super(Float.TYPE);
    }

    public Float get(Class<? extends Float> type, ResultSet rs, int columnIndex) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Float get(Class<? extends Float> type, ResultSet rs, String columnName) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void set(Class<? extends Float> type, PreparedStatement stmt, Float value, int index) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Float get(Class<? extends Float> type, CallableStatement cs, int index) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Float get(Class<? extends Float> type, CallableStatement cs, String parameterName) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Float getDefaultValue() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
