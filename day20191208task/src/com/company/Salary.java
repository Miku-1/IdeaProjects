package com.company;

public class Salary {
    /*
    * 工资描述
    * */

    // 工资id
    private String salaryId;

    // 员工id
    private String employeeId;

    // 基本工资
    private Integer baseSalary;

    public String getSalaryId() {
        return salaryId;
    }

    public void setSalaryId(String salaryId) {
        this.salaryId = salaryId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Integer baseSalary) {
        this.baseSalary = baseSalary;
    }
}
