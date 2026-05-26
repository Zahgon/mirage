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

import com.miragesql.miragesql.exception.TwoWaySQLException;

/**
 * {@link SqlTokenizer} Implementation.
 *
 * @author higa
 */
public class SqlTokenizerImpl implements SqlTokenizer {

    private String sql;

    private int position = 0;

    private String token;

    private TokenType tokenType = TokenType.SQL;

    private TokenType nextTokenType = TokenType.SQL;

    private int bindVariableNum = 0;

    public SqlTokenizerImpl(String sql) {
        this.sql = sql;
    }

    //	@Override
    public String getSql() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    //	@Override
    public int getPosition() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    //	@Override
    public String getToken() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    //	@Override
    public String getBefore() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    //	@Override
    public String getAfter() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    //	@Override
    public TokenType getTokenType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    //	@Override
    public TokenType getNextTokenType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    //	@Override
    public TokenType next() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Parse the SQL.
     */
    protected void parseSql() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns the next starting position.
     *
     * @param commentStartPos starting position of the comment
     * @param elseCommentStartPos starting position of the ELSE comment
     * @param bindVariableStartPos starting position of the bind variable
     * @return the next starting position.
     */
    protected int getNextStartPos(int commentStartPos, int elseCommentStartPos, int bindVariableStartPos) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Parse the comment.
     */
    protected void parseComment() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Parse the bind variable.
     */
    protected void parseBindVariable() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Parse the ELSE comment.
     */
    protected void parseElse() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Parse the end of the SQL.
     */
    protected void parseEof() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return the bind variable name for the position parameters.
     */
    protected String nextBindVariableName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    //	@Override
    public String skipToken() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    //	@Override
    public String skipWhitespace() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private int skipWhitespace(int position) {
        int index = sql.length();
        for (int i = position; i < sql.length(); ++i) {
            char c = sql.charAt(i);
            if (!Character.isWhitespace(c)) {
                index = i;
                break;
            }
        }
        return index;
    }
}
