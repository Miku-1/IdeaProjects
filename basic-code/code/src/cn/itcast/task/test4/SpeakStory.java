package cn.itcast.task.test4;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SpeakStory {
    public static void main(String[] args) {
        /*
        * 谁去买手机
        *
        * */
        Person ali = new Person();
        ali.setName("阿狸");
        ali.setSex("女");
        ali.setHeight(175);
        ali.setWeight(50);
        System.out.println(ali.toString());

        /*
        * 手机
        * */
        List<Phone> phoneList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Phone iphone = new Phone();
            iphone.setId(2019120001+i);
            iphone.setBrand("apple");
            iphone.setColor("玫瑰金");
            iphone.setMobileCpu("A11");
            iphone.setRam(2);
            iphone.setRom(64);
            iphone.setPrice(5000.00);
            phoneList.add(iphone);
        }
        System.out.println(phoneList);


        /*
        * 购买信息
        * */
        Shop shop = new Shop();
        shop.setPerson(ali);
        shop.setTime(new Date());
        shop.setSite("华强北");
        shop.setCount(phoneList.size());
        System.out.println(shop.toString());

    }
}
