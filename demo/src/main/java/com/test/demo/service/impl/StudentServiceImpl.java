package com.test.demo.service.impl;

import com.test.demo.entity.Student;
import com.test.demo.dao.StudentDao;
import com.test.demo.service.StudentService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;


/**
 * (Student)表服务实现类
 *
 * @author makejava
 * @since 2022-07-09 19:35:49
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentDao studentDao;

    /**
     * 通过ID查询单条数据
     *
     * @param studentId 主键
     * @return 实例对象
     */
    @Override
    public Student queryById(String studentId) {
        return this.studentDao.queryById(studentId);
    }



    /**
     * 新增数据
     *
     * @param student 实例对象
     * @return 实例对象
     */
    @Override
    public Student insert(Student student) {
        this.studentDao.insert(student);
        return student;
    }

    /**
     * 修改数据
     *
     * @param student 实例对象
     * @return 实例对象
     */
    @Override
    public Student update(Student student) {
        this.studentDao.update(student);
        return this.queryById(student.getStudentId());
    }

    /**
     * 通过主键删除数据
     *
     * @param studentId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String studentId) {
        return this.studentDao.deleteById(studentId) > 0;
    }
}
