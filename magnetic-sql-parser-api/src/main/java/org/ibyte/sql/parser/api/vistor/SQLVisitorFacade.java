package org.ibyte.sql.parser.api.vistor;

import org.ibyte.sql.parser.api.vistor.statement.DDLVisitor;
import org.ibyte.sql.parser.api.vistor.statement.DMLVisitor;
import org.ibyte.sql.parser.api.vistor.statement.DQLVisitor;

/**
 * SQL Visitor Facade
 */
public interface SQLVisitorFacade {

    /**
     * Get DML visitor class.
     *
     * @return DML visitor class
     */
    Class<? extends DMLVisitor> getDMLVisitorClass();

    /**
     * Get DDL visitor class.
     *
     * @return DDL visitor class
     */
    Class<? extends DDLVisitor> getDDLVisitorClass();

    /**
     * Get DDL visitor class
     *
     * @return DQL visitor class
     */
    Class<? extends DQLVisitor> getDCLVisitorClass();
}
