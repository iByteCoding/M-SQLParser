package org.ibytecoding.parser.api.vistor;

import org.ibytecoding.parser.api.vistor.statement.DDLVisitor;
import org.ibytecoding.parser.api.vistor.statement.DMLVisitor;
import org.ibytecoding.parser.api.vistor.statement.DQLVisitor;

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
     * Get DQL visitor class.
     *
     * @return DQL visitor class
     */
    Class<? extends DQLVisitor> getDCLVisitorClass();
}
