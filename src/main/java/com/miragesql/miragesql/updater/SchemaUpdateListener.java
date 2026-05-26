package com.miragesql.miragesql.updater;

import java.sql.Connection;
import java.sql.SQLException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import com.miragesql.miragesql.SqlManagerImpl;
import com.miragesql.miragesql.session.Session;
import com.miragesql.miragesql.session.SessionFactory;
import com.miragesql.miragesql.util.ExceptionUtil;
import com.miragesql.miragesql.util.StringUtil;

/**
 * This is a ServletContextListener to execute {@link SchemaUpdater} when the servlet context is initialized.
 * <p>
 * This listener is only available when Mirage-SQL is working standalone.
 * Because this listener get connection configurations from jdbc.properties using {@link SessionFactory}.
 * If you want to use Mirage-SQL with DI containers such as Spring or etc, you can't use this listener.
 * </p>
 *
 * @author Naoki Takezoe
 */
public class SchemaUpdateListener implements ServletContextListener {

    private static final Logger logger = LoggerFactory.getLogger(SchemaUpdateListener.class);

    public void contextInitialized(ServletContextEvent sce) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void contextDestroyed(ServletContextEvent sce) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
