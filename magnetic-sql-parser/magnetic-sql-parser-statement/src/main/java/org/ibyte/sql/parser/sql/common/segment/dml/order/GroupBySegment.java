package org.ibyte.sql.parser.sql.common.segment.dml.order;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.ibyte.sql.parser.sql.SQLSegment;
import org.ibyte.sql.parser.sql.common.segment.dml.order.item.OrderByItemSegment;

import java.util.Collection;

/**
 * Group By Segment.
 */
@RequiredArgsConstructor
@Getter
public final class GroupBySegment implements SQLSegment {

    private final int startIndex;

    private final int stopIndex;

    private final Collection<OrderByItemSegment> groupByItems;

}
