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

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.LinkedList;
import com.miragesql.miragesql.util.OgnlUtil;

/**
 * {@link Node} for <code>IN</code> bind variables.
 *
 * @author higa
 * @author shuji.w6e
 */
public class ParenBindVariableNode extends AbstractNode {

    private String expression;

    private Object parsedExpression;

    public ParenBindVariableNode(String expression) {
        this.expression = expression;
        this.parsedExpression = OgnlUtil.parseExpression(expression);
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

    private Object[] toArray(Iterable<?> iterable) {
        LinkedList<Object> list = new LinkedList<>();
        for (Object o : iterable) {
            list.add(o);
        }
        return list.toArray();
    }

    /**
     * @param ctx the SqlContext
     * @param array the variable array
     */
    protected void bindArray(SqlContext ctx, Object array) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
