package com.company;

import java.net.Inet4Address;

public class Department {
    // 部门id
    private String depId;

    // 部门名称
    private String depName;

    // 部门领导
    private String depLeader;

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
        return depLeader;
    }

    public void setDepLeader(String depLeader) {
        this.depLeader = depLeader;
    }
}
