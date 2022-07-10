package com.test.demo.controller;

import com.test.demo.entity.Order;
import com.test.demo.service.OrderService;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import javax.annotation.Resource;


/**
 * (Order)表控制层
 *
 * @author makejava
 * @since 2022-07-09 19:25:21
 */
@RestController
@CrossOrigin
@RequestMapping("order")
public class OrderController {
    /**
     * 服务对象
     */
    @Resource
    private OrderService orderService;



    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Order> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.orderService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param order 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Order> add(Order order) {
        return ResponseEntity.ok(this.orderService.insert(order));
    }

    /**
     * 编辑数据
     *
     * @param order 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Order> edit(Order order) {
        return ResponseEntity.ok(this.orderService.update(order));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.orderService.deleteById(id));
    }

}

