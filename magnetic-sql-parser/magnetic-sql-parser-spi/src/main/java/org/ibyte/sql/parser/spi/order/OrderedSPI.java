package org.ibyte.sql.parser.spi.order;
public interface OrderedSPI<T> {

    int getOrder();

    Class<T> getTypeClass();
}
