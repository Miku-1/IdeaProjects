package com.service;

/*
 *@Date: 13:20 2019/12/21
 *@Description:
 */

import com.pojo.QZone;

import java.util.List;

public interface QqZoneService {

    /*
     * 增加
     * */
    void addQZone(QZone qZone);

    /*
     * 删除
     * */
    void deleteQZone(QZone qZone);

    /*
     * 修改
     * */
    void updateQZone(QZone qZone);

    /*
     * 查看
     * */
    List<QZone> getQZone();
}

