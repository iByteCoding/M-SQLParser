package org.ibyte.sql.parser.sql.constant;
import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import java.util.TreeSet;

/**
 * 逻辑运算符
 */
public enum LogicalOperator {

    AND("AND", "&&"),
    OR("OR", "||");

    private final Collection<String> texts = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);

    LogicalOperator(final String... texts) {
        this.texts.addAll(Arrays.asList(texts));
    }

    /**
     * 从文本中获取逻辑运算符值。
     *
     * @param text 文本
     * @return 逻辑算符值
     */
    public static Optional<LogicalOperator> valueFrom(final String text) {
        for (LogicalOperator each : LogicalOperator.values()) {
            if (each.texts.contains(text)) {
                return Optional.of(each);
            }
        }
        return Optional.empty();
    }
}

