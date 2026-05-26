package com.miragesql.miragesql;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import com.miragesql.miragesql.annotation.PrimaryKey;
import com.miragesql.miragesql.annotation.PrimaryKey.GenerationType;
import com.miragesql.miragesql.annotation.ResultSet;
import com.miragesql.miragesql.bean.BeanDesc;
import com.miragesql.miragesql.bean.BeanDescFactory;
import com.miragesql.miragesql.bean.PropertyDesc;
import com.miragesql.miragesql.dialect.Dialect;
import com.miragesql.miragesql.dialect.StandardDialect;
import com.miragesql.miragesql.exception.IORuntimeException;
import com.miragesql.miragesql.naming.DefaultNameConverter;
import com.miragesql.miragesql.naming.NameConverter;
import com.miragesql.miragesql.parser.Node;
import com.miragesql.miragesql.parser.SqlContext;
import com.miragesql.miragesql.parser.SqlParserImpl;
import com.miragesql.miragesql.provider.ConnectionProvider;
import com.miragesql.miragesql.type.BigDecimalValueType;
import com.miragesql.miragesql.type.BooleanPrimitiveValueType;
import com.miragesql.miragesql.type.BooleanValueType;
import com.miragesql.miragesql.type.ByteArrayValueType;
import com.miragesql.miragesql.type.DoublePrimitiveValueType;
import com.miragesql.miragesql.type.DoubleValueType;
import com.miragesql.miragesql.type.FloatPrimitiveValueType;
import com.miragesql.miragesql.type.FloatValueType;
import com.miragesql.miragesql.type.IntegerPrimitiveValueType;
import com.miragesql.miragesql.type.IntegerValueType;
import com.miragesql.miragesql.type.LongPrimitiveValueType;
import com.miragesql.miragesql.type.LongValueType;
import com.miragesql.miragesql.type.ObjectValueType;
import com.miragesql.miragesql.type.ShortPrimitiveValueType;
import com.miragesql.miragesql.type.ShortValueType;
import com.miragesql.miragesql.type.SqlDateValueType;
import com.miragesql.miragesql.type.StringValueType;
import com.miragesql.miragesql.type.TimeValueType;
import com.miragesql.miragesql.type.TimestampValueType;
import com.miragesql.miragesql.type.UtilDateValueType;
import com.miragesql.miragesql.type.ValueType;
import com.miragesql.miragesql.type.enumerate.EnumOneBasedOrdinalValueType;
import com.miragesql.miragesql.type.enumerate.EnumOrdinalValueType;
import com.miragesql.miragesql.type.enumerate.EnumStringValueType;
import com.miragesql.miragesql.util.IOUtil;
import com.miragesql.miragesql.util.MirageUtil;
import com.miragesql.miragesql.util.Validate;

public class SqlManagerImpl implements SqlManager {

    //	private static final Logger logger = Logger.getLogger(SqlManagerImpl.class.getName());
    protected BeanDescFactory beanDescFactory;

    protected ConnectionProvider connectionProvider;

    protected NameConverter nameConverter;

    protected EntityOperator entityOperator;

    protected Dialect dialect = new StandardDialect();

    protected SqlExecutor sqlExecutor = new SqlExecutor();

    protected CallExecutor callExecutor = new CallExecutor();

    protected Map<SqlResource, Node> nodeCache = new ConcurrentHashMap<>();

    protected boolean cacheMode = false;

    public SqlManagerImpl() {
        addValueType(new StringValueType());
        addValueType(new IntegerValueType());
        addValueType(new IntegerPrimitiveValueType());
        addValueType(new LongValueType());
        addValueType(new LongPrimitiveValueType());
        addValueType(new ShortValueType());
        addValueType(new ShortPrimitiveValueType());
        addValueType(new DoubleValueType());
        addValueType(new DoublePrimitiveValueType());
        addValueType(new FloatValueType());
        addValueType(new FloatPrimitiveValueType());
        addValueType(new BooleanValueType());
        addValueType(new BooleanPrimitiveValueType());
        addValueType(new BigDecimalValueType());
        addValueType(new SqlDateValueType());
        addValueType(new UtilDateValueType());
        addValueType(new TimeValueType());
        addValueType(new TimestampValueType());
        addValueType(new ByteArrayValueType());
        addValueType(new EnumStringValueType());
        addValueType(new EnumOrdinalValueType());
        addValueType(new EnumOneBasedOrdinalValueType());
        addValueType(new ObjectValueType());
        //		addValueType(new com.miragesql.miragesql.type.DefaultValueType());
        setDialect(dialect);
        setBeanDescFactory(new BeanDescFactory());
        setNameConverter(new DefaultNameConverter());
        setEntityOperator(new DefaultEntityOperator());
    }

