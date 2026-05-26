package com.miragesql.miragesql.type;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BooleanPrimitiveValueType extends AbstractValueType<Boolean> {

    public BooleanPrimitiveValueType() {
        super(Boolean.TYPE);
    }

    public Boolean get(Class<? extends Boolean> type, ResultSet rs, int columnIndex) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Boolean get(Class<? extends Boolean> type, ResultSet rs, String columnName) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void set(Class<? extends Boolean> type, PreparedStatement stmt, Boolean value, int index) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Boolean get(Class<? extends Boolean> type, CallableStatement cs, int index) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Boolean get(Class<? extends Boolean> type, CallableStatement cs, String parameterName) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Boolean getDefaultValue() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
