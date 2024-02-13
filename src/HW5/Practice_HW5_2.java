package HW5;

import java.util.Random;

public class Practice_HW5_2 {
    public static void main(String[] args) {
        // 請設計一個方法為randAvg()，從10個 0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值
        randAvg();
    }
    public static void randAvg() {
        Random random = new Random();
        int[] numbers = new int[10];
        int sum = 0;

        // 生成10個0到100(包括100)的整數亂數並計算總合
        System.out.print("隨機數: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(101); // 生成0到100(包括100)的亂數
            System.out.print(numbers[i] + " ");
            sum += numbers[i];
        }

        System.out.println();
        double average = (double) sum / 10; // 計算平均值
        System.out.println("平均值: " + average);

    }

}
