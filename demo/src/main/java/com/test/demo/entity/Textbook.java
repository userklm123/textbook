package com.test.demo.entity;

import java.io.Serializable;

/**
 * (Textbook)实体类
 *
 * @author makejava
 * @since 2022-07-09 19:44:13
 */
public class Textbook implements Serializable {
    private static final long serialVersionUID = 644531159495516559L;
    
    private Long textbookId;
    /**
     * 书名
     */
    private String textbookName;
    /**
     * 作者
     */
    private String textbookAuthor;
    /**
     * 出版社id
     */
    private String pressId;
    /**
     * 出版社联系人
     */
    private String pressLink;
    /**
     * 类型
     */
    private String type;
    /**
     * 获奖
     */
    private String awards;
    /**
     * 版本
     */
    private String edition;
    /**
     * 出版社名称
     */
    private String pressName;
    /**
     * 所属课程
     */
    private String courseId;
    
    private Long inventory;


    public Long getTextbookId() {
        return textbookId;
    }

    public void setTextbookId(Long textbookId) {
        this.textbookId = textbookId;
    }

    public String getTextbookName() {
        return textbookName;
    }

    public void setTextbookName(String textbookName) {
        this.textbookName = textbookName;
    }

    public String getTextbookAuthor() {
        return textbookAuthor;
    }

    public void setTextbookAuthor(String textbookAuthor) {
        this.textbookAuthor = textbookAuthor;
    }

    public String getPressId() {
        return pressId;
    }

    public void setPressId(String pressId) {
        this.pressId = pressId;
    }

    public String getPressLink() {
        return pressLink;
    }

    public void setPressLink(String pressLink) {
        this.pressLink = pressLink;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAwards() {
        return awards;
    }

    public void setAwards(String awards) {
        this.awards = awards;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getPressName() {
        return pressName;
    }

    public void setPressName(String pressName) {
        this.pressName = pressName;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public Long getInventory() {
        return inventory;
    }

    public void setInventory(Long inventory) {
        this.inventory = inventory;
    }

}

