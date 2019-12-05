package cn.itcast.day06code;

public class Demo03PhoneParam {
    public static void main(String[] args) {
        Phone one = new Phone();
        one.brand = "华为";
        one.price = 49999.00;
        one.call("雷杰");

        method(one);
    }
    public static void method(Phone param){
        System.out.println(param.price);
    }
}
