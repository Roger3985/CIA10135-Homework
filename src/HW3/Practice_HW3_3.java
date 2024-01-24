package HW3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// 阿文很喜歡簽大樂透(1~49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討 厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1~9)，畫面會顯示他可以選擇的號碼與總數
public class Practice_HW3_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("阿文...請輸入你討厭哪個數字(0~9)");
        int num = s.nextInt();
        int count = 0;

        // 設定每行印出的數量
        int numbersPerRow = 6;

        for (int i = 1; i <= 49; i++) {
            if (i % 10 != num && i / 10 != num) {
                System.out.print(i + "\t");
                count++;
                // 判斷是否換行
                if (count % numbersPerRow == 0) {
                    System.out.println();
                }
            }
        }
        System.out.print("總共有" + count + "個數字");

        // 進階挑戰:輸入不要的數字後，直接亂數印出6個號碼且不得重複
        System.out.println();
        System.out.println("-------------------------------------------------");
        System.out.println("進階挑戰:輸入不要的數字後，直接亂數印出6個號碼且不得重複");

        int[] lotteryNumbers = new int[6];

        Random random = new Random();

        // 生成六個隨機號碼
        for (int i = 0; i < 6; i++) {
            int randomNumber;
            do {
                randomNumber = random.nextInt(49) + 1;
            } while (randomNumber % 10 == num || randomNumber / 10 == num);

            lotteryNumbers[i] = randomNumber;
        }
        // 打印出生成的六個隨機的數字
        System.out.println("隨機生成的6個號碼（排除不要的數字）：" + Arrays.toString(lotteryNumbers));
    }

}
