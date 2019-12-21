package com.service;

/*
 *@Date: 11:02 2019/12/21
 *@Description:
 */

import com.pojo.QqGroup;

import java.util.List;

public interface QqGroupService {
    /*
    * 增加
    * */
    void addGroup(QqGroup qqGroup);

    /*
    * 删除
    * */
    void deleteGroup(QqGroup qqGroup);

    /*
    * 修改
    * */
    void updateGroup(QqGroup qqGroup);

    /*
    * 查看
    * */
    List<QqGroup> selectQqGroup();
}
