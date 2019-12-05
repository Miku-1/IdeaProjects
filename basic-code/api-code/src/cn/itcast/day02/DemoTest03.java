package cn.itcast.day02;

import java.util.ArrayList;
import java.util.Scanner;


public class DemoTest03 {
    public static void main(String[] args) {
//        int[] arr = {1,2,3};
//        System.out.println(getString(arr));
        System.out.println("请输入字符串");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] arr = getCharCount(str);
        System.out.println("大写字母:"+arr[0]+"\n小写字母:"+arr[1]+"\n数字:"+arr[2]+"\n其他字符:"+arr[3]);
    }

    // 题目 定义一个方法 把数组{1,2,3}按照指定格式拼接成一个字符串 格式如下 [word1#word2#word3]
    // 利用for循环 遍历 进行字符串拼接
    public static String getString(int[] arr){
        String str = new String("[");
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1){
                str += "word" + arr[i] + "#";
            }
            else{
                str += "word" + arr[i] + "]";
            }

        }
        return str;
    }

    // 键盘输入一个字符串,并统计出现的次数

    public static int[] getCharCount(String str){

        int[] arr = {0,0,0,0}; // 利用数组 大写字母, 小写字母, 数字, 其他
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if(charArray[i] <= 90 && charArray[i] >= 65){
                arr[0] += 1;
            }
            else if (charArray[i] <= 122 && charArray[i] >= 97){
                arr[1] += 1;
            }
            else if (charArray[i] <= 57 && charArray[i] >= 48){
                arr[2] += 1;
            }
            else{
                arr[3] += 1;
            }
        }
        return arr;
    }
}
