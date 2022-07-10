package com.test.demo.service;

import com.test.demo.entity.Department;
import com.github.pagehelper.Page;

/**
 * (Department)表服务接口
 *
 * @author makejava
 * @since 2022-07-08 20:50:36
 */
public interface DepartmentService {

    /**
     * 通过ID查询单条数据
     *
     * @param departmentId 主键
     * @return 实例对象
     */
    Department queryById(Long departmentId);



    /**
     * 新增数据
     *
     * @param department 实例对象
     * @return 实例对象
     */
    Department insert(Department department);

    /**
     * 修改数据
     *
     * @param department 实例对象
     * @return 实例对象
     */
    Department update(Department department);

    /**
     * 通过主键删除数据
     *
     * @param departmentId 主键
     * @return 是否成功
     */
    boolean deleteById(Long departmentId);

}
