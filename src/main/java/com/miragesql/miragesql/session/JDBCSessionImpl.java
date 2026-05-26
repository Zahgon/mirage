package com.miragesql.miragesql.session;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.miragesql.miragesql.SqlManager;
import com.miragesql.miragesql.SqlManagerImpl;
import com.miragesql.miragesql.dialect.Dialect;
import com.miragesql.miragesql.exception.SessionException;
import com.miragesql.miragesql.provider.DefaultConnectionProvider;
import com.miragesql.miragesql.util.StringUtil;

/**
 * The default implementation of {@link Session}.
 * <p>
 * This implementation set {@link Dialect} to {@link SqlManager} automatically by the JDBC connection URL.
 *
 * @author Naoki Takezoe
 */
public class JDBCSessionImpl implements Session {

    private static final Logger logger = LoggerFactory.getLogger(JDBCSessionImpl.class);

    private SqlManager sqlManager;

    private DefaultConnectionProvider provider;

    private String driver;

    private String url;

    private String user;

    private String password;

    private ThreadLocal<Boolean> rollbackOnly = new ThreadLocal<>();

    /**
     * The implementation of {@link Session} which creates the connection from a JDBC connection.
     *
     * To enable it you need to add the properties below to <code>jdbc.properties</code>.
     *
     * @param properties the Properties object which has a following properties:
     *   <ul>
     *     <li>jdbc.driver - the JDBC driver classname (optional on JDBC 4.0)</li>
     *     <li>jdbc.url - the JDBC connection URL</li>
     *     <li>jdbc.user - the username</li>
     *     <li>jdbc.password - the password</li>
     *     <li>sql.cache - if true then SqlManager caches parsing result of 2waySQL</li>
     *   </ul>
     */
    public JDBCSessionImpl(Properties properties) {
        this.driver = properties.getProperty("jdbc.driver");
        this.url = properties.getProperty("jdbc.url");
        this.user = properties.getProperty("jdbc.user");
        this.password = properties.getProperty("jdbc.password");
        sqlManager = new SqlManagerImpl();
        sqlManager.setDialect(DialectAutoSelector.getDialect(url));
        provider = new DefaultConnectionProvider();
        sqlManager.setConnectionProvider(provider);
        String cache = properties.getProperty("sql.cache");
        if ("true".equals(cache)) {
            ((SqlManagerImpl) sqlManager).setCacheMode(true);
        } else {
            ((SqlManagerImpl) sqlManager).setCacheMode(false);
        }
    }

    /**
     * {@inheritDoc}
     */
    public void begin() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    public void commit() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    public SqlManager getSqlManager() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void release() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    public void rollback() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    public void setRollbackOnly() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    public boolean isRollbackOnly() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
