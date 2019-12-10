package com.studentunionlist;

import com.studentunion.Student;

import java.util.ArrayList;
import java.util.List;

/*
* 学生表
* */
public class Demo02 {
    public static void main(String[] args) {
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

        System.out.println(students.get(0).toString());
        String filepath = "E:\\file\\Students.txt";


    }

}
