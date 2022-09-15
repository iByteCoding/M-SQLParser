package org.ibyte.sql.parser.sql.common.statement;

import lombok.Getter;
import lombok.Setter;
import org.ibyte.sql.parser.sql.common.segment.generic.CommentSegment;
import org.ibyte.sql.parser.sql.common.segment.generic.ParameterMarkerSegment;

import java.util.Collection;
import java.util.LinkedList;

/**
 * SQL statement abstract class.
 */
@Getter
public class AbstractSQLStatement implements SQLStatement {

    private int parameterCount;

    private final Collection<ParameterMarkerSegment> parameterMarkerSegments = new LinkedList<>();

    private final Collection<CommentSegment> commentSegments = new LinkedList<>();
}
