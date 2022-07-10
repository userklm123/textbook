package com.test.demo.service;

import com.test.demo.entity.Teacher;
import com.github.pagehelper.Page;

/**
 * (Teacher)表服务接口
 *
 * @author makejava
 * @since 2022-07-09 19:40:39
 */
public interface TeacherService {

    /**
     * 通过ID查询单条数据
     *
     * @param teacherId 主键
     * @return 实例对象
     */
    Teacher queryById(Long teacherId);



    /**
     * 新增数据
     *
     * @param teacher 实例对象
     * @return 实例对象
     */
    Teacher insert(Teacher teacher);

    /**
     * 修改数据
     *
     * @param teacher 实例对象
     * @return 实例对象
     */
    Teacher update(Teacher teacher);

    /**
     * 通过主键删除数据
     *
     * @param teacherId 主键
     * @return 是否成功
     */
    boolean deleteById(Long teacherId);

}
