package com.studentunion;

/*
 * 学生会
 * */
public class StudentUnion {
    // 学生会编号
    private String stuUnionId;

    // 学生会名称(院级)
    private String stuUnionName;

    // 主管老师教工编号
    private String teacherId;

    // 学生会主席学号
    private String stuId;

    // 从属学校编号
    private String schoolId;

    public String getStuUnionId() {
        return stuUnionId;
    }

    public void setStuUnionId(String stuUnionId) {
        this.stuUnionId = stuUnionId;
    }

    public String getStuUnionName() {
        return stuUnionName;
    }

    public void setStuUnionName(String stuUnionName) {
        this.stuUnionName = stuUnionName;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
    }

    @Override
    public String toString() {
        return "StudentUnion{" +
                "stuUnionId='" + stuUnionId + '\'' +
                ", stuUnionName='" + stuUnionName + '\'' +
                ", teacherId='" + teacherId + '\'' +
                ", stuId='" + stuId + '\'' +
                ", schoolId='" + schoolId + '\'' +
                '}';
    }
}
