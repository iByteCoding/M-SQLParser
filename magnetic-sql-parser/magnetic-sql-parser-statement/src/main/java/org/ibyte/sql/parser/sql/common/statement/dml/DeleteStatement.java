package org.ibyte.sql.parser.sql.common.statement.dml;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.ibyte.sql.parser.sql.common.segment.dml.predicate.WhereSegment;
import org.ibyte.sql.parser.sql.common.segment.generic.table.TableSegment;
import org.ibyte.sql.parser.sql.common.statement.AbstractSQLStatement;

import java.util.Optional;

/**
 * Delete statement.
 */
@Setter
@ToString
public abstract class DeleteStatement extends AbstractSQLStatement implements DMLStatement{

    @Getter
    private TableSegment tableSegment;

    private WhereSegment where;

    /**
     * @return
     */
    public Optional<WhereSegment> getWhere(){
        return Optional.ofNullable(where);
    }
}
