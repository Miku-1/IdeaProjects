package cn.itcast.cn.itcast.day01api;

public class Demo02StringPool {
    public static void main(String[] args) {
        byte[] array = {97,98,99};
        String str1 = new String(array);
        String str2 = "abc";
        String str3 = "abc";

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str2 == str3);
    }
}
