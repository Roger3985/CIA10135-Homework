package HW3;

import java.util.Scanner;

// 請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰 三角形、其它三角形或不是三角形
// (提示:Scanner，三角形成立條件，判斷式if else)、(進階功能:加入直角三角形的判斷)
public class Practice_HW3_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("請輸入三個整數：");
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 = s.nextInt();

        if (num1 > 0 && num2 > 0 && num3 > 0) {
            if (num1 == num2 && num2 == num3 && num1 == num3) {
                System.out.println("正三角形");
                System.out.println("不是直角三角形"); //(進階功能:加入直角三角形的判斷)
            } else if (num1 == num2 || num2 == num3 || num1 == num3) {
                System.out.println("等腰三角形");
                //(進階功能:加入直角三角形的判斷)
                if (Math.pow(num1, 2) + Math.pow(num2, 2) == Math.pow(num3, 2) || Math.pow(num2, 2) + Math.pow(num3, 2) == Math.pow(num1, 2) || Math.pow(num1, 2) + Math.pow(num3, 2) == Math.pow(num2, 2)) {
                    System.out.println("直角三角形");
                } else {
                    System.out.println("不是直角三角形");
                }
            } else if (num1 != num2 && num2 != num3 && num1 != num3) {
                System.out.println("其他三角形");
                //(進階功能:加入直角三角形的判斷)
                if (Math.pow(num1, 2) + Math.pow(num2, 2) == Math.pow(num3, 2) || Math.pow(num2, 2) + Math.pow(num3, 2) == Math.pow(num1, 2) || Math.pow(num1, 2) + Math.pow(num3, 2) == Math.pow(num2, 2)) {
                    System.out.println("直角三角形");
                } else {
                    System.out.println("不是直角三角形");
                }
            }
        } else {
            System.out.println("不是三角形");
        }

    }
}
