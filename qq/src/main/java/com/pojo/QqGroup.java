package com.pojo;

import lombok.Data;

import java.util.Date;

/*
 *@Date: 15:12 2019/12/17
 *@Description:
 */
@Data
public class QqGroup {
    /**
     * 主键id
     */
    private Integer id;
    /**
     * 分组名称
     */
    private String groupName;
    /**
     * 创建分组的时间
     */
    private Date createTime;

}