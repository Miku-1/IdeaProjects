package com.service.impl;

/*
 *@Date: 13:25 2019/12/21
 *@Description:
 */

import com.dao.QqZoneMemberShipDao;
import com.pojo.QqMemberShip;
import com.service.QqMemberShipService;

import java.util.List;

public class QqMemberShipServiceImpl implements QqMemberShipService {
    QqZoneMemberShipDao qzmbsd = null;
    public QqMemberShipServiceImpl(){
        qzmbsd = new QqZoneMemberShipDao();
    }

    @Override
    public void addQqMemberShip(QqMemberShip qqMemberShip) {
        qzmbsd.add(qqMemberShip);
    }

    @Override
    public void deleteQqMemberShip(QqMemberShip qqMemberShip) {
        qzmbsd.delete(qqMemberShip);
    }

    @Override
    public void updateQqMemberShip(QqMemberShip qqMemberShip) {

    }

    @Override
    public List<QqMemberShip> getQqMemberShip() {
        return null;
    }
}
