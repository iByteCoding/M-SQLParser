package org.ibyte.sql.parser.sql.common.statement.dml;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.ibyte.sql.parser.sql.common.segment.dml.item.ProjectionsSegment;
import org.ibyte.sql.parser.sql.common.segment.dml.order.GroupBySegment;
import org.ibyte.sql.parser.sql.common.segment.dml.order.OrderBySegment;
import org.ibyte.sql.parser.sql.common.segment.dml.predicate.HavingSegment;
import org.ibyte.sql.parser.sql.common.segment.dml.predicate.WhereSegment;
import org.ibyte.sql.parser.sql.common.segment.generic.table.TableSegment;
import org.ibyte.sql.parser.sql.common.statement.AbstractSQLStatement;

import java.util.Collection;
import java.util.Optional;

/**
 * select statement.
 */
@Getter
@Setter
@ToString
public final class SelectStatement extends AbstractSQLStatement implements DMLStatement {

    private ProjectionsSegment projections;

    private TableSegment form;

    private WhereSegment where;

    private GroupBySegment group;

    private HavingSegment having;

    private OrderBySegment orderBy;

    /**
     * Get where.
     */
    private Optional<WhereSegment> getWhere(){
        return Optional.ofNullable(where);
    }
}
