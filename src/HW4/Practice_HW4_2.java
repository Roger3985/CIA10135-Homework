package HW4;

import java.util.Scanner;

public class Practice_HW4_2 {
    public static void main(String[] args) {
        // 阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列
        // 請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的員工編號: 25 19 27 共 3 人!」
        System.out.println("題目: 阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列\n" +
                "請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的員工編號: 25 19 27 共 3 人");
        int[][] a = {{25, 2500}, {32, 800}, {8, 500}, {19, 1000}, {27, 1200}};
        int sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("輸入欲借的金額: ");
        int num = s.nextInt();
        System.out.print("有錢可借的員工編號: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (num <= a[i][j]) {
                    System.out.print(a[i][0] + " ");
                    sum++;
                }
            }
        }
        System.out.print("共" + sum + "人");
        
    }

}

