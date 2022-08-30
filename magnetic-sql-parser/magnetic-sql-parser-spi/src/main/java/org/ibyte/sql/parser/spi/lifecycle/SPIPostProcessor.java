package org.ibyte.sql.parser.spi.lifecycle;

import java.util.Properties;

public interface SPIPostProcessor {

    /**
     * Initialize SPI.
     */
    void init(Properties props);
}
