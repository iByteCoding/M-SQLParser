package org.ibyte.sql.parser.spi.type.required;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.ibyte.sql.parser.spi.SQLParserServiceLoader;
import org.ibyte.sql.parser.spi.exception.ServiceProviderNotFoundException;

import java.util.Collection;

/**
 * 约定拓展注册管理
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class RequiredSPIRegistry {

    /**
     * 获取注册实例
     *
     * @param spiClass 拓展实现
     * @param <T> SPI 拓展类型
     */
    public static <T extends RequiredSPI> T getRegisteredService(final Class<T> spiClass) {
        Collection<T> services = SQLParserServiceLoader.getServiceInstances(spiClass);
        if (services.isEmpty()){
            throw new ServiceProviderNotFoundException(spiClass);
        }
        if (1 == services.size()){
            return services.iterator().next();
        }
        return services.stream().filter(RequiredSPI::isDefault).findFirst().orElseGet(()->services.iterator().next());
    }
}
