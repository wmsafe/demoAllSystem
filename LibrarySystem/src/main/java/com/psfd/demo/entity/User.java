package com.psfd.demo.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Mht
 * @since 2020-07-11
 */
@TableName("user")
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "userid", type = IdType.AUTO)
    private Integer userid;
    private String username;
    private String password;


    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
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

    @Override
    protected Serializable pkVal() {
        return this.userid;
    }

    @Override
    public String toString() {
        return "User{" +
        "userid=" + userid +
        ", username=" + username +
        ", password=" + password +
        "}";
    }
}
