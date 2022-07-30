package org.ibyte.sql.parser.sql.segment.dal;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.ibyte.sql.parser.sql.SQLSegment;

/**
 * From table segment.
 */
@RequiredArgsConstructor
@Getter
public final class FromTableSegment implements SQLSegment {

    private final int startIndex;

    private final int stopIndex;

}
