package org.ibyte.sql.parser.sql.segment.generic.table;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.ibyte.sql.parser.sql.SQLSegment;
import org.ibyte.sql.parser.sql.value.identifier.IdentifierValue;

/**
 * table Name segment.
 */
@RequiredArgsConstructor
@Getter
public class TableNameSegment implements SQLSegment {

    private final int startIndex;

    private final int stopIndex;

    private final IdentifierValue identifier;
}
