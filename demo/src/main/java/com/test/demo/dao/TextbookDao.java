package com.test.demo.dao;

import com.test.demo.entity.Textbook;
import org.apache.ibatis.annotations.Param;

import java.awt.print.Pageable;
import java.util.List;
/**
 * (Textbook)表数据库访问层
 *
 * @author makejava
 * @since 2022-07-09 19:44:13
 */
public interface TextbookDao {

    /**
     * 通过ID查询单条数据
     *
     * @param textbookId 主键
     * @return 实例对象
     */
    Textbook queryById(Long textbookId);

    /**
     * 查询指定行数据
     *
     * @param textbook 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<Textbook> queryAllByLimit(Textbook textbook, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param textbook 查询条件
     * @return 总行数
     */
    long count(Textbook textbook);

    /**
     * 新增数据
     *
     * @param textbook 实例对象
     * @return 影响行数
     */
    int insert(Textbook textbook);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Textbook> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Textbook> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Textbook> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Textbook> entities);

    /**
     * 修改数据
     *
     * @param textbook 实例对象
     * @return 影响行数
     */
    int update(Textbook textbook);

    /**
     * 通过主键删除数据
     *
     * @param textbookId 主键
     * @return 影响行数
     */
    int deleteById(Long textbookId);

}

