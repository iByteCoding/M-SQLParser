package org.ibyte.sql.parser.sql.segment.ddl.column.alter;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.ibyte.sql.parser.sql.segment.ddl.AlterDefinitionSegment;
import org.ibyte.sql.parser.sql.segment.ddl.column.ColumnDefinitionSegment;
import org.ibyte.sql.parser.sql.segment.ddl.column.position.ColumnPositionSegment;

import java.util.Collection;
import java.util.Optional;


@RequiredArgsConstructor
@Getter
@Setter
public class AddColumnDefinitionSegment implements AlterDefinitionSegment {

    private final int startIndex;

    private final int stopIndex;

    private final Collection<ColumnDefinitionSegment> columnDefinitions;

    private ColumnPositionSegment columnPosition;

    public Optional<ColumnPositionSegment> getColumnPosition(){
        return Optional.ofNullable(columnPosition);
    }
}
