package org.ibyte.sql.parser.sql.segment.dal;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.ibyte.sql.parser.sql.SQLSegment;
import org.ibyte.sql.parser.sql.segment.generic.RemoveAvailable;

/**
 * Form table segment.
 */
@RequiredArgsConstructor
@Getter
public class FromSchemaSegment implements SQLSegment, RemoveAvailable {

    private int startIndex;

    private int stopIndex;
}
