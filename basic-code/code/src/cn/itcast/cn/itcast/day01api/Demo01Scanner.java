package cn.itcast.cn.itcast.day01api;

import java.util.Scanner;
/*
    引用类型的一般使用步骤:
    1. 导包
    import 包路径.类名;
    只有java.lang不需要导包

    2. 创建
    格式: 类名 对象名 = new 类名();

    3. 使用
    对象名.成员方法();


*/
public class Demo01Scanner {
    public static void main(String[] args) {
        // System.in 从键盘输入
        Scanner sc = new Scanner(System.in);
        // 获取int数字  int num = sc.nextInt();
        int num = sc.nextInt();
        System.out.println("输入的数字是"+num);
        // 获取输入的字符串
        String str = sc.next();
        System.out.println("输入的字符串是"+str);
    }

}
