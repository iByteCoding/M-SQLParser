package org.ibyte.sql.parser.spi.type.typed;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.ibyte.sql.parser.spi.SQLParserServiceLoader;

import java.util.Optional;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class TypedSPIRegistry {

    /**
     * 找到注册服务。
     *
     * @param spiClass 拓展类型
     * @param type     类型
     * @param <T>      SPI类类型
     */
    public static <T extends TypedSPI> Optional<T> findRegisteredService(final Class<T> spiClass, final String type) {
        for (T instance : SQLParserServiceLoader.getServiceInstances(spiClass)) {
            if (matchesType(type,instance)){
                return Optional.of(instance);
            }
        }
        return Optional.empty();
    }

    private static boolean matchesType(final String type, final TypedSPI instance) {
        return instance.getType().equalsIgnoreCase(type) || instance.getTypeAliases().contains(type);
    }
}
