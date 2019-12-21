package com.service.impl;

/*
 *@Date: 15:35 2019/12/21
 *@Description:
 */

import com.dao.QqZoneLogDao;
import com.pojo.QZoneLog;
import com.service.QZoneLogService;

import java.util.List;

public class QZoneLogServiceImpl implements QZoneLogService {
    QqZoneLogDao qqZoneLogDao;

    public QZoneLogServiceImpl() {
        qqZoneLogDao = new QqZoneLogDao();
    }

    @Override
    public void addQZoneLog(QZoneLog qZoneLog) {
        qqZoneLogDao.add(qZoneLog);
    }

    @Override
    public void deleteQZoneLog(QZoneLog qZoneLog) {
        qqZoneLogDao.delete(qZoneLog.getId());
    }

    @Override
    public void updateQZoneLog(QZoneLog qZoneLog) {
        qqZoneLogDao.update(qZoneLog);
    }

    @Override
    public List<QZoneLog> getQZoneLog() {
        return null;
    }
}
