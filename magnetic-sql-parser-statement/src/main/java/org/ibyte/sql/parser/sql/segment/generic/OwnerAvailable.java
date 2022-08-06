package org.ibyte.sql.parser.sql.segment.generic;

import org.ibyte.sql.parser.sql.SQLSegment;

import java.util.Optional;

/**
 * Owner available
 */
public interface OwnerAvailable extends SQLSegment {

    /**
     * Get owner.
     *
     * @return owner
     */
    Optional<OwnerSegment> getOwner();

    /**
     * Set owner.
     *
     * @param owner owner
     */
    void setOwner(OwnerSegment owner);

}
