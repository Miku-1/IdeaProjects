package com.service;

/*
 *@Date: 11:18 2019/12/21
 *@Description:
 */

import com.pojo.QqMember;

import java.util.List;

public interface QqMemberService {

    /*
    * 增加
    * */
    void addQqMember(QqMember qqMember);

    /*
    * 删除
    * */
    void deleteQqMember(QqMember qqMember);

    /*
    * 修改
    * */
    void updateQqMember(QqMember qqMember);

    /*
    * 查看
    * */
    List<QqMember> getQqMember();
}
