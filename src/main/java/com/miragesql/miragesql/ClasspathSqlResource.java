package com.miragesql.miragesql;

import java.io.IOException;
import java.io.InputStream;

/**
 * {@link SqlResource} represented by an sql path, more precisely the classpath resource of the file containing
 * the SQL string, found by the rules of: {@link ClassLoader#getResource(String)}.
 */
public class ClasspathSqlResource implements SqlResource {

    /**
     * The path to the file containing the SQL.
     */
    private final String sqlPath;

    /**
     * Constructs a {@link SqlResource} from a file path.
     *
     * @param sqlPath the SQL file path.
     */
    public ClasspathSqlResource(final String sqlPath) {
        this.sqlPath = sqlPath;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InputStream getInputStream() throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
