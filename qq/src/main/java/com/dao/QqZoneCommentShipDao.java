package com.dao;

/*
 *@Date: 13:08 2019/12/21
 *@Description:
 */

import com.pojo.QZoneComments;
import com.pojo.QZoneLogCommentShip;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class QqZoneCommentShipDao {

    private static final String DRIVER = "com.mysql.jdbc.Driver";
    //连接的数据库，结构是 协议+ip地址+端口号+数据库名
    private static final String URL = "jdbc:mysql://101.132.33.149:3306/wenxin";
    //数据库的用户名
    private static final String USERNAME = "root";
    //密码
    private static final String PASSWORD = "123456";

    public QqZoneCommentShipDao() {
        try {
            Class.forName(DRIVER);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
    public void add(QZoneLogCommentShip qZoneLogCommentShip){

    }

    public void delete(Integer id){

    }
    public void update(QZoneLogCommentShip qZoneLogCommentShip){}

    public List getList(){
        List<Object> list = new ArrayList<>();
        return list;
    }
}