package com.company;

import java.util.Date;

/*
 * 员工考勤表
 * */
public class EmployeeCheck {
    // 表单编号
    private String empcheckId;

    // 考勤编号
    private String checkId;

    // 员工编号
    private String employeeId;

    public String getEmpcheckId() {
        return empcheckId;
    }

    public void setEmpcheckId(String empcheckId) {
        this.empcheckId = empcheckId;
    }

    public String getCheckId() {
        return checkId;
    }

    public void setCheckId(String checkId) {
        this.checkId = checkId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
}