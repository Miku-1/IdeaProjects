package com.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @Date: 15:19 2019/12/17
 * @Description: 空间日志
 */
@Data
public class QZoneLog {
    /**
     * 主键
     */
    private Integer id;
    /**
     * 日志的标题
     */
    private String title;
    /**
     * 日志的内容
     */
    private String content;
    /**
     * 日志的创建时间
     */
    private Date createDate;
}