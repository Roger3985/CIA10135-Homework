package Hw_2;

public class Practice_Hw2 {
    public static void main(String[] args) {
        /* 請設計一隻Java程式，計算1～1000的偶數和 (2+4+6+8+…+1000) */
        int i, sum = 0;
        for (i = 1; i <= 1000; i++) {
            if (i % 2 == 0 ) {
                sum += i;
            }
        }
        System.out.println("第一小題\n1～1000的偶數和 (2+4+6+8+…+1000)" + " = " + sum);

        System.out.println("===============================================");

        /* 請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用for迴圈) */
        sum = 1;
        for (i = 1; i <= 10; i++) {
            sum *= i;
        }
        System.out.println("第二小題\n1～10的連乘積 (1*2*3*…*10) (用for迴圈)" + " = " + sum);

        System.out.println("===============================================");

        /* 請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用while迴圈) */
        sum = 1;
        i = 1;
        while (i <= 10) {
            sum *= i;
            i++;
        }
        System.out.println("第三小題\n1～10的連乘積 (1*2*3*…*10) (用while迴圈)" + " = " + sum);

        System.out.println("===============================================");

        /* 請設計一隻Java程式，輸出結果為以下：
           1 4 9 16 25 36 49 64 81 100 */
        System.out.println("第四小題\n輸出結果為以下：");
        int j;
        for (i = 1; i <= 10; i++) {
            for (j = 1; j<= 10; j++) {
                if (i == j) {
                    sum = i * j;
                    System.out.print(sum + " ");
                }
            }
        }

        System.out.println();
        System.out.println("===============================================");

        /* 阿文很熱衷大樂透 (1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，
           輸出結果為阿文可以選擇的數字有哪些？總共有幾個？ */
        System.out.println("第五題: \n輸出結果為阿文可以選擇的數字有: " );
        int count = 0;
        for (i = 1;  i <= 49; i++) {
            if (i % 10 != 4) {
                if (i / 10 != 4) {
                    count++;
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println();
        System.out.println("總共有" + count + "個");

        System.out.println("===============================================");

        /* 請設計一隻Java程式，輸出結果為以下：
           1 2 3 4 5 6 7 8 9 10
           1 2 3 4 5 6 7 8 9
           1 2 3 4 5 6 7 8
           1 2 3 4 5 6 7
           1 2 3 4 5 6
           1 2 3 4 5
           1 2 3 4
           1 2 3
           1 2
           1
        */
        System.out.println("第六題: \n輸出結果為以下： " );
        for (i = 0; i <= 9; i++) {
            for (j = 1; j <= 10 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("===============================================");

        /* 請設計一隻Java程式，輸出結果為以下：
           A
           BB
           CCC
           DDDD
           EEEEE
           FFFFFF
         */
        System.out.println("第七題: \n輸出結果為以下： " );

        System.out.println("第一種寫法(純for寫法): " );
        char nowchar = 'A';
        for (i = 1; i <= 6; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(nowchar);
            }
            System.out.println();
            nowchar++;
        }

        System.out.println();
        System.out.println("第二種寫法(for + while寫法): " );
        nowchar = 'A';
        for (i = 1; i <= 6; i++) {
            j = 1;
            while (j <= i){
                System.out.print(nowchar);
                j++;
            }
            System.out.println();
            nowchar++;
        }

        System.out.println();
        System.out.println("第三種寫法(while + do while寫法): " );
        nowchar = 'A';
        i = 1;
        while (i <= 6) {
            j = 1;
            do {
                System.out.print(nowchar);
                j++;
            } while (j <=6 && j <= i);

            System.out.println();
            nowchar++;
            i++;
        }

    }
}
