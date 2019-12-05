package cn.itcast.day04;

public class Demo01Method {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            printMethod();
            System.out.println();
        }
    }

    public static void printMethod(){
        for (int i = 0; i < 20; i++) {
            System.out.print("*");

        }
    }
}
