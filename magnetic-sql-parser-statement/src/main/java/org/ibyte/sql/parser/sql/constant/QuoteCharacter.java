package org.ibyte.sql.parser.sql.constant;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

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
        if (value == null || value.isEmpty()) {
            return QuoteCharacter.NONE;
        }
        for (QuoteCharacter each : QuoteCharacter.values()) {
            if (QuoteCharacter.NONE != each && each.startDelimiter.charAt(0) == value.charAt(0)) {
                return each;
            }
        }
        return QuoteCharacter.NONE;
    }
}
