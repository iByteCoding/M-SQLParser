package org.ibyte.sql.parser.sql.common.segment.expr.subquery;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.ibyte.sql.parser.sql.SQLSegment;

@RequiredArgsConstructor
@Getter
@ToString
public final class SubquerySegment implements SQLSegment{

    private final int startIndex;

    private final int stopIndex;
}
