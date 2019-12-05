/*
*   方法的重载（Overload）：
*           多个方法的名称一样，但是参数不一样
*   方法重载实现：
*           1，参数个数不同
*           2，参数类型不同
*           3, 多类型参数
*
*
* */
package cn.itcast.day04;

import java.sql.SQLOutput;

public class Demo05MethodOverload {
    public static void main(String[] args) {
        System.out.println(sum(2,3,4));
        System.out.println(sum(2,3,4,5));
        System.out.println(sum(2,3));
    }
    public static int sum(int a,int b){
        return a + b;
    }
    public static int sum(int a,int b,int c){
        return a + b + c;
    }
    public static int sum(int a,int b,int c,int d){
        return a + b + c + d;
    }
}
