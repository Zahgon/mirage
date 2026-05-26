package com.miragesql.miragesql.dialect;

import com.miragesql.miragesql.annotation.PrimaryKey.GenerationType;
import com.miragesql.miragesql.type.PostgreResultSetValueType;
import com.miragesql.miragesql.type.ValueType;

// TODO LargeObject support
public class PostgreSQLDialect extends StandardDialect {

    private PostgreResultSetValueType valueType = new PostgreResultSetValueType();

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ValueType<?> getValueType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getSequenceSql(String sequenceName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean supportsGenerationType(GenerationType generationType) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
