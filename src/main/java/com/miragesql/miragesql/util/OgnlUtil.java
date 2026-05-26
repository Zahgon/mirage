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
package com.miragesql.miragesql.util;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.Map;
import com.miragesql.miragesql.exception.OgnlRuntimeException;
import ognl.*;

/**
 * Utility class for OGNL.
 *
 * @author higa
 */
@SuppressWarnings("rawtypes")
public class OgnlUtil {

    /**
     * Constructor.
     */
    protected OgnlUtil() {
    }

    /**
     * Returns the value using the OGNL expression and the root object.
     *
     * @param exp the OGNL expression
     * @param root the root object
     *
     * @return the value
     *
     * @see #getValue(Object, Map, Object, String, int)
     */
    public static Object getValue(Object exp, Object root) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns the value using the OGNL expression, the root object, a path and a line number.
     *
     * @param exp the OGNL expression
     * @param root the root object
     * @param path the path
     * @param lineNumber the line number
     *
     * @return the value
     *
     * @see #getValue(Object, Map, Object, String, int)
     */
    public static Object getValue(Object exp, Object root, String path, int lineNumber) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns the value using the OGNL expression, the root object and a context map.
     *
     * @param exp the OGNL expression
     * @param ctx the context map
     * @param root the root object
     *
     * @return the value
     *
     * @see #getValue(Object, Map, Object, String, int)
     */
    public static Object getValue(Object exp, Map ctx, Object root) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns the value using the OGNL expression, the root object, a context mpa, a path and a line number.
     *
     * @param exp the OGNL expression
     * @param ctx the context map
     * @param root the root object
     * @param path the path
     * @param lineNumber the line number
     *
     * @return the value
     *
     * @throws OgnlRuntimeException when a {@link ognl.OgnlException} occurs
     */
    public static Object getValue(Object exp, Map ctx, Object root, String path, int lineNumber) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Parses an OGNL expression.
     *
     * @param expression the expression
     *
     * @return a tree representation of the OGNL expression
     *
     * @see #parseExpression(String, String, int)
     */
    public static Object parseExpression(String expression) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Parses an OGNL expression.
     *
     * @param expression the expression
     * @param path the path
     * @param lineNumber the line number
     *
     * @return a tree representation of the OGNL expression
     *
     * @throws OgnlRuntimeException when a {@link ognl.OgnlException} occurs
     */
    public static Object parseExpression(String expression, String path, int lineNumber) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static class DefaultMemberAccess implements MemberAccess {

        private boolean allowPrivateAccess = false;

        private boolean allowProtectedAccess = false;

        private boolean allowPackageProtectedAccess = false;

        /*
         * =================================================================== Constructors
         * ===================================================================
         */
        public DefaultMemberAccess(boolean allowAllAccess) {
            this(allowAllAccess, allowAllAccess, allowAllAccess);
        }

        public DefaultMemberAccess(boolean allowPrivateAccess, boolean allowProtectedAccess, boolean allowPackageProtectedAccess) {
            super();
            this.allowPrivateAccess = allowPrivateAccess;
            this.allowProtectedAccess = allowProtectedAccess;
            this.allowPackageProtectedAccess = allowPackageProtectedAccess;
        }

        /*
         * =================================================================== Public methods
         * ===================================================================
         */
        public boolean getAllowPrivateAccess() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public void setAllowPrivateAccess(boolean value) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public boolean getAllowProtectedAccess() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public void setAllowProtectedAccess(boolean value) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public boolean getAllowPackageProtectedAccess() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public void setAllowPackageProtectedAccess(boolean value) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public Object setup(Map context, Object target, Member member, String propertyName) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public void restore(Map context, Object target, Member member, String propertyName, Object state) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public boolean isAccessible(Map context, Object target, Member member, String propertyName) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
