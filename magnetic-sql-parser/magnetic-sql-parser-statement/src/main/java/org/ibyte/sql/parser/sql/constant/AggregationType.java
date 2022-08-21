package org.ibyte.sql.parser.sql.constant;

/**
 * 聚合函数枚举类
 */
public enum AggregationType {

    MAX, MIN, SUM, COUNT, AVG;

    /**
     * 是聚合函数
     * @param aggregationType 聚合函数类型
     * @return 是否为聚合函数
     */
    public static boolean isAggregationType(final String aggregationType) {
        for (AggregationType each : AggregationType.values()) {
            if (aggregationType.equalsIgnoreCase(each.name())) {
                return true;
            }
        }
        return false;
    }
}

