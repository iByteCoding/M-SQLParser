package org.ibyte.sql.parser.binder.processor.converter;

/**
 * 未实现转化函数
 * <p>
 * 默认支持转化类
 */
public class NoopConverter implements Converter<Object, Object> {

    public static final NoopConverter INSTANCE = new NoopConverter();

    @Override
    public Object apply(Object input) {
        return input;
    }
}
