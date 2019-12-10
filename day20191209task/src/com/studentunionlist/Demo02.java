package com.studentunionlist;

import com.studentunion.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
* 学生表
* */
public class Demo02 {
    public static void main(String[] args) throws IOException {
        List<Student> students = new ArrayList<>();

        Student ali = new Student();

        ali.setSchoolId("SX015");
        ali.setStuId("SLG1618023");
        ali.setStuName("阿狸");
        ali.setStuAge("19");
        ali.setStuSex("女");
        ali.setStuProfession("外语");
        ali.setStuPhone("13235679898");

        students.add(ali);
//        System.out.println(students.get(0).toString());
        // 将该学生信息写入本地文件
        String filepath = "E:\\file\\Students.txt";
        outPut(students.get(0).toString(),filepath);

        readText(filepath);


    }
    /*
    * 定义函数  输出学生信息文档
    * */
    private static void outPut(String word,String filepath) throws IOException {
        File file = new File(filepath);
        Writer write = new OutputStreamWriter(new FileOutputStream(filepath));
        write.write(word);
        write.close();

    }
    /*
    * 定义函数 读文档
    * */
    private static void readText(String filepath) throws IOException {
        File file = new File(filepath);
        FileInputStream fileInputStream = new FileInputStream(file);
        Reader reader = new InputStreamReader(fileInputStream);
        char[] chars = new char[1000];
        int len = reader.read(chars);
        System.out.println(new String(chars,0,len));
        reader.close();



    }
}
