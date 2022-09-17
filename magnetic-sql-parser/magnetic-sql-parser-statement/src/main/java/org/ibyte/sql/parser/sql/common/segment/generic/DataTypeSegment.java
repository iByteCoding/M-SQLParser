package org.ibyte.sql.parser.sql.common.segment.generic;

import lombok.Getter;
import lombok.Setter;
import org.ibyte.sql.parser.sql.common.segment.expr.ExpressionSegment;

@Getter
@Setter
public final class DataTypeSegment implements ExpressionSegment {

    private int startIndex;

    private int stopIndex;

    private String dataTypeName;
}

