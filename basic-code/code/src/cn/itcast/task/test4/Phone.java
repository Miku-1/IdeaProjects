package cn.itcast.task.test4;

public class Phone {
    // 产品编号
    private Integer id;

    // 品牌
    private String brand;

    // 价格
    private Double price;

    // 颜色
    private String color;

    // Cpu
    private String mobileCpu;

    // 运行内存(G)
    private Integer ram;

    // 储存空间
    private Integer rom;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMobileCpu() {
        return mobileCpu;
    }

    public void setMobileCpu(String mobileCpu) {
        this.mobileCpu = mobileCpu;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getRom() {
        return rom;
    }

    public void setRom(Integer rom) {
        this.rom = rom;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", mobileCpu='" + mobileCpu + '\'' +
                ", ram=" + ram + "g" +
                ", rom=" + rom + "g" +
                '}';
    }
}
