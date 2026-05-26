package com.miragesql.miragesql.session;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;
import com.miragesql.miragesql.exception.ConfigurationException;
import com.miragesql.miragesql.util.IOUtil;
import com.miragesql.miragesql.util.StringUtil;

public class SessionFactory {

    private static Session session;

    /**
     * Returns a session configured with the properties specified in the "jdbc.properties" file.
     *
     * @return {@link Session}
     *
     * @throws ConfigurationException if the configuration can't be loaded
     */
    public synchronized static Session getSession() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a session configured with the properties specified by the properties parameter.
     * If no <code>session.class</code> key is present in the properties, the session will use the {@link JDBCSessionImpl}.
     *
     * @param properties properties with settings to create a {@link Session} with.
     *
     * @return {@link Session}
     */
    public synchronized static Session getSession(Properties properties) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
