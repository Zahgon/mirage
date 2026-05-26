/*
 * Copyright 2011 Daisuke Miyamoto.
 * Created on 2011/10/23
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
package com.miragesql.miragesql.type.enumerate;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import com.miragesql.miragesql.type.ValueType;
import com.miragesql.miragesql.util.AnnotationUtils;
import com.miragesql.miragesql.annotation.Enumerated;
import com.miragesql.miragesql.annotation.Enumerated.EnumType;
import com.miragesql.miragesql.bean.PropertyDesc;

/**
 * {@link Enum}型をordinalの {@code int}型としてDBに保存するための {@link ValueType}実装クラス。
 *
 * @since 1.0
 * @author daisuke
 */
public class EnumOrdinalValueType implements ValueType<Object> {

    private static Enum<? extends Object> toEnum(Class<? extends Object> type, int ordinal) {
        Object[] values = type.getEnumConstants();
        if (values.length <= ordinal || ordinal < 0) {
            return null;
        }
        return (Enum<?>) values[ordinal];
    }

    public Integer get(Class<? extends Object> type, CallableStatement cs, int index) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Integer get(Class<? extends Object> type, CallableStatement cs, String parameterName) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Enum<? extends Object> get(Class<? extends Object> type, ResultSet rs, int columnIndex) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Enum<? extends Object> get(Class<? extends Object> type, ResultSet rs, String columnName) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Class<? extends Object> getJavaType(int sqlType) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isSupport(Class<?> type, PropertyDesc propertyDesc) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void registerOutParameter(Class<?> type, CallableStatement cs, int index) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void registerOutParameter(Class<?> type, CallableStatement cs, String parameterName) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void set(Class<? extends Object> type, PreparedStatement stmt, Object value, int index) throws SQLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Object getDefaultValue() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
