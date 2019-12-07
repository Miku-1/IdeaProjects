package cn.itcast.day02api;

public class Pupil {
    private String name;
    private int age;

    public Pupil(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Pupil() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
