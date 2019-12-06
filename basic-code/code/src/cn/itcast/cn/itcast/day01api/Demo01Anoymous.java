package cn.itcast.cn.itcast.day01api;

/*
匿名对象就是只有右边的对象,没有左边的赋值运算符和名字;

*
* */
public class Demo01Anoymous {
    public static void main(String[] args) {
        Person one = new Person();
        one.name = "小姨子";
        one.showName();

        // 匿名对象
        new Person().name = "赵康";

    }
}
