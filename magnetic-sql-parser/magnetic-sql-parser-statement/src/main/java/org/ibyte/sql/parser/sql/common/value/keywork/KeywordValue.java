package org.ibyte.sql.parser.sql.common.value.keywork;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.ibyte.sql.parser.sql.common.value.ValueASTNode;

@RequiredArgsConstructor
@Getter
public class KeywordValue implements ValueASTNode<String> {

    private final String value;
}
