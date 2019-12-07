package cn.itcast.day02api;

import java.util.ArrayList;

public class Demo0ArrayListEach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("哈士奇");
        list.add("阿拉斯加");
        list.add("柴犬");
        list.add("泰迪");

        for (int i = 0;i < list.size();i ++){
            System.out.println(list.get(i));
            System.out.printf("我是%s\t",list.get(i));
        }
    }
}
