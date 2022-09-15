package org.ibyte.sql.parser.sql.common.segment.dml.column;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.ibyte.sql.parser.sql.common.segment.expr.ExpressionSegment;
import org.ibyte.sql.parser.sql.common.segment.generic.OwnerAvailable;
import org.ibyte.sql.parser.sql.common.segment.generic.OwnerSegment;
import org.ibyte.sql.parser.sql.common.value.identifier.IdentifierValue;

/**
 * Column Segment
 */
@RequiredArgsConstructor
@Getter
@Setter
@ToString
public final class ColumnSegment implements ExpressionSegment, OwnerAvailable {

    private final int startIndex;

    private final int stopIndex;

    private final IdentifierValue identifier;

    private OwnerSegment owner;


    public String getQualifiedName(){
        return null == owner
                ? identifier.getValueWithQuoteCharacters()
                : String.join(".", owner.getIdentifier().getValueWithQuoteCharacters(), identifier.getValueWithQuoteCharacters());
    }
}
