package com.test.demo.service.impl;

import com.test.demo.entity.Order;
import com.test.demo.dao.OrderDao;
import com.test.demo.service.OrderService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;

/**
 * (Order)表服务实现类
 *
 * @author makejava
 * @since 2022-07-09 19:25:21
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderDao orderDao;

    /**
     * 通过ID查询单条数据
     *
     * @param orderId 主键
     * @return 实例对象
     */
    @Override
    public Order queryById(Long orderId) {
        return this.orderDao.queryById(orderId);
    }



    /**
     * 新增数据
     *
     * @param order 实例对象
     * @return 实例对象
     */
    @Override
    public Order insert(Order order) {
        this.orderDao.insert(order);
        return order;
    }

    /**
     * 修改数据
     *
     * @param order 实例对象
     * @return 实例对象
     */
    @Override
    public Order update(Order order) {
        this.orderDao.update(order);
        return this.queryById(order.getOrderId());
    }

    /**
     * 通过主键删除数据
     *
     * @param orderId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long orderId) {
        return this.orderDao.deleteById(orderId) > 0;
    }
}
