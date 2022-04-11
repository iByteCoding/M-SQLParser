package org.ibyte.sql.parser.binder.accessor.type;

import java.sql.Types;
import java.util.EnumSet;

/**
 * SQLParser 常用解析数据类型
 * <p>
 * 不支持类型可以自行拓展补充并实现相关数据转化逻辑
 */
public enum JdbcType {

    /**
     * 数值型
     */
    BIT(Types.BIT),
    TINYINT(Types.TINYINT),
    SMALLINT(Types.SMALLINT),
    INTEGER(Types.INTEGER),
    BIGINT(Types.BIGINT),

    /**
     * 浮点型
     */
    FLOAT(Types.FLOAT),
    REAL(Types.REAL),
    DOUBLE(Types.DOUBLE),
    NUMERIC(Types.NUMERIC),
    DECIMAL(Types.DECIMAL),

    /**
     * 字符型
     */
    CHAR(Types.CHAR),
    VARCHAR(Types.VARCHAR),
    LONGVARCHAR(Types.LONGVARCHAR),

    /**
     * 日期型
     */
    DATE(Types.DATE),
    TIME(Types.TIME),
    TIMESTAMP(Types.TIMESTAMP),

    /**
     * 二进制数据以及非常用拓展类型
     */
    BINARY(Types.BINARY),
    VARBINARY(Types.VARBINARY),
    LONGVARBINARY(Types.LONGVARBINARY),
    NULL(Types.NULL),
    OTHER(Types.OTHER),
    JAVA_OBJECT(Types.JAVA_OBJECT),
    DISTINCT(Types.DISTINCT),
    STRUCT(Types.STRUCT),
    ARRAY(Types.ARRAY),
    BLOB(Types.BLOB),
    CLOB(Types.CLOB),
    REF(Types.REF),
    DATALINK(Types.DATALINK),
    BOOLEAN(Types.BOOLEAN),
    ROWID(Types.ROWID),
    NCHAR(Types.NCHAR),
    NVARCHAR(Types.NVARCHAR),
    LONGNVARCHAR(Types.LONGNVARCHAR),
    NCLOB(Types.NCLOB),
    SQLXML(Types.SQLXML),
    REF_CURSOR(2012),
    TIME_WITH_TIMEZONE(2013),
    TIMESTAMP_WITH_TIMEZONE(2014),

    UNKNOWN(Integer.MIN_VALUE);

    JdbcType() {
    }

    JdbcType(int code) {
        this.code = code;
    }

    private int code;

    public static final JdbcType ofCode(final int code) {
        EnumSet<JdbcType> es = EnumSet.allOf(JdbcType.class);
        for (JdbcType type : es) {
            if (type.code == code) {
                return type;
            }
        }
        return UNKNOWN;
    }

}
