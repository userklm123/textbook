package com.test.demo.entity;

import java.io.Serializable;

/**
 * (Teacher)实体类
 *
 * @author makejava
 * @since 2022-07-09 19:40:39
 */
public class Teacher implements Serializable {
    private static final long serialVersionUID = 595350072033678904L;
    
    private Long teacherId;
    /**
     * 密码
     */
    private Long teacherPw;
    /**
     * 系部
     */
    private String department;
    /**
     * 姓名
     */
    private String teacherName;
    /**
     * 课程
     */
    private String coursesId;


    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public Long getTeacherPw() {
        return teacherPw;
    }

    public void setTeacherPw(Long teacherPw) {
        this.teacherPw = teacherPw;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getCoursesId() {
        return coursesId;
    }

    public void setCoursesId(String coursesId) {
        this.coursesId = coursesId;
    }

}

