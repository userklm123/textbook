package com.test.demo.service;

import com.test.demo.entity.Needs;
import com.github.pagehelper.Page;

/**
 * (Needs)表服务接口
 *
 * @author makejava
 * @since 2022-07-09 19:01:49
 */
public interface NeedsService {

    /**
     * 通过ID查询单条数据
     *
     * @param needId 主键
     * @return 实例对象
     */
    Needs queryById(Long needId);


    /**
     * 新增数据
     *
     * @param needs 实例对象
     * @return 实例对象
     */
    Needs insert(Needs needs);

    /**
     * 修改数据
     *
     * @param needs 实例对象
     * @return 实例对象
     */
    Needs update(Needs needs);

    /**
     * 通过主键删除数据
     *
     * @param needId 主键
     * @return 是否成功
     */
    boolean deleteById(Long needId);

}
