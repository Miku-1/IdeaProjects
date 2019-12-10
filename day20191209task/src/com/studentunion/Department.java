package com.studentunion;

/*
* 学会会部室
* */
public class Department {

    // 部室编号
    private String depID;

    // 部室名称
    private String depName;

    // 部长学号
    private String stuId;

    // 主管老师教工编号
    private String teaId;

    public String getDepID() {
        return depID;
    }

    public void setDepID(String depID) {
        this.depID = depID;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getTeaId() {
        return teaId;
    }

    public void setTeaId(String teaId) {
        this.teaId = teaId;
    }

    @Override
    public String toString() {
        return "Department{" +
                "depID='" + depID + '\'' +
                ", depName='" + depName + '\'' +
                ", stuId=" + stuId +
                ", teaId=" + teaId +
                '}';
    }
}
