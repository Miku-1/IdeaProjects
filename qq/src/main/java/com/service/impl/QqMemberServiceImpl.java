package com.service.impl;

/*
 *@Date: 11:48 2019/12/21
 *@Description:
 */

import com.dao.QqMemberDao;
import com.pojo.QqMember;
import com.service.QqMemberService;

import java.util.List;

public class QqMemberServiceImpl implements QqMemberService {
    QqMemberDao qqMemberDao;
    public QqMemberServiceImpl(){
        QqMemberDao qqMemberDao = new QqMemberDao();
    }

    @Override
    public void addQqMember(QqMember qqMember) {

        qqMemberDao.add(qqMember);
    }

    @Override
    public void deleteQqMember(QqMember qqMember) {
        qqMemberDao.delete(qqMember.getQqNumber());
    }

    @Override
    public void updateQqMember(QqMember qqMember) {
        qqMemberDao.update(qqMember);
    }

    @Override
    public List<QqMember> getQqMember() {
        return qqMemberDao.getList();
    }
}
