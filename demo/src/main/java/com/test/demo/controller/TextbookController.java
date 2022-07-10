package com.test.demo.controller;

import com.test.demo.entity.Textbook;
import com.test.demo.service.TextbookService;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import javax.annotation.Resource;


/**
 * (Textbook)表控制层
 *
 * @author makejava
 * @since 2022-07-09 19:44:13
 */
@RestController
@CrossOrigin
@RequestMapping("textbook")
public class TextbookController {
    /**
     * 服务对象
     */
    @Resource
    private TextbookService textbookService;



    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Textbook> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.textbookService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param textbook 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Textbook> add(Textbook textbook) {
        return ResponseEntity.ok(this.textbookService.insert(textbook));
    }

    /**
     * 编辑数据
     *
     * @param textbook 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Textbook> edit(Textbook textbook) {
        return ResponseEntity.ok(this.textbookService.update(textbook));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.textbookService.deleteById(id));
    }

}

