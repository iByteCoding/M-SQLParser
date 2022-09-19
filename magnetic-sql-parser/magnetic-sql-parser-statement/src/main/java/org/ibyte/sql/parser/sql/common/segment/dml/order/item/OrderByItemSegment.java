package org.ibyte.sql.parser.sql.common.segment.dml.order.item;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.ibyte.sql.parser.sql.SQLSegment;

/**
 * order by item segment.
 */
@RequiredArgsConstructor
@Getter
public final class OrderByItemSegment implements SQLSegment {

    private final int startIndex;

    private final int stopIndex;

}
