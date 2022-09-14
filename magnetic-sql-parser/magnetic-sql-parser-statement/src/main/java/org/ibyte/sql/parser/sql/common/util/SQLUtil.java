package org.ibyte.sql.parser.sql.common.util;

import com.google.common.base.CharMatcher;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public final class SQLUtil {

    /**
     * 获取SQL表达式的精确值。
     * @param value SQL 表达式
     */
    public static String getExactlyValue(final String value) {
        return null == value ? null : CharMatcher.anyOf("[]`'\"").removeFrom(value);
    }
}
