package cn.itcast.day06code;
/*
*
* 定义一个类,学生
* 属性:姓名,身高年龄
*
* 行为:
* 吃饭
* 睡觉
* 学习
*
* 对应java类中
* 成员变量(属性)
*   String name // 姓名
*   int    age // 年龄
* 成员方法(行为)
*   public  void eat(){};
*
*   public void sleep(){};
*   public void study(){};
*
*
* 注意事项:
* 成员变量直接定义在类中
* 成员方法 不用书写 static 关键字
* */
public class Student {
    // 成员变量
    String name; // 姓名
    int age; // 年龄

    // 成员方法
    public void eat(){
        System.out.println("吃饭饭");
    }

    public void sleep(){
        System.out.println("睡觉觉");
    }

    public void study(){
        System.out.println("学习");
    }
}
