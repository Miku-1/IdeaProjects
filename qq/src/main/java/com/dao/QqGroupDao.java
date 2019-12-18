package com.dao;

/*
 *@Date: 17:24 2019/12/18
 *@Description: 对 QQ分组表相关操作的实现
 */

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.pojo.QqGroup;

public class QqGroupDao {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    //连接的数据库，结构是 协议+ip地址+端口号+数据库名
    private static final String URL = "jdbc:mysql://101.132.33.149:3306/wenxin";
    //数据库的用户名
    private static final String USERNAME = "root";
    //密码
    private static final String PASSWORD = "123456";

    public QqGroupDao() {
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

            String sql = "SELECT COUNT(*) FROM t_qq_group";

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
    public void add(QqGroup qqGroup) {
        String sql = "INSERT INTO t_qq_group values(null,?,?)";
        try (Connection c = getConnection(); PreparedStatement ps = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, qqGroup.getGroupName());
            ps.setDate(2, (Date) qqGroup.getCreateTime());
            ps.execute();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                int id = rs.getInt(1);
                qqGroup.setId(id);
                System.out.println(qqGroup.toString());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    /*
     * 修改
     * */
    public void update(QqGroup qqGroup) {
        String sql = "UPDATE t_qq_group SET groupname = ? ,createtime = ? WHERE id = ?";
        try (Connection c = getConnection(); PreparedStatement ps = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, qqGroup.getGroupName());
            ps.setDate(2, (Date) qqGroup.getCreateTime());
            ps.setInt(3, qqGroup.getId());
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    /*
     * 删除
     * */
    public void delete(Integer id) {
        String sql = "DELETE FROM t_qq_group WHERE id = " + id;
        try (Connection c = getConnection(); Statement s = c.createStatement()) {
            s.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /*
     *按id查找
     * */
    public QqGroup get(Integer id) {
        QqGroup qqGroup = null;
        String sql = "SELECT * FROM t_qq_group WHERE id = " + id;
        try (Connection c = getConnection(); Statement s = c.createStatement()) {
            ResultSet rs = s.executeQuery(sql);

            if (rs.next()) {
                qqGroup = new QqGroup();
                qqGroup.setId(rs.getInt(1));
                qqGroup.setGroupName(rs.getString(2));
                qqGroup.setCreateTime(rs.getDate(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return qqGroup;
    }

    /*
     * 利用对象数组输出表中数据
     * */
    public List getList() {
        List<QqGroup> list = new ArrayList<>();
        try (Connection c = getConnection(); Statement s = c.createStatement();) {

            String sql = "SELECT * FROM t_qq_group";

            ResultSet rs = s.executeQuery(sql);
            while (rs.next()) {
                QqGroup qqGroup = new QqGroup();
                qqGroup.setId(rs.getInt(1));
                qqGroup.setGroupName(rs.getString(2));
                qqGroup.setCreateTime(rs.getDate(3));
                list.add(qqGroup);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;

    }

    public static void main(String[] args) throws SQLException {
        QqGroup qqGroup = new QqGroup();
        qqGroup.setId(3);
        qqGroup.setGroupName("家人");
        qqGroup.setCreateTime(new Date(2019 - 1900, 12 - 1, 18));

        QqGroupDao qqGroupDao = new QqGroupDao();
        qqGroupDao.getTotal();
//        qqGroupDao.add(qqGroup);
//        qqGroupDao.update(qqGroup);
//        qqGroupDao.delete(5);
//        System.out.println(qqGroupDao.get(5).toString());
        System.out.println(qqGroupDao.getList().toString());

    }
}

