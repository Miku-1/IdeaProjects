package cn.itcast.task.test5;

import javax.naming.InsufficientResourcesException;

public class Teacher {
    // 课目 topic
    private  String topic;

    // 姓名
    private String name;

    // 年龄
    private Integer age;

    // 性别
    private String sex;

    // 职称
    private String title;

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "topic='" + topic + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
