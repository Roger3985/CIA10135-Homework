package HWE.Practice_HWE_1;

public abstract class Pen {
    /*  建立父類別Pen
        (1) 兩個屬性：品牌(brand)、價格(price) (封裝設計)
        (2) 建構子設計：一個無參數與一個根據屬性而設計
        (3) 定義Getter/Setter方法
        (4) 宣告一個抽象方法write() */

    private String brand;
    private double price;

    // 無參數建構子
    public Pen() {}

    // 帶參數建構子
    public Pen(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    // Getter方法
    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    // Setter方法
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // 抽象方法
    public abstract void write();

}

