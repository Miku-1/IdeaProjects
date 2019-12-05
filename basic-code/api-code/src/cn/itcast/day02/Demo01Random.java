package cn.itcast.day02;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

// random类生成随机数
// 1. 导包
// 2. 创建
// Random r = new Random();
// 3.   使用
public class Demo01Random {
    public static void main(String[] args) {
        Random r = new Random();
//        int num = r.nextInt();
//        System.out.println(num);

        int num2 = r.nextInt(100);
        Scanner sc = new Scanner(System.in);
        System.out.println(num2);
        int count = 1;
        while(count <= 10){
            System.out.printf("请在10次内猜出该数字,当前是第%d次\n",count);
            System.out.println("请输入你猜测的数字:");
            int numInput = sc.nextInt ();
            if (numInput > num2){
                System.out.println("输入数字太大");
            }
            else if (numInput < num2){
                System.out.println("输入数字过小");
            }
            else{
                System.out.println("恭喜猜对了");
                break;
            }
            count ++;
            if (count > 10){
                System.out.println("游戏次数已用完,本轮游戏结束");
            }

        }
    }
}
