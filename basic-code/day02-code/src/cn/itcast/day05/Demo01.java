package cn.itcast.day05;
/*
* 数组的初始化:在内存中创建一个数组，并向其中赋予一些默认值
* 两种常见的初始化方式：
* 1，动态初始化 指定长度
* 2，静态初始化 指定内容
*动态初始化数组的格式：
*数据类型 [] 数组名称 = new 数据类型 [数组长度];
*
* 左侧数据类型含义：数组中保存的数据类型是什么类型
* 左侧的中括号 代表数组
* 左侧的数组名称：数组的名字
* 右侧的new代表创建数组的动作
* 右侧的数据类型和左侧的数据类型保持一致
* 右侧括号中的数字表示数组中可以保存几个数据，是一个int数字
*
* 静态初始化
*数据类型 [] 数组名称 = new 数据类型[]元素1，元素2,，...};
* 省略格式
* 数据类型[] 数组名称 = {}；
*
* 直接打印数组:内存地址的哈希值
*
* 动态初始化数组的时候:会默认一个值
* 整数类型 : 0
* 浮点类型 : 0.0
* 字符类型 : '\u0000'
* 布尔类型 : false
* 引用类型 : null
* */
public class Demo01 {
    public static void main(String[] args) {
        //创建一个数组，里面可以存放300个int数据
        int [] arr = {1,2,3,45,66,77,88,23,43,56};
        int min = 0,max = arr.length-1;
        while(min<max){
            int temp = arr[min];
            arr[min] = arr[max];
            arr[max] = temp;
            min ++;
            max --;
        }
        for (int i = 0;i < arr.length;i++ ){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }
}
