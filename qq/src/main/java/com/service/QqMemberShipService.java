package com.service;

/*
 *@Date: 13:16 2019/12/21
 *@Description:
 */

import com.pojo.QqMemberShip;

import java.util.List;

public interface QqMemberShipService {

    /*
     * 增加
     * */
    void addQqMemberShip(QqMemberShip qqMemberShip);

    /*
     * 删除
     * */
    void deleteQqMemberShip(QqMemberShip qqMemberShip);

    /*
     * 修改
     * */
    void updateQqMemberShip(QqMemberShip qqMemberShip);

    /*
     * 查看
     * */
    List<QqMemberShip> getQqMemberShip();
}
