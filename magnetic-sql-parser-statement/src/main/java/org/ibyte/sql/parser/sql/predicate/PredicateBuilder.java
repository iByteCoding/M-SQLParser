package org.ibyte.sql.parser.sql.predicate;

import lombok.RequiredArgsConstructor;
import org.ibyte.sql.parser.api.ASTNode;

/**
 * 语法构建
 */
@RequiredArgsConstructor
public class PredicateBuilder {

    private final ASTNode left;

    private final ASTNode right;

    private final String operator;
}
