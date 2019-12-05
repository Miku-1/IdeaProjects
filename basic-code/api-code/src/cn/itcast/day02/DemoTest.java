package cn.itcast.day02;

import java.util.ArrayList;
import java.util.Random;

public class DemoTest {
    public static void main(String[] args) {
        Random random  = new Random();
        ArrayList<Integer> intlList = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int num = random.nextInt(33) + 1;
            intlList.add(num);
        }
        System.out.println(intlList);

        for (int i = 0; i < intlList.size(); i++) {
            System.out.println(intlList.get(i));
        }
    }
}
