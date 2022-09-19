package org.ibyte.sql.parser.sql.common.segment.generic;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.ibyte.sql.parser.sql.SQLSegment;
import org.ibyte.sql.parser.sql.common.segment.dml.order.item.OrderByItemSegment;
import org.ibyte.sql.parser.sql.common.segment.expr.subquery.SubquerySegment;

import java.util.LinkedList;
import java.util.List;

/**
 * Model Segment
 */
@RequiredArgsConstructor
@Getter
public final class ModelSegment implements SQLSegment {

    private final int startIndex;

    private final int stopIndex;

    private final List<SubquerySegment> referenceModelSelect = new LinkedList<>();

    private final List<OrderByItemSegment> orderBySegments = new LinkedList<>();
}
