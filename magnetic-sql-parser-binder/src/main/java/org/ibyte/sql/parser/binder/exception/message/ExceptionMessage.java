package org.ibyte.sql.parser.binder.exception.message;

/**
 * 参数消息
 */
public class ExceptionMessage {

    private volatile String template;
    private Object[] args = null;

    public ExceptionMessage() {
    }

    public ExceptionMessage(String template) {
        this.template = template;
    }

    public ExceptionMessage(String template, Object... args) {
        this.template = template;
        this.args = args;
    }

    public String getMessage() {
        if (template != null) {
            return template + args;
        }
        return "";
    }

    @Override
    public String toString() {
        return getMessage();
    }
}
