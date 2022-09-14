package org.ibyte.sql.parser.sql.common.segment.expr.comples;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class CommonExpressionSegment implements ComplexExpressionSegment{

    private final int startIndex;

    private final int stopIndex;

    private final String text;
}
