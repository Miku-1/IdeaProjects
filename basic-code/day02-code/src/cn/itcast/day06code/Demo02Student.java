package cn.itcast.day06code;

/*
*
*   对象创建格式
*   类名称 对象名 = new 类名称();
*   Student ali = new Student();
*
* */
import cn.itcast.day06code.Student;

public class Demo02Student {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.age = 18;
        stu.name = "Ali";

        System.out.println(stu.age);
        stu.eat();
    }
}
