package com.miragesql.miragesql.type;

import java.io.ByteArrayInputStream;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.sql.Types;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import com.miragesql.miragesql.bean.PropertyDesc;
import com.miragesql.miragesql.util.IOUtil;

@Deprecated
public class DefaultValueType implements ValueType<Object> {

    private static final int TYPE_UNKNOWN = Integer.MIN_VALUE;

    private static Map<Class<?>, Integer> javaTypeToSqlTypeMap = new HashMap<>(32);

    static {
        javaTypeToSqlTypeMap.put(byte.class, new Integer(Types.TINYINT));
        javaTypeToSqlTypeMap.put(Byte.class, new Integer(Types.TINYINT));
        javaTypeToSqlTypeMap.put(short.class, new Integer(Types.SMALLINT));
        javaTypeToSqlTypeMap.put(Short.class, new Integer(Types.SMALLINT));
        javaTypeToSqlTypeMap.put(int.class, new Integer(Types.INTEGER));
        javaTypeToSqlTypeMap.put(Integer.class, new Integer(Types.INTEGER));
        javaTypeToSqlTypeMap.put(long.class, new Integer(Types.BIGINT));
        javaTypeToSqlTypeMap.put(Long.class, new Integer(Types.BIGINT));
        javaTypeToSqlTypeMap.put(BigInteger.class, new Integer(Types.BIGINT));
        javaTypeToSqlTypeMap.put(float.class, new Integer(Types.FLOAT));
        javaTypeToSqlTypeMap.put(Float.class, new Integer(Types.FLOAT));
        javaTypeToSqlTypeMap.put(double.class, new Integer(Types.DOUBLE));
        javaTypeToSqlTypeMap.put(Double.class, new Integer(Types.DOUBLE));
        javaTypeToSqlTypeMap.put(BigDecimal.class, new Integer(Types.DECIMAL));
        javaTypeToSqlTypeMap.put(java.sql.Date.class, new Integer(Types.DATE));
        javaTypeToSqlTypeMap.put(java.sql.Time.class, new Integer(Types.TIME));
        javaTypeToSqlTypeMap.put(java.sql.Timestamp.class, new Integer(Types.TIMESTAMP));
        javaTypeToSqlTypeMap.put(Blob.class, new Integer(Types.BLOB));
        javaTypeToSqlTypeMap.put(byte[].class, new Integer(Types.BLOB));
        javaTypeToSqlTypeMap.put(Clob.class, new Integer(Types.CLOB));
    }

    //	@Override
    public Object get(Class<?> type, ResultSet rs, int columnIndex) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    //	@Override
    public Object get(Class<?> type, ResultSet rs, String columnName) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    //	@Override
    public void set(Class<?> type, PreparedStatement stmt, Object value, int index) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    //	@Override
    public Object get(Class<?> type, CallableStatement cs, int index) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    //	@Override
    public Object get(Class<?> type, CallableStatement cs, String parameterName) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    //	@Override
    public void registerOutParameter(Class<?> type, CallableStatement cs, int index) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    //	@Override
    public void registerOutParameter(Class<?> type, CallableStatement cs, String parameterName) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static int javaTypeToSqlType(Class<?> javaType) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static boolean isStringValue(Class<?> inValueType) {
        return (CharSequence.class.isAssignableFrom(inValueType) || StringWriter.class.isAssignableFrom(inValueType));
    }

    private static boolean isDateValue(Class<?> inValueType) {
        return (java.util.Date.class.isAssignableFrom(inValueType) && !(java.sql.Date.class.isAssignableFrom(inValueType) || java.sql.Time.class.isAssignableFrom(inValueType) || java.sql.Timestamp.class.isAssignableFrom(inValueType)));
    }

    protected void setNull(Class<?> type, PreparedStatement stmt, int index) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    //	@Override
    public boolean isSupport(Class<?> type, PropertyDesc propertyDesc) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Class<?> getJavaType(int sqlType) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static boolean isPrimitive(Class<?> type) {
        if (type == Integer.TYPE || type == Long.TYPE || type == Short.TYPE || type == Double.TYPE || type == Float.TYPE || type == Boolean.TYPE) {
            return true;
        }
        return false;
    }

    public Object getDefaultValue() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
