package com.service.impl;

/*
 *@Date: 15:27 2019/12/21
 *@Description:
 */

import com.dao.QqZoneCommentsDao;
import com.pojo.QZoneComments;
import com.service.QqZoneCommentsService;

import java.util.List;

public class QqZoneCommentsServiceImpl implements QqZoneCommentsService {
    QqZoneCommentsDao qqZoneCommentsDao;

    public QqZoneCommentsServiceImpl() {
        qqZoneCommentsDao = new QqZoneCommentsDao();
    }

    @Override
    public void addQZoneComments(QZoneComments qZoneComments) {
        qqZoneCommentsDao.add(qZoneComments);
    }

    @Override
    public void deleteQZoneComments(QZoneComments qZoneComments) {
        qqZoneCommentsDao.delete(qZoneComments.getId());
    }

    @Override
    public void updateQZoneComments(QZoneComments qZoneComments) {

    }

    @Override
    public List<QZoneComments> getQZoneComments() {
        return null;
    }
}
