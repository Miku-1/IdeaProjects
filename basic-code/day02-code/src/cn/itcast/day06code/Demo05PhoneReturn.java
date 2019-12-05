package cn.itcast.day06code;

public class Demo05PhoneReturn {
    public static void main(String[] args) {
        Phone two = phoneReturn();
        System.out.println(two.price);
        System.out.println(two.color);
        System.out.println(two.brand);

    }
    public static Phone phoneReturn(){
        Phone one = new Phone();
        one.color = "red";
        one.brand = "apple";
        one.price = 8848.0;

        return one;
    }
}
