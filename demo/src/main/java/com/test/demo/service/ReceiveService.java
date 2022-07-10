package com.test.demo.service;

import com.test.demo.entity.Receive;
import com.github.pagehelper.Page;

/**
 * (Receive)表服务接口
 *
 * @author makejava
 * @since 2022-07-09 19:29:23
 */
public interface ReceiveService {

    /**
     * 通过ID查询单条数据
     *
     * @param personId 主键
     * @return 实例对象
     */
    Receive queryById(Long personId);


    /**
     * 新增数据
     *
     * @param receive 实例对象
     * @return 实例对象
     */
    Receive insert(Receive receive);

    /**
     * 修改数据
     *
     * @param receive 实例对象
     * @return 实例对象
     */
    Receive update(Receive receive);

    /**
     * 通过主键删除数据
     *
     * @param personId 主键
     * @return 是否成功
     */
    boolean deleteById(Long personId);

}
