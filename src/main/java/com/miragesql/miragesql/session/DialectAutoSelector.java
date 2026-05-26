package com.miragesql.miragesql.session;

import com.miragesql.miragesql.dialect.*;

public class DialectAutoSelector {

    /**
     * Selects the Database Dialect based on the JDBC connection URL.
     *
     * @param url the JDBC Connection URL
     * @return the dialect that maps to a specific JDBC URL.
     */
    public static Dialect getDialect(String url) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
