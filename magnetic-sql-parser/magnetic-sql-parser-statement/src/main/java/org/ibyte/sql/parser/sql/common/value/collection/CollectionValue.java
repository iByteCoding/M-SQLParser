package org.ibyte.sql.parser.sql.common.value.collection;

import lombok.Getter;
import org.ibyte.sql.parser.sql.common.value.ValueASTNode;

import java.util.Collection;
import java.util.LinkedList;

@Getter
public final class CollectionValue<T> implements ValueASTNode<Collection> {

    private final Collection<T> value = new LinkedList<>();

    /**
     * 将另一个定义数据中的所有值放入这个定义数据中。
     * @param collectionValue 集合值
     */
    public void combine(final CollectionValue<T> collectionValue) {
        value.addAll(collectionValue.getValue());
    }
}
