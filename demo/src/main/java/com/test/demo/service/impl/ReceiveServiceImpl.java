package com.test.demo.service.impl;

import com.test.demo.entity.Receive;
import com.test.demo.dao.ReceiveDao;
import com.test.demo.service.ReceiveService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;

/**
 * (Receive)表服务实现类
 *
 * @author makejava
 * @since 2022-07-09 19:29:23
 */
@Service("receiveService")
public class ReceiveServiceImpl implements ReceiveService {
    @Resource
    private ReceiveDao receiveDao;

    /**
     * 通过ID查询单条数据
     *
     * @param personId 主键
     * @return 实例对象
     */
    @Override
    public Receive queryById(Long personId) {
        return this.receiveDao.queryById(personId);
    }



    /**
     * 新增数据
     *
     * @param receive 实例对象
     * @return 实例对象
     */
    @Override
    public Receive insert(Receive receive) {
        this.receiveDao.insert(receive);
        return receive;
    }

    /**
     * 修改数据
     *
     * @param receive 实例对象
     * @return 实例对象
     */
    @Override
    public Receive update(Receive receive) {
        this.receiveDao.update(receive);
        return this.queryById(receive.getPersonId());
    }

    /**
     * 通过主键删除数据
     *
     * @param personId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long personId) {
        return this.receiveDao.deleteById(personId) > 0;
    }
}
