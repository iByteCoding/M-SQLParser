package org.ibyte.sql.parser.spi.type.ordered.cache;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.lang.ref.SoftReference;
import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 缓存策略
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class OrderedServiceCache {

    private static volatile SoftReference<Map<Key, Map<?, ?>>> softCache = new SoftReference<>(new ConcurrentHashMap<>(128));

    /**
     * 查找缓存实例
     *
     * @param spiClass 拓展类
     * @param types    拓展类型
     */
    public static Optional<Map<?, ?>> findCachedServices(final Class<?> spiClass, final Collection<?> types) {
        return Optional.ofNullable(softCache.get()).map(optional -> optional.get(new Key(spiClass, types)));
    }

    /**
     * 缓存实例
     *
     * @param spiClass SPI Class
     * @param types    拓展类型
     * @param services 缓存实例
     */
    public static void cacheService(final Class<?> spiClass, final Collection<?> types, final Map<?, ?> services) {
        Map<Key, Map<?, ?>> cache = softCache.get();
        if (null == cache) {
            synchronized (OrderedServiceCache.class) {
                cache = softCache.get();
                if (null == cache){
                    cache = new ConcurrentHashMap<>(128);
                    softCache = new SoftReference<>(cache);
                }
            }
        }
    }


    @RequiredArgsConstructor
    @EqualsAndHashCode
    private static final class Key {

        private final Class<?> clazz;

        private final Collection<?> types;
    }
}
