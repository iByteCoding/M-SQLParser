package org.ibyte.sql.parser.sql.segment.expr.subquery;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.ibyte.sql.parser.sql.SQLSegment;
import org.ibyte.sql.parser.sql.segment.dml.predicate.value.PredicateRightValue;

@RequiredArgsConstructor
@Getter
@ToString
public final class SubquerySegment implements SQLSegment, PredicateRightValue {

    private final int startIndex;

    private final int stopIndex;
}
