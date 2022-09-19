package org.ibyte.sql.parser.sql.common.statement.dml;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.ibyte.sql.parser.sql.common.segment.dml.assignment.InsertValuesSegment;
import org.ibyte.sql.parser.sql.common.segment.dml.column.ColumnSegment;
import org.ibyte.sql.parser.sql.common.segment.dml.column.InsertColumnsSegment;
import org.ibyte.sql.parser.sql.common.segment.expr.subquery.SubquerySegment;
import org.ibyte.sql.parser.sql.common.segment.generic.table.SimpleTableSegment;
import org.ibyte.sql.parser.sql.common.statement.AbstractSQLStatement;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Optional;

/**
 * insert statement.
 */
@Getter
@Setter
@ToString
public abstract class InsertStatement extends AbstractSQLStatement implements DMLStatement {

    private SimpleTableSegment table;

    private InsertColumnsSegment insertColumns;

    private SubquerySegment insertSelect;

    private Collection<InsertValuesSegment> insertValues = new LinkedList<>();

    /**
     * Get insert Columns.
     */
    public Optional<InsertColumnsSegment> getInsertColumns() {
        return Optional.ofNullable(insertColumns);
    }

    /**
     * Get columns.
     */
    public Collection<ColumnSegment> getColumns() {
        return null == insertColumns ? Collections.emptyList() : insertColumns.getColumns();
    }

    /**
     * Get insert select segment.
     */
    public Optional<SubquerySegment> getInsertSelect(){
        return Optional.ofNullable(insertSelect);
    }
}
