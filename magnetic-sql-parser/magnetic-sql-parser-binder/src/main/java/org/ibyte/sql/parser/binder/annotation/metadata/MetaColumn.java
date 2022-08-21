package org.ibyte.sql.parser.binder.annotation.metadata;

import org.ibyte.sql.parser.binder.processor.converter.NoopConverter;
import org.ibyte.sql.parser.binder.accessor.type.JdbcType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static org.ibyte.sql.parser.binder.accessor.type.JdbcType.UNKNOWN;

/**
 * 列属性申明注解
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.METHOD})
public @interface MetaColumn {
    /**
     * 标注值
     */
    String[] value() default {};

    /**
     * 列对应的JDBC类型
     */
    JdbcType jdbcType() default UNKNOWN;

    /**
     * 类型转换器
     */
    Class<?> converter() default NoopConverter.class;
}