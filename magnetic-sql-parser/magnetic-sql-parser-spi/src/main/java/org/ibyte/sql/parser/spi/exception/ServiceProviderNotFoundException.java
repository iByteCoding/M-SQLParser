package org.ibyte.sql.parser.spi.exception;

public final class ServiceProviderNotFoundException extends SQLParserSPIException{

    private static final long serialVersionUID = -3730257541332863236L;

    private static final int ERROR_CODE = 1;

    public ServiceProviderNotFoundException(final Class<?> clazz) {
        super(ERROR_CODE, String.format("No implementation class load from SPI `%s`.", clazz.getName()));
    }

    public ServiceProviderNotFoundException(final Class<?> clazz, final String type) {
        super(ERROR_CODE, String.format("No implementation class load from SPI `%s` with type `%s`.", clazz.getName(), type));
    }
}
