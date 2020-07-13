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
@TableName("book_type")
public class BookType extends Model<BookType> {

    private static final long serialVersionUID = 1L;

    /**
     * 图书类型编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 图书类型名称
     */
    private String typename;
    /**
     * 可借天数
     */
    private Integer days;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Book_type{" +
        "id=" + id +
        ", typename=" + typename +
        ", days=" + days +
        "}";
    }
}
