package org.ibyte.sql.parser.sql.common.segment.dml.assignment;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.ibyte.sql.parser.sql.SQLSegment;
import org.ibyte.sql.parser.sql.common.segment.expr.ExpressionSegment;

import java.util.List;

/**
 * insert values segment.
 */
@RequiredArgsConstructor
@Getter
public final class InsertValuesSegment implements SQLSegment {

    private final int startIndex;

    private final int stopIndex;

    private final List<ExpressionSegment> values;
}
