package com.test.demo.controller;

import com.test.demo.entity.Teacher;
import com.test.demo.service.TeacherService;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import javax.annotation.Resource;


/**
 * (Teacher)表控制层
 *
 * @author makejava
 * @since 2022-07-09 19:40:39
 */
@RestController
@CrossOrigin
@RequestMapping("teacher")
public class TeacherController {
    /**
     * 服务对象
     */
    @Resource
    private TeacherService teacherService;

    @PostMapping("getTeacherById")
    @ResponseBody
    public JSONObject getTeacherById(@RequestBody(required = false) Teacher teacher){

        Long teacherPw = this.teacherService.queryById(teacher.getTeacherId()).getTeacherPw();
        String department = this.teacherService.queryById(teacher.getTeacherId()).getDepartment();
        String teacherName = this.teacherService.queryById(teacher.getTeacherId()).getTeacherName();
        String coursesId = this.teacherService.queryById(teacher.getTeacherId()).getCoursesId();
        //5.将查询到的文档类型名称放入返回结果
        JSONObject o = new JSONObject();
        o.put("teacherId", teacher.getTeacherId());
        o.put("teacherPw", teacherPw);
        o.put("department", department);
        o.put("teacherName", teacherName);
        o.put("coursesId", coursesId);

        return o;
    }


    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Teacher> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.teacherService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param teacher 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Teacher> add(Teacher teacher) {
        return ResponseEntity.ok(this.teacherService.insert(teacher));
    }

    /**
     * 编辑数据
     *
     * @param teacher 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Teacher> edit(Teacher teacher) {
        return ResponseEntity.ok(this.teacherService.update(teacher));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.teacherService.deleteById(id));
    }

}

