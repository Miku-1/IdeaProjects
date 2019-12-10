package com.studentunion;


/*
* 教师类
* */
public class Teacher {
    // 教工编号
    private String teaId;

    // 教师姓名
    private String teaName;

    // 教师性别
    private String teaSex;

    // 教师年龄
    private Integer teaAge;

    // 教师在学院身份
    private String teaPosition;

    // 所在学校编号
    private String schoolId;

    public String getTeaId() {
        return teaId;
    }

    public void setTeaId(String teaId) {
        this.teaId = teaId;
    }

    public String getTeaName() {
        return teaName;
    }

    public void setTeaName(String teaName) {
        this.teaName = teaName;
    }

    public String getTeaSex() {
        return teaSex;
    }

    public void setTeaSex(String teaSex) {
        this.teaSex = teaSex;
    }

    public Integer getTeaAge() {
        return teaAge;
    }

    public void setTeaAge(Integer teaAge) {
        this.teaAge = teaAge;
    }

    public String getTeaPosition() {
        return teaPosition;
    }

    public void setTeaPosition(String teaPosition) {
        this.teaPosition = teaPosition;
    }

    public String getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teaId='" + teaId + '\'' +
                ", teaName='" + teaName + '\'' +
                ", teaSex='" + teaSex + '\'' +
                ", teaAge=" + teaAge +
                ", teaPosition='" + teaPosition + '\'' +
                ", schoolId='" + schoolId + '\'' +
                '}';
    }
}
