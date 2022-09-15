package org.ibyte.sql.parser.sql.common.segment.generic;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.ibyte.sql.parser.sql.SQLSegment;
import org.ibyte.sql.parser.sql.common.value.identifier.IdentifierValue;

@RequiredArgsConstructor
@Getter
public final class DatabaseSegment implements SQLSegment {

    private final int startIndex;

    private final int stopIndex;

    private final IdentifierValue identifierValue;

}
