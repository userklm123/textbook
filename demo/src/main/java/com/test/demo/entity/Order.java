package com.test.demo.entity;

import java.io.Serializable;

/**
 * (Order)实体类
 *
 * @author makejava
 * @since 2022-07-09 19:25:21
 */
public class Order implements Serializable {
    private static final long serialVersionUID = 604613092436831810L;
    
    private Long orderId;
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
     * 订购数量
     */
    private Long amount;
    /**
     * 订购时间
     */
    private String orderTime;
    /**
     * 总价
     */
    private Long price;
    /**
     * 订购渠道
     */
    private String orderChannel;


    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
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

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getOrderChannel() {
        return orderChannel;
    }

    public void setOrderChannel(String orderChannel) {
        this.orderChannel = orderChannel;
    }

}

