package org.ibyte.sql.parser.binder.processor.converter;

/**
 * 布尔转换器
 */
public class BooleanConverter implements Converter<Object, Boolean> {

    public static final BooleanConverter INSTANCE = new BooleanConverter();

    @Override
    public Boolean apply(Object input) {
        return null;
    }
}
