package com.miragesql.miragesql.dialect;

import com.miragesql.miragesql.annotation.PrimaryKey.GenerationType;
import com.miragesql.miragesql.type.ValueType;

public class StandardDialect implements Dialect {

    public String getName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean needsParameterForResultSet() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ValueType<?> getValueType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getSequenceSql(String sequenceName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean supportsGenerationType(GenerationType generationType) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getCountSql(String sql) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
