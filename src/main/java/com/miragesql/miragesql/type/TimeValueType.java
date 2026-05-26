package com.miragesql.miragesql.type;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;

public class TimeValueType extends AbstractValueType<Time> {

    public TimeValueType() {
        super(Time.class);
    }

    public Time get(Class<? extends Time> type, ResultSet rs, int columnIndex) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Time get(Class<? extends Time> type, ResultSet rs, String columnName) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void set(Class<? extends Time> type, PreparedStatement stmt, Time value, int index) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Time get(Class<? extends Time> type, CallableStatement cs, int index) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Time get(Class<? extends Time> type, CallableStatement cs, String parameterName) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
