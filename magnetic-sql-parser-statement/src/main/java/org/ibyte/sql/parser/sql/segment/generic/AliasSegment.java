package org.ibyte.sql.parser.sql.segment.generic;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.ibyte.sql.parser.sql.SQLSegment;
import org.ibyte.sql.parser.sql.value.identifier.IdentifierValue;

/**
 * Alias segment.
 */
@RequiredArgsConstructor
@Getter
public class AliasSegment implements SQLSegment {

    private final int startIndex;

    private final int stopIndex;

    private final IdentifierValue identifier;
}
