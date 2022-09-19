package org.ibyte.sql.parser.sql.common.segment.dml.predicate;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.ibyte.sql.parser.sql.SQLSegment;
import org.ibyte.sql.parser.sql.common.segment.expr.ExpressionSegment;

/**
 * having segmentø.
 */
@RequiredArgsConstructor
@Getter
@Setter
public final class HavingSegment implements SQLSegment {

    private final int startIndex;

    private final int stopIndex;

    private final ExpressionSegment expr;

}
