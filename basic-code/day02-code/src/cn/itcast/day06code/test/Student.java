package cn.itcast.day06code.test;

/*
    标准类:四个组成部分
    1. 所有的成员变量使用private关键字修饰
    2. 为每一个成员变量编写一对 set get 方法
    3. 编写一个无参数的构造方法
    4. 编写一个全参数的构造方法
    这样标准的类 就叫做beans
* */


public class Student {
    private String name;    // 姓名
    private int age;        // 年龄

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
