package HW7;

import java.io.*;

public class Practice_HW7_3 {
    public static void main(String[] args) {
        /* 請從無到有試著完成一個方法名為copyFile，這個方法有兩個參數。呼叫此方法時，第一個參數所
           代表的檔案會複製到第二個參數代表的檔案 */
        // 呼叫 copyFile 方法來複製檔案
        copyFile("C:\\CIA101_Workspace\\CIA10135-Homework\\src\\HW7\\source.txt", "C:\\CIA101_Workspace\\CIA10135-Homework\\src\\HW7\\destination.txt");
    }

    // 定義 copyFile 方法
    public static void copyFile(String sourceFileName, String destinationFileName) {
        try (FileInputStream fis = new FileInputStream(sourceFileName);
             FileOutputStream fos = new FileOutputStream(destinationFileName)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            // 從來源檔案讀取資料並寫入目的地檔案
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
                // 將緩衝區中的數據強制寫入到文件中
				fos.flush(); 
            }
            System.out.println("檔案複製成功！");
        } catch (IOException e) {
            System.err.println("發生錯誤：" + e.getMessage());
        }
    }
}
