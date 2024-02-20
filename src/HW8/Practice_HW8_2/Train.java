package HW8.Practice_HW8_2;

import java.util.Objects;

// 實作comparable介面
public class Train implements Comparable<Train> {
    /*  • 請設計一個Train類別，並包含以下屬性：
        - 班次 number，型別為int - 車種 type，型別為String - 出發地 start，型別為String
        - 目的地 dest，型別為String - 票價 price，型別為double
        • 設計對應的getter/setter方法，並在main方法裡透過建構子產生以下7個Train的物件，放到每小題
          需使用的集合裡
        - (202, “普悠瑪”, “樹林”, “花蓮”, 400)
        - (1254, “區間”, “屏東”, “基隆”, 700)
        - (118, “自強”, “高雄”, “台北”, 500)
        - (1288, “區間”, “新竹”, “基隆”, 400)
        - (122, “自強”, “台中”, “花蓮”, 600)
        - (1222, “區間”, “樹林”, 七堵, 300)
        - (1254, “區間”, “屏東”, “基隆”, 700) */

    /* 請設計一個Train類別，並包含以下屬性：
       - 班次 number，型別為int - 車種 type，型別為String - 出發地 start，型別為String
       - 目的地 dest，型別為String - 票價 price，型別為double */
    private int number;
    private String type;
    private String start;
    private String dest;
    private double price;

    public Train(int number, String type, String start, String dest, double price) {
        this.number = number;
        this.type = type;
        this.start = start;
        this.dest = dest;
        this.price = price;
    }

    // 設計對應的getter/setter方法
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // 覆寫equals()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Train train = (Train) o;
        return number == train.number &&
                Double.compare(train.price, price) == 0 &&
                Objects.equals(type, train.type) &&
                Objects.equals(start, train.start) &&
                Objects.equals(dest, train.dest);
    }

    // 覆寫hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(number, type, start, dest, price);
    }

    // 覆寫compareTo()
    @Override
    public int compareTo(Train other) {
        // 班次編號由大到小排序
        return Integer.compare(other.number, this.number);
    }

    // 覆寫toString()
    @Override
    public String toString() {
        return "Train{" +
                "number=" + number +
                ", type='" + type + '\'' +
                ", start='" + start + '\'' +
                ", dest='" + dest + '\'' +
                ", price=" + price +
                '}';
    }
}
