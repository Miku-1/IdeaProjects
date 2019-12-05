package cn.itcast.day06code.Demo01;

/*
* private
* 一旦使用private修饰,那么本类当中可以依旧访问
* 但是超出本类便是不能访问
* */
public class Person {
    String name;
    private int age;

    public void show(){
        System.out.println(name);
        System.out.println(age);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
