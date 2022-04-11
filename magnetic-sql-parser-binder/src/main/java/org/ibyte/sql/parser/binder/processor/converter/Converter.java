package org.ibyte.sql.parser.binder.processor.converter;

import java.util.Objects;
import java.util.function.Function;

/**
 * 转化函数
 *
 * @param <R>
 * @param <T>
 */
@FunctionalInterface
public interface Converter<R, T> extends Function<R, T> {

}
