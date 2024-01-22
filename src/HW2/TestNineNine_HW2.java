package HW2;

public class TestNineNine_HW2 {

    public static void main(String[] args) {
        /* 範例: 全用 for 的方式寫的九九乘法表 */
        System.out.println("範例: 全用 for 的方式寫的九九乘法表");
            int i, j;
            for (i = 1; i <= 9; i++) {
                for (j = 1; j <= 9; j++) {
                    System.out.print(i + "*" + j + "=" + i * j + "\t");
                }
            System.out.println();
            }

        System.out.println("----------------------------------------------------");

        /* 一： 使用for迴圈 + while迴圈 */
        System.out.println("一： 使用for迴圈 + while迴圈");
        for (i = 1; i <= 9; i++) {
            j = 1;
            while (j <= 9) {
                System.out.print(i + "*" + j + "=" + i * j + "\t");
                j++;
            }
            System.out.println();
        }

        System.out.println("----------------------------------------------------");

        /* 二： 使用for迴圈 + do while迴圈 */
        System.out.println("二： 使用for迴圈 + do while迴圈");
        for (i = 1; i <= 9; i++) {
            j = 1;
            do {
                System.out.print(i + "*" + j + "=" + i * j + "\t");
                j++;
            } while (j <= 9);
            System.out.println();
        }

        System.out.println("----------------------------------------------------");

        /* 三: 使用while迴圈 + do while迴圈 */
        System.out.println("三: 使用while迴圈 + do while迴圈");
        i = 1;
        while (i <= 9) {
            j = 1;
            do {
                System.out.print(i + "*" + j + "=" + i * j+ "\t");
                j++;
            } while (j <= 9);
            System.out.println();
            i++;
        }

    }

}
