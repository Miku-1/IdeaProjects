package com.service.impl;

/*
 *@Date: 11:09 2019/12/21
 *@Description:
 */

import com.dao.QqGroupDao;
import com.pojo.QqGroup;
import com.service.QqGroupService;

import java.util.List;

public class QqGroupServiceImpl implements QqGroupService{
    QqGroupDao qqGroupDao;
    public  QqGroupServiceImpl(){
        qqGroupDao = new QqGroupDao();
    }

    // 添加
    @Override
    public void addGroup(QqGroup qqGroup) {
        qqGroupDao.add(qqGroup);
    }

    @Override
    public void deleteGroup(QqGroup qqGroup) {
        qqGroupDao.delete(qqGroup.getId());
    }

    @Override
    public void updateGroup(QqGroup qqGroup) {
        qqGroupDao.update(qqGroup);
    }

    @Override
    public List<QqGroup> selectQqGroup() {
        return qqGroupDao.getList();
    }
}
