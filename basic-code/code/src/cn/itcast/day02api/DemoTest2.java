package cn.itcast.day02api;

import java.util.ArrayList;

public class DemoTest2 {
    public static void main(String[] args) {
        ArrayList<Pupil> list = new ArrayList<>();
        Pupil stu1 = new Pupil("小胡",20);
        Pupil stu2 = new Pupil("小狗",10);
        Pupil stu3 = new Pupil("老马",30);
        Pupil stu4 = new Pupil("护士",23);

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName()+"年龄"+list.get(i).getAge());
        }
    }
}
