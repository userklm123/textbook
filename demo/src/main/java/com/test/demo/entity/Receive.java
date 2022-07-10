package com.test.demo.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Receive)实体类
 *
 * @author makejava
 * @since 2022-07-09 19:29:23
 */
public class Receive implements Serializable {
    private static final long serialVersionUID = -82535070334503017L;
    
    private Long personId;
    /**
     * 领书时间
     */
    private Date time;
    /**
     * 书id
     */
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
     * 领书数量
     */
    private Long amount;
    /**
     * 总价
     */
    private Long price;


    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

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

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

}

