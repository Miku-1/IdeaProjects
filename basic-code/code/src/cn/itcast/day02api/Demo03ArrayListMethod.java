package cn.itcast.day02api;

import java.util.ArrayList;

/*
add(数据)             添加元素
get(索引编号)         根据下标获取元素
remove(索引编号)      根据下标删除元素
size()                返回数组中包含的元素个数



* */
public class Demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        // add返回值,插入结果
        list.add("柳岩");
        list.add("小陆");
        list.add("项目");
        list.add("谷歌");
        System.out.println(list);
        //查询
        String name = list.get(2);
        System.out.println(name);
        // 删除
        list.remove(3);
        System.out.println(list);
        // 删除元素
        list.remove("小陆");
        System.out.println(list);
        // 返回数组数据个数
        int count = list.size();
        System.out.println(count);

    }
}
