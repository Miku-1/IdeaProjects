package cn.itcast.day02;

import java.util.ArrayList;
/*
    数组的长度不可变
    但是ArrayList的长度可变

    对于ArrayList来说  有一个<E>表示泛型
    泛型: 也就是说, 装在集合中的所有元素都是统一的什么类型
    泛型只能是引用类型,不能是基本类型

    对于ArrayList来说直接打印输出的是内容,而不是地址值
*/
public class Demo02ArrayList {
    public static void main(String[] args) {
        // 创建一个ArrayList
        // 从JDK 1.7+ 开始右边<>中的类型可以不写
        ArrayList<String> list = new ArrayList<>();
        // 向list添加内容
        list.add("123");
        list.add("xiaomign");
        list.add("狗子");

        System.out.println(list);
    }
}
