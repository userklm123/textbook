package com.test.demo.dao;

import com.test.demo.entity.Needs;
import org.apache.ibatis.annotations.Param;

import java.awt.print.Pageable;
import java.util.List;


/**
 * (Needs)表数据库访问层
 *
 * @author makejava
 * @since 2022-07-09 19:01:49
 */
public interface NeedsDao {

    /**
     * 通过ID查询单条数据
     *
     * @param needId 主键
     * @return 实例对象
     */
    Needs queryById(Long needId);

    /**
     * 查询指定行数据
     *
     * @param needs 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<Needs> queryAllByLimit(Needs needs, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param needs 查询条件
     * @return 总行数
     */
    long count(Needs needs);

    /**
     * 新增数据
     *
     * @param needs 实例对象
     * @return 影响行数
     */
    int insert(Needs needs);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Needs> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Needs> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Needs> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Needs> entities);

    /**
     * 修改数据
     *
     * @param needs 实例对象
     * @return 影响行数
     */
    int update(Needs needs);

    /**
     * 通过主键删除数据
     *
     * @param needId 主键
     * @return 影响行数
     */
    int deleteById(Long needId);

}

