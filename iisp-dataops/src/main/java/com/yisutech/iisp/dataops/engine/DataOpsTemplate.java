package com.yisutech.iisp.dataops.engine;

import com.yisutech.iisp.dataops.engine.model.ColumnMeta;
import com.yisutech.iisp.dataops.engine.model.TableMeta;

import java.util.List;
import java.util.Map;

/**
 * 版权：Copyright by www.yisutech.com
 * 文件名：com.yisutech.iisp.dataops.engine.DataOpsTemplate
 * 描述：
 *
 * @author guangzhong.wgz
 * @create 2018-03-23 下午4:48
 **/
public interface DataOpsTemplate {

    /**
     * 创建表
     *
     * @param tableMeta {@link TableMeta}
     * @return true, 成功; false, 失败
     */
    boolean createTable(TableMeta tableMeta);

    /**
     * 删除表
     *
     * @param tableMeta {@link TableMeta}
     * @return true, 成功; false, 失败
     */
    boolean dropTable(TableMeta tableMeta);

    /**
     * 变更新
     *
     * @param tableMeta {@link TableMeta}
     * @return true, 成功; false, 失败
     */
    boolean alterTable(TableMeta tableMeta, Map<String, ColumnMeta> columnMetas);

    /**
     * 查询表
     *
     * @param tableMetas {@link TableMeta}
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> query(List<TableMeta> tableMetas);

    /**
     * 查询表
     *
     * @param tableMetas {@link TableMeta}
     * @param offset     开始记录
     * @param size       记录数
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> query(List<TableMeta> tableMetas, int offset, int size);

    /**
     * 查询表
     *
     * @param sqlTemplate sql模板(freemarker模板)
     * @param values      Map<String, Object> 模板内动态变量
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> query(String sqlTemplate, Map<String, Object> values);

    /**
     * 查询表
     *
     * @param sqlTemplate sql模板(freemarker模板)
     * @param values      Map<String, Object> 模板内动态变量
     * @param offset      记录开始位置
     * @param size        记录数
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> query(String sqlTemplate, Map<String, Object> values, int offset, int size);

    /**
     * 写入记录
     *
     * @param tableMeta 表元信息
     * @param values    值集合
     * @return 主键ID
     */
    int insert(TableMeta tableMeta, Map<String, Object> values);

    /**
     * 写入记录
     *
     * @param sqlTemplate sql模板(freemarker)
     * @param values      值集合
     * @return 主键ID
     */
    int insert(String sqlTemplate, Map<String, Object> values);

    /**
     * 批量写入记录
     *
     * @param sqlTemplate sql模板
     * @param values      值集合
     * @return 主键集合
     */
    List<Integer> batchInsert(String sqlTemplate, List<Map<String, Object>> values);

    /**
     * 更新记录
     *
     * @param tableMeta 表元信息
     * @param values    值集合
     * @return 记录数
     */
    int update(TableMeta tableMeta, Map<String, Object> values);

    /**
     * 更新记录
     *
     * @param sqlTemplate sql模板
     * @param values      值集合
     * @return 记录数
     */
    int update(String sqlTemplate, Map<String, Object> values);

    /**
     * 批量更新记录
     *
     * @param sqlTemplate sql模板
     * @param values      值集合
     * @return 记录数
     */
    List<Integer> batchUpdate(String sqlTemplate, List<Map<String, Object>> values);
}
