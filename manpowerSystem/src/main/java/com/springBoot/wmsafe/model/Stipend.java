package com.springBoot.wmsafe.model;

public class Stipend {

    private Long id; //薪金信息编号
    private String name; //员工姓名
    private Float basic; //基本薪金
    private Float eat; //饭补
    private Float house;//房补
    private String granttime;// 工资发放时间
    private Float duty; //全勤奖
    private Float scot; //赋税
    private Float punishment; //罚款
    private Float other; //额外补助
    private Float totalize; //总计

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getBasic() {
        return basic;
    }

    public void setBasic(Float basic) {
        this.basic = basic;
    }

    public Float getEat() {
        return eat;
    }

    public void setEat(Float eat) {
        this.eat = eat;
    }

    public Float getHouse() {
        return house;
    }

    public void setHouse(Float house) {
        this.house = house;
    }

    public String getGranttime() {
        return granttime;
    }

    public void setGranttime(String granttime) {
        this.granttime = granttime;
    }

    public Float getDuty() {
        return duty;
    }

    public void setDuty(Float duty) {
        this.duty = duty;
    }

    public Float getScot() {
        return scot;
    }

    public void setScot(Float scot) {
        this.scot = scot;
    }

    public Float getPunishment() {
        return punishment;
    }

    public void setPunishment(Float punishment) {
        this.punishment = punishment;
    }

    public Float getOther() {
        return other;
    }

    public void setOther(Float other) {
        this.other = other;
    }

    public Float getTotalize() {
        return totalize;
    }

    public void setTotalize(Float totalize) {
        this.totalize = totalize;
    }

    @Override
    public String toString() {
        return "Stipend{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", basic=" + basic +
                ", eat=" + eat +
                ", house=" + house +
                ", granttime=" + granttime +
                ", duty=" + duty +
                ", scot=" + scot +
                ", punishment=" + punishment +
                ", other=" + other +
                ", totalize=" + totalize +
                '}';
    }
}
