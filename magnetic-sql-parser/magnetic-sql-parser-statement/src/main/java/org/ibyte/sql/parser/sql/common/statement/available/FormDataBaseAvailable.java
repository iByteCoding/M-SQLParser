package org.ibyte.sql.parser.sql.common.statement.available;

import org.ibyte.sql.parser.sql.common.segment.generic.DatabaseSegment;

import java.util.Optional;

public interface FormDataBaseAvailable {

    /**
     * 获取Schema
     */
    Optional<DatabaseSegment> getDatabase();
}
