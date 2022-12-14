package org.ibyte.sql.parser.exception.message;

/**
 * 数值转化异常
 */
public class ValueConvertException extends RuntimeException {

    public ValueConvertException() {
        super();
    }

    public ValueConvertException(String message) {
        super(message);
    }

    public ValueConvertException(String message, Throwable cause) {
        super(message, cause);
    }

    public ValueConvertException(Throwable cause) {
        super(cause);
    }
}
