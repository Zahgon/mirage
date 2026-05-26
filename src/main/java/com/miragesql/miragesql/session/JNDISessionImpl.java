package com.miragesql.miragesql.session;

import com.miragesql.miragesql.SqlManager;
import com.miragesql.miragesql.SqlManagerImpl;
import com.miragesql.miragesql.exception.ConfigurationException;
import com.miragesql.miragesql.exception.SessionException;
import com.miragesql.miragesql.provider.DataSourceConnectionProvider;
import com.miragesql.miragesql.provider.JNDIDataSourceConnectionProvider;
import javax.naming.NamingException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * JNDI based Mirage-SQL Session implementation.
 */
public class JNDISessionImpl implements Session {

    private static final Logger logger = LoggerFactory.getLogger(JNDISessionImpl.class);

    private SqlManager sqlManager;

    JNDIDataSourceConnectionProvider provider;

    private ThreadLocal<Boolean> rollbackOnly = new ThreadLocal<>();

    /**
     * The implementation of {@link Session} which gets the connection from a JNDI Data Source.
     * <p>
     * To enable JNDI you need to add the properties below to <code>jdbc.properties</code>.
     *
     * @param properties the Properties object which has a following properties:
     * <pre>
     *  session.class=com.miragesql.miragesql.session.JNDISessionImpl
     *  jndi.name=jdbc/mydbname
     *  db.dialect=jdbc:mysql:
     *  sql.cache=true
     * </pre>
     */
    public JNDISessionImpl(Properties properties) {
        String jndiName = properties.getProperty("jndi.name");
        String dialectUrl = properties.getProperty("db.dialect");
        sqlManager = new SqlManagerImpl();
        sqlManager.setDialect(DialectAutoSelector.getDialect(dialectUrl));
        try {
            provider = new JNDIDataSourceConnectionProvider(jndiName);
        } catch (NamingException e) {
            throw new ConfigurationException(e);
        }
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
    public void rollback() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    public void release() {
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

    /**
     * {@inheritDoc}
     */
    public SqlManager getSqlManager() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
