package cn.itcast.day02;

import java.util.ArrayList;

public class DemoTest2 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student stu1 = new Student("小胡",20);
        Student stu2 = new Student("小狗",10);
        Student stu3 = new Student("老马",30);
        Student stu4 = new Student("护士",23);

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName()+"年龄"+list.get(i).getAge());
        }
    }
}
