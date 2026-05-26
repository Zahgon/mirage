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

import com.miragesql.miragesql.bean.BeanDesc;
import com.miragesql.miragesql.bean.BeanDescFactory;
import com.miragesql.miragesql.bean.PropertyDesc;
import com.miragesql.miragesql.exception.TwoWaySQLException;
import com.miragesql.miragesql.util.StringUtil;

/**
 * {@link Node} for embedding values.
 *
 * @author higa
 */
public class EmbeddedValueNode extends AbstractNode {

    private String expression;

    private String baseName;

    private String propertyName;

    private BeanDescFactory beanDescFactory;

    /**
     * Creates a <code>EmbeddedValueNode</code> from a string expression.
     *
     * @param expression the string expression to create the node from.
     * @param beanDescFactory beanDescFactory
     */
    public EmbeddedValueNode(String expression, BeanDescFactory beanDescFactory) {
        this.expression = expression;
        this.beanDescFactory = beanDescFactory;
        String[] array = StringUtil.split(expression, ".");
        this.baseName = array[0];
        if (array.length > 1) {
            this.propertyName = array[1];
        }
    }

    /**
     * @return the expression
     */
    public String getExpression() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    //	@Override
    public void accept(SqlContext ctx) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
