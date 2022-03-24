package org.ibyte.sql.parser.binder.exception;

import org.ibyte.sql.parser.binder.exception.message.ExceptionMessage;

/**
 * 非法值异常
 */
public class IllegalValueException extends RuntimeException {

    public IllegalValueException() {
        super();
    }

    public IllegalValueException(ExceptionMessage message) {
        super(message.getMessage());
    }

    public IllegalValueException(String message) {
        super(message);
    }

    public IllegalValueException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalValueException(Throwable cause) {
        super(cause);
    }
}
