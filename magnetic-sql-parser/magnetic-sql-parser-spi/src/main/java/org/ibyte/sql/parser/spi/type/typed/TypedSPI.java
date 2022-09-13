package org.ibyte.sql.parser.spi.type.typed;

import java.util.Collection;
import java.util.Collections;

/**
 * 类型拓展
 */
public interface TypedSPI {

    /**
     * 获取类型
     *
     * @return 类型
     */
    default String getType() {
        return "";
    }

    /**
     * 获取类型别名
     *
     * @return 类型别名
     */
    default Collection<String> getTypeAliases() {
        return Collections.emptyList();
    }
}
