package org.ibyte.sql.parser.sql.common.segment.dml.assignment;

import org.ibyte.sql.parser.sql.SQLSegment;
import org.ibyte.sql.parser.sql.common.segment.dml.column.ColumnSegment;
import org.ibyte.sql.parser.sql.common.segment.expr.ExpressionSegment;

import java.util.List;

public abstract class AssignmentSegment implements SQLSegment {

    /**
     * 获取对应列
     */
    public abstract List<ColumnSegment> getColumns();

    /**
     * 获取对应值
     */
    public abstract ExpressionSegment getValue();


}
