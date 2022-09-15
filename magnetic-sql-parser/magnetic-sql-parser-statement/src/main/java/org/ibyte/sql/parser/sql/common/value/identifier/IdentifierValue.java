package org.ibyte.sql.parser.sql.common.value.identifier;

import com.google.common.base.Strings;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.ibyte.sql.parser.sql.common.constant.QuoteCharacter;
import org.ibyte.sql.parser.sql.common.util.SQLUtil;
import org.ibyte.sql.parser.sql.common.value.ValueASTNode;

/**
 * Identifier Value
 */
@RequiredArgsConstructor
@Getter
@ToString
public final class IdentifierValue implements ValueASTNode<String> {

    private final String value;

    private final QuoteCharacter quoteCharacter;

    public IdentifierValue(final String text) {
        this(SQLUtil.getExactlyValue(text), QuoteCharacter.getQuoteCharacter(text));
    }

    public IdentifierValue(final String text, final String reservedCharacters) {
        this(SQLUtil.getExactlyValue(text, reservedCharacters), QuoteCharacter.getQuoteCharacter(text));
    }

    /**
     * Get value with quote characters, i.e. `table1` or `field1`
     *
     * @return value with quote characters
     */
    public String getValueWithQuoteCharacters() {
        return null == value ? "" : quoteCharacter.wrap(value);
    }

    /**
     * Get quoted content.
     *
     * @param text text
     * @return quote content
     */
    public static String getQuotedContent(final String text) {
        if (Strings.isNullOrEmpty(text)) {
            return text;
        }
        QuoteCharacter quoteCharacter = QuoteCharacter.getQuoteCharacter(text);
        if (quoteCharacter.equals(QuoteCharacter.NONE)) {
            return text.trim();
        }
        return text.substring(1, text.length() - 1);
    }
}
