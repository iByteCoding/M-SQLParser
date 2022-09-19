package org.ibyte.sql.parser.sql.common.statement.dml;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.ibyte.sql.parser.sql.common.segment.dml.item.ProjectionsSegment;
import org.ibyte.sql.parser.sql.common.statement.AbstractSQLStatement;

/**
 * select statement.
 */
@Getter
@Setter
@ToString
public final class SelectStatement extends AbstractSQLStatement implements DMLStatement{

    private final ProjectionsSegment projections;
}
