package com.springBoot.wmsafe.model;

public class Job {

    private Long id; //应聘人员编号
    private String name;//应聘人员姓名
    private Byte sex; //性别
    private Integer age;//年龄
    private String job; //IR位
    private String specia丨ty;//所学专业
    private String experience;//工作经验
    private String studyeffort;//学历
    private String schoo丨;//毕业学校
    private String tel; //电话号码
    private String email; //Email 地址
    private String createtime;//创建时间
    private String content; //详细经历
    private Byte isstock; //是否入库

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

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getSpecia丨ty() {
        return specia丨ty;
    }

    public void setSpecia丨ty(String specia丨ty) {
        this.specia丨ty = specia丨ty;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getStudyeffort() {
        return studyeffort;
    }

    public void setStudyeffort(String studyeffort) {
        this.studyeffort = studyeffort;
    }

    public String getSchoo丨() {
        return schoo丨;
    }

    public void setSchoo丨(String schoo丨) {
        this.schoo丨 = schoo丨;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Byte getIsstock() {
        return isstock;
    }

    public void setIsstock(Byte isstock) {
        this.isstock = isstock;
    }

    @Override
    public String toString() {
        return "Job{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", job='" + job + '\'' +
                ", specia丨ty='" + specia丨ty + '\'' +
                ", experience='" + experience + '\'' +
                ", studyeffort='" + studyeffort + '\'' +
                ", schoo丨='" + schoo丨 + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                ", createtime=" + createtime +
                ", content='" + content + '\'' +
                ", isstock=" + isstock +
                '}';
    }
}
