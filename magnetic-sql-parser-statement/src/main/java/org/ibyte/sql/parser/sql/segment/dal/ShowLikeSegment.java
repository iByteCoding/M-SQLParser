package org.ibyte.sql.parser.sql.segment.dal;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.ibyte.sql.parser.sql.SQLSegment;

/**
 * show like segment.
 */
@RequiredArgsConstructor
@Getter
public class ShowLikeSegment implements SQLSegment {

    private final int startIndex;

    private final int stopIndex;

    private final String pattern;
}
