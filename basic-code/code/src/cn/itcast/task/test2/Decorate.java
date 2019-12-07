package cn.itcast.task.test2;

public class Decorate {
    // 花费
    private Double cost;

    // 要求
    private String[] tasks;

    private void hardBack(Worker worker,House house){

    }

    private void simple(Worker worker , House house){
        System.out.println("装修花费:" + cost);
        System.out.println("装修要求");
        for (int i = 0; i < tasks.length; i++) {
            System.out.println((i+1) + "." + tasks[i]);
        }

    }
}
