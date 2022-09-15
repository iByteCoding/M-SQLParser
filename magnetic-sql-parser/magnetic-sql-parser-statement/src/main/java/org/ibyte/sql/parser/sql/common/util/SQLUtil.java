package org.ibyte.sql.parser.sql.common.util;

import com.google.common.base.CharMatcher;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;

import java.util.regex.Pattern;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public final class SQLUtil {

    private static final String SQL_END = ";";

    private static final String COMMENT_PREFIX = "/*";

    private static final String COMMENT_SUFFIX = "*/";

    private static final String EXCLUDED_CHARACTERS = "[]`'\"";

    private static final Pattern SINGLE_CHARACTER_PATTERN = Pattern.compile("^_|([^\\\\])_");

    private static final Pattern SINGLE_CHARACTER_ESCAPE_PATTERN = Pattern.compile("\\\\_");

    private static final Pattern ANY_CHARACTER_PATTERN = Pattern.compile("^%|([^\\\\])%");

    private static final Pattern ANY_CHARACTER_ESCAPE_PATTERN = Pattern.compile("\\\\%");

    /**
     * 获取SQL表达式的精确值。
     * @param value SQL 表达式
     */
    public static String getExactlyValue(final String value) {
        return null == value ? null : CharMatcher.anyOf("[]`'\"").removeFrom(value);
    }

    public static String getExactlyValue(final String value, final String reservedCharacters) {
        if (null == value) {
            return null;
        }
        String toBeExcludedCharacters = CharMatcher.anyOf(reservedCharacters).removeFrom(EXCLUDED_CHARACTERS);
        return CharMatcher.anyOf(toBeExcludedCharacters).removeFrom(value);
    }
}
