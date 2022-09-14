package org.ibyte.sql.parser.sql.common.segment.dal;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.ibyte.sql.parser.sql.SQLSegment;

/**
 * Variable segment
 */
@RequiredArgsConstructor
@Getter
public final class VariableSegment implements SQLSegment {

    private final int startIndex;

    private final int stopIndex;

    private final String variable;
}
