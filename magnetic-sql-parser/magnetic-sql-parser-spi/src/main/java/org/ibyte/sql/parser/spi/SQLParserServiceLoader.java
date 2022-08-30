package org.ibyte.sql.parser.spi;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;
import org.ibyte.sql.parser.spi.annotation.SingletonSPI;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * SQL Parser Service Loader
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SQLParserServiceLoader {

    private static final Map<Class<?>, Collection<Object>> SERVICES = new ConcurrentHashMap<>();

    /**
     * 注册服务
     *
     * @param serviceInterface 服务接口
     */
    public static void register(final Class<?> serviceInterface) {
        if (!SERVICES.containsKey(serviceInterface)) {
            SERVICES.put(serviceInterface, load(serviceInterface));
        }
    }

    private static <T> Collection<Object> load(final Class<T> serviceInterface) {
        Collection<Object> result = new LinkedList<>();
        for (T each : ServiceLoader.load(serviceInterface)) {
            result.add(each);
        }
        return result;
    }

    /**
     * 获取服务实例
     *
     * @param serviceInterface  服务接口
     * @param <T> 类型
     */
    public static <T> Collection<T> getServiceInstances(final Class<T> serviceInterface) {
        return null == serviceInterface.getAnnotation(SingletonSPI.class)
                ? createNewServiceInstances(serviceInterface)
                : getSingletonServiceInstances(serviceInterface);
    }

    @SneakyThrows(ReflectiveOperationException.class)
    @SuppressWarnings("unchecked")
    private static <T> Collection<T> createNewServiceInstances(final Class<T> serviceInterface){
        if (!SERVICES.containsKey(serviceInterface)){
            return Collections.emptyList();
        }
        Collection<Object> services = SERVICES.get(serviceInterface);
        Collection<T> result = new LinkedList<>();
        for (Object each : services) {
            result.add((T) each.getClass().getDeclaredConstructor().newInstance());
        }
        return result;
    }

    @SuppressWarnings("unchecked")
    private static <T> Collection<T> getSingletonServiceInstances(final Class<T> serviceInterface) {
        return (Collection<T>) SERVICES.getOrDefault(serviceInterface, Collections.emptyList());
    }



}
