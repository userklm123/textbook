package com.test.demo.service.impl;

import com.test.demo.entity.Department;
import com.test.demo.dao.DepartmentDao;
import com.test.demo.service.DepartmentService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;

/**
 * (Department)表服务实现类
 *
 * @author makejava
 * @since 2022-07-08 20:50:36
 */
@Service("departmentService")
public class DepartmentServiceImpl implements DepartmentService {
    @Resource
    private DepartmentDao departmentDao;

    /**
     * 通过ID查询单条数据
     *
     * @param departmentId 主键
     * @return 实例对象
     */
    @Override
    public Department queryById(Long departmentId) {
        return this.departmentDao.queryById(departmentId);
    }



    /**
     * 新增数据
     *
     * @param department 实例对象
     * @return 实例对象
     */
    @Override
    public Department insert(Department department) {
        this.departmentDao.insert(department);
        return department;
    }

    /**
     * 修改数据
     *
     * @param department 实例对象
     * @return 实例对象
     */
    @Override
    public Department update(Department department) {
        this.departmentDao.update(department);
        return this.queryById(department.getDepartmentId());
    }

    /**
     * 通过主键删除数据
     *
     * @param departmentId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long departmentId) {
        return this.departmentDao.deleteById(departmentId) > 0;
    }
}
