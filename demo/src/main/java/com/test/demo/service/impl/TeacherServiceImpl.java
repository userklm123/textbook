package com.test.demo.service.impl;

import com.test.demo.entity.Teacher;
import com.test.demo.dao.TeacherDao;
import com.test.demo.service.TeacherService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;


/**
 * (Teacher)表服务实现类
 *
 * @author makejava
 * @since 2022-07-09 19:40:39
 */
@Service("teacherService")
public class TeacherServiceImpl implements TeacherService {
    @Resource
    private TeacherDao teacherDao;

    /**
     * 通过ID查询单条数据
     *
     * @param teacherId 主键
     * @return 实例对象
     */
    @Override
    public Teacher queryById(Long teacherId) {
        return this.teacherDao.queryById(teacherId);
    }



    /**
     * 新增数据
     *
     * @param teacher 实例对象
     * @return 实例对象
     */
    @Override
    public Teacher insert(Teacher teacher) {
        this.teacherDao.insert(teacher);
        return teacher;
    }

    /**
     * 修改数据
     *
     * @param teacher 实例对象
     * @return 实例对象
     */
    @Override
    public Teacher update(Teacher teacher) {
        this.teacherDao.update(teacher);
        return this.queryById(teacher.getTeacherId());
    }

    /**
     * 通过主键删除数据
     *
     * @param teacherId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long teacherId) {
        return this.teacherDao.deleteById(teacherId) > 0;
    }
}
