package com.springBoot.wmsafe.model;

import org.springframework.stereotype.Controller;

public class Users {

    private long id;//用户ID
    private String username;//员工账号
    private String password;//员工密码
    private Byte sex;//员工性别
    private String birthday;//出生日期
    private String createtime;//创建日期
    private Byte isadmin;//是否是管理员
    private String content;//人员介绍

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public Byte getIsadmin() {
        return isadmin;
    }

    public void setIsadmin(Byte isadmin) {
        this.isadmin = isadmin;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", sex=" + sex +
                ", birthday='" + birthday + '\'' +
                ", createtime='" + createtime + '\'' +
                ", isadmin=" + isadmin +
                ", content='" + content + '\'' +
                '}';
    }
}