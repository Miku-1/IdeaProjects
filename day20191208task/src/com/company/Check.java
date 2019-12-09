package com.company;

import java.util.Date;

/*
* 考勤信息表
* */
public class Check {
    // 考勤编号
    private String checkId;

    // 考勤时间
    private Date checkTime;

    // 考勤内容
    private String checkInfo;

    // 考勤结果
    private String checkResult;

    // 备注
    private String checkNote;

    public String getCheckId() {
        return checkId;
    }

    public void setCheckId(String checkId) {
        this.checkId = checkId;
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public String getCheckInfo() {
        return checkInfo;
    }

    public void setCheckInfo(String checkInfo) {
        this.checkInfo = checkInfo;
    }

    public String getCheckResult() {
        return checkResult;
    }

    public void setCheckResult(String checkResult) {
        this.checkResult = checkResult;
    }

    public String getCheckNote() {
        return checkNote;
    }

    public void setCheckNote(String checkNote) {
        this.checkNote = checkNote;
    }
}
