package com.miragesql.miragesql.type;

import java.io.ByteArrayInputStream;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.miragesql.miragesql.bean.PropertyDesc;
import com.miragesql.miragesql.util.IOUtil;

public class ByteArrayValueType extends AbstractValueType<byte[]> {

    public static void main(String[] args) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ByteArrayValueType() {
        super(byte[].class);
    }

    @Override
    public boolean isSupport(Class<?> type, PropertyDesc propertyDesc) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public byte[] get(Class<? extends byte[]> type, ResultSet rs, int columnIndex) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public byte[] get(Class<? extends byte[]> type, ResultSet rs, String columnName) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void set(Class<? extends byte[]> type, PreparedStatement stmt, byte[] value, int index) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public byte[] get(Class<? extends byte[]> type, CallableStatement cs, int index) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public byte[] get(Class<? extends byte[]> type, CallableStatement cs, String parameterName) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
