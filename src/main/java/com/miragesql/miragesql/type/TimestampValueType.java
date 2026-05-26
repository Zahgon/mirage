package com.miragesql.miragesql.type;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public class TimestampValueType extends AbstractValueType<Timestamp> {

    public TimestampValueType() {
        super(Timestamp.class);
    }

    public Timestamp get(Class<? extends Timestamp> type, ResultSet rs, int columnIndex) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Timestamp get(Class<? extends Timestamp> type, ResultSet rs, String columnName) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void set(Class<? extends Timestamp> type, PreparedStatement stmt, Timestamp value, int index) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Timestamp get(Class<? extends Timestamp> type, CallableStatement cs, int index) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Timestamp get(Class<? extends Timestamp> type, CallableStatement cs, String parameterName) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
