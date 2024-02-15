package HW7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Practice_HW7_1 {
    public static void main(String[] args) {
        /* 請寫一個程式讀取這個Sample.txt檔案，並輸出以下訊息：
           Sample.txt檔案共有xxx個位元組，yyy個字元，zzz列資料 */
        // 建立File對象
        File file = new File("C:\\CIA101_Workspace\\CIA10135-Homework\\src\\HW7\\Sample.txt");

        // 變量初始化
        int byteCount = 0;
        int charCount = 0;
        int lineCount = 0;

        try {
            // 建立FileReader對象
            FileReader fileReader = new FileReader(file);
            // 建立BufferedReader對象
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            // 逐行讀取
            while ((line = bufferedReader.readLine()) != null) {
                // 如果該行是空，不計算為一行
                if (!line.trim().isEmpty()) {
                    // 更新行數
                    lineCount++;
                    // 更新字元數，排除空白字符
                    charCount += line.trim().length();
                }
                // 更新位元組數
                byteCount += line.getBytes().length;
            }
            // 關閉讀取器
            bufferedReader.close();
            fileReader.close();

            // 輸出結果
            System.out.println("Sample.txt檔案共有 " + byteCount + " 個位元組，" + charCount + " 個字元，" + lineCount + " 列資料");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}