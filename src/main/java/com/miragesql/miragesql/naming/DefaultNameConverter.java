package com.miragesql.miragesql.naming;

/**
 * The default implementation of {@link NameConverter}.
 * <p>
 * This implementation uses camel case for entity / property names, and underscore for table / column names.
 *
 * @author Naoki Takezoe
 */
public class DefaultNameConverter implements NameConverter {

    //	@Override
    /**
     * {@inheritDoc}
     */
    public String columnToProperty(String columnName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    //	@Override
    /**
     * {@inheritDoc}
     */
    public String entityToTable(String entityName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    //	@Override
    /**
     * {@inheritDoc}
     */
    public String propertyToColumn(String propertyName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
    //	@Override
    //	public String tableToEntity(String tableName) {
    //		return null;
    //	}
}
