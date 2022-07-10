package com.test.demo.service;

import com.test.demo.entity.Student;
import com.github.pagehelper.Page;

/**
 * (Student)表服务接口
 *
 * @author makejava
 * @since 2022-07-09 19:35:49
 */
public interface StudentService {

    /**
     * 通过ID查询单条数据
     *
     * @param studentId 主键
     * @return 实例对象
     */
    Student queryById(String studentId);


    /**
     * 新增数据
     *
     * @param student 实例对象
     * @return 实例对象
     */
    Student insert(Student student);

    /**
     * 修改数据
     *
     * @param student 实例对象
     * @return 实例对象
     */
    Student update(Student student);

    /**
     * 通过主键删除数据
     *
     * @param studentId 主键
     * @return 是否成功
     */
    boolean deleteById(String studentId);

}
