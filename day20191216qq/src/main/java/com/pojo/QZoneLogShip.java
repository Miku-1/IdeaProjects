package com.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class QZoneLogShip {
    /**
     * 主键
     */
    private Integer id;
    /**
     * 空间id
     */
    private Integer qZoneId;
    /**
     * 日志id
     */
    private Integer logId;
    /**
     * 发表日志时间
     */
    private Date creatTime;
}