package cn.itcast.task.test5;

import java.util.HashMap;

public class Quiz {
    public static void main(String[] args) {
        Teacher cai = new Teacher();
        cai.setName("蔡徐坤");
        cai.setTopic("体育");
        cai.setAge(28);
        cai.setTitle("篮球小王子");
        cai.setSex("男");
        System.out.println(cai.toString());

        HashMap<String, String> team = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            Student stu = new Student();
            stu.setId(1619064000+i);
            stu.setAge(15);
            stu.setSex("男");
            stu.setScore(467);
            team.put("No"+i,stu.toString());
        }
        System.out.println(team.size());
        System.out.println(team);
        System.out.println(team.get("No2"));
        System.out.println(team.get("No6"));
    }
}
