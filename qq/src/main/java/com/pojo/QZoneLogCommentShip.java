package com.pojo;

/*
 *@Date: 15:20 2019/12/17
 *@Description:
 */

import lombok.Data;

@Data
public class QZoneLogCommentShip {
    private Integer id;
    /**
     * 日志id
     */
    private Integer logId;
    /**
     * 评论id
     */
    private Integer commontId;
    /**
     * 创建时间
     */
    private Integer createTime;
}