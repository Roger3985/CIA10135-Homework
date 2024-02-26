package HW10;

import java.util.Scanner;

public class Practice_HW10_3 {
    public static void main(String[] args) {
        /*  • 請設計一隻程式，讓使用者輸入日期(年月日，例如:20110131)後，可以轉成想要的輸出格式化成
            (1) 年/月/日(2)月/日/年(3)日/月/年三選一，而輸入非指定日期數字格式會顯示出提示訊息如圖
            (提示:TestFormatter.java, Java API文件，判斷格式可用正規表示法) */
    	Scanner sc = new Scanner(System.in);
        String inputDate;

        while (true) {
            System.out.print("請輸入日期（年月日，例如：20110131）：");
            inputDate = sc.nextLine();

            // 檢查輸入是否為日期
            if (inputDate.matches("\\d{4}\\d{2}\\d{2}")) {
                break; // 如果輸入正確，則跳出迴圈
            } else {
                System.out.println("日期格式不正確，請再輸入一次！");
            }
        }

        // 進行後續操作，例如選擇格式化方式
        System.out.print("欲格式化成(1)年/月/日(2)月/日/年(3)日/月/年：");

        int option = sc.nextInt();

        switch (option) {
            case 1:
                formatAsYearMonthDay(inputDate);
                break;
            case 2:
                formatAsMonthDayYear(inputDate);
                break;
            case 3:
                formatAsDayMonthYear(inputDate);
                break;
        }

        sc.close();
    }

    // 格式化成年/月/日
    public static void formatAsYearMonthDay(String inputDate) {
        String formattedDate = inputDate.substring(0, 4) + "/" + inputDate.substring(4, 6) + "/" + inputDate.substring(6, 8);
        System.out.println("年/月/日：" + formattedDate);
    }

    // 格式化成月/日/年
    public static void formatAsMonthDayYear(String inputDate) {
        String formattedDate = inputDate.substring(4, 6) + "/" + inputDate.substring(6, 8) + "/" + inputDate.substring(0, 4);
        System.out.println("月/日/年：" + formattedDate);
    }

    // 格式化成日/月/年
    public static void formatAsDayMonthYear(String inputDate) {
        String formattedDate = inputDate.substring(6, 8) + "/" + inputDate.substring(4, 6) + "/" + inputDate.substring(0, 4);
        System.out.println("日/月/年：" + formattedDate);
    }

}
