package com.miragesql.miragesql.updater;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.miragesql.miragesql.SqlManager;
import com.miragesql.miragesql.SqlManagerImpl;
import com.miragesql.miragesql.StringSqlResource;
import com.miragesql.miragesql.dialect.Dialect;
import com.miragesql.miragesql.exception.SQLRuntimeException;
import com.miragesql.miragesql.util.IOUtil;

/**
 * Execute SQL files which located a specific package to update database schema.
 * You can use this to update database schema automatically  with application updating.
 * <p>
 * By the default, you have to locate SQLs within META-INF as follows:
 * </p>
 * <pre>
 * /META-INF
 *   mysql_1.sql
 *   mysql_2.sql
 *   mysql_3.sql
 *   ...
 * </pre>
 * <p>
 * You can change a package where locate SQL files by {@link #setPackageName(String)}.
 * </p>
 * <p>
 * SQLs will be executed in the order of version number which contained in the filename.
 * The version number (a part of filename) have to be a continued integer value.
 * Filename can contain the database type such as "mysql" also. It is omittable.
 * For examples, if the schema updater can not find a "mysql_1.sql", uses "1.sql" instead of it.
 * </p>
 *
 * @author Naoki Takezoe
 */
public class SchemaUpdater {

    private static final Logger logger = LoggerFactory.getLogger(SchemaUpdater.class);

    protected SqlManager sqlManager;

    protected String tableName = "SCHEMA_VERSION";

    protected String packageName = "META-INF";

    /**
     * Sets the SqlManager to use for schema updating.
     *
     * @param sqlManager the SqlManager
     */
    public void setSqlManager(SqlManager sqlManager) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Sets the table name which manages the schema version. The default is "SCHEMA_VERSION".
     *
     * @param tableName the table name
     */
    public void setTableName(String tableName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Sets the package name where locate SQL files. The default is "META-INF".
     *
     * @param packageName the package name
     */
    public void setPackageName(String packageName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Updates database schema to the latest state.
     * <p>
     * Note: Before calling this method, Connection might have to be auto-commit mode.
     */
    public void update() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns the SQL which located within a package specified by the packageName as
     * "dialectname_version.sql" or "version.sql".
     *
     * @param version the version number
     * @return SQL or null if the SQL file does not exist
     */
    protected String getSql(int version) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Checks the table which manages a schema version exists or not exists.
     *
     * @return if the table exists then returns true; otherwise false
     */
    protected boolean existsTable() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Creates table which manages schema version and insert an initial record as version 0.
     */
    protected void createTable() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns the current version number.
     *
     * @return the current version number
     */
    protected int getCurrentVersion() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Updates the version number by the given value.
     *
     * @param version the version number
     */
    protected void updateVersion(int version) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
