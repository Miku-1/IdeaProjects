package com.dao;

/*
 *@Date: 18:58 2019/12/20
 *@Description:
 */

import com.pojo.QZone;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class QqZoneDao {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    //连接的数据库，结构是 协议+ip地址+端口号+数据库名
    private static final String URL = "jdbc:mysql://101.132.33.149:3306/wenxin";
    //数据库的用户名
    private static final String USERNAME = "root";
    //密码
    private static final String PASSWORD = "123456";

    public QqZoneDao() {
        try {
            Class.forName(DRIVER);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

    /*
     * 获取表中数据
     * */
    public Integer getTotal() {
        int total = 0;
        try (Connection c = getConnection(); Statement s = c.createStatement()) {
            String sql = "INSERT COUNT(*) FROM t_qq_zone";
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()) {
                total = rs.getInt(1);
            }
            System.out.println("Total:" + total);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return total;
    }

    /*
    * add    *
    * */
    public void add(QZone qZone){
        String sql = "INSERT INTO t_qq_zone values(null,?,?,?)";
        try(Connection c = getConnection();PreparedStatement ps = c.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)){
            ps.setString(1,qZone.getZoneName());
            ps.setString(2,qZone.getBackGroundPicture());
            ps.setString(3,qZone.getQqShowPhoto());
            ps.execute();
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                int id = rs.getInt(1);
                qZone.setId(id);
                System.out.println(qZone.toString());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /*
    * update
    * */
    public void update(QZone qZone){
        String sql = "UPDATE t_qq_zone set zone_name = ?,background_picture = ?, qq_show_photo = ? WHERE id = ?";
        try(Connection c = getConnection();PreparedStatement ps = c.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)){
            ps.setString(1,qZone.getZoneName());
            ps.setString(2,qZone.getBackGroundPicture());
            ps.setString(3,qZone.getQqShowPhoto());
            ps.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /*
    * delete
    * */
    public void delete(Integer id){
        String sql = "DELETE FROM t_qq_zone WHERE id = "+id;
        try(Connection c = getConnection();Statement s = c.createStatement()) {
            s.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /*
    * 输出List
    * */
    public List getList(){
        String sql = "SELECT * FROM t_qq_zone";
        List<QZone> qZoneList = new ArrayList<>();
        try(Connection c = getConnection();Statement s = c.createStatement()) {
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()){
                QZone qZone = new QZone();
                qZone.setId(rs.getInt(1));
                qZone.setZoneName(rs.getString(2));
                qZone.setBackGroundPicture(rs.getString(3));
                qZone.setQqShowPhoto(rs.getString(4));

                qZoneList.add(qZone);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return qZoneList;
    }

}