package HW5.Practice_HW5_4;

public class MyRectangleMain {
    public static void main(String[] args) {
        /* 請另外建立一個MyRectangleMain類別，此類別只有main方法
        (1) 使用public MyRectangle()建構子建立物件，設定width, depth為10, 20，透過getArea()印出結果
        (2) 使用public MyRectangle(double width, double depth)建構子建立物件，設定width, depth為10, 20，透過getArea()印出結果 */

        // 使用public MyRectangle()建構子建立物件，設定width, depth為10, 20，透過getArea()印出結果
        MyRectangle rectangle1 = new MyRectangle();
        rectangle1.setWidth(10.0);
        rectangle1.setDepth(20.0);
        System.out.println("使用public MyRectangle()建構子建立物件: " + rectangle1.getArea());

        // 使用public MyRectangle(double width, double depth)建構子建立物件，設定width, depth為10, 20，透過getArea()印出結果
        MyRectangle rectangle2 = new MyRectangle(10.0, 20.0);
        System.out.println("使用public MyRectangle(double width, double depth)建構子建立物件: " + rectangle2.getArea());
    }

}
