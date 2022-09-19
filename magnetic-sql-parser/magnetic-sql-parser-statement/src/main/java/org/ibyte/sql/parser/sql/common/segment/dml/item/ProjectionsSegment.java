package org.ibyte.sql.parser.sql.common.segment.dml.item;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.ibyte.sql.parser.sql.SQLSegment;

import java.util.Collection;
import java.util.LinkedList;

/**
 * projections segment.
 */
@RequiredArgsConstructor
@Getter
public final class ProjectionsSegment implements SQLSegment {

    private final int startIndex;

    private final int stopIndex;

    @Setter
    private boolean distinctRow;

    private final Collection<ProjectionsSegment> projections = new LinkedList<>();
}
