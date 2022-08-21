package org.ibyte.sql.parser.sql.value;

import org.ibyte.sql.parser.api.ASTNode;

/**
 * value AST node.
 * @param <T> type of value
 */
public interface ValueASTNode<T> extends ASTNode {

    T getValue();
}
