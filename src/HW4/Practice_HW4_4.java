package HW4;

public class Practice_HW4_4 {
    public static void main(String[] args) {
        // 請算出每位同學考最高分的次數
        System.out.println("請算出每位同學考最高分的次數");
        int[][] exam= {
                {10, 35, 40, 100, 90, 85, 75, 70},
                {37, 75, 77, 89, 64, 75, 70, 95},
                {100, 70, 79, 90, 75, 70, 79, 90},
                {77, 95, 70, 89, 60, 75, 85, 89},
                {98, 70, 89, 90, 75, 90, 89, 90},
                {90, 80, 100, 75, 50, 20, 99, 75}
        };

        int i, j, k;
        int maxscore = 0;
        int[] student = new int[8];

        for (i = 0; i < exam.length; i++) {
            for (j = 0; j < exam[i].length; j++) {
                int count = 0;
                for (k = 0; k < student.length; k++) {
                    if (exam[i][j] > exam[i][k]) {
                        count++;
                        if (count == 7) {
                            maxscore = j;
                            student[maxscore] += 1;
                        }
                    }
                }
            }
        }
        System.out.println("1號同學考最高分次數 = " + student[0]);
        System.out.println("2號同學考最高分次數 = " + student[1]);
        System.out.println("3號同學考最高分次數 = " + student[2]);
        System.out.println("4號同學考最高分次數 = " + student[3]);
        System.out.println("5號同學考最高分次數 = " + student[4]);
        System.out.println("6號同學考最高分次數 = " + student[5]);
        System.out.println("7號同學考最高分次數 = " + student[6]);
        System.out.println("8號同學考最高分次數 = " + student[7]);

    }
}
