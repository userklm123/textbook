package com.test.demo.controller;

import com.test.demo.entity.Receive;
import com.test.demo.service.ReceiveService;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import javax.annotation.Resource;
/**
 * (Receive)表控制层
 *
 * @author makejava
 * @since 2022-07-09 19:29:23
 */
@RestController
@CrossOrigin
@RequestMapping("receive")
public class ReceiveController {
    /**
     * 服务对象
     */
    @Resource
    private ReceiveService receiveService;



    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Receive> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.receiveService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param receive 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Receive> add(Receive receive) {
        return ResponseEntity.ok(this.receiveService.insert(receive));
    }

    /**
     * 编辑数据
     *
     * @param receive 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Receive> edit(Receive receive) {
        return ResponseEntity.ok(this.receiveService.update(receive));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.receiveService.deleteById(id));
    }

}

