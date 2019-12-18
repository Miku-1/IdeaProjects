package com.pojo;

/*
 *@Date: 15:13 2019/12/17
 *@Description:
 */

import lombok.Data;

@Data
public class QZoneMemberShip {
    private Integer id;
    /**
     * qq号的id
     */
    private Integer memberId;
    /**
     * 空间的id
     */
    private Integer zoneId;
}
