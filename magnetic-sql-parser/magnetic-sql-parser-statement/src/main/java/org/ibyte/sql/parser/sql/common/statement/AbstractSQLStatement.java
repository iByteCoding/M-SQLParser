package org.ibyte.sql.parser.sql.common.statement;

import lombok.Getter;
import lombok.Setter;

/**
 * SQL statement abstract class.
 */
@Getter
@Setter
public class AbstractSQLStatement implements SQLStatement {

    private int parameterCount;
}
