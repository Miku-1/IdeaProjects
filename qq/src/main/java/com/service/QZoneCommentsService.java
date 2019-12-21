package com.service;

/*
 *@Date: 13:22 2019/12/21
 *@Description:
 */

import com.pojo.QZoneComments;

import java.util.List;

public interface QZoneCommentsService {

    /*
     * 增加
     * */
    void addQZoneComments(QZoneComments qZoneComments);

    /*
     * 删除
     * */
    void deleteQZoneComments(QZoneComments qZoneComments);

    /*
     * 修改
     * */
    void updateQZoneComments(QZoneComments qZoneComments);

    /*
     * 查看
     * */
    List<QZoneComments> getQZoneComments();
}
