package org.ibyte.sql.parser.sql.common.statement;

import org.ibyte.sql.parser.api.ASTNode;

/**
 * SQL statement.
 */
public interface SQLStatement extends ASTNode {

    /**
     * get count of parameters.
     * @return count of parameters
     */
    int getParameterCount();
}
