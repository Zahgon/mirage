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

import java.util.Stack;
import com.miragesql.miragesql.bean.BeanDescFactory;
import com.miragesql.miragesql.exception.TwoWaySQLException;
import com.miragesql.miragesql.parser.SqlTokenizer.TokenType;
import com.miragesql.miragesql.util.StringUtil;

/**
 * Default {@link SqlParser} implementation.
 *
 * @author higa
 */
public class SqlParserImpl implements SqlParser {

    private BeanDescFactory beanDescFactory;

    private SqlTokenizer tokenizer;

    private Stack<Node> nodeStack = new Stack<>();

    public SqlParserImpl(String sql, BeanDescFactory beanDescFactory) {
        sql = sql.trim();
        if (sql.endsWith(";")) {
            sql = sql.substring(0, sql.length() - 1);
        }
        tokenizer = new SqlTokenizerImpl(sql);
        this.beanDescFactory = beanDescFactory;
    }

    //	@Override
    public Node parse() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected void parseToken() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Parse the SQL.
     */
    protected void parseSql() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Parse an SQL comment.
     */
    protected void parseComment() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Parse an IF node.
     */
    protected void parseIf() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Parse a BEGIN node.
     */
    protected void parseBegin() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Parse an END node.
     */
    protected void parseEnd() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Parse an ELSE node.
     */
    protected void parseElse() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Parse bind variables comment.
     */
    protected void parseCommentBindVariable() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Parse the bind variable.
     */
    protected void parseBindVariable() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Pop (remove from the stack) the top node.
     *
     * @return the top node.
     */
    protected Node pop() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Peek the top node.
     *
     * @return the top node.
     */
    protected Node peek() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Push a node
     *
     * @param node the node to push.
     */
    protected void push(Node node) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return <code>true</code> if in the ELSE branch, <code>false</code> otherwise.
     */
    protected boolean isElseMode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Checks if this comment is a "Mirage-SQL" comment, i.e. can be a keyword or a bind variable.
     *
     * @param comment the comment to check
     * @return <code>true</code> if it's a Mirage-SQL comment.
     */
    protected static boolean isTargetComment(String comment) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Checks if this comment is a "Mirage-SQL" <code>IF</code> keyword.
     *
     * @param comment the comment to check
     * @return <code>true</code> if this comment is an <code>IF</code> keyword.
     */
    protected static boolean isIfComment(String comment) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Checks if this comment is a "Mirage-SQL" <code>BEGIN</code> keyword.
     *
     * @param content the comment to check
     * @return <code>true</code> if this comment is an <code>BEGIN</code> keyword.
     */
    protected static boolean isBeginComment(String content) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Checks if this comment is a "Mirage-SQL" <code>END</code> keyword.
     *
     * @param content the comment to check
     * @return <code>true</code> if this comment is an <code>END</code> keyword.
     */
    protected static boolean isEndComment(String content) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Checks if the comment is an Oracle optimizer hint.
     *
     * @param content the comment to check
     * @return <code>true</code> if this comment is an Oracle optimizer hint.
     */
    protected static boolean isHintComment(String content) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
