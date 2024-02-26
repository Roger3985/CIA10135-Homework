package HW10;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Practice_HW10_2 {
    public static void main(String[] args) {
        /*  • 請設計一隻程式，讓使用者可以輸入一個任意數後，可以選擇要以下列何種表示方法顯示(1)千分位 (2)百分比(3)科學記號，而輸入非任意數會顯示提示訊息如圖
              (提示: TestFormatter.java, Java API 文件, 判斷數字可用正規表示法)
            • 補充 (依此類推): 輸入12345，千分位為12,345，輸入123，千分位為123
              輸入0.75，百分比為75%，輸入1，結果為100% */
    	Scanner sc = new Scanner(System.in);
    	double number = 0;

    	while (true) {
    	    System.out.print("請輸入一個數字： ");
    	    String input = sc.nextLine();

    	    // 檢查輸入是否為數字
    	    if (!input.matches("-?\\d+(\\.\\d+)?")) {
    	        System.out.println("數字格式不正確，請再輸入一次！");
    	        continue; // 回到循環頂部，提示用戶重新輸入
    	    }

    	    number = Double.parseDouble(input);
    	    break; // 跳出循環，表示輸入正確
    	}

    	// 進行後續操作，例如選擇格式化方式
        System.out.print("欲格式化成(1)千分位(2)百分位(3)科學記號：");

        int option = sc.nextInt();

        switch (option) {
            case 1:
                formatThousandSeparator(number);
                break;
            case 2:
                formatPercentage(number);
                break;
            case 3:
                formatScientificNotation(number);
                break;
        }

        sc.close();
    }

    // 格式化為千分位
    public static void formatThousandSeparator(double number) {
        DecimalFormat formatter = new DecimalFormat("#,###");
        String formattedNumber = formatter.format(number);
        System.out.println("千分為表示法： " + formattedNumber);
    }

    // 格式化為百分位
    public static void formatPercentage(double number) {
        DecimalFormat formatter = new DecimalFormat("#%");
        String formattedNumber = formatter.format(number);
        System.out.println("百分位表示法： " + formattedNumber);
    }

    // 格式化為科學記號
    public static void formatScientificNotation(double number) {
        DecimalFormat formatter = new DecimalFormat("0.0#E00");
        String formattedNumber = formatter.format(number);
        System.out.println("科學記號表示法： " + formattedNumber);
    }
}
