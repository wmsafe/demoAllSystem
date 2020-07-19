package com.springBoot.wmsafe.model;

public class Educate {

    private Long id;//培训编号
    private String name;//培训名称
    private String purpose;//培训目的
    private String begintime;//培训开始时间
    private String endtime;//培训结束时间
    private String datum;//培训材料
    private String teacher;//格训讲师
    private String student;//培训人员
    private String createtime;//创建时间
    private Byte educate;//培训是否完成
    private String effect;//培训效果
    private String summarize;//总结

    @Override
    public String toString() {
        return "Educate{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", purpose='" + purpose + '\'' +
                ", begintime=" + begintime +
                ", endtime=" + endtime +
                ", datum='" + datum + '\'' +
                ", teacher='" + teacher + '\'' +
                ", student='" + student + '\'' +
                ", createtime=" + createtime +
                ", educate=" + educate +
                ", effect='" + effect + '\'' +
                ", summarize='" + summarize + '\'' +
                '}';
    }

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

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getBegintime() {
        return begintime;
    }

    public void setBegintime(String begintime) {
        this.begintime = begintime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public Byte getEducate() {
        return educate;
    }

    public void setEducate(Byte educate) {
        this.educate = educate;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public String getSummarize() {
        return summarize;
    }

    public void setSummarize(String summarize) {
        this.summarize = summarize;
    }
}
