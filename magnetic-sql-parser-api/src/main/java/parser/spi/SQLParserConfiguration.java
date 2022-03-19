package parser.spi;

import parser.api.lexer.SQLLexer;
import parser.api.parser.SQLParser;
import parser.api.vistor.SQLVisitorFacade;

/**
 * SQL解析器配置
 */
public interface SQLParserConfiguration {

    /**
     * 获取数据库类型的名称。
     */
    String getDatabaseTypeName();

    /**
     * 获取SQL分析类类型。
     */
    Class<? extends SQLLexer> getLexerClass();

    /**
     * 获取SQL解析器类类型。
     */
    Class<? extends SQLParser> getParserClass();

    /**
     * 获取SQL访问者facade类。
     */
    Class<? extends SQLVisitorFacade> getVisitorFacadeClass();
}
