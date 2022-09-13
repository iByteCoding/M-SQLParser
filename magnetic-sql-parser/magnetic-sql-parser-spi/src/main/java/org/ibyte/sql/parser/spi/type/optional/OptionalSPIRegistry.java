package org.ibyte.sql.parser.spi.type.optional;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.ibyte.sql.parser.spi.SQLParserServiceLoader;

import java.util.Optional;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class OptionalSPIRegistry {

    /**
     * 查找可选择拓展实例
     *
     * @param spiClass 拓展声明
     */
    public static <T extends OptionalSPI> Optional<T> findRegistryService(final Class<T> spiClass) {
        return SQLParserServiceLoader.getServiceInstances(spiClass).stream().findFirst();
    }
}
