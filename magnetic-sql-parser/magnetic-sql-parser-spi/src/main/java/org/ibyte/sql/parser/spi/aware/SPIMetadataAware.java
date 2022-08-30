package org.ibyte.sql.parser.spi.aware;

import java.util.Collection;

public interface SPIMetadataAware {

    /**
     * 获取受支持的数据库类型。
     */
    Collection<String> getSupportedDatabaseTypes();

    /**
     * 描述。
     */
    String getDescription();
}
