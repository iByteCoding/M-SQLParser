package org.ibyte.sql.parser.sql.common.constant;


import com.google.common.base.Strings;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;

/**
 * 引用字符
 */
@RequiredArgsConstructor
@Getter
public enum QuoteCharacter {

    BACK_QUOTE("`", "`"),

    SINGLE_QUOTE("'", "'"),

    QUOTE("\"", "\""),

    BRACKETS("[", "]"),

    NONE("", "");

    private final String startDelimiter;

    private final String endDelimiter;

    /**
     * 获取引用字符
     */
    public static QuoteCharacter getQuoteCharacter(final String value) {
        if (Strings.isNullOrEmpty(value)) {
            return NONE;
        }
        return Arrays.stream(values()).filter(each -> NONE != each && each.startDelimiter.charAt(0) == value.charAt(0)).findFirst().orElse(NONE);
    }

    /**
     * 获取包装后字符串
     */
    public String wrap(final String value) {
        return startDelimiter + value + endDelimiter;
    }
}
