package cn.itcast.day06code;

import java.util.Arrays;

public class Demo01PrintArray {
    public static void main(String[] args) {
//        打印一个数组，样式如下 [1,2,3,4,5]
        int[] arrA = {1,2,3,4,5,6};  
        System.out.print('[');
        for (int i = 0;i < arrA.length;i ++){
            if (i < arrA.length - 1){
                System.out.print(arrA[i] + ", ");
            }
            else{
                System.out.print(arrA[i] + "]" + "\n");
            }
        }

        System.out.println("=======");
        System.out.println(Arrays.toString(arrA));

    }
}
