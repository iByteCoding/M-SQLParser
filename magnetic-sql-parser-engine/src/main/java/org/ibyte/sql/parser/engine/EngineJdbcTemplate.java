package org.ibyte.sql.parser.engine;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.ResultSetExtractor;

import javax.sql.DataSource;
import java.util.Objects;

/**
 * 基于springframework.jdbc拓展模板引擎
 */
public class EngineJdbcTemplate extends JdbcTemplate {

    private static final Logger LOGGER = LoggerFactory.getLogger(EngineJdbcTemplate.class);

    /**
     * 无参构造方法
     */
    public EngineJdbcTemplate() {
        super();
    }

    /**
     * 根据数据源构造模板引擎
     *
     * @param dataSource 数据源
     */
    public EngineJdbcTemplate(DataSource dataSource) {
        super(dataSource);
    }

    /**
     * 根据数据源构造模板引擎
     * <p>
     * 注意: 根据“lazyInit”标志，异常的初始化,translator将被触发。
     *
     * @param dataSource 数据源
     * @param lazyInit   是否懒处理
     */
    public EngineJdbcTemplate(DataSource dataSource, boolean lazyInit) {
        super(dataSource, lazyInit);
    }


    /**
     * 获取默认数据源
     *
     * @return 返回已注入数据源
     */
    protected DataSource dataSource() {
        DataSource dataSource = getDataSource();
        if (Objects.isNull(dataSource)) {
            throw new NullPointerException("No DataSource set");
        }
        return dataSource;
    }

    /**
     * 执行给定的静态SQL查询，使用ResultSetExtractor
     *
     * @param sql 静态SQL
     * @param rse ResultSetExtractor
     */
    @Override
    public <T> T query(String sql, ResultSetExtractor<T> rse) throws DataAccessException {
        return super.query(sql, rse);
    }


    // TODO
    @Override
    public <T> T query(PreparedStatementCreator psc, PreparedStatementSetter pss, ResultSetExtractor<T> rse)
            throws DataAccessException {
        return super.query(psc, pss, rse);
    }
}
