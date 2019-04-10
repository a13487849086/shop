package com.itwcxing.bean;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
private Integer id;
private String userName;
private String password;
private Date create_time;
private Date uptate_time;
private Integer plus_member;

    public User() {
    }

    public User(Integer id, String userName, String password, Date create_time, Date uptate_time, Integer plus_member) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.create_time = create_time;
        this.uptate_time = uptate_time;
        this.plus_member = plus_member;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getUptate_time() {
        return uptate_time;
    }

    public void setUptate_time(Date uptate_time) {
        this.uptate_time = uptate_time;
    }

    public Integer getPlus_member() {
        return plus_member;
    }

    public void setPlus_member(Integer plus_member) {
        this.plus_member = plus_member;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", create_time=" + create_time +
                ", uptate_time=" + uptate_time +
                ", plus_member=" + plus_member +
                '}';
    }
}
