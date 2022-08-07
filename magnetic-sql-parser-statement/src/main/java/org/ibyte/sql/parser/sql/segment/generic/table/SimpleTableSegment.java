package org.ibyte.sql.parser.sql.segment.generic.table;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.ibyte.sql.parser.sql.segment.generic.AliasAvailable;
import org.ibyte.sql.parser.sql.segment.generic.AliasSegment;
import org.ibyte.sql.parser.sql.segment.generic.OwnerAvailable;
import org.ibyte.sql.parser.sql.segment.generic.OwnerSegment;
import org.ibyte.sql.parser.sql.value.identifier.IdentifierValue;

import java.util.Optional;

/**
 * simple table segment.
 */
@RequiredArgsConstructor
@Getter
public class SimpleTableSegment implements TableSegment, OwnerAvailable, AliasAvailable {

    private final TableNameSegment tableName;

    @Setter
    private OwnerSegment owner;

    @Setter
    private AliasSegment alias;

    public SimpleTableSegment(final int startIndex, final int stopIndex, final IdentifierValue identifier) {
        tableName = new TableNameSegment(startIndex, stopIndex, identifier);
    }

    @Override
    public int getStartIndex() {
        return null == owner ? tableName.getStartIndex() : owner.getStartIndex();
    }

    @Override
    public int getStopIndex(){
        return tableName.getStopIndex();
    }

    @Override
    public Optional<OwnerSegment> getOwner() {
        return Optional.ofNullable(owner);
    }

    @Override
    public Optional<String> getAlias() {
        return null == alias ? Optional.empty() : Optional.ofNullable(alias.getIdentifier().getValue());
    }

}
