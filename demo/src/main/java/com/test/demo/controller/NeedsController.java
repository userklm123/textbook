package com.test.demo.controller;

import com.test.demo.entity.Needs;
import com.test.demo.service.NeedsService;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import javax.annotation.Resource;

/**
 * (Needs)表控制层
 *
 * @author makejava
 * @since 2022-07-09 19:01:48
 */
@RestController
@CrossOrigin
@RequestMapping("needs")
public class NeedsController {
    /**
     * 服务对象
     */
    @Resource
    private NeedsService needsService;



    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Needs> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.needsService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param needs 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Needs> add(Needs needs) {
        return ResponseEntity.ok(this.needsService.insert(needs));
    }

    /**
     * 编辑数据
     *
     * @param needs 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Needs> edit(Needs needs) {
        return ResponseEntity.ok(this.needsService.update(needs));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.needsService.deleteById(id));
    }

}

