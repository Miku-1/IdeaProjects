package cn.itcast.day01api;

/*
*
* ==  是进行地址值的比较,如果确实需要进行字符串的内容进行比较
*     任何对象都能用 object进行接受
* */
public class Demo02StringEquals {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        char[] charArray = {'h','e','l','l','o'};
        String str3 = new String(charArray);

        System.out.println(str1.equals(str3));
        System.out.println(str2.equals(str3));
    }
}
