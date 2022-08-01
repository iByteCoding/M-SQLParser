package org.ibyte.sql.parser.sql.value.identifier;

import lombok.Getter;
import org.ibyte.sql.parser.sql.constant.QuoteCharacter;
import org.ibyte.sql.parser.sql.util.SQLUtil;
import org.ibyte.sql.parser.sql.value.ValueASTNode;

/**
 * Identifier Value
 */
@Getter
public final class IdentifierValue implements ValueASTNode<String> {

    private final String value;

    private final QuoteCharacter quoteCharacter;

    public IdentifierValue(final String text){
        value = SQLUtil.getExactlyValue(text);
        quoteCharacter = QuoteCharacter.getQuoteCharacter(text);
    }
}
