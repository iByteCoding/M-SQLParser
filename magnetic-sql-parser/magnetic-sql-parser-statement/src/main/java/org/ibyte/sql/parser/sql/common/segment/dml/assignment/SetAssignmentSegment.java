package org.ibyte.sql.parser.sql.common.segment.dml.assignment;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.ibyte.sql.parser.sql.SQLSegment;

import java.util.Collection;

/**
 * set assignment segment.
 */
@RequiredArgsConstructor
@Getter
public final class SetAssignmentSegment implements SQLSegment {

    private final int startIndex;

    private final int stopIndex;

    private final Collection<AssignmentSegment> values;
}
