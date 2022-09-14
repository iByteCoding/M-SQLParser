package org.ibyte.sql.parser.sql.common.constant;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * 括号的SQL
 */
@RequiredArgsConstructor
@Getter
public enum Paren {

    PARENTHESES('(', ')'), BRACKET('[', ']'), BRACES('{', '}');

    private final char leftParen;

    private final char rightParen;

    /**
     * 判断通过的符号是否为左括号
     */
    public static boolean isLeftParen(final char token) {
        for (Paren each : Paren.values()) {
            if (each.leftParen == token) {
                return true;
            }
        }
        return false;
    }

    /**
     * 判断左括号是否匹配右括号
     */
    public static boolean match(final char leftToken, final char rightToken) {
        for (Paren each : Paren.values()) {
            if (each.leftParen == leftToken && each.rightParen == rightToken) {
                return true;
            }
        }
        return false;
    }
}
