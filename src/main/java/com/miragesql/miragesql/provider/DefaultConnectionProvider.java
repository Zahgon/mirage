package com.miragesql.miragesql.provider;

import java.sql.Connection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.miragesql.miragesql.util.JdbcUtil;

/**
 * The simple implementation of {@link ConnectionProvider}.
 *
 * @author Naoki Takezoe
 */
public class DefaultConnectionProvider implements ConnectionProvider {

    private static final Logger logger = LoggerFactory.getLogger(DefaultConnectionProvider.class);

    private ThreadLocal<Connection> threadLocal = new ThreadLocal<>();

    public void setConnection(Connection conn) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void releaseConnection() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    //	@Override
    /**
     * {@inheritDoc}
     */
    public Connection getConnection() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
