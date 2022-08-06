package org.ibyte.sql.parser.sql.segment.ddl.constraint;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.ibyte.sql.parser.sql.SQLSegment;

/**
 * Drop Primary Key segment.
 */
@RequiredArgsConstructor
@Getter
public class DropPrimaryKeySegment implements SQLSegment {

    private final int startIndex;

    private final int stopIndex;
}
