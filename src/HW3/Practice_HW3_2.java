package HW3;

import java.util.Scanner;

// 請設計一隻程式，會亂數產生一個0~9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜對則顯示正確訊息
public class Practice_HW3_2 {
    public static void main(String[] args) {
        int i1 = (int) (Math.random() * 9);
        Scanner s1 = new Scanner(System.in);
        System.out.println("開始猜數字吧！");
        int num1 = s1.nextInt();

        while (i1 != num1) {
            System.out.print("猜錯囉\n");
            num1 = s1.nextInt();
        }
        System.out.println("答對了！答案就是" + num1);

        // 進階功能:產生0~100亂數，每次猜就會提示你是大於還是小於正確答案
        System.out.println();
        System.out.println("-------------------------------------------------");
        System.out.println("進階功能:產生0~100亂數，每次猜就會提示你是大於還是小於正確答案");
        int i2 = (int) (Math.random() * 101);
        Scanner s2 = new Scanner(System.in);
        System.out.println("開始猜數字吧！");
        int num2 = s2.nextInt();

        do {
            if (num2 > i2) {
                System.out.println("大於正確答案");
            } else {
                System.out.println("小於正確答案");
            }
            num2 = s2.nextInt();
        } while (i2 != num2);

        System.out.println("答對了！答案就是" + num2);
    }
}