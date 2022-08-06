package org.ibyte.sql.parser.sql.segment.ddl.constraint;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.ibyte.sql.parser.sql.segment.ddl.AlterDefinitionSegment;
import org.ibyte.sql.parser.sql.segment.ddl.CreateDefinitionSegment;
import org.ibyte.sql.parser.sql.segment.dml.column.ColumnSegment;
import org.ibyte.sql.parser.sql.segment.generic.table.SimpleTableSegment;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Optional;

/**
 * Constraint Definition Segment.
 */
@RequiredArgsConstructor
@Getter
@Setter
public class ConstraintDefinitionSegment implements CreateDefinitionSegment, AlterDefinitionSegment {

    private final int startIndex;

    private final int stopIndex;

    private final Collection<ColumnSegment> primaryKeyColumns = new LinkedList<>();

    private final SimpleTableSegment referencedTable;

    public Optional<SimpleTableSegment> getReferencedTable(){
        return Optional.ofNullable(referencedTable);
    }


}
