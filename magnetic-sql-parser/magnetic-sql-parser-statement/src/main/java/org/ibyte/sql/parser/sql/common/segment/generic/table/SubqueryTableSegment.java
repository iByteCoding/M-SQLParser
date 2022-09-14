package org.ibyte.sql.parser.sql.common.segment.generic.table;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.ibyte.sql.parser.sql.common.segment.expr.subquery.SubquerySegment;
import org.ibyte.sql.parser.sql.common.segment.generic.AliasAvailable;
import org.ibyte.sql.parser.sql.common.segment.generic.AliasSegment;

import java.util.Optional;

@RequiredArgsConstructor
@Getter
@ToString
public final class SubqueryTableSegment implements TableSegment, AliasAvailable {

    private final SubquerySegment subquery;

    @Setter
    private AliasSegment alias;

    @Override
    public Optional<String> getAlias() {
        return null == alias ? Optional.empty() : Optional.ofNullable(alias.getIdentifier().getValue());
    }

    @Override
    public int getStartIndex() {
        return subquery.getStartIndex();
    }

    @Override
    public int getStopIndex() {
        return subquery.getStopIndex();
        // TODO
        // return null == alias ? alias.getStopIndex() : column.getStopIndex();
    }
}