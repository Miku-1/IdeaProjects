package com.service.impl;

/*
 *@Date: 15:24 2019/12/21
 *@Description:
 */

import com.dao.QqZoneDao;
import com.pojo.QZone;
import com.service.QqZoneService;

import java.util.List;

public class QqZoneServiceImpl implements QqZoneService {
    QqZoneDao qqZoneDao;

    public QqZoneServiceImpl() {
        qqZoneDao = new QqZoneDao();
    }

    @Override
    public void addQZone(QZone qZone) {
        qqZoneDao.add(qZone);
    }

    @Override
    public void deleteQZone(QZone qZone) {
        qqZoneDao.delete(qZone.getId());
    }

    @Override
    public void updateQZone(QZone qZone) {
        qqZoneDao.update(qZone);
    }

    @Override
    public List<QZone> getQZone() {
        return null;
    }
}
