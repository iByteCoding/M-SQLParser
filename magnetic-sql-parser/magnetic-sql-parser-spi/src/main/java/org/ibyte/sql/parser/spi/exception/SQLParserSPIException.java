package org.ibyte.sql.parser.spi.exception;

public class SQLParserSPIException extends RuntimeException {

    private static final long serialVersionUID = -3044979409127407014L;

    public SQLParserSPIException(final int errorCode, final String message) {
        super(createErrorMessage(errorCode, message));
    }

    private static String createErrorMessage(final int errorCode, final String message) {
        return String.format("SPI-%05d: %s", errorCode, message);
    }
}
