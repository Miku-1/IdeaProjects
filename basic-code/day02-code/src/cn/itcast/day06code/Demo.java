package cn.itcast.day06code;

public class Demo {
    public static void main(String[] args) {
        Phone oneplus = new Phone();
        oneplus.brand = "一加";
        oneplus.color = "red";
        oneplus.price = 3400;

        oneplus.call("小明");
        oneplus.sendMessage();
    }

}
