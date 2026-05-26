package com.miragesql.miragesql.provider;

import java.sql.Connection;
import java.sql.SQLException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.sql.XADataSource;
import com.miragesql.miragesql.exception.SQLRuntimeException;
import com.miragesql.miragesql.util.JdbcUtil;

/**
 * {@link ConnectionProvider} implementation which gets a connection from <code>javax.sql.XADataSource</code>.
 *
 * @author Naoki Takezoe
 */
public class XADataSourceConnectionProvider implements ConnectionProvider {

    private static final Logger logger = LoggerFactory.getLogger(XADataSourceConnectionProvider.class);

    private XADataSource xaDataSource;

    private ThreadLocal<Connection> threadLocal = new ThreadLocal<>();

    public void setDataSource(XADataSource xaDataSource) {
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
