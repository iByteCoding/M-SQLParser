package org.ibyte.sql.parser.sql.common.segment.ddl.column.position;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.ibyte.sql.parser.sql.SQLSegment;

@RequiredArgsConstructor
@Getter
public abstract class ColumnPositionSegment implements SQLSegment, Comparable<ColumnPositionSegment> {

    private final int startIndex;

    private final int stopIndex;

    @Override
    public int compareTo(final ColumnPositionSegment o) {
        return startIndex - o.startIndex;
    }
}
