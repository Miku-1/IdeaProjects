package cn.itcast.day06code.Demo01;

public class Demo04Student {
    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student("南球",22);
//        System.out.println(stu1);
        System.out.println(stu2.getName()+stu2.getAge());
    }
}
