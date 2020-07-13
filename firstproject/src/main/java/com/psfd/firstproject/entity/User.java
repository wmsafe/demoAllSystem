package com.psfd.firstproject.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Mht
 * @since 2020-07-12
 */
@TableName("user")
public class User extends Model<User> {

private static final long serialVersionUID=1L;

    private String username;

    private String password;

    private Integer quanxian;


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

    public Integer getQuanxian() {
        return quanxian;
    }

    public void setQuanxian(Integer quanxian) {
        this.quanxian = quanxian;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "User{" +
        "username=" + username +
        ", password=" + password +
        ", quanxian=" + quanxian +
        "}";
    }
}
