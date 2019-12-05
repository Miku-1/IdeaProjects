package cn.itcast.day04;
/*
参数
返回值
定义方法的完整格式

修饰符 返回值的类型 方法名称（参数类型，参数名称，。。。）{
    方法体
    return 返回值；

    返回值类型：
    参数类型 进入方法的数据类型
}
有返回值的方法可以 单独调用 打印调用 赋值调用
无返回值的方法只能单独调用
对于 void 没有返回值，可以返回自己  直接 return；
*/
public class Demo02MethodDefine {
    public static void main(String[] args) {
        int sum = twoNumAdd(5,10);
        System.out.println(sum);
    }
    public static int twoNumAdd(int a,int b){
        return a + b;
    }

}
