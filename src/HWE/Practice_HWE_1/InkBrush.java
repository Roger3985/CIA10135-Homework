package HWE.Practice_HWE_1;

public class InkBrush extends Pen {
     /*  建立兩個子類別Pencil與InkBrush繼承Pen父類別
        (1) 實作方法：Pencil輸出為削鉛筆再寫，InkBrush為沾墨汁再寫
        (2) Pencil實際售價為定價8折，InkBrush為定價9折
        (3) 多型操作，當共同呼叫write()方法與getPrice()方法，各種筆都可正確顯示write內容與售價金額 */

    // 無參數建構子
    public InkBrush() {
    }

    // 帶參數建構子
    public InkBrush(String brand, double price) {
        super(brand, price);
    }

    // 實作write()方法
    @Override
    public void write() {
        System.out.println("沾墨汁再寫");
    }

    // 計算實際售價
    public double calculateActualPrice() {
        return getPrice() * 0.9; // 9折
    }

}
