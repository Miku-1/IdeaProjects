package cn.itcast.task.test1;

public class Dog {

    // 种类 哈士奇 柴犬
    private String kind;

    // 体型 多长
    private String shape;

    // 毛发 长毛还是短毛
    private String further;

    //功能 导盲 救援
    private String ability;

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public void setFurther(String further) {
        this.further = further;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public String getKind() {
        return kind;
    }

    public String getShape() {
        return shape;
    }

    public String getFurther() {
        return further;
    }

    public String getAbility() {
        return ability;
    }
}
