package cn.itcast.day04;

public class Demo03IsSame {
    public static void main(String[] args) {
        boolean result = isSame(2,3);
        System.out.println(result);
    }
    public static boolean isSame(int a,int b){
        return a == b;
    }
}
