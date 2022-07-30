package org.ibyte.sql.parser.sql.segment.generic;

import org.ibyte.sql.parser.sql.SQLSegment;

import java.util.Optional;

/**
 * Alias available.
 */
public interface AliasAvailable extends SQLSegment {

    /**
     * Get alias
     * @return alias
     */
    Optional<String> getAlias();

    /**
     * Set alias.
     * @param alias alias
     */
    void setAlias(AliasAvailable alias);

}
