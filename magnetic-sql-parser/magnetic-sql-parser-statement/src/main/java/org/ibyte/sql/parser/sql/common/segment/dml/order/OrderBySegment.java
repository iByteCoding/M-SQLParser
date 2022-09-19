package org.ibyte.sql.parser.sql.common.segment.dml.order;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.ibyte.sql.parser.sql.SQLSegment;
import org.ibyte.sql.parser.sql.common.segment.dml.order.item.OrderByItemSegment;

import java.util.Collection;

/**
 * order by segment.
 */
@RequiredArgsConstructor
@Getter
public final class OrderBySegment implements SQLSegment {

    private final int startIndex;

    private final int stopIndex;

    private final Collection<OrderByItemSegment> orderByItems;
}
