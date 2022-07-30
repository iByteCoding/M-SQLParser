package org.ibyte.sql.parser.sql;

import org.ibyte.sql.parser.api.ASTNode;

/**
 * SQL segment
 */
public interface SQLSegment extends ASTNode {

    /**
     * 开始指数
     */
    int getStartIndex();

    /**
     * 结束指数
     */
    int getStopIndex();
}
