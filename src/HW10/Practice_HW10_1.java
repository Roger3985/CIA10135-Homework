package HW10;

import java.util.Random;

public class Practice_HW10_1 {
    // 判斷一個數是否為質數的方法
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        /* 請設計一隻程式，用亂數產生5個介於1~100之間的整數，而輸出結果可以判斷出這5個整數為是否為質數 (提示:Math類別) */
        Random random = new Random();

        // 生成5個介於1到100之間的整數並進行質數判斷
        System.out.println("生成的隨機數及其是否為質數");
        for (int i = 0; i < 5; i++) {
            int randomNumber = random.nextInt(100) + 1;
            boolean isPrime = isPrime(randomNumber);
            System.out.println(randomNumber + ": " + (isPrime ? "是質數" : "不是質數"));
        }


    }
}
