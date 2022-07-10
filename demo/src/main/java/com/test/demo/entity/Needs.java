package com.test.demo.entity;

import java.io.Serializable;

/**
 * (Needs)实体类
 *
 * @author makejava
 * @since 2022-07-09 19:01:49
 */
public class Needs implements Serializable {
    private static final long serialVersionUID = 390718916865740532L;
    
    private Long needId;
    /**
     * 教材id
     */
    private Long textbookId;
    /**
     * 数量
     */
    private Long amount;
    /**
     * 所属课程
     */
    private String course;
    /**
     * 老师ID
     */
    private String teacherId;
    /**
     * 申请人系部
     */
    private String department;
    /**
     * 是否被系部审查过并锁定
     */
    private String departmentWhr;
    /**
     * 是否被教材科审查过
     */
    private String sectionWhr;
    /**
     * 单价
     */
    private Long price;


    public Long getNeedId() {
        return needId;
    }

    public void setNeedId(Long needId) {
        this.needId = needId;
    }

    public Long getTextbookId() {
        return textbookId;
    }

    public void setTextbookId(Long textbookId) {
        this.textbookId = textbookId;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartmentWhr() {
        return departmentWhr;
    }

    public void setDepartmentWhr(String departmentWhr) {
        this.departmentWhr = departmentWhr;
    }

    public String getSectionWhr() {
        return sectionWhr;
    }

    public void setSectionWhr(String sectionWhr) {
        this.sectionWhr = sectionWhr;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

}

