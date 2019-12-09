package com.company;

import java.net.Inet4Address;

public class Department {
    // 部门id
    private String depId;

    // 部门名称
    private String depName;

    // 部门领导编号
    private String leaderId;

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public String getDepLeader() {
        return leaderId;
    }

    public void setDepLeader(String depLeader) {
        this.leaderId = depLeader;
    }
}
