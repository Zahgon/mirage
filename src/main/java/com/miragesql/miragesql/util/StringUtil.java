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

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * {@link String}用のユーティリティクラスです。
 *
 * @author higa
 */
public class StringUtil {

    /**
     * 空の文字列の配列です。
     */
    public static final String[] EMPTY_STRINGS = new String[0];

    /**
     */
    protected StringUtil() {
    }

    /**
     * 文字列が<code>null</code>または空文字列なら<code>true</code>を返します。
     *
     * @param text
     *            文字列
     * @return 文字列が<code>null</code>または空文字列なら<code>true</code>
     */
    public static final boolean isEmpty(final String text) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * 文字列が<code>null</code>でも空文字列でもなければ<code>true</code>を返します。
     *
     * @param text
     *            文字列
     * @return 文字列が<code>null</code>でも空文字列でもなければ<code>true</code>
     * @since 2.4.33
     */
    public static final boolean isNotEmpty(final String text) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * 文字列を置き換えます。
     *
     * @param text
     *            テキスト
     * @param fromText
     *            置き換え対象のテキスト
     * @param toText
     *            置き換えるテキスト
     * @return 結果
     */
    public static final String replace(final String text, final String fromText, final String toText) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * 文字列を分割します。
     *
     * @param str
     *            文字列
     * @param delim
     *            分割するためのデリミタ
     * @return 分割された文字列の配列
     */
    public static String[] split(final String str, final String delim) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * 左側の空白を削ります。
     *
     * @param text
     *            テキスト
     * @return 結果の文字列
     */
    public static final String ltrim(final String text) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * 左側の指定した文字列を削ります。
     *
     * @param text
     *            テキスト
     * @param trimText
     *            削るテキスト
     * @return 結果の文字列
     */
    public static final String ltrim(final String text, String trimText) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * 右側の空白を削ります。
     *
     * @param text
     *            テキスト
     * @return 結果の文字列
     */
    public static final String rtrim(final String text) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * 右側の指定した文字列を削ります。
     *
     * @param text
     *            テキスト
     * @param trimText
     *            削る文字列
     * @return 結果の文字列
     */
    public static final String rtrim(final String text, String trimText) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * サフィックスを削ります。
     *
     * @param text
     *            テキスト
     * @param suffix
     *            サフィックス
     * @return 結果の文字列
     */
    public static final String trimSuffix(final String text, final String suffix) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * プレフィックスを削ります。
     *
     * @param text
     *            テキスト
     * @param prefix
     *            プレフィックス
     * @return 結果の文字列
     */
    public static final String trimPrefix(final String text, final String prefix) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * JavaBeansの仕様にしたがってデキャピタライズを行ないます。大文字が2つ以上続く場合は、小文字にならないので注意してください。
     *
     * @param name
     *            名前
     * @return 結果の文字列
     */
    public static String decapitalize(final String name) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * JavaBeansの仕様にしたがってキャピタライズを行ないます。大文字が2つ以上続く場合は、大文字にならないので注意してください。
     *
     * @param name
     *            名前
     * @return 結果の文字列
     */
    public static String capitalize(final String name) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * ブランクかどうか返します。
     *
     * @param str
     *            文字列
     * @return ブランクかどうか
     */
    public static boolean isBlank(final String str) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * ブランクではないかどうか返します。
     *
     * @param str
     *            文字列
     * @return ブランクではないかどうか
     * @see #isBlank(String)
     */
    public static boolean isNotBlank(final String str) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * charを含んでいるかどうか返します。
     *
     * @param str
     *            文字列
     * @param ch
     *            char
     * @return charを含んでいるかどうか
     */
    public static boolean contains(final String str, final char ch) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * 文字列を含んでいるかどうか返します。
     *
     * @param s1
     *            文字列
     * @param s2
     *            比較する対象となる文字列
     * @return 文字列を含んでいるかどうか
     */
    public static boolean contains(final String s1, final String s2) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * 文字列同士が等しいかどうか返します。どちらもnullの場合は、<code>true</code>を返します。
     *
     * @param target1
     *            文字列1
     * @param target2
     *            文字列2
     * @return 文字列同士が等しいかどうか
     */
    public static boolean equals(final String target1, final String target2) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * ケースインセンシティブで文字列同士が等しいかどうか返します。どちらもnullの場合は、<code>true</code>を返します。
     *
     * @param target1
     *            文字列1
     * @param target2
     *            文字列2
     * @return ケースインセンシティブで文字列同士が等しいか
     */
    public static boolean equalsIgnoreCase(final String target1, final String target2) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * ケースインセンシティブで特定の文字で終わっているのかどうかを返します。
     *
     * @param target1
     *            テキスト
     * @param target2
     *            比較する文字列
     * @return ケースインセンシティブで特定の文字で終わっているのかどうか
     */
    public static boolean endsWithIgnoreCase(final String target1, final String target2) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * ケースインセンシティブで特定の文字ではじまっているのかどうかを返します。
     *
     * @param target1
     *            テキスト
     * @param target2
     *            比較する文字列
     * @return ケースインセンシティブで特定の文字ではじまっているのかどうか
     */
    public static boolean startsWithIgnoreCase(final String target1, final String target2) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * 文字列の最後から指定した文字列で始まっている部分より手前を返します。
     *
     * @param str
     *            文字列
     * @param separator
     *            セパレータ
     * @return 結果の文字列
     */
    public static String substringFromLast(final String str, final String separator) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * 文字列の最後から指定した文字列で始まっている部分より後ろを返します。
     *
     * @param str
     *            文字列
     * @param separator
     *            セパレータ
     * @return 結果の文字列
     */
    public static String substringToLast(final String str, final String separator) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * 16進数の文字列に変換します。
     *
     * @param bytes
     *            バイトの配列
     * @return 16進数の文字列
     */
    public static String toHex(final byte[] bytes) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * 16進数の文字列に変換します。
     *
     * @param i
     *            int
     * @return 16進数の文字列
     */
    public static String toHex(final int i) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * 文字列に、数値を16進数に変換した文字列を追加します。
     *
     * @param buf
     *            追加先の文字列
     * @param i
     *            数値
     */
    public static void appendHex(final StringBuffer buf, final byte i) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * 文字列に、数値を16進数に変換した文字列を追加します。
     *
     * @param buf
     *            追加先の文字列
     * @param i
     *            数値
     */
    public static void appendHex(final StringBuffer buf, final int i) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * _記法をキャメル記法に変換します。
     *
     * @param s
     *            テキスト
     * @return 結果の文字列
     */
    public static String camelize(String s) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * キャメル記法を_記法に変換します。
     *
     * @param s
     *            テキスト
     * @return 結果の文字列
     */
    public static String decamelize(final String s) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * 文字列が数値のみで構成されているかどうかを返します。
     *
     * @param s
     *            文字列
     * @return 数値のみで構成されている場合、<code>true</code>
     */
    public static boolean isNumber(final String s) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
