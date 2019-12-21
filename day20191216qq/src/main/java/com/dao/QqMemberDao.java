package com.dao;

/*
 *@Date: 15:28 2019/12/17
 *@Description:对QQ信息表相关操作的实现
 */

import com.pojo.QqMember;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class QqMemberDao {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    //连接的数据库，结构是 协议+ip地址+端口号+数据库名
    private static final String URL = "jdbc:mysql://101.132.33.149:3306/wenxin";
    //数据库的用户名
    private static final String USERNAME = "root";
    //密码
    private static final String PASSWORD = "123456";

    public QqMemberDao() {
        try {
            Class.forName(DRIVER);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

    /*
     * 获取表中的数据数目
     * */
    public int getTotal() {
        int total = 0;
        try (Connection c = getConnection(); Statement s = c.createStatement();) {

            String sql = "SELECT COUNT(*) FROM t_qq_member";

            ResultSet rs = s.executeQuery(sql);
            while (rs.next()) {
                total = rs.getInt(1);
            }

            System.out.println("total:" + total);

        } catch (SQLException e) {

            e.printStackTrace();
        }
        return total;
    }

    /*
     *添加
     * */
    public void add(QqMember qqMember) {
        String sql = "INSERT INTO t_qq_member values(null,?,?,?,?,?)";
        try (Connection c = getConnection(); PreparedStatement ps = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, qqMember.getQqNumber());
            ps.setString(2, qqMember.getPassword());
            ps.setString(3, qqMember.getImgUrl());
            ps.setString(4, qqMember.getNickName());
            ps.setString(5, qqMember.getSex());
            ps.execute();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                int id = rs.getInt(1);
                qqMember.setId(id);
                System.out.println(qqMember.toString());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    /*
     * 修改
     * */
    public void update(QqMember qqMember) {
        String sql = "UPDATE t_qq_member SET password = ? ,img_url = ?,nickename = ?,sex =? WHERE qq_number = ?";
        try (Connection c = getConnection(); PreparedStatement ps = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, qqMember.getPassword());
            ps.setString(2, qqMember.getImgUrl());
            ps.setString(3, qqMember.getNickName());
            ps.setString(4, qqMember.getSex());
            ps.setString(5, qqMember.getQqNumber());
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    /*
     * 删除
     * */
    public void delete(String qqNumber) {
        String sql = "DELETE FROM t_qq_member WHERE qq_number = " + qqNumber;
        try (Connection c = getConnection(); Statement s = c.createStatement()) {
            s.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /*
     *按qq号查找
     * */
    public QqMember get(String qqNumber) {
        QqMember qqMember = null;
        String sql = "SELECT * FROM t_qq_member WHERE qq_number = " + qqNumber;
        try (Connection c = getConnection(); Statement s = c.createStatement()) {
            ResultSet rs = s.executeQuery(sql);

            if (rs.next()) {
                qqMember = new QqMember();
                qqMember.setQqNumber(rs.getString("qq_bumber"));
                qqMember.setImgUrl(rs.getString("img_url"));
                qqMember.setSex(rs.getString("sex"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return qqMember;
    }

    /*
     * 利用对象数组输出表中数据
     * */
    public List getList() {
        List<QqMember> list = new ArrayList<>();
        try (Connection c = getConnection(); Statement s = c.createStatement();) {

            String sql = "SELECT * FROM t_qq_member";

            ResultSet rs = s.executeQuery(sql);
            while (rs.next()) {
                QqMember qqMember = new QqMember();
                qqMember.setId(rs.getInt(1));
                qqMember.setQqNumber(rs.getString(2));
                qqMember.setPassword(rs.getString(3));
                qqMember.setImgUrl(rs.getNString(4));
                qqMember.setNickName(rs.getNString(5));
                qqMember.setSex(rs.getString(6));
                list.add(qqMember);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;

    }

    public static void main(String[] args) throws SQLException {


    }
}

