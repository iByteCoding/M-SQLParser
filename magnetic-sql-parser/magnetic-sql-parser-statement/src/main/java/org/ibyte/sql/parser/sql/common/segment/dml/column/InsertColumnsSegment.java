package org.ibyte.sql.parser.sql.common.segment.dml.column;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.ibyte.sql.parser.sql.SQLSegment;

import java.util.Collection;

/**
 * insert columns segment.
 */
@RequiredArgsConstructor
@Getter
public final class InsertColumnsSegment implements SQLSegment {

    private final int startIndex;

    private final int stopIndex;

    private final Collection<ColumnSegment> columns;

}
