package com.miragesql.miragesql.dialect;

import com.miragesql.miragesql.annotation.PrimaryKey.GenerationType;
import com.miragesql.miragesql.type.OracleResultSetValueType;
import com.miragesql.miragesql.type.ValueType;

public class OracleDialect extends StandardDialect {

    private OracleResultSetValueType valueType = new OracleResultSetValueType();

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
    public boolean needsParameterForResultSet() {
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
