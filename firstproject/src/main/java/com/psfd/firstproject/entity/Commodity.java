package com.psfd.firstproject.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Mht
 * @since 2020-07-12
 */
@TableName("commodity")
public class Commodity extends Model<Commodity> {

private static final long serialVersionUID=1L;

    @TableId(value = "commodityId", type = IdType.AUTO)
    private Integer commodityId;

    private String commodityName;

    private Float price;

    private Float agio;


    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getAgio() {
        return agio;
    }

    public void setAgio(Float agio) {
        this.agio = agio;
    }

    @Override
    protected Serializable pkVal() {
        return this.commodityId;
    }

    @Override
    public String toString() {
        return "Commodity{" +
        "commodityId=" + commodityId +
        ", commodityName=" + commodityName +
        ", price=" + price +
        ", agio=" + agio +
        "}";
    }
}
