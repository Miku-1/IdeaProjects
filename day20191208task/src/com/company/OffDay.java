package com.company;


/*
* 请假信息
* */
public class OffDay {
    // 请假编号
    private String offDayId;

    // 员工编号
    private String employeeId;

    // 请假时长
    private Integer duration;

    // 请假原因
    private Integer offDayReason;

    public String getOffDayId() {
        return offDayId;
    }

    public void setOffDayId(String offDayId) {
        this.offDayId = offDayId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getOffDayReason() {
        return offDayReason;
    }

    public void setOffDayReason(Integer offDayReason) {
        this.offDayReason = offDayReason;
    }
}
