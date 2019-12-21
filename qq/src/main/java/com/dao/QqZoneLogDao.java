package com.dao;

/*
 *@Date: 19:26 2019/12/20
 *@Description:
 */

import com.pojo.QZoneLog;
import com.pojo.QqGroup;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class QqZoneLogDao {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    //连接的数据库，结构是 协议+ip地址+端口号+数据库名
    private static final String URL = "jdbc:mysql://101.132.33.149:3306/wenxin";
    //数据库的用户名
    private static final String USERNAME = "root";
    //密码
    private static final String PASSWORD = "123456";

    public QqZoneLogDao(){
        try{
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL,USERNAME,PASSWORD);
    }

    private Integer getTotal(){
        int total = 0;
        try(Connection c = getConnection(); Statement s = c.createStatement()){
            ResultSet rs = s.executeQuery("SELECT COUNT(*) FROM t_qq_zone_log");
            while (rs.next()){
                total = rs.getInt(1);
            }
            System.out.println("Total:" + total);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return total;
    }

    public void add(QZoneLog qZoneLog){
        String sql = "INSERT INTO t_qq_zone_log VALUES (NULL,?,?,?)";
        try(Connection c = getConnection();PreparedStatement ps = c.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)){
            ps.setString(1,qZoneLog.getTitle());
            ps.setString(2,qZoneLog.getContent());
            ps.setDate(3, (Date) qZoneLog.getCreateDate());
            ps.execute();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()){
                Integer id = rs.getInt(1);
                qZoneLog.setId(id);
                System.out.println(qZoneLog.toString());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(QZoneLog qZoneLog){
        String sql = "UPDATE t_qq_zone_log SET title = ?,content = ?,create_date = ?";
        try(Connection c =getConnection();PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1,qZoneLog.getTitle());
            ps.setString(2,qZoneLog.getContent());
            ps.setDate(3,(Date) qZoneLog.getCreateDate());
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } ;
    }

    public void delete(Integer id) {
        String sql = "DELETE FROM t_qq_zone_log WHERE id = " + id;
        try (Connection c = getConnection(); Statement s = c.createStatement()) {
            s.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List getList() {
        List<QZoneLog> list = new ArrayList<>();
        try (Connection c = getConnection(); Statement s = c.createStatement();) {

            String sql = "SELECT * FROM t_qq_zone_log";

            ResultSet rs = s.executeQuery(sql);
            while (rs.next()) {
                QZoneLog qZoneLog = new QZoneLog();
                qZoneLog.setId(rs.getInt(1));
                qZoneLog.setTitle(rs.getString(2));
                qZoneLog.setTitle(rs.getString(3));
                qZoneLog.setCreateDate(rs.getDate(4));
                list.add(qZoneLog);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;

    }
}
