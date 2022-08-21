package org.ibyte.sql.parser.sql.segment.ddl.index;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.ibyte.sql.parser.sql.SQLSegment;
import org.ibyte.sql.parser.sql.value.identifier.IdentifierValue;

/**
 * 索引声明
 */
@RequiredArgsConstructor
@Getter
public class IndexSegment implements SQLSegment {

    private final int startIndex;

    private final int stopIndex;

    private final IdentifierValue identifier;

}
