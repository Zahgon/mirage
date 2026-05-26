package com.miragesql.miragesql.type;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DoubleValueType extends AbstractValueType<Double> {

    public DoubleValueType() {
        super(Double.class);
    }

    public Double get(Class<? extends Double> type, ResultSet rs, int columnIndex) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Double get(Class<? extends Double> type, ResultSet rs, String columnName) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void set(Class<? extends Double> type, PreparedStatement stmt, Double value, int index) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Double get(Class<? extends Double> type, CallableStatement cs, int index) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Double get(Class<? extends Double> type, CallableStatement cs, String parameterName) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
