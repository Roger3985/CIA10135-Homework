package HW4;

import java.util.Scanner;

public class Practice_HW4_3 {
    public static void main(String[] args) {
        // 請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
        // 例：輸入 1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」
        System.out.println("題目: 請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天");
        int[] day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入西元年(yyyy)=");
        int num1 = scanner.nextInt();
        System.out.println("請輸入月(mm)=");
        int num2 = scanner.nextInt();
        int num3;
        if (num2 != 2) {
            System.out.println("請輸入日(dd)=");
            num3 = scanner.nextInt();
        } else {
            for (num3 = 0; num3 == 0; num3++) {
                System.out.println("請輸入日(dd)=");
                num3 = scanner.nextInt();
                if(num3 > 29) {  // 擋下錯誤輸入
                    num3 = 0;
                    System.out.println("2月日期應小於29日，請重新輸入");
                }
            }
        }
        int totalday = 0;
        for (int i = 0; i < num2 - 1; i++) {
            totalday += day[i];
        }
        totalday += num3;

        if(num2 > 2) {
            if((num1 % 4 == 0 && num1 % 100 != 0) || num1 % 400 == 0) { // 閏月判斷
                totalday += 1; // 閏月判斷出來需要將日期加一
            }
        }
        System.out.println("西元" + num1 + "年，第" + totalday +"天");
        System.out.println("==============================================");
        
    }
}
