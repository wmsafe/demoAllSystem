package com.psfd.firstproject.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Mht
 * @since 2020-07-12
 */
@TableName("vipinformation")
public class Vipinformation extends Model<Vipinformation> {

private static final long serialVersionUID=1L;

    @TableId(value = "vipId", type = IdType.AUTO)
    private Integer vipId;

    private String name;

    private Integer age;

    private String profession;

    private LocalDateTime joinTime;


    public Integer getVipId() {
        return vipId;
    }

    public void setVipId(Integer vipId) {
        this.vipId = vipId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public LocalDateTime getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(LocalDateTime joinTime) {
        this.joinTime = joinTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.vipId;
    }

    @Override
    public String toString() {
        return "Vipinformation{" +
        "vipId=" + vipId +
        ", name=" + name +
        ", age=" + age +
        ", profession=" + profession +
        ", joinTime=" + joinTime +
        "}";
    }
}
