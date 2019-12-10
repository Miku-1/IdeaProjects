package com.studentunion;
/*
*
* 学生类
* */
public class Student {
    // 学号
    private String stuId;

    // 姓名
    private String stuName;

    // 性别
    private String stuSex;

    // 年龄
    private Integer stuAge;

    // 院系
    private String stuProfession;


    // 联系方式
    private String stuPhone;

    // 从属学校编号
    private String schoolId;

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex;
    }

    public Integer getStuAge() {
        return stuAge;
    }

    public void setStuAge(Integer stuAge) {
        this.stuAge = stuAge;
    }

    public String getStuProfession() {
        return stuProfession;
    }

    public void setStuProfession(String stuProfession) {
        this.stuProfession = stuProfession;
    }


    public String getStuPhone() {
        return stuPhone;
    }

    public void setStuPhone(String stuPhone) {
        this.stuPhone = stuPhone;
    }

    public String getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ",\n stuName='" + stuName + '\'' +
                ",\n stuSex='" + stuSex + '\'' +
                ",\n stuAge='" + stuAge + '\'' +
                ",\n stuProfession='" + stuProfession + '\'' +
                ",\n stuPhone='" + stuPhone + '\'' +
                ",\n schoolId='" + schoolId + '\'' +
                '}';
    }
}
