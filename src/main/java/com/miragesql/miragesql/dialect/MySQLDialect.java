package com.miragesql.miragesql.dialect;

import com.miragesql.miragesql.annotation.PrimaryKey.GenerationType;

// TODO: stored procedure / function and sequence support
public class MySQLDialect extends StandardDialect {

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
    public String getCountSql(String sql) {
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
