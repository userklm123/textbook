package com.test.demo.service.impl;

import com.test.demo.entity.Needs;
import com.test.demo.dao.NeedsDao;
import com.test.demo.service.NeedsService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;

/**
 * (Needs)表服务实现类
 *
 * @author makejava
 * @since 2022-07-09 19:01:49
 */
@Service("needsService")
public class NeedsServiceImpl implements NeedsService {
    @Resource
    private NeedsDao needsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param needId 主键
     * @return 实例对象
     */
    @Override
    public Needs queryById(Long needId) {
        return this.needsDao.queryById(needId);
    }



    /**
     * 新增数据
     *
     * @param needs 实例对象
     * @return 实例对象
     */
    @Override
    public Needs insert(Needs needs) {
        this.needsDao.insert(needs);
        return needs;
    }

    /**
     * 修改数据
     *
     * @param needs 实例对象
     * @return 实例对象
     */
    @Override
    public Needs update(Needs needs) {
        this.needsDao.update(needs);
        return this.queryById(needs.getNeedId());
    }

    /**
     * 通过主键删除数据
     *
     * @param needId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long needId) {
        return this.needsDao.deleteById(needId) > 0;
    }
}
