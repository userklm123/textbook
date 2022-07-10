package com.test.demo.entity;

import java.io.Serializable;

/**
 * (Department)实体类
 *
 * @author makejava
 * @since 2022-07-08 20:50:36
 */
public class Department implements Serializable {
    private static final long serialVersionUID = -61834584204798990L;
    
    private Long departmentId;
    /**
     * 密码
     */
    private Long departmentPw;
    /**
     * 系部名称
     */
    private String department;


    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public Long getDepartmentPw() {
        return departmentPw;
    }

    public void setDepartmentPw(Long departmentPw) {
        this.departmentPw = departmentPw;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}

