package org.ibyte.sql.parser.spi;

import java.util.Properties;

public interface TypeBasedSPI {

    /**
     * 获取类型
     */
    String getType();

    /**
     * 获取 Properties
     */
    Properties getProperties();

    /**
     * 设置 Properties
     */
    void setProperties();
}
