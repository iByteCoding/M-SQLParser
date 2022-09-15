package org.ibyte.sql.parser.sql.common.statement.ddl;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.ibyte.sql.parser.sql.common.segment.ddl.index.IndexSegment;
import org.ibyte.sql.parser.sql.common.segment.dml.column.ColumnSegment;
import org.ibyte.sql.parser.sql.common.segment.generic.table.SimpleTableSegment;
import org.ibyte.sql.parser.sql.common.statement.AbstractSQLStatement;

import java.util.Collection;
import java.util.LinkedList;

/**
 * Create Index Statement
 */
@Getter
@Setter
@ToString
public abstract class CreateIndexStatement extends AbstractSQLStatement implements DDLStatement{

    private IndexSegment index;

    private SimpleTableSegment table;

    private Collection<ColumnSegment> columnSegments = new LinkedList<>();

}
