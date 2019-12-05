package cn.itcast.day04;

public class Demo04GetSum {
    public static void main(String[] args) {
       int sum =  getSum(1,100);
        System.out.println(sum);
    }

    public static int getSum(int a, int b){
        int sum = 0;
        for (int i = a ;i <= b;i++){
            sum += i;
        }
        return sum;
    }
}
