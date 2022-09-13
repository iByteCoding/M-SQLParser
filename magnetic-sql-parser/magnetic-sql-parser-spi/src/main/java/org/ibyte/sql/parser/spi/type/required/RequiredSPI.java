package org.ibyte.sql.parser.spi.type.required;

/**
 * 约定拓展
 */
public interface RequiredSPI {

    /**
     * 判读是否是默认拓展接口
     */
    default boolean isDefault() {
        return false;
    }
}
