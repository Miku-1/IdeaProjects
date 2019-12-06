package cn.itcast.cn.itcast.day01api;
/*
*   java中所有的 双引号字符串就是 String 类对象
*  特点:
*   1. 字符串的内容永不可变,是常量
*   2. 正式因为字符串不可变,所以可以共享使用
*   3. 字符串效果上相当于char[] 字符数组,底层是byte[]数组

* 字符串的构造方法
* 1. public String();创建一个空白字符串.不包含任何内容
* 2. public String(char[] array);根据字符串数组的内容 来创建对应的字符串
* 3. public String(buyte[] array); 根据字节数组的内容 创建对应的字符串
 */
public class Demo01String {
    public static void main(String[] args) {
        // 空参构造
        String str1 = new String();//
        System.out.println(str1);
        // 根据字符数组创建字符串
        char[] chararray = {'1','2','3','4','5','6','7'};
        String str2 = new String(chararray);
        System.out.println("第二个字符串是"+str2);
        // 根据字节数组创建字符串
        byte[] bytearray = {97,65,99};
        String str3 = new String(bytearray);
        System.out.println("第三个字符串是" + str3);
    }


}
