package org.ibyte.sql.parser.spi.type.ordered;
public interface OrderedSPI<T> {

    int getOrder();

    Class<T> getTypeClass();
}
