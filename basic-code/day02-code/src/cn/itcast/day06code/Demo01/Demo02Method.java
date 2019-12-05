package cn.itcast.day06code.Demo01;

public class Demo02Method {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,34,56,77,12,34,12,34,123};
        int max = getMax(arr);
        System.out.println(max);
    }
    public static int getMax(int[] arr){
        int max = 0;
        for(int i = 1;i < arr.length;i++){
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
