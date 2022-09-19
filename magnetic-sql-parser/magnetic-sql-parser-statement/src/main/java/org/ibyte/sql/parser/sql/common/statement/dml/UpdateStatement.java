package org.ibyte.sql.parser.sql.common.statement.dml;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.ibyte.sql.parser.sql.common.segment.generic.table.TableSegment;
import org.ibyte.sql.parser.sql.common.statement.AbstractSQLStatement;

/**
 * update statement.
 */
@Getter
@Setter
@ToString
public abstract class UpdateStatement extends AbstractSQLStatement implements DMLStatement {

    private TableSegment tableSegment;
}
