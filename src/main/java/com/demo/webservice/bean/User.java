package com.demo.webservice.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * create by WSL_SILVA
 * 日期: 2018/7/19 0019
 * 用途：
 * 描述:
 */
public class User implements Serializable{
    private Date createTime;

    private String name;

    private String password;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
