package com.test.demo.controller;

import com.test.demo.entity.Department;
import com.test.demo.service.DepartmentService;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

import javax.annotation.Resource;

/**
 * (Department)表控制层
 *
 * @author makejava
 * @since 2022-07-08 20:50:36
 */
@RestController
@CrossOrigin
@RequestMapping("department")
public class DepartmentController {
    /**
     * 服务对象
     */
    @Resource
    private DepartmentService departmentService;


    @PostMapping("getDepartmentById")
    @ResponseBody
    public JSONObject getDepartmentById(@RequestBody(required = false) Department department){

        Long departmentPw = this.departmentService.queryById(department.getDepartmentId()).getDepartmentPw();
        String departmentn = this.departmentService.queryById(department.getDepartmentId()).getDepartment();
        //5.将查询到的文档类型名称放入返回结果
        JSONObject o = new JSONObject();
        o.put("departmentId", department.getDepartmentId());
        o.put("departmentPw", departmentPw);
        o.put("department", departmentn);

        return o;
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Department> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.departmentService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param department 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Department> add(Department department) {
        return ResponseEntity.ok(this.departmentService.insert(department));
    }

    /**
     * 编辑数据
     *
     * @param department 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Department> edit(Department department) {
        return ResponseEntity.ok(this.departmentService.update(department));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.departmentService.deleteById(id));
    }

}

