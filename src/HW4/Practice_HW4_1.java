package HW4;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;

public class Practice_HW4_1 {
    public static void main(String[] args) {
        // 有個一維陣列：{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
        // 請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
        System.out.println("第一題: 有個一維陣列：{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}，寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素");
        int[] array = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
        int sum = 0, avg = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("所有元素的平均值: " + sum / array.length);
        System.out.print("大於平均值的元素: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > sum / array.length) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        System.out.println("===================================");

        // 請建立一個字串，經過程式執行後，輸入結果是反過來的
        // 例如String s = “Hello World”，執行結果即為dlroW olleH
        System.out.println("第二題: 請建立一個字串，經過程式執行後，輸入結果是反過來的\n" + "例如:String s = “Hello World”，執行結果即為dlroW olleH");
        String str = "Hello World";
        System.out.println("輸入: " + str);
        // System.out.println(str.length()); 長度為11
        // System.out.println(str.charAt(0)); 但轉換為字串後第一個表示為0開始
        // System.out.println(str.charAt(11)); 顯示出來表示超出位數，表示整體長度需要減一，不然其表示會多出1位數
        int length = str.length() - 1;
        System.out.print("結果: ");
        for (int n = length;  n >= 0; n--) {
            System.out.print(str.charAt(n));
        }

        System.out.println();
        System.out.println("===================================");

        // 有個字串陣列 (八大行星)：{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
        // 請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
        System.out.println("第三題: 有個字串陣列 (八大行星)：{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}，" +
                "請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)");
        String[] stars = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
        int total = 0;
        for (int i = 0; i < stars.length; i++) {
            for (int j = 0; j < stars[i].length(); j++) {
                switch (stars[i].charAt(j)) {
                    case 'a':
                        total++;
                        break;
                    case 'e':
                        total++;
                        break;
                    case 'i':
                        total++;
                        break;
                    case 'o':
                        total++;
                        break;
                    case 'u':
                        total++;
                        break;
                }
            }
        }
        System.out.println("以上八大行星的英文單字中共有" + total + "個母音");
        
    }


}
