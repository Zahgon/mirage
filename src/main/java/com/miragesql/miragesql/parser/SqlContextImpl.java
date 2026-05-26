/*
 * Copyright 2004-2010 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package com.miragesql.miragesql.parser;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import ognl.OgnlRuntime;

/**
 * Implementation of the {@link SqlContext} interface.
 *
 * @author higa
 */
public class SqlContextImpl implements SqlContext {

    // private static Logger logger = Logger.getLogger(SqlContextImpl.class);
    // CaseInsensitiveMap
    private Map<String, Object> args = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

    // CaseInsensitiveMap
    private Map<String, Class<?>> argTypes = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

    private StringBuffer sqlBuf = new StringBuffer(255);

    private List<Object> bindVariables = new ArrayList<>();

    private List<Class<?>> bindVariableTypes = new ArrayList<>();

    private boolean enabled = true;

    private SqlContext parent;

    static {
        OgnlRuntime.setPropertyAccessor(SqlContext.class, new SqlContextPropertyAccessor());
    }

    public SqlContextImpl() {
    }

    /**
     * Creates a <code>SqlContextImpl</code> with a specific <code>parent</code>
     *
     * @param parent the parent context.
     */
    public SqlContextImpl(SqlContext parent) {
        this.parent = parent;
        enabled = false;
    }

    //	@Override
    public Object getArg(String name) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    //	@Override
    public boolean hasArg(String name) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    //	@Override
    public Class<?> getArgType(String name) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    //	@Override
    public void addArg(String name, Object arg, Class<?> argType) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    //	@Override
    public String getSql() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    //	@Override
    public Object[] getBindVariables() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    //	@Override
    public Class<?>[] getBindVariableTypes() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    //	@Override
    public SqlContext addSql(String sql) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    //	@Override
    public SqlContext addSql(String sql, Object bindVariable, Class<?> bindVariableType) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    //	@Override
    public SqlContext addSql(String sql, Object[] bindVariables, Class<?>[] bindVariableTypes) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    //	@Override
    public boolean isEnabled() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    //	@Override
    public void setEnabled(boolean enabled) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
