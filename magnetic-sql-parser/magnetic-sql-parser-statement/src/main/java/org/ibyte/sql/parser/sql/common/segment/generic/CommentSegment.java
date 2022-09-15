package org.ibyte.sql.parser.sql.common.segment.generic;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.ibyte.sql.parser.sql.SQLSegment;

/**
 * Comment Segment
 */
@RequiredArgsConstructor
@Getter
public class CommentSegment implements SQLSegment {

    private final String text;

    private final int startIndex;

    private final int stopIndex;
}
