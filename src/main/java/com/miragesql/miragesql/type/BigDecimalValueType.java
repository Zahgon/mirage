package com.miragesql.miragesql.type;

import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BigDecimalValueType extends AbstractValueType<BigDecimal> {

    public BigDecimalValueType() {
        super(BigDecimal.class);
    }

    public BigDecimal get(Class<? extends BigDecimal> type, ResultSet rs, int columnIndex) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public BigDecimal get(Class<? extends BigDecimal> type, ResultSet rs, String columnName) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void set(Class<? extends BigDecimal> type, PreparedStatement stmt, BigDecimal value, int index) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public BigDecimal get(Class<? extends BigDecimal> type, CallableStatement cs, int index) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public BigDecimal get(Class<? extends BigDecimal> type, CallableStatement cs, String parameterName) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
