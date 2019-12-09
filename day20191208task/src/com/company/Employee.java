package com.company;
/*
* 描述员工信息
* */
public class Employee {
    // 员工编号
    private String emplyeeId;

    // 员工姓名
    private String employeeName;

    // 性别
    private String employeeSex;

    // 年龄
    private Integer employeeAge;

    // 籍贯
    private Integer employeeHometown;

    // 手机号
    private Integer employeePhone;


    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeSex() {
        return employeeSex;
    }

    public void setEmployeeSex(String employeeSex) {
        this.employeeSex = employeeSex;
    }

    public Integer getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(Integer employeeAge) {
        this.employeeAge = employeeAge;
    }

    public Integer getEmployeeHometown() {
        return employeeHometown;
    }

    public void setEmployeeHometown(Integer employeeHometown) {
        this.employeeHometown = employeeHometown;
    }

    public Integer getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(Integer employeePhone) {
        this.employeePhone = employeePhone;
    }

    public String getEmplyeeId() {
        return emplyeeId;
    }

    public void setEmplyeeId(String emplyeeId) {
        this.emplyeeId = emplyeeId;
    }

}
