package org.ibyte.sql.parser.sql.statement;

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
