package com.test.demo.controller;

import com.test.demo.entity.Student;
import com.test.demo.service.StudentService;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import javax.annotation.Resource;

/**
 * (Student)表控制层
 *
 * @author makejava
 * @since 2022-07-09 19:35:49
 */
@RestController
@CrossOrigin
@RequestMapping("student")
public class StudentController {
    /**
     * 服务对象
     */
    @Resource
    private StudentService studentService;


    @PostMapping("getStudentById")
    @ResponseBody
    public JSONObject getStudentById(@RequestBody(required = false) Student student){

        Long studentPw = this.studentService.queryById(student.getStudentId()).getStudentPw();
        String department = this.studentService.queryById(student.getStudentId()).getDepartment();
        Long studentTerm = this.studentService.queryById(student.getStudentId()).getStudentTerm();
        String studentName = this.studentService.queryById(student.getStudentId()).getStudentName();
        String coursesId = this.studentService.queryById(student.getStudentId()).getCoursesId();
        //5.将查询到的文档类型名称放入返回结果
        JSONObject o = new JSONObject();
        o.put("studentId", student.getStudentId());
        o.put("department", department);
        o.put("studentTerm", studentTerm);
        o.put("studentName", studentName);
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
    public ResponseEntity<Student> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.studentService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param student 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Student> add(Student student) {
        return ResponseEntity.ok(this.studentService.insert(student));
    }

    /**
     * 编辑数据
     *
     * @param student 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Student> edit(Student student) {
        return ResponseEntity.ok(this.studentService.update(student));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(String id) {
        return ResponseEntity.ok(this.studentService.deleteById(id));
    }

}

