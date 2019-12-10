package com.studentunion;

import java.io.*;
import java.util.Date;

public class WriteLog {
    public static void main(String[] args) throws IOException {
        /*
        * 谁写日志
        * */
        Student wang = new Student();
        wang.setSchoolId("SLG");
        wang.setStuId("SLG1512056");
        wang.setStuName("杨晓红");
        wang.setStuSex("女");
        wang.setStuAge(23);
        wang.setStuProfession("财务管理");
        wang.setStuPhone("13772567667");


        /*
        * 给谁写日志
        * */
        Student li = new Student();
        li.setSchoolId("SLG");
        li.setStuId("SLG1512076");
        li.setStuName("李琪");
        li.setStuSex("女");
        li.setStuAge(21);
        li.setStuProfession("财务管理");
        li.setStuPhone("13445678876");
        // 周志内容
        String words = "本周我部进行什么........";
        // 文件保存路径
        String filepath = "E:\\file\\Weeklylog.txt";

        String weekLog= weeklyLog(li, wang,words);

        outPut(weekLog,filepath);

        // readText(filepath);

    }
    public static String weeklyLog(Student member,Student leader,String words){
        // 生成日期
        Date date = new Date();
        System.out.println("本周工作汇报");
        System.out.println(date);
        System.out.println(words);
        System.out.println("汇到人:\t"+ member);
        System.out.println("汇到对象:\t"+ leader);
        return  "汇报时间:\t"+date + "\n" +
                "汇报记录:\t"+ words+"\n" +
                "汇报人信息:\t"+member+"\n" +
                "汇报对象信息:\t"+leader;
    }
    /*
    * 写入文件
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
