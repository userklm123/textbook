package com.test.demo.entity;

import java.io.Serializable;

/**
 * (Student)实体类
 *
 * @author makejava
 * @since 2022-07-09 19:35:49
 */
public class Student implements Serializable {
    private static final long serialVersionUID = -13581966152186031L;
    
    private String studentId;
    /**
     * 密码
     */
    private Long studentPw;
    /**
     * 系部
     */
    private String department;
    
    private Long studentTerm;
    /**
     * 姓名
     */
    private String studentName;
    /**
     * 创建时间
     */
    private String coursesId;


    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public Long getStudentPw() {
        return studentPw;
    }

    public void setStudentPw(Long studentPw) {
        this.studentPw = studentPw;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Long getStudentTerm() {
        return studentTerm;
    }

    public void setStudentTerm(Long studentTerm) {
        this.studentTerm = studentTerm;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCoursesId() {
        return coursesId;
    }

    public void setCoursesId(String coursesId) {
        this.coursesId = coursesId;
    }

}

