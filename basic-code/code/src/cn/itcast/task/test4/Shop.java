package cn.itcast.task.test4;

import java.util.Date;

public class Shop {
    // 购买人员
    private Person person;



    // 购买时间
    private Date time;

    // 购买地点
    private String site;

    // 购买数量
    private Integer count;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }


    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "person=" + person +
                "time=" + time +
                ", site='" + site + '\'' +
                ", count=" + count +
                '}';
    }
}
