package com.test.demo.entity;

import java.io.Serializable;

/**
 * (Admin)实体类
 *
 * @author makejava
 * @since 2022-07-08 20:49:15
 */
public class Admin implements Serializable {
    private static final long serialVersionUID = -97352262227020938L;
    
    private Long adminId;
    /**
     * 密码
     */
    private Long adminPw;


    public Long getAdminId() {
        return adminId;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    public Long getAdminPw() {
        return adminPw;
    }

    public void setAdminPw(Long adminPw) {
        this.adminPw = adminPw;
    }

}

