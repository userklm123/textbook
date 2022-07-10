package com.test.demo.service;

import com.test.demo.entity.Admin;
import com.github.pagehelper.Page;

/**
 * (Admin)表服务接口
 *
 * @author makejava
 * @since 2022-07-08 20:49:15
 */
public interface AdminService {

    /**
     * 通过ID查询单条数据
     *
     * @param adminId 主键
     * @return 实例对象
     */
    Admin queryById(Long adminId);



    /**
     * 新增数据
     *
     * @param admin 实例对象
     * @return 实例对象
     */
    Admin insert(Admin admin);

    /**
     * 修改数据
     *
     * @param admin 实例对象
     * @return 实例对象
     */
    Admin update(Admin admin);

    /**
     * 通过主键删除数据
     *
     * @param adminId 主键
     * @return 是否成功
     */
    boolean deleteById(Long adminId);

}