    public void setCacheMode(boolean cacheMode) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setBeanDescFactory(BeanDescFactory beanDescFactory) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    public void setNameConverter(NameConverter nameConverter) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public NameConverter getNameConverter() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    public void setConnectionProvider(ConnectionProvider connectionProvider) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    public void setEntityOperator(EntityOperator entityOperator) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ConnectionProvider getConnectionProvider() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    public void setDialect(Dialect dialect) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Dialect getDialect() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected Node prepareNode(SqlResource resource) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected SqlContext prepareSqlContext(Object param) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    public int executeUpdate(SqlResource resource) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    public int executeUpdate(SqlResource resource, Object param) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    public <T> List<T> getResultList(Class<T> clazz, SqlResource resource) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    public <T> List<T> getResultList(Class<T> clazz, SqlResource resource, Object param) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    public <T> T getSingleResult(Class<T> clazz, SqlResource resource) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    public <T> T getSingleResult(Class<T> clazz, SqlResource resource, Object param) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    public int deleteEntity(Object entity) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int deleteEntity(String entityName, Object entity) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    public <T> int deleteBatch(T... entities) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <T> int deleteBatch(String entityName, T... entities) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    public <T> int deleteBatch(List<T> entities) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <T> int deleteBatch(String entityName, List<T> entities) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Sets GenerationType.SEQUENCE properties value.
     */
    private void fillPrimaryKeysBySequence(Object entity) {
        if (!dialect.supportsGenerationType(GenerationType.SEQUENCE)) {
            return;
        }
        BeanDesc beanDesc = beanDescFactory.getBeanDesc(entity.getClass());
        int size = beanDesc.getPropertyDescSize();
        for (int i = 0; i < size; i++) {
            PropertyDesc propertyDesc = beanDesc.getPropertyDesc(i);
            PrimaryKey primaryKey = propertyDesc.getAnnotation(PrimaryKey.class);
            if (primaryKey != null && primaryKey.generationType() == GenerationType.SEQUENCE) {
                String sql = dialect.getSequenceSql(primaryKey.generator());
                Object value = sqlExecutor.getSingleResult(propertyDesc.getPropertyType(), sql, new Object[0]);
                propertyDesc.setValue(entity, value);
            }
        }
    }

    /**
     * {@inheritDoc}
     */
    public int insertEntity(Object entity) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int insertEntity(String entityName, Object entity) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    public <T> int insertBatch(T... entities) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <T> int insertBatch(String entityName, T... entities) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    public <T> int insertBatch(List<T> entities) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <T> int insertBatch(String entityName, List<T> entities) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    public int updateEntity(Object entity) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int updateEntity(String entityName, Object entity) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    public <T> int updateBatch(T... entities) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <T> int updateBatch(String entityName, T... entities) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    public <T> int updateBatch(List<T> entities) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <T> int updateBatch(String entityName, List<T> entities) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    public <T> T findEntity(Class<T> clazz, Object... id) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <T> T findEntity(String entityName, Class<T> clazz, Object... id) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Sets the value types.
     *
     * @param valueTypes the value types to set.
     *
     * @throws IllegalArgumentException if the {@code valueTypes} is {@code null} or
     * an element in the {@code valueTypes} is {@code null}
     */
    public void setValueTypes(List<ValueType<?>> valueTypes) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    public void addValueType(ValueType<?> valueType) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    public int getCount(SqlResource resource) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    public int getCount(SqlResource resource, Object param) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    public <T, R> R iterate(Class<T> clazz, IterationCallback<T, R> callback, SqlResource resource) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    public <T, R> R iterate(Class<T> clazz, IterationCallback<T, R> callback, SqlResource resource, Object param) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    public void call(String procedureName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    public void call(String procedureName, Object parameter) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    public <T> T call(Class<T> resultClass, String functionName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    public <T> T call(Class<T> resultClass, String functionName, Object param) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    public <T> List<T> callForList(Class<T> resultClass, String functionName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    public <T> List<T> callForList(Class<T> resultClass, String functionName, Object param) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected String toCallString(String moduleName, boolean function) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected String toCallString(String moduleName, Object param, boolean function) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected boolean needsParameter(PropertyDesc pd) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
