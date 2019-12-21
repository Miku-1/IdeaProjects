package com.pojo;

import lombok.Data;

/*
 *@Date: 15:11 2019/12/17
 *@Description:
 */
@Data
public class QqMemberShip {
    /**
     * 记录id  主键id
     */
    private Integer id;
    /**
     * 自己qq号的id
     */
    private Integer QqMemberId;
    /**
     * 朋友qq号的id
     */
    private Integer friendId;
    /**
     * 分组id
     */
    private Integer groupId;
    /**
     * 0 特别关注
     * 1 拉黑了
     * 2 删除
     */
    private Short status;

}