package HW7;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class Practice_HW7_2 {
    public static void main(String[] args) {
        /* 請寫一隻程式，能夠亂數產生10個1～1000的整數，並寫入一個名為Data.txt的檔案裡 (請使用
           append功能讓每次執行結果都能被保存起來) */
        // 生成10個1到1000之間的隨機整數
        Random random = new Random();
        int[] randomIntegers = new int[10];
        for (int i = 0; i < randomIntegers.length; i++) {
            randomIntegers[i] = random.nextInt(1000) + 1; // 產生1到1000的隨機整數
        }

        // 將隨機整數寫入檔案
        try (PrintWriter writer = new PrintWriter(new FileWriter("C:\\CIA101_Workspace\\CIA10135-Homework\\src\\HW7\\Data.txt", true))) {
            for (int num : randomIntegers) {
                writer.println(num);
            }
            System.out.println("隨機整數已寫入檔案 Data.txt");
        } catch (IOException e) {
            System.err.println("寫入檔案時發生錯誤：" + e.getMessage());
        }
    }
}