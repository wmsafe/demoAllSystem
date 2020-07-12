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
@TableName("vip_ci")
public class Vip_ci extends Model<Vip_ci> {

private static final long serialVersionUID=1L;

    @TableId(value = "consumeId", type = IdType.AUTO)
    private Integer consumeId;

    private Integer vipid;

    private String name;

    private Integer commodityId;

    private String commodityName;

    private Float price;

    private Float practicePrice;


    public Integer getConsumeId() {
        return consumeId;
    }

    public void setConsumeId(Integer consumeId) {
        this.consumeId = consumeId;
    }

    public Integer getVipid() {
        return vipid;
    }

    public void setVipid(Integer vipid) {
        this.vipid = vipid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public Float getPracticePrice() {
        return practicePrice;
    }

    public void setPracticePrice(Float practicePrice) {
        this.practicePrice = practicePrice;
    }

    @Override
    protected Serializable pkVal() {
        return this.consumeId;
    }

    @Override
    public String toString() {
        return "Vip_ci{" +
        "consumeId=" + consumeId +
        ", vipid=" + vipid +
        ", name=" + name +
        ", commodityId=" + commodityId +
        ", commodityName=" + commodityName +
        ", price=" + price +
        ", practicePrice=" + practicePrice +
        "}";
    }
}
