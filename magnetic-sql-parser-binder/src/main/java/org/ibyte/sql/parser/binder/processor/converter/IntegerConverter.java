package org.ibyte.sql.parser.binder.processor.converter;

import org.ibyte.sql.parser.binder.util.Numbers;
import org.ibyte.sql.parser.exception.message.ValueConvertException;

/**
 * 数值转化器
 */
public class IntegerConverter implements Converter<Object, Integer> {

    public static final IntegerConverter INSTANCE = new IntegerConverter();

    @Override
    public Integer apply(Object input) {
        if (input == null) {
            return 0;
        }
        if (input instanceof Boolean) {
            return (Boolean) input ? 1 : 0;
        }
        if (input instanceof Number) {
            return Numbers.convertNumberToTargetClass((Number) input, Integer.class);
        }
        if (input instanceof String) {
            Number number = Numbers.createNumber(input.toString());
            return Numbers.convertNumberToTargetClass(number, Integer.class);
        }
        throw new ValueConvertException("Can't cast " + input + " to java.lang.Integer");
    }
}
