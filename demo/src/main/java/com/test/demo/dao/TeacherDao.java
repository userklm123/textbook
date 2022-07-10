package com.test.demo.dao;

import com.test.demo.entity.Teacher;
import org.apache.ibatis.annotations.Param;

import java.awt.print.Pageable;
import java.util.List;

/**
 * (Teacher)表数据库访问层
 *
 * @author makejava
 * @since 2022-07-09 19:40:39
 */
public interface TeacherDao {

    /**
     * 通过ID查询单条数据
     *
     * @param teacherId 主键
     * @return 实例对象
     */
    Teacher queryById(Long teacherId);

    /**
     * 查询指定行数据
     *
     * @param teacher 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<Teacher> queryAllByLimit(Teacher teacher, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param teacher 查询条件
     * @return 总行数
     */
    long count(Teacher teacher);

    /**
     * 新增数据
     *
     * @param teacher 实例对象
     * @return 影响行数
     */
    int insert(Teacher teacher);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Teacher> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Teacher> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Teacher> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Teacher> entities);

    /**
     * 修改数据
     *
     * @param teacher 实例对象
     * @return 影响行数
     */
    int update(Teacher teacher);

    /**
     * 通过主键删除数据
     *
     * @param teacherId 主键
     * @return 影响行数
     */
    int deleteById(Long teacherId);

}

