package com.studentunion;

/*
* 学校
* */

public class School {
    // 学校编号
    private String schoolId;
    // 学校名字
    private String schoolName;

    // 校长
    private String president;

    // 分类
    private String schoolSort;

    public String getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getPresident() {
        return president;
    }

    public void setPresident(String president) {
        this.president = president;
    }

    public String getSchoolSort() {
        return schoolSort;
    }

    public void setSchoolSort(String schoolSort) {
        this.schoolSort = schoolSort;
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolId='" + schoolId + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", president='" + president + '\'' +
                ", schoolSort='" + schoolSort + '\'' +
                '}';
    }
}
