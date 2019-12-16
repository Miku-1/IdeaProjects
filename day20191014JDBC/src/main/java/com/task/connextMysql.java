package com.task;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class connextMysql {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    //连接的数据库，结构是 协议+ip地址+端口号+数据库名
    private static final String URL = "jdbc:mysql://101.132.33.149:3306/wenxin";
    //数据库的用户名
    private static final String USERNAME = "root";
    //密码
    private static final String PASSWORD = "123456";

    // 执行sql语句 实现增删改
    public static void orde(String sql) throws SQLException {
        Connection connection = null;
        Statement statement = null;
        try {
            // 加载驱动
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            // 获取执行对象
            statement = connection.createStatement();
            statement.executeUpdate(sql);
//            System.out.println("Success");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
                connection.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    // 查询
    public static List show(String tableName) throws SQLException {
        Connection connection = null;
        Statement statement = null;
        List<Animal> list = new ArrayList<Animal>();
        try {
            // 加载驱动
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            // 获取执行对象
            statement = connection.createStatement();
            // 获得结果
            ResultSet resultSet = statement.executeQuery("SELECT * FROM "+tableName);

            // 获取表头信息（列集）
            ResultSetMetaData rsmd = resultSet.getMetaData();
            // 打印表头（第一列 从1开始）
            int columnCount = rsmd.getColumnCount();
            for (int i = 0; i < columnCount; i++) {
                System.out.printf("%-6s",rsmd.getColumnName(i+1));
            }
            System.out.println();
            while (resultSet.next()) {
                Animal animal = new Animal();
                animal.setId(resultSet.getInt("id"));
                animal.setName(resultSet.getString("name"));
                animal.setAge(resultSet.getInt("age"));
                list.add(animal);
                System.out.printf("%-6d%-6s%-6d\n", animal.getId(), animal.getName(), animal.getAge());
            }
//            System.out.println(list);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
                connection.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        String tableName1 = "t_animal";
        String tableName2 = "t_goods";
        String tableName3 = "t_person";
        String sql2 = "INSERT INTO t_animal (name,age) VALUES('dog','2'),('cat',3)";
        String sql3 = "DELETE FROM t_animal WHERE ID = '5'";
        String sql4 = "UPDATE t_animal SET name = 'cow' WHERE ID = '6'";
        try {
            connextMysql.orde(sql4);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try{
                connextMysql.show(tableName1);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
