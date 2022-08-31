package org.ibyte.sql.parser.spi.order;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.*;

@NoArgsConstructor(access =  AccessLevel.PRIVATE)
public class OrderedSPIRegistry {

    /**
     * 按类类型获取注册服务.
     *
     * @param spiClass 有序SPI类
     * @param types 类型
     * @param <T> 有序SPI类的类型
     * @return 注册服务
     */
    public static <T extends OrderedSPI<?>> Map<Class<?>, T> getRegisteredServicesByClass(final Class<T> spiClass, final Collection<Class<?>> types) {
        return (Map<Class<?>, T>) Collections.emptyList();
    }


}
